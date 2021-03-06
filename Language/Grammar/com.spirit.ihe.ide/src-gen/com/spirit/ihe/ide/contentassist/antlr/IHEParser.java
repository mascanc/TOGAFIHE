/*
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.spirit.ihe.ide.contentassist.antlr.internal.InternalIHEParser;
import com.spirit.ihe.services.IHEGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class IHEParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(IHEGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, IHEGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup(), "rule__MainTgf__Group__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_3(), "rule__MainTgf__Group_3__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_4(), "rule__MainTgf__Group_4__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_5(), "rule__MainTgf__Group_5__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_6(), "rule__MainTgf__Group_6__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_7(), "rule__MainTgf__Group_7__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_8(), "rule__MainTgf__Group_8__0");
			builder.put(grammarAccess.getMainTgfAccess().getGroup_9(), "rule__MainTgf__Group_9__0");
			builder.put(grammarAccess.getProfileAccess().getGroup(), "rule__Profile__Group__0");
			builder.put(grammarAccess.getProfileAccess().getGroup_3(), "rule__Profile__Group_3__0");
			builder.put(grammarAccess.getProfileAccess().getGroup_4(), "rule__Profile__Group_4__0");
			builder.put(grammarAccess.getProfileAccess().getGroup_5(), "rule__Profile__Group_5__0");
			builder.put(grammarAccess.getProfileAccess().getGroup_6(), "rule__Profile__Group_6__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup(), "rule__SecRequirements__Group__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_2(), "rule__SecRequirements__Group_2__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_3(), "rule__SecRequirements__Group_3__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_4(), "rule__SecRequirements__Group_4__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_5(), "rule__SecRequirements__Group_5__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_6(), "rule__SecRequirements__Group_6__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_7(), "rule__SecRequirements__Group_7__0");
			builder.put(grammarAccess.getSecRequirementsAccess().getGroup_8(), "rule__SecRequirements__Group_8__0");
			builder.put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
			builder.put(grammarAccess.getQualityAttrAccess().getGroup(), "rule__QualityAttr__Group__0");
			builder.put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
			builder.put(grammarAccess.getIHEAccess().getImportElAssignment_0(), "rule__IHE__ImportElAssignment_0");
			builder.put(grammarAccess.getIHEAccess().getMainAssignment_1(), "rule__IHE__MainAssignment_1");
			builder.put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
			builder.put(grammarAccess.getMainTgfAccess().getNameAssignment_1(), "rule__MainTgf__NameAssignment_1");
			builder.put(grammarAccess.getMainTgfAccess().getGenPackageAssignment_3_2(), "rule__MainTgf__GenPackageAssignment_3_2");
			builder.put(grammarAccess.getMainTgfAccess().getSatNameAssignment_4_2(), "rule__MainTgf__SatNameAssignment_4_2");
			builder.put(grammarAccess.getMainTgfAccess().getVersionNameAssignment_5_2(), "rule__MainTgf__VersionNameAssignment_5_2");
			builder.put(grammarAccess.getMainTgfAccess().getStatusNameAssignment_6_2(), "rule__MainTgf__StatusNameAssignment_6_2");
			builder.put(grammarAccess.getMainTgfAccess().getObjectiveNameAssignment_7_2(), "rule__MainTgf__ObjectiveNameAssignment_7_2");
			builder.put(grammarAccess.getMainTgfAccess().getHlfunctionNameAssignment_8_2(), "rule__MainTgf__HlfunctionNameAssignment_8_2");
			builder.put(grammarAccess.getMainTgfAccess().getRulesAssignment_9_2(), "rule__MainTgf__RulesAssignment_9_2");
			builder.put(grammarAccess.getMainTgfAccess().getProfAssignment_10(), "rule__MainTgf__ProfAssignment_10");
			builder.put(grammarAccess.getProfileAccess().getNameAssignment_1(), "rule__Profile__NameAssignment_1");
			builder.put(grammarAccess.getProfileAccess().getProfNameAssignment_3_2(), "rule__Profile__ProfNameAssignment_3_2");
			builder.put(grammarAccess.getProfileAccess().getDescrNameAssignment_4_2(), "rule__Profile__DescrNameAssignment_4_2");
			builder.put(grammarAccess.getProfileAccess().getFeatNameAssignment_5_2(), "rule__Profile__FeatNameAssignment_5_2");
			builder.put(grammarAccess.getProfileAccess().getFunctionNameAssignment_6_2(), "rule__Profile__FunctionNameAssignment_6_2");
			builder.put(grammarAccess.getProfileAccess().getActorAssignment_8(), "rule__Profile__ActorAssignment_8");
			builder.put(grammarAccess.getProfileAccess().getTransactionAssignment_10(), "rule__Profile__TransactionAssignment_10");
			builder.put(grammarAccess.getProfileAccess().getDomainAssignment_12(), "rule__Profile__DomainAssignment_12");
			builder.put(grammarAccess.getProfileAccess().getQualityattrAssignment_14(), "rule__Profile__QualityattrAssignment_14");
			builder.put(grammarAccess.getProfileAccess().getSecreAssignment_16(), "rule__Profile__SecreAssignment_16");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecReIDAssignment_0(), "rule__SecRequirements__SecReIDAssignment_0");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreFormAssignment_2_2(), "rule__SecRequirements__SecreFormAssignment_2_2");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreSensitivityAssignment_3_2(), "rule__SecRequirements__SecreSensitivityAssignment_3_2");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreLocationAssignment_4_2(), "rule__SecRequirements__SecreLocationAssignment_4_2");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreStateAssignment_5_2(), "rule__SecRequirements__SecreStateAssignment_5_2");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreGoalAssignment_6_2(), "rule__SecRequirements__SecreGoalAssignment_6_2");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreCountermeasureAssignment_7_2(), "rule__SecRequirements__SecreCountermeasureAssignment_7_2");
			builder.put(grammarAccess.getSecRequirementsAccess().getSecreCategoryAssignment_8_2(), "rule__SecRequirements__SecreCategoryAssignment_8_2");
			builder.put(grammarAccess.getIHEAccess().getUnorderedGroup(), "rule__IHE__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private IHEGrammarAccess grammarAccess;

	@Override
	protected InternalIHEParser createParser() {
		InternalIHEParser result = new InternalIHEParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public IHEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(IHEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
