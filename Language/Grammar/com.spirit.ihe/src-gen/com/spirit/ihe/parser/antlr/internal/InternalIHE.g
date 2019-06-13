/*
 * generated by Xtext 2.17.1
 */
grammar InternalIHE;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.spirit.ihe.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.spirit.ihe.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.spirit.ihe.services.IHEGrammarAccess;

}

@parser::members {

 	private IHEGrammarAccess grammarAccess;

    public InternalIHEParser(TokenStream input, IHEGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "IHE";
   	}

   	@Override
   	protected IHEGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleIHE
entryRuleIHE returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIHERule()); }
	iv_ruleIHE=ruleIHE
	{ $current=$iv_ruleIHE.current; }
	EOF;

// Rule IHE
ruleIHE returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getIHEAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getIHEAccess().getUnorderedGroup(), 0);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getIHEAccess().getImportElImportParserRuleCall_0_0());
								}
								lv_importEl_1_0=ruleImport
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getIHERule());
									}
									add(
										$current,
										"importEl",
										lv_importEl_1_0,
										"com.spirit.ihe.IHE.Import");
									afterParserOrEnumRuleCall();
								}
							)
							))+
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIHEAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getIHEAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getIHEAccess().getUnorderedGroup(), 1);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getIHEAccess().getMainMainTgfParserRuleCall_1_0());
								}
								lv_main_2_0=ruleMainTgf
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getIHERule());
									}
									set(
										$current,
										"main",
										lv_main_2_0,
										"com.spirit.ihe.IHE.MainTgf");
									afterParserOrEnumRuleCall();
								}
							)
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIHEAccess().getUnorderedGroup());
				}
			)
		)
				)*
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getIHEAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleMainTgf
entryRuleMainTgf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainTgfRule()); }
	iv_ruleMainTgf=ruleMainTgf
	{ $current=$iv_ruleMainTgf.current; }
	EOF;

