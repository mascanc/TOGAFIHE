package com.spirit.sample.generated.centralregistry;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
        
public class ExtSource {
    private ABB extsource;
        
    private void initP() {
        extsource = new ABB("EXTSOURCE", "Legacy External data source, used to submit clinical images", "Submit clinical images", "");
                                                
                Actor contentcreator = new Actor("ContentCreator");
		        	extsource.addActor(contentcreator);
                Actor contentrecipient = new Actor("ContentRecipient");
		        	extsource.addActor(contentrecipient);
        	
        	Transaction provide = new Transaction(contentcreator, "provide", contentrecipient);
        	extsource.addTransaction(provide);
        	                
        	
        	Domain application = new Domain() { 
        	    private String name = "Application";
        	    public String getName() { return name; }
        	};
        	extsource.addDomain(application);
        		
        		QualityAttribute att1 = new QualityAttribute() {
        			private String value = "max.doc.size<10000000";
        						
        			@Override
        			public void addRule(String value) {
        			this.value = value;
        			}
        						
        			@Override
        			public String getValue() {
        			return this.value;
        			}
        						            
        			@Override
        			public void evaluate(ABB y, ABB y2) {
        			// place your implementation here
        			}
        		};
        		extsource.addQualityAttribute(att1);
        		
        		SecurityRequirement es1 = new SecurityRequirement() {
        			private String form = "Electronic";
        			private String sensitivity = "Confidential";
        			private String location = "Partially Controlled";
        			private String state = "Transmission";
        			private String goal = "Authentication";
        			private String countermeasure = "Authenticate the user who is submitting the document";
        			private String category = "Data integrity transfer protection";
        			private String name = "es1";
        			
        			@Override
        			public String getName() {
        				return this.name;	
        			}

        		@Override
        			public String getForm() {
        				return this.form;	
        			}
        			@Override
        			public String getGoal() {
        				return this.goal;	
        			}
        			@Override
        			public String getLocation() {
        				return this.location;	
        			}
        			@Override
        			public String getSensitivity() {
        				return this.sensitivity;	
        			}
        			@Override
        			public String getState() {
        				return this.state;	
        			}
        			@Override
        			public String getCountermeasure() {
        				return this.countermeasure;	
        			}
        			@Override
        			public String getCategory() {
        				return this.category;	
        			}

        		};
        		extsource.addSecurityRequirements(es1);
        		
        			
    			}
    			
    			public ExtSource() {
    				    initP();
    			
    			}
    			
    			public ABB getABB() {
    				return this.extsource;
			}
			}
