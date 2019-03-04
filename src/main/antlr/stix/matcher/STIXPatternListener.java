// Generated from STIXPattern.g4 by ANTLR 4.7.1
package stix.matcher;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STIXPatternParser}.
 */
public interface STIXPatternListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(STIXPatternParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(STIXPatternParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#observationExpressions}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressions(STIXPatternParser.ObservationExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#observationExpressions}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressions(STIXPatternParser.ObservationExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#observationExpressionOr}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionOr(STIXPatternParser.ObservationExpressionOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#observationExpressionOr}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionOr(STIXPatternParser.ObservationExpressionOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#observationExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionAnd(STIXPatternParser.ObservationExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#observationExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionAnd(STIXPatternParser.ObservationExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionRepeated}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionRepeated(STIXPatternParser.ObservationExpressionRepeatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionRepeated}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionRepeated(STIXPatternParser.ObservationExpressionRepeatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionSimple}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionSimple(STIXPatternParser.ObservationExpressionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionSimple}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionSimple(STIXPatternParser.ObservationExpressionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionCompound}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionCompound(STIXPatternParser.ObservationExpressionCompoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionCompound}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionCompound(STIXPatternParser.ObservationExpressionCompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionWithin}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionWithin(STIXPatternParser.ObservationExpressionWithinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionWithin}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionWithin(STIXPatternParser.ObservationExpressionWithinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code observationExpressionStartStop}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void enterObservationExpressionStartStop(STIXPatternParser.ObservationExpressionStartStopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code observationExpressionStartStop}
	 * labeled alternative in {@link STIXPatternParser#observationExpression}.
	 * @param ctx the parse tree
	 */
	void exitObservationExpressionStartStop(STIXPatternParser.ObservationExpressionStartStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(STIXPatternParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(STIXPatternParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#comparisonExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpressionAnd(STIXPatternParser.ComparisonExpressionAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#comparisonExpressionAnd}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpressionAnd(STIXPatternParser.ComparisonExpressionAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestEqual}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestEqual(STIXPatternParser.PropTestEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestEqual}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestEqual(STIXPatternParser.PropTestEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestOrder}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestOrder(STIXPatternParser.PropTestOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestOrder}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestOrder(STIXPatternParser.PropTestOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestSet}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestSet(STIXPatternParser.PropTestSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestSet}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestSet(STIXPatternParser.PropTestSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestLike}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestLike(STIXPatternParser.PropTestLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestLike}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestLike(STIXPatternParser.PropTestLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestRegex}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestRegex(STIXPatternParser.PropTestRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestRegex}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestRegex(STIXPatternParser.PropTestRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestIsSubset}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestIsSubset(STIXPatternParser.PropTestIsSubsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestIsSubset}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestIsSubset(STIXPatternParser.PropTestIsSubsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestIsSuperset}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestIsSuperset(STIXPatternParser.PropTestIsSupersetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestIsSuperset}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestIsSuperset(STIXPatternParser.PropTestIsSupersetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propTestParen}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void enterPropTestParen(STIXPatternParser.PropTestParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propTestParen}
	 * labeled alternative in {@link STIXPatternParser#propTest}.
	 * @param ctx the parse tree
	 */
	void exitPropTestParen(STIXPatternParser.PropTestParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#startStopQualifier}.
	 * @param ctx the parse tree
	 */
	void enterStartStopQualifier(STIXPatternParser.StartStopQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#startStopQualifier}.
	 * @param ctx the parse tree
	 */
	void exitStartStopQualifier(STIXPatternParser.StartStopQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#withinQualifier}.
	 * @param ctx the parse tree
	 */
	void enterWithinQualifier(STIXPatternParser.WithinQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#withinQualifier}.
	 * @param ctx the parse tree
	 */
	void exitWithinQualifier(STIXPatternParser.WithinQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#repeatedQualifier}.
	 * @param ctx the parse tree
	 */
	void enterRepeatedQualifier(STIXPatternParser.RepeatedQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#repeatedQualifier}.
	 * @param ctx the parse tree
	 */
	void exitRepeatedQualifier(STIXPatternParser.RepeatedQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#objectPath}.
	 * @param ctx the parse tree
	 */
	void enterObjectPath(STIXPatternParser.ObjectPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#objectPath}.
	 * @param ctx the parse tree
	 */
	void exitObjectPath(STIXPatternParser.ObjectPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#objectType}.
	 * @param ctx the parse tree
	 */
	void enterObjectType(STIXPatternParser.ObjectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#objectType}.
	 * @param ctx the parse tree
	 */
	void exitObjectType(STIXPatternParser.ObjectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#firstPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterFirstPathComponent(STIXPatternParser.FirstPathComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#firstPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitFirstPathComponent(STIXPatternParser.FirstPathComponentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexPathStep}
	 * labeled alternative in {@link STIXPatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterIndexPathStep(STIXPatternParser.IndexPathStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexPathStep}
	 * labeled alternative in {@link STIXPatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitIndexPathStep(STIXPatternParser.IndexPathStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pathStep}
	 * labeled alternative in {@link STIXPatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterPathStep(STIXPatternParser.PathStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pathStep}
	 * labeled alternative in {@link STIXPatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitPathStep(STIXPatternParser.PathStepContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keyPathStep}
	 * labeled alternative in {@link STIXPatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void enterKeyPathStep(STIXPatternParser.KeyPathStepContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keyPathStep}
	 * labeled alternative in {@link STIXPatternParser#objectPathComponent}.
	 * @param ctx the parse tree
	 */
	void exitKeyPathStep(STIXPatternParser.KeyPathStepContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#setLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSetLiteral(STIXPatternParser.SetLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#setLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSetLiteral(STIXPatternParser.SetLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveLiteral(STIXPatternParser.PrimitiveLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#primitiveLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveLiteral(STIXPatternParser.PrimitiveLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link STIXPatternParser#orderableLiteral}.
	 * @param ctx the parse tree
	 */
	void enterOrderableLiteral(STIXPatternParser.OrderableLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link STIXPatternParser#orderableLiteral}.
	 * @param ctx the parse tree
	 */
	void exitOrderableLiteral(STIXPatternParser.OrderableLiteralContext ctx);
}