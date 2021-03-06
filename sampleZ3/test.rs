(set-option :print-success false)
(set-option :produce-models true) 
(set-option :produce-proofs true)


;
; Definitions of the constants for the profiles. Those are the attributes
; for the quality_attributes
;
(echo "Declaring the quality attributes of Profile PI")
(echo "Declaring pi.levenshtein.match_score")
(define-fun pi.levenshtein.match_score () Real 0.9)

(echo "Declaring pi.levenshtein.match_sec")
(define-fun pi.levenshtein.match_sec () Int 200)

(echo "Declaring pi.soundex.match_score")
(define-fun pi.soundex.match_score () Real 0.83)

(echo "Declaring pi.soundex.match_sec")
(define-fun pi.soundex.match_sec () Int 400)

(echo "Declaring the quality attributes of Profile SR")
(echo "Declaring sr.hw.hs")
(define-fun sr.hw.hs () Int 3000)

(echo "Declaring sr.sw.hs")
(define-fun sr.sw.hs () Int 1000)


(echo "Declaring the quality attributes of Profile DS")
(echo "Declaring ds.db.write.sec")
(define-fun ds.db.write.sec () Int 30)

(echo "Declaring ds.db.read.sec")
(define-fun ds.db.read.sec () Int 70)

(echo "Declaring ds.fs.write.sec")
(define-fun ds.fs.write.sec () Int 40)

(echo "Declaring ds.fs.read.sec")
(define-fun ds.fs.read.sec () Int 20)

;
; Definition of the goal. Is our architecture capable of doing x reads per second?
;

(echo "Declaring the GOAL")
(declare-fun secure_reads_per_second () Int)

;
; Algorithms. We put in OR the quality attributes, and we AND the overall
;
(echo "Declaring the algorithms")
(define-fun throughput_pi_read() Bool(
    or (> pi.levenshtein.match_sec secure_reads_per_second) (> pi.soundex.match_sec secure_reads_per_second)
))

(define-fun throughput_sr_read() Bool(
    or (> sr.hw.hs secure_reads_per_second) (> sr.sw.hs secure_reads_per_second)

))

(define-fun throughput_ds_read() Bool(
    or (> ds.db.read.sec secure_reads_per_second) (> ds.fs.read.sec secure_reads_per_second)

))

;
; Declaring the Overall function
;


(define-fun throughput_total() Bool(
    and throughput_pi_read throughput_ds_read throughput_sr_read
))

;
; Adding the assertions to the stack. This is the main goal of the 
; evaluation of the quality attributes: how many reads per second
;
(assert throughput_total)
(assert (and (> secure_reads_per_second 30) (< secure_reads_per_second 32)))


(echo "Checking satisifiability")

(check-sat)

(echo "The architecture supports the following value")
(get-value (secure_reads_per_second))
(get-proof)
(get-model)
(get-info :all-statistics)


