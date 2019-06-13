/*
 * generated by Xtext 2.17.1
 */
package com.spirit.ihe.serializer;

import com.google.inject.Inject;
import com.spirit.ihe.iHE.IHE;
import com.spirit.ihe.iHE.IHEPackage;
import com.spirit.ihe.iHE.Import;
import com.spirit.ihe.iHE.MainTgf;
import com.spirit.ihe.iHE.Profile;
import com.spirit.ihe.iHE.SecRequirements;
import com.spirit.ihe.services.IHEGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class IHESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IHEGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IHEPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IHEPackage.IHE:
				sequence_IHE(context, (IHE) semanticObject); 
				return; 
			case IHEPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case IHEPackage.MAIN_TGF:
				sequence_MainTgf(context, (MainTgf) semanticObject); 
				return; 
			case IHEPackage.PROFILE:
				sequence_Profile(context, (Profile) semanticObject); 
				return; 
			case IHEPackage.SEC_REQUIREMENTS:
				sequence_SecRequirements(context, (SecRequirements) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     IHE returns IHE
	 *
	 * Constraint:
	 *     (importEl+=Import | main=MainTgf)+
	 */
	protected void sequence_IHE(ISerializationContext context, IHE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, IHEPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, IHEPackage.Literals.IMPORT__IMPORT_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MainTgf returns MainTgf
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         genPackage=STRING? 
	 *         satName=STRING? 
	 *         versionName=STRING? 
	 *         statusName=STRING? 
	 *         objectiveName=STRING? 
	 *         hlfunctionName=STRING? 
	 *         rules+=Rule* 
	 *         prof+=Profile+
	 *     )
	 */
	protected void sequence_MainTgf(ISerializationContext context, MainTgf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Profile returns Profile
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         profName=STRING? 
	 *         descrName=STRING? 
	 *         featName=STRING? 
	 *         functionName=STRING? 
	 *         actor+=Actor+ 
	 *         transaction+=Transaction* 
	 *         domain+=Domain* 
	 *         qualityattr+=QualityAttr* 
	 *         secre+=SecRequirements*
	 *     )
	 */
	protected void sequence_Profile(ISerializationContext context, Profile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SecRequirements returns SecRequirements
	 *
	 * Constraint:
	 *     (
	 *         SecReID=ID 
	 *         secreForm=STRING? 
	 *         secreSensitivity=STRING? 
	 *         secreLocation=STRING? 
	 *         secreState=STRING? 
	 *         secreGoal=STRING? 
	 *         secreCountermeasure=STRING? 
	 *         secreCategory=STRING?
	 *     )
	 */
	protected void sequence_SecRequirements(ISerializationContext context, SecRequirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
