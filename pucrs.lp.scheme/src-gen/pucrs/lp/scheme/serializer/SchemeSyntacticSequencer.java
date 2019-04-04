/*
 * generated by Xtext 2.17.0
 */
package pucrs.lp.scheme.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import pucrs.lp.scheme.services.SchemeGrammarAccess;

@SuppressWarnings("all")
public class SchemeSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SchemeGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Conditional_RightParenthesisKeyword_8_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SchemeGrammarAccess) access;
		match_Conditional_RightParenthesisKeyword_8_q = new TokenAlias(false, true, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_8());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Conditional_RightParenthesisKeyword_8_q.equals(syntax))
				emit_Conditional_RightParenthesisKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     value3=INT (ambiguity) (rule end)
	 */
	protected void emit_Conditional_RightParenthesisKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