// Rule MainTgf
ruleMainTgf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ArchitecturalElement'
		{
			newLeafNode(otherlv_0, grammarAccess.getMainTgfAccess().getArchitecturalElementKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMainTgfAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMainTgfRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='JavaPackage'
			{
				newLeafNode(otherlv_3, grammarAccess.getMainTgfAccess().getJavaPackageKeyword_3_0());
			}
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getMainTgfAccess().getColonKeyword_3_1());
			}
			(
				(
					lv_genPackage_5_0=RULE_STRING
					{
						newLeafNode(lv_genPackage_5_0, grammarAccess.getMainTgfAccess().getGenPackageSTRINGTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMainTgfRule());
						}
						setWithLastConsumed(
							$current,
							"genPackage",
							lv_genPackage_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_6='Name'
			{
				newLeafNode(otherlv_6, grammarAccess.getMainTgfAccess().getNameKeyword_4_0());
			}
			otherlv_7=':'
			{
				newLeafNode(otherlv_7, grammarAccess.getMainTgfAccess().getColonKeyword_4_1());
			}
			(
				(
					lv_satName_8_0=RULE_STRING
					{
						newLeafNode(lv_satName_8_0, grammarAccess.getMainTgfAccess().getSatNameSTRINGTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMainTgfRule());
						}
						setWithLastConsumed(
							$current,
							"satName",
							lv_satName_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_9='Version'
			{
				newLeafNode(otherlv_9, grammarAccess.getMainTgfAccess().getVersionKeyword_5_0());
			}
			otherlv_10=':'
			{
				newLeafNode(otherlv_10, grammarAccess.getMainTgfAccess().getColonKeyword_5_1());
			}
			(
				(
					lv_versionName_11_0=RULE_STRING
					{
						newLeafNode(lv_versionName_11_0, grammarAccess.getMainTgfAccess().getVersionNameSTRINGTerminalRuleCall_5_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMainTgfRule());
						}
						setWithLastConsumed(
							$current,
							"versionName",
							lv_versionName_11_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_12='Status'
			{
				newLeafNode(otherlv_12, grammarAccess.getMainTgfAccess().getStatusKeyword_6_0());
			}
			otherlv_13=':'
			{
				newLeafNode(otherlv_13, grammarAccess.getMainTgfAccess().getColonKeyword_6_1());
			}
			(
				(
					lv_statusName_14_0=RULE_STRING
					{
						newLeafNode(lv_statusName_14_0, grammarAccess.getMainTgfAccess().getStatusNameSTRINGTerminalRuleCall_6_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMainTgfRule());
						}
						setWithLastConsumed(
							$current,
							"statusName",
							lv_statusName_14_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_15='Objective'
			{
				newLeafNode(otherlv_15, grammarAccess.getMainTgfAccess().getObjectiveKeyword_7_0());
			}
			otherlv_16=':'
			{
				newLeafNode(otherlv_16, grammarAccess.getMainTgfAccess().getColonKeyword_7_1());
			}
			(
				(
					lv_objectiveName_17_0=RULE_STRING
					{
						newLeafNode(lv_objectiveName_17_0, grammarAccess.getMainTgfAccess().getObjectiveNameSTRINGTerminalRuleCall_7_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMainTgfRule());
						}
						setWithLastConsumed(
							$current,
							"objectiveName",
							lv_objectiveName_17_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_18='HL_Function'
			{
				newLeafNode(otherlv_18, grammarAccess.getMainTgfAccess().getHL_FunctionKeyword_8_0());
			}
			otherlv_19=':'
			{
				newLeafNode(otherlv_19, grammarAccess.getMainTgfAccess().getColonKeyword_8_1());
			}
			(
				(
					lv_hlfunctionName_20_0=RULE_STRING
					{
						newLeafNode(lv_hlfunctionName_20_0, grammarAccess.getMainTgfAccess().getHlfunctionNameSTRINGTerminalRuleCall_8_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMainTgfRule());
						}
						setWithLastConsumed(
							$current,
							"hlfunctionName",
							lv_hlfunctionName_20_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_21='Rules:'
			{
				newLeafNode(otherlv_21, grammarAccess.getMainTgfAccess().getRulesKeyword_9_0());
			}
			otherlv_22='{'
			{
				newLeafNode(otherlv_22, grammarAccess.getMainTgfAccess().getLeftCurlyBracketKeyword_9_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMainTgfAccess().getRulesRuleParserRuleCall_9_2_0());
					}
					lv_rules_23_0=ruleRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMainTgfRule());
						}
						add(
							$current,
							"rules",
							lv_rules_23_0,
							"com.spirit.ihe.IHE.Rule");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_24='}'
			{
				newLeafNode(otherlv_24, grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_9_3());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getMainTgfAccess().getProfProfileParserRuleCall_10_0());
				}
				lv_prof_25_0=ruleProfile
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainTgfRule());
					}
					add(
						$current,
						"prof",
						lv_prof_25_0,
						"com.spirit.ihe.IHE.Profile");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_26='}'
		{
			newLeafNode(otherlv_26, grammarAccess.getMainTgfAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleProfile
entryRuleProfile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProfileRule()); }
	iv_ruleProfile=ruleProfile
	{ $current=$iv_ruleProfile.current; }
	EOF;

// Rule Profile
ruleProfile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Profile'
		{
			newLeafNode(otherlv_0, grammarAccess.getProfileAccess().getProfileKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProfileAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProfileRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getProfileAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Name'
			{
				newLeafNode(otherlv_3, grammarAccess.getProfileAccess().getNameKeyword_3_0());
			}
			otherlv_4=':'
			{
				newLeafNode(otherlv_4, grammarAccess.getProfileAccess().getColonKeyword_3_1());
			}
			(
				(
					lv_profName_5_0=RULE_STRING
					{
						newLeafNode(lv_profName_5_0, grammarAccess.getProfileAccess().getProfNameSTRINGTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProfileRule());
						}
						setWithLastConsumed(
							$current,
							"profName",
							lv_profName_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_6='Description'
			{
				newLeafNode(otherlv_6, grammarAccess.getProfileAccess().getDescriptionKeyword_4_0());
			}
			otherlv_7=':'
			{
				newLeafNode(otherlv_7, grammarAccess.getProfileAccess().getColonKeyword_4_1());
			}
			(
				(
					lv_descrName_8_0=RULE_STRING
					{
						newLeafNode(lv_descrName_8_0, grammarAccess.getProfileAccess().getDescrNameSTRINGTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProfileRule());
						}
						setWithLastConsumed(
							$current,
							"descrName",
							lv_descrName_8_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_9='Features'
			{
				newLeafNode(otherlv_9, grammarAccess.getProfileAccess().getFeaturesKeyword_5_0());
			}
			otherlv_10=':'
			{
				newLeafNode(otherlv_10, grammarAccess.getProfileAccess().getColonKeyword_5_1());
			}
			(
				(
					lv_featName_11_0=RULE_STRING
					{
						newLeafNode(lv_featName_11_0, grammarAccess.getProfileAccess().getFeatNameSTRINGTerminalRuleCall_5_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProfileRule());
						}
						setWithLastConsumed(
							$current,
							"featName",
							lv_featName_11_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_12='Function'
			{
				newLeafNode(otherlv_12, grammarAccess.getProfileAccess().getFunctionKeyword_6_0());
			}
			otherlv_13=':'
			{
				newLeafNode(otherlv_13, grammarAccess.getProfileAccess().getColonKeyword_6_1());
			}
			(
				(
					lv_functionName_14_0=RULE_STRING
					{
						newLeafNode(lv_functionName_14_0, grammarAccess.getProfileAccess().getFunctionNameSTRINGTerminalRuleCall_6_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProfileRule());
						}
						setWithLastConsumed(
							$current,
							"functionName",
							lv_functionName_14_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_15='actors:'
		{
			newLeafNode(otherlv_15, grammarAccess.getProfileAccess().getActorsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getActorActorParserRuleCall_8_0());
				}
				lv_actor_16_0=ruleActor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"actor",
						lv_actor_16_0,
						"com.spirit.ihe.IHE.Actor");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_17='transactions:'
		{
			newLeafNode(otherlv_17, grammarAccess.getProfileAccess().getTransactionsKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getTransactionTransactionParserRuleCall_10_0());
				}
				lv_transaction_18_0=ruleTransaction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"transaction",
						lv_transaction_18_0,
						"com.spirit.ihe.IHE.Transaction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_19='domains:'
		{
			newLeafNode(otherlv_19, grammarAccess.getProfileAccess().getDomainsKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getDomainDomainParserRuleCall_12_0());
				}
				lv_domain_20_0=ruleDomain
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"domain",
						lv_domain_20_0,
						"com.spirit.ihe.IHE.Domain");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_21='quality_attributes:'
		{
			newLeafNode(otherlv_21, grammarAccess.getProfileAccess().getQuality_attributesKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getQualityattrQualityAttrParserRuleCall_14_0());
				}
				lv_qualityattr_22_0=ruleQualityAttr
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"qualityattr",
						lv_qualityattr_22_0,
						"com.spirit.ihe.IHE.QualityAttr");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_23='security_requirements:'
		{
			newLeafNode(otherlv_23, grammarAccess.getProfileAccess().getSecurity_requirementsKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProfileAccess().getSecreSecRequirementsParserRuleCall_16_0());
				}
				lv_secre_24_0=ruleSecRequirements
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProfileRule());
					}
					add(
						$current,
						"secre",
						lv_secre_24_0,
						"com.spirit.ihe.IHE.SecRequirements");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_25='}'
		{
			newLeafNode(otherlv_25, grammarAccess.getProfileAccess().getRightCurlyBracketKeyword_17());
		}
	)
;

// Entry rule entryRuleSecRequirements
entryRuleSecRequirements returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSecRequirementsRule()); }
	iv_ruleSecRequirements=ruleSecRequirements
	{ $current=$iv_ruleSecRequirements.current; }
	EOF;

// Rule SecRequirements
ruleSecRequirements returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_SecReID_0_0=RULE_ID
				{
					newLeafNode(lv_SecReID_0_0, grammarAccess.getSecRequirementsAccess().getSecReIDIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSecRequirementsRule());
					}
					setWithLastConsumed(
						$current,
						"SecReID",
						lv_SecReID_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getSecRequirementsAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='Form'
			{
				newLeafNode(otherlv_2, grammarAccess.getSecRequirementsAccess().getFormKeyword_2_0());
			}
			otherlv_3=':'
			{
				newLeafNode(otherlv_3, grammarAccess.getSecRequirementsAccess().getColonKeyword_2_1());
			}
			(
				(
					lv_secreForm_4_0=RULE_STRING
					{
						newLeafNode(lv_secreForm_4_0, grammarAccess.getSecRequirementsAccess().getSecreFormSTRINGTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreForm",
							lv_secreForm_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_5='Sensitivity'
			{
				newLeafNode(otherlv_5, grammarAccess.getSecRequirementsAccess().getSensitivityKeyword_3_0());
			}
			otherlv_6=':'
			{
				newLeafNode(otherlv_6, grammarAccess.getSecRequirementsAccess().getColonKeyword_3_1());
			}
			(
				(
					lv_secreSensitivity_7_0=RULE_STRING
					{
						newLeafNode(lv_secreSensitivity_7_0, grammarAccess.getSecRequirementsAccess().getSecreSensitivitySTRINGTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreSensitivity",
							lv_secreSensitivity_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_8='Location'
			{
				newLeafNode(otherlv_8, grammarAccess.getSecRequirementsAccess().getLocationKeyword_4_0());
			}
			otherlv_9=':'
			{
				newLeafNode(otherlv_9, grammarAccess.getSecRequirementsAccess().getColonKeyword_4_1());
			}
			(
				(
					lv_secreLocation_10_0=RULE_STRING
					{
						newLeafNode(lv_secreLocation_10_0, grammarAccess.getSecRequirementsAccess().getSecreLocationSTRINGTerminalRuleCall_4_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreLocation",
							lv_secreLocation_10_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_11='State'
			{
				newLeafNode(otherlv_11, grammarAccess.getSecRequirementsAccess().getStateKeyword_5_0());
			}
			otherlv_12=':'
			{
				newLeafNode(otherlv_12, grammarAccess.getSecRequirementsAccess().getColonKeyword_5_1());
			}
			(
				(
					lv_secreState_13_0=RULE_STRING
					{
						newLeafNode(lv_secreState_13_0, grammarAccess.getSecRequirementsAccess().getSecreStateSTRINGTerminalRuleCall_5_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreState",
							lv_secreState_13_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_14='Goal'
			{
				newLeafNode(otherlv_14, grammarAccess.getSecRequirementsAccess().getGoalKeyword_6_0());
			}
			otherlv_15=':'
			{
				newLeafNode(otherlv_15, grammarAccess.getSecRequirementsAccess().getColonKeyword_6_1());
			}
			(
				(
					lv_secreGoal_16_0=RULE_STRING
					{
						newLeafNode(lv_secreGoal_16_0, grammarAccess.getSecRequirementsAccess().getSecreGoalSTRINGTerminalRuleCall_6_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreGoal",
							lv_secreGoal_16_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_17='Countermeasure'
			{
				newLeafNode(otherlv_17, grammarAccess.getSecRequirementsAccess().getCountermeasureKeyword_7_0());
			}
			otherlv_18=':'
			{
				newLeafNode(otherlv_18, grammarAccess.getSecRequirementsAccess().getColonKeyword_7_1());
			}
			(
				(
					lv_secreCountermeasure_19_0=RULE_STRING
					{
						newLeafNode(lv_secreCountermeasure_19_0, grammarAccess.getSecRequirementsAccess().getSecreCountermeasureSTRINGTerminalRuleCall_7_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreCountermeasure",
							lv_secreCountermeasure_19_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		(
			otherlv_20='Category'
			{
				newLeafNode(otherlv_20, grammarAccess.getSecRequirementsAccess().getCategoryKeyword_8_0());
			}
			otherlv_21=':'
			{
				newLeafNode(otherlv_21, grammarAccess.getSecRequirementsAccess().getColonKeyword_8_1());
			}
			(
				(
					lv_secreCategory_22_0=RULE_STRING
					{
						newLeafNode(lv_secreCategory_22_0, grammarAccess.getSecRequirementsAccess().getSecreCategorySTRINGTerminalRuleCall_8_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSecRequirementsRule());
						}
						setWithLastConsumed(
							$current,
							"secreCategory",
							lv_secreCategory_22_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)?
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getSecRequirementsAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleActor
entryRuleActor returns [String current=null]:
	{ newCompositeNode(grammarAccess.getActorRule()); }
	iv_ruleActor=ruleActor
	{ $current=$iv_ruleActor.current.getText(); }
	EOF;

// Rule Actor
ruleActor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getActorAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleTransaction
entryRuleTransaction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTransactionRule()); }
	iv_ruleTransaction=ruleTransaction
	{ $current=$iv_ruleTransaction.current.getText(); }
	EOF;

// Rule Transaction
ruleTransaction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTransactionAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getTransactionAccess().getActorParserRuleCall_1());
		}
		this_Actor_1=ruleActor
		{
			$current.merge(this_Actor_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTransactionAccess().getCommaKeyword_2());
		}
		this_STRING_3=RULE_STRING
		{
			$current.merge(this_STRING_3);
		}
		{
			newLeafNode(this_STRING_3, grammarAccess.getTransactionAccess().getSTRINGTerminalRuleCall_3());
		}
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTransactionAccess().getCommaKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getTransactionAccess().getActorParserRuleCall_5());
		}
		this_Actor_5=ruleActor
		{
			$current.merge(this_Actor_5);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTransactionAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleDomain
entryRuleDomain returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDomainRule()); }
	iv_ruleDomain=ruleDomain
	{ $current=$iv_ruleDomain.current.getText(); }
	EOF;

// Rule Domain
ruleDomain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getDomainAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleQualityAttr
entryRuleQualityAttr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualityAttrRule()); }
	iv_ruleQualityAttr=ruleQualityAttr
	{ $current=$iv_ruleQualityAttr.current.getText(); }
	EOF;

// Rule QualityAttr
ruleQualityAttr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualityAttrAccess().getQualityAttrIDParserRuleCall_0());
		}
		this_QualityAttrID_0=ruleQualityAttrID
		{
			$current.merge(this_QualityAttrID_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw='['
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualityAttrAccess().getLeftSquareBracketKeyword_1());
		}
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getQualityAttrAccess().getSTRINGTerminalRuleCall_2());
		}
		kw=']'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getQualityAttrAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleQualityAttrID
entryRuleQualityAttrID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualityAttrIDRule()); }
	iv_ruleQualityAttrID=ruleQualityAttrID
	{ $current=$iv_ruleQualityAttrID.current.getText(); }
	EOF;

// Rule QualityAttrID
ruleQualityAttrID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getQualityAttrIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleRule
entryRuleRule returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current.getText(); }
	EOF;

// Rule Rule
ruleRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRuleAccess().getRuleIdParserRuleCall_0());
		}
		this_RuleId_0=ruleRuleId
		{
			$current.merge(this_RuleId_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=':'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRuleAccess().getColonKeyword_1());
		}
		this_STRING_2=RULE_STRING
		{
			$current.merge(this_STRING_2);
		}
		{
			newLeafNode(this_STRING_2, grammarAccess.getRuleAccess().getSTRINGTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleRuleId
entryRuleRuleId returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRuleIdRule()); }
	iv_ruleRuleId=ruleRuleId
	{ $current=$iv_ruleRuleId.current.getText(); }
	EOF;

// Rule RuleId
ruleRuleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getRuleIdAccess().getIDTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
