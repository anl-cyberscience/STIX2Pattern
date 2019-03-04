// Generated from STIXPattern.g4 by ANTLR 4.7.1
package stix.matcher;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STIXPatternParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntLiteral=1, FloatLiteral=2, HexLiteral=3, BinaryLiteral=4, StringLiteral=5, 
		BoolLiteral=6, TimestampLiteral=7, AND=8, OR=9, NOT=10, FOLLOWEDBY=11, 
		LIKE=12, MATCHES=13, ISSUPERSET=14, ISSUBSET=15, LAST=16, IN=17, START=18, 
		STOP=19, SECONDS=20, TRUE=21, FALSE=22, WITHIN=23, REPEATS=24, TIMES=25, 
		IdentifierWithoutHyphen=26, IdentifierWithHyphen=27, EQ=28, NEQ=29, LT=30, 
		LE=31, GT=32, GE=33, QUOTE=34, COLON=35, DOT=36, COMMA=37, RPAREN=38, 
		LPAREN=39, RBRACK=40, LBRACK=41, PLUS=42, HYPHEN=43, MINUS=44, POWER_OP=45, 
		DIVIDE=46, ASTERISK=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static final int
		RULE_pattern = 0, RULE_observationExpressions = 1, RULE_observationExpressionOr = 2, 
		RULE_observationExpressionAnd = 3, RULE_observationExpression = 4, RULE_comparisonExpression = 5, 
		RULE_comparisonExpressionAnd = 6, RULE_propTest = 7, RULE_startStopQualifier = 8, 
		RULE_withinQualifier = 9, RULE_repeatedQualifier = 10, RULE_objectPath = 11, 
		RULE_objectType = 12, RULE_firstPathComponent = 13, RULE_objectPathComponent = 14, 
		RULE_setLiteral = 15, RULE_primitiveLiteral = 16, RULE_orderableLiteral = 17;
	public static final String[] ruleNames = {
		"pattern", "observationExpressions", "observationExpressionOr", "observationExpressionAnd", 
		"observationExpression", "comparisonExpression", "comparisonExpressionAnd", 
		"propTest", "startStopQualifier", "withinQualifier", "repeatedQualifier", 
		"objectPath", "objectType", "firstPathComponent", "objectPathComponent", 
		"setLiteral", "primitiveLiteral", "orderableLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'<'", "'<='", "'>'", "'>='", "'''", 
		"':'", "'.'", "','", "')'", "'('", "']'", "'['", "'+'", null, "'-'", "'^'", 
		"'/'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntLiteral", "FloatLiteral", "HexLiteral", "BinaryLiteral", "StringLiteral", 
		"BoolLiteral", "TimestampLiteral", "AND", "OR", "NOT", "FOLLOWEDBY", "LIKE", 
		"MATCHES", "ISSUPERSET", "ISSUBSET", "LAST", "IN", "START", "STOP", "SECONDS", 
		"TRUE", "FALSE", "WITHIN", "REPEATS", "TIMES", "IdentifierWithoutHyphen", 
		"IdentifierWithHyphen", "EQ", "NEQ", "LT", "LE", "GT", "GE", "QUOTE", 
		"COLON", "DOT", "COMMA", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "PLUS", 
		"HYPHEN", "MINUS", "POWER_OP", "DIVIDE", "ASTERISK", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "STIXPattern.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STIXPatternParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PatternContext extends ParserRuleContext {
		public ObservationExpressionsContext observationExpressions() {
			return getRuleContext(ObservationExpressionsContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			observationExpressions(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObservationExpressionsContext extends ParserRuleContext {
		public ObservationExpressionOrContext observationExpressionOr() {
			return getRuleContext(ObservationExpressionOrContext.class,0);
		}
		public List<ObservationExpressionsContext> observationExpressions() {
			return getRuleContexts(ObservationExpressionsContext.class);
		}
		public ObservationExpressionsContext observationExpressions(int i) {
			return getRuleContext(ObservationExpressionsContext.class,i);
		}
		public TerminalNode FOLLOWEDBY() { return getToken(STIXPatternParser.FOLLOWEDBY, 0); }
		public ObservationExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressions(this);
		}
	}

	public final ObservationExpressionsContext observationExpressions() throws RecognitionException {
		return observationExpressions(0);
	}

	private ObservationExpressionsContext observationExpressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionsContext _localctx = new ObservationExpressionsContext(_ctx, _parentState);
		ObservationExpressionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_observationExpressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(39);
			observationExpressionOr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObservationExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_observationExpressions);
					setState(41);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(42);
					match(FOLLOWEDBY);
					setState(43);
					observationExpressions(3);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObservationExpressionOrContext extends ParserRuleContext {
		public ObservationExpressionAndContext observationExpressionAnd() {
			return getRuleContext(ObservationExpressionAndContext.class,0);
		}
		public List<ObservationExpressionOrContext> observationExpressionOr() {
			return getRuleContexts(ObservationExpressionOrContext.class);
		}
		public ObservationExpressionOrContext observationExpressionOr(int i) {
			return getRuleContext(ObservationExpressionOrContext.class,i);
		}
		public TerminalNode OR() { return getToken(STIXPatternParser.OR, 0); }
		public ObservationExpressionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpressionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionOr(this);
		}
	}

	public final ObservationExpressionOrContext observationExpressionOr() throws RecognitionException {
		return observationExpressionOr(0);
	}

	private ObservationExpressionOrContext observationExpressionOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionOrContext _localctx = new ObservationExpressionOrContext(_ctx, _parentState);
		ObservationExpressionOrContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_observationExpressionOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			observationExpressionAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObservationExpressionOrContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_observationExpressionOr);
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(53);
					match(OR);
					setState(54);
					observationExpressionOr(3);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObservationExpressionAndContext extends ParserRuleContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public List<ObservationExpressionAndContext> observationExpressionAnd() {
			return getRuleContexts(ObservationExpressionAndContext.class);
		}
		public ObservationExpressionAndContext observationExpressionAnd(int i) {
			return getRuleContext(ObservationExpressionAndContext.class,i);
		}
		public TerminalNode AND() { return getToken(STIXPatternParser.AND, 0); }
		public ObservationExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionAnd(this);
		}
	}

	public final ObservationExpressionAndContext observationExpressionAnd() throws RecognitionException {
		return observationExpressionAnd(0);
	}

	private ObservationExpressionAndContext observationExpressionAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionAndContext _localctx = new ObservationExpressionAndContext(_ctx, _parentState);
		ObservationExpressionAndContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_observationExpressionAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			observationExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ObservationExpressionAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_observationExpressionAnd);
					setState(63);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(64);
					match(AND);
					setState(65);
					observationExpressionAnd(3);
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ObservationExpressionContext extends ParserRuleContext {
		public ObservationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observationExpression; }
	 
		public ObservationExpressionContext() { }
		public void copyFrom(ObservationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObservationExpressionRepeatedContext extends ObservationExpressionContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public RepeatedQualifierContext repeatedQualifier() {
			return getRuleContext(RepeatedQualifierContext.class,0);
		}
		public ObservationExpressionRepeatedContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionRepeated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionRepeated(this);
		}
	}
	public static class ObservationExpressionSimpleContext extends ObservationExpressionContext {
		public TerminalNode LBRACK() { return getToken(STIXPatternParser.LBRACK, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(STIXPatternParser.RBRACK, 0); }
		public ObservationExpressionSimpleContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionSimple(this);
		}
	}
	public static class ObservationExpressionCompoundContext extends ObservationExpressionContext {
		public TerminalNode LPAREN() { return getToken(STIXPatternParser.LPAREN, 0); }
		public ObservationExpressionsContext observationExpressions() {
			return getRuleContext(ObservationExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(STIXPatternParser.RPAREN, 0); }
		public ObservationExpressionCompoundContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionCompound(this);
		}
	}
	public static class ObservationExpressionWithinContext extends ObservationExpressionContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public WithinQualifierContext withinQualifier() {
			return getRuleContext(WithinQualifierContext.class,0);
		}
		public ObservationExpressionWithinContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionWithin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionWithin(this);
		}
	}
	public static class ObservationExpressionStartStopContext extends ObservationExpressionContext {
		public ObservationExpressionContext observationExpression() {
			return getRuleContext(ObservationExpressionContext.class,0);
		}
		public StartStopQualifierContext startStopQualifier() {
			return getRuleContext(StartStopQualifierContext.class,0);
		}
		public ObservationExpressionStartStopContext(ObservationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObservationExpressionStartStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObservationExpressionStartStop(this);
		}
	}

	public final ObservationExpressionContext observationExpression() throws RecognitionException {
		return observationExpression(0);
	}

	private ObservationExpressionContext observationExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObservationExpressionContext _localctx = new ObservationExpressionContext(_ctx, _parentState);
		ObservationExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_observationExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				{
				_localctx = new ObservationExpressionSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(72);
				match(LBRACK);
				setState(73);
				comparisonExpression(0);
				setState(74);
				match(RBRACK);
				}
				break;
			case LPAREN:
				{
				_localctx = new ObservationExpressionCompoundContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(LPAREN);
				setState(77);
				observationExpressions(0);
				setState(78);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ObservationExpressionStartStopContext(new ObservationExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_observationExpression);
						setState(82);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(83);
						startStopQualifier();
						}
						break;
					case 2:
						{
						_localctx = new ObservationExpressionWithinContext(new ObservationExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_observationExpression);
						setState(84);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(85);
						withinQualifier();
						}
						break;
					case 3:
						{
						_localctx = new ObservationExpressionRepeatedContext(new ObservationExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_observationExpression);
						setState(86);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(87);
						repeatedQualifier();
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public ComparisonExpressionAndContext comparisonExpressionAnd() {
			return getRuleContext(ComparisonExpressionAndContext.class,0);
		}
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(STIXPatternParser.OR, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitComparisonExpression(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			comparisonExpressionAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
					setState(96);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(97);
					match(OR);
					setState(98);
					comparisonExpression(3);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionAndContext extends ParserRuleContext {
		public PropTestContext propTest() {
			return getRuleContext(PropTestContext.class,0);
		}
		public List<ComparisonExpressionAndContext> comparisonExpressionAnd() {
			return getRuleContexts(ComparisonExpressionAndContext.class);
		}
		public ComparisonExpressionAndContext comparisonExpressionAnd(int i) {
			return getRuleContext(ComparisonExpressionAndContext.class,i);
		}
		public TerminalNode AND() { return getToken(STIXPatternParser.AND, 0); }
		public ComparisonExpressionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpressionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterComparisonExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitComparisonExpressionAnd(this);
		}
	}

	public final ComparisonExpressionAndContext comparisonExpressionAnd() throws RecognitionException {
		return comparisonExpressionAnd(0);
	}

	private ComparisonExpressionAndContext comparisonExpressionAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionAndContext _localctx = new ComparisonExpressionAndContext(_ctx, _parentState);
		ComparisonExpressionAndContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_comparisonExpressionAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(105);
			propTest();
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonExpressionAndContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpressionAnd);
					setState(107);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(108);
					match(AND);
					setState(109);
					comparisonExpressionAnd(3);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropTestContext extends ParserRuleContext {
		public PropTestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propTest; }
	 
		public PropTestContext() { }
		public void copyFrom(PropTestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropTestRegexContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode MATCHES() { return getToken(STIXPatternParser.MATCHES, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestRegexContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestRegex(this);
		}
	}
	public static class PropTestOrderContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public OrderableLiteralContext orderableLiteral() {
			return getRuleContext(OrderableLiteralContext.class,0);
		}
		public TerminalNode GT() { return getToken(STIXPatternParser.GT, 0); }
		public TerminalNode LT() { return getToken(STIXPatternParser.LT, 0); }
		public TerminalNode GE() { return getToken(STIXPatternParser.GE, 0); }
		public TerminalNode LE() { return getToken(STIXPatternParser.LE, 0); }
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestOrderContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestOrder(this);
		}
	}
	public static class PropTestLikeContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(STIXPatternParser.LIKE, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestLikeContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestLike(this);
		}
	}
	public static class PropTestEqualContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public PrimitiveLiteralContext primitiveLiteral() {
			return getRuleContext(PrimitiveLiteralContext.class,0);
		}
		public TerminalNode EQ() { return getToken(STIXPatternParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(STIXPatternParser.NEQ, 0); }
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestEqualContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestEqual(this);
		}
	}
	public static class PropTestSetContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode IN() { return getToken(STIXPatternParser.IN, 0); }
		public SetLiteralContext setLiteral() {
			return getRuleContext(SetLiteralContext.class,0);
		}
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestSetContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestSet(this);
		}
	}
	public static class PropTestIsSubsetContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode ISSUBSET() { return getToken(STIXPatternParser.ISSUBSET, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestIsSubsetContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestIsSubset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestIsSubset(this);
		}
	}
	public static class PropTestParenContext extends PropTestContext {
		public TerminalNode LPAREN() { return getToken(STIXPatternParser.LPAREN, 0); }
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(STIXPatternParser.RPAREN, 0); }
		public PropTestParenContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestParen(this);
		}
	}
	public static class PropTestIsSupersetContext extends PropTestContext {
		public ObjectPathContext objectPath() {
			return getRuleContext(ObjectPathContext.class,0);
		}
		public TerminalNode ISSUPERSET() { return getToken(STIXPatternParser.ISSUPERSET, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public TerminalNode NOT() { return getToken(STIXPatternParser.NOT, 0); }
		public PropTestIsSupersetContext(PropTestContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPropTestIsSuperset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPropTestIsSuperset(this);
		}
	}

	public final PropTestContext propTest() throws RecognitionException {
		PropTestContext _localctx = new PropTestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propTest);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PropTestEqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				objectPath();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(116);
					match(NOT);
					}
				}

				setState(119);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				primitiveLiteral();
				}
				break;
			case 2:
				_localctx = new PropTestOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				objectPath();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(123);
					match(NOT);
					}
				}

				setState(126);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LE) | (1L << GT) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(127);
				orderableLiteral();
				}
				break;
			case 3:
				_localctx = new PropTestSetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				objectPath();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(130);
					match(NOT);
					}
				}

				setState(133);
				match(IN);
				setState(134);
				setLiteral();
				}
				break;
			case 4:
				_localctx = new PropTestLikeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				objectPath();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(137);
					match(NOT);
					}
				}

				setState(140);
				match(LIKE);
				setState(141);
				match(StringLiteral);
				}
				break;
			case 5:
				_localctx = new PropTestRegexContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				objectPath();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(144);
					match(NOT);
					}
				}

				setState(147);
				match(MATCHES);
				setState(148);
				match(StringLiteral);
				}
				break;
			case 6:
				_localctx = new PropTestIsSubsetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				objectPath();
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(151);
					match(NOT);
					}
				}

				setState(154);
				match(ISSUBSET);
				setState(155);
				match(StringLiteral);
				}
				break;
			case 7:
				_localctx = new PropTestIsSupersetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				objectPath();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(158);
					match(NOT);
					}
				}

				setState(161);
				match(ISSUPERSET);
				setState(162);
				match(StringLiteral);
				}
				break;
			case 8:
				_localctx = new PropTestParenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				match(LPAREN);
				setState(165);
				comparisonExpression(0);
				setState(166);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartStopQualifierContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(STIXPatternParser.START, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(STIXPatternParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(STIXPatternParser.StringLiteral, i);
		}
		public TerminalNode STOP() { return getToken(STIXPatternParser.STOP, 0); }
		public StartStopQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startStopQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterStartStopQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitStartStopQualifier(this);
		}
	}

	public final StartStopQualifierContext startStopQualifier() throws RecognitionException {
		StartStopQualifierContext _localctx = new StartStopQualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_startStopQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(START);
			setState(171);
			match(StringLiteral);
			setState(172);
			match(STOP);
			setState(173);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithinQualifierContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(STIXPatternParser.WITHIN, 0); }
		public TerminalNode SECONDS() { return getToken(STIXPatternParser.SECONDS, 0); }
		public TerminalNode IntLiteral() { return getToken(STIXPatternParser.IntLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(STIXPatternParser.FloatLiteral, 0); }
		public WithinQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withinQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterWithinQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitWithinQualifier(this);
		}
	}

	public final WithinQualifierContext withinQualifier() throws RecognitionException {
		WithinQualifierContext _localctx = new WithinQualifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_withinQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WITHIN);
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==IntLiteral || _la==FloatLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			match(SECONDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatedQualifierContext extends ParserRuleContext {
		public TerminalNode REPEATS() { return getToken(STIXPatternParser.REPEATS, 0); }
		public TerminalNode IntLiteral() { return getToken(STIXPatternParser.IntLiteral, 0); }
		public TerminalNode TIMES() { return getToken(STIXPatternParser.TIMES, 0); }
		public RepeatedQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatedQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterRepeatedQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitRepeatedQualifier(this);
		}
	}

	public final RepeatedQualifierContext repeatedQualifier() throws RecognitionException {
		RepeatedQualifierContext _localctx = new RepeatedQualifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeatedQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(REPEATS);
			setState(180);
			match(IntLiteral);
			setState(181);
			match(TIMES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPathContext extends ParserRuleContext {
		public ObjectTypeContext objectType() {
			return getRuleContext(ObjectTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(STIXPatternParser.COLON, 0); }
		public FirstPathComponentContext firstPathComponent() {
			return getRuleContext(FirstPathComponentContext.class,0);
		}
		public ObjectPathComponentContext objectPathComponent() {
			return getRuleContext(ObjectPathComponentContext.class,0);
		}
		public ObjectPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObjectPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObjectPath(this);
		}
	}

	public final ObjectPathContext objectPath() throws RecognitionException {
		ObjectPathContext _localctx = new ObjectPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			objectType();
			setState(184);
			match(COLON);
			setState(185);
			firstPathComponent();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==LBRACK) {
				{
				setState(186);
				objectPathComponent(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeContext extends ParserRuleContext {
		public TerminalNode IdentifierWithoutHyphen() { return getToken(STIXPatternParser.IdentifierWithoutHyphen, 0); }
		public TerminalNode IdentifierWithHyphen() { return getToken(STIXPatternParser.IdentifierWithHyphen, 0); }
		public ObjectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterObjectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitObjectType(this);
		}
	}

	public final ObjectTypeContext objectType() throws RecognitionException {
		ObjectTypeContext _localctx = new ObjectTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==IdentifierWithoutHyphen || _la==IdentifierWithHyphen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstPathComponentContext extends ParserRuleContext {
		public TerminalNode IdentifierWithoutHyphen() { return getToken(STIXPatternParser.IdentifierWithoutHyphen, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public FirstPathComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstPathComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterFirstPathComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitFirstPathComponent(this);
		}
	}

	public final FirstPathComponentContext firstPathComponent() throws RecognitionException {
		FirstPathComponentContext _localctx = new FirstPathComponentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_firstPathComponent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==IdentifierWithoutHyphen) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectPathComponentContext extends ParserRuleContext {
		public ObjectPathComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPathComponent; }
	 
		public ObjectPathComponentContext() { }
		public void copyFrom(ObjectPathComponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexPathStepContext extends ObjectPathComponentContext {
		public TerminalNode LBRACK() { return getToken(STIXPatternParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(STIXPatternParser.RBRACK, 0); }
		public TerminalNode IntLiteral() { return getToken(STIXPatternParser.IntLiteral, 0); }
		public TerminalNode ASTERISK() { return getToken(STIXPatternParser.ASTERISK, 0); }
		public IndexPathStepContext(ObjectPathComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterIndexPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitIndexPathStep(this);
		}
	}
	public static class PathStepContext extends ObjectPathComponentContext {
		public List<ObjectPathComponentContext> objectPathComponent() {
			return getRuleContexts(ObjectPathComponentContext.class);
		}
		public ObjectPathComponentContext objectPathComponent(int i) {
			return getRuleContext(ObjectPathComponentContext.class,i);
		}
		public PathStepContext(ObjectPathComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPathStep(this);
		}
	}
	public static class KeyPathStepContext extends ObjectPathComponentContext {
		public TerminalNode IdentifierWithoutHyphen() { return getToken(STIXPatternParser.IdentifierWithoutHyphen, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public KeyPathStepContext(ObjectPathComponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterKeyPathStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitKeyPathStep(this);
		}
	}

	public final ObjectPathComponentContext objectPathComponent() throws RecognitionException {
		return objectPathComponent(0);
	}

	private ObjectPathComponentContext objectPathComponent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ObjectPathComponentContext _localctx = new ObjectPathComponentContext(_ctx, _parentState);
		ObjectPathComponentContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_objectPathComponent, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				_localctx = new KeyPathStepContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				match(DOT);
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==StringLiteral || _la==IdentifierWithoutHyphen) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LBRACK:
				{
				_localctx = new IndexPathStepContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(LBRACK);
				setState(197);
				_la = _input.LA(1);
				if ( !(_la==IntLiteral || _la==ASTERISK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(198);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PathStepContext(new ObjectPathComponentContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_objectPathComponent);
					setState(201);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(202);
					objectPathComponent(4);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SetLiteralContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(STIXPatternParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(STIXPatternParser.RPAREN, 0); }
		public List<PrimitiveLiteralContext> primitiveLiteral() {
			return getRuleContexts(PrimitiveLiteralContext.class);
		}
		public PrimitiveLiteralContext primitiveLiteral(int i) {
			return getRuleContext(PrimitiveLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(STIXPatternParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(STIXPatternParser.COMMA, i);
		}
		public SetLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterSetLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitSetLiteral(this);
		}
	}

	public final SetLiteralContext setLiteral() throws RecognitionException {
		SetLiteralContext _localctx = new SetLiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setLiteral);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(LPAREN);
				setState(209);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(LPAREN);
				setState(211);
				primitiveLiteral();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(212);
					match(COMMA);
					setState(213);
					primitiveLiteral();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveLiteralContext extends ParserRuleContext {
		public OrderableLiteralContext orderableLiteral() {
			return getRuleContext(OrderableLiteralContext.class,0);
		}
		public TerminalNode BoolLiteral() { return getToken(STIXPatternParser.BoolLiteral, 0); }
		public PrimitiveLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterPrimitiveLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitPrimitiveLiteral(this);
		}
	}

	public final PrimitiveLiteralContext primitiveLiteral() throws RecognitionException {
		PrimitiveLiteralContext _localctx = new PrimitiveLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_primitiveLiteral);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntLiteral:
			case FloatLiteral:
			case HexLiteral:
			case BinaryLiteral:
			case StringLiteral:
			case TimestampLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				orderableLiteral();
				}
				break;
			case BoolLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(BoolLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderableLiteralContext extends ParserRuleContext {
		public TerminalNode IntLiteral() { return getToken(STIXPatternParser.IntLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(STIXPatternParser.FloatLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(STIXPatternParser.StringLiteral, 0); }
		public TerminalNode BinaryLiteral() { return getToken(STIXPatternParser.BinaryLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(STIXPatternParser.HexLiteral, 0); }
		public TerminalNode TimestampLiteral() { return getToken(STIXPatternParser.TimestampLiteral, 0); }
		public OrderableLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderableLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).enterOrderableLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof STIXPatternListener ) ((STIXPatternListener)listener).exitOrderableLiteral(this);
		}
	}

	public final OrderableLiteralContext orderableLiteral() throws RecognitionException {
		OrderableLiteralContext _localctx = new OrderableLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_orderableLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntLiteral) | (1L << FloatLiteral) | (1L << HexLiteral) | (1L << BinaryLiteral) | (1L << StringLiteral) | (1L << TimestampLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return observationExpressions_sempred((ObservationExpressionsContext)_localctx, predIndex);
		case 2:
			return observationExpressionOr_sempred((ObservationExpressionOrContext)_localctx, predIndex);
		case 3:
			return observationExpressionAnd_sempred((ObservationExpressionAndContext)_localctx, predIndex);
		case 4:
			return observationExpression_sempred((ObservationExpressionContext)_localctx, predIndex);
		case 5:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 6:
			return comparisonExpressionAnd_sempred((ComparisonExpressionAndContext)_localctx, predIndex);
		case 14:
			return objectPathComponent_sempred((ObjectPathComponentContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean observationExpressions_sempred(ObservationExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean observationExpressionOr_sempred(ObservationExpressionOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean observationExpressionAnd_sempred(ObservationExpressionAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean observationExpression_sempred(ObservationExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparisonExpressionAnd_sempred(ComparisonExpressionAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean objectPathComponent_sempred(ObjectPathComponentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u00e8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5E\n\5\f\5\16\5H\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7f\n\7\f\7\16\7i\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bq\n\b\f\b\16\bt"+
		"\13\b\3\t\3\t\5\tx\n\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0094\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u00a2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00be\n"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00ca\n\20\3"+
		"\20\3\20\7\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u00d9\n\21\f\21\16\21\u00dc\13\21\3\21\3\21\5\21\u00e0\n"+
		"\21\3\22\3\22\5\22\u00e4\n\22\3\23\3\23\3\23\2\t\4\6\b\n\f\16\36\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\t\3\2\36\37\3\2 #\3\2\3\4"+
		"\3\2\34\35\4\2\7\7\34\34\4\2\3\3\61\61\4\2\3\7\t\t\2\u00f2\2&\3\2\2\2"+
		"\4(\3\2\2\2\6\63\3\2\2\2\b>\3\2\2\2\nR\3\2\2\2\f_\3\2\2\2\16j\3\2\2\2"+
		"\20\u00aa\3\2\2\2\22\u00ac\3\2\2\2\24\u00b1\3\2\2\2\26\u00b5\3\2\2\2\30"+
		"\u00b9\3\2\2\2\32\u00bf\3\2\2\2\34\u00c1\3\2\2\2\36\u00c9\3\2\2\2 \u00df"+
		"\3\2\2\2\"\u00e3\3\2\2\2$\u00e5\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\b\3\1"+
		"\2)*\5\6\4\2*\60\3\2\2\2+,\f\4\2\2,-\7\r\2\2-/\5\4\3\5.+\3\2\2\2/\62\3"+
		"\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\b\4"+
		"\1\2\64\65\5\b\5\2\65;\3\2\2\2\66\67\f\4\2\2\678\7\13\2\28:\5\6\4\59\66"+
		"\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>?\b\5\1\2"+
		"?@\5\n\6\2@F\3\2\2\2AB\f\4\2\2BC\7\n\2\2CE\5\b\5\5DA\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2G\t\3\2\2\2HF\3\2\2\2IJ\b\6\1\2JK\7+\2\2KL\5\f\7\2"+
		"LM\7*\2\2MS\3\2\2\2NO\7)\2\2OP\5\4\3\2PQ\7(\2\2QS\3\2\2\2RI\3\2\2\2RN"+
		"\3\2\2\2S\\\3\2\2\2TU\f\5\2\2U[\5\22\n\2VW\f\4\2\2W[\5\24\13\2XY\f\3\2"+
		"\2Y[\5\26\f\2ZT\3\2\2\2ZV\3\2\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]\13\3\2\2\2^\\\3\2\2\2_`\b\7\1\2`a\5\16\b\2ag\3\2\2\2bc\f\4\2\2"+
		"cd\7\13\2\2df\5\f\7\5eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3\2\2"+
		"\2ig\3\2\2\2jk\b\b\1\2kl\5\20\t\2lr\3\2\2\2mn\f\4\2\2no\7\n\2\2oq\5\16"+
		"\b\5pm\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\17\3\2\2\2tr\3\2\2\2uw\5"+
		"\30\r\2vx\7\f\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\t\2\2\2z{\5\"\22\2{"+
		"\u00ab\3\2\2\2|~\5\30\r\2}\177\7\f\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\t\3\2\2\u0081\u0082\5$\23\2\u0082\u00ab\3\2\2\2\u0083"+
		"\u0085\5\30\r\2\u0084\u0086\7\f\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\23\2\2\u0088\u0089\5 \21\2\u0089"+
		"\u00ab\3\2\2\2\u008a\u008c\5\30\r\2\u008b\u008d\7\f\2\2\u008c\u008b\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\16\2\2\u008f"+
		"\u0090\7\7\2\2\u0090\u00ab\3\2\2\2\u0091\u0093\5\30\r\2\u0092\u0094\7"+
		"\f\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\7\17\2\2\u0096\u0097\7\7\2\2\u0097\u00ab\3\2\2\2\u0098\u009a\5"+
		"\30\r\2\u0099\u009b\7\f\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7\21\2\2\u009d\u009e\7\7\2\2\u009e\u00ab\3"+
		"\2\2\2\u009f\u00a1\5\30\r\2\u00a0\u00a2\7\f\2\2\u00a1\u00a0\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\7"+
		"\7\2\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\5\f\7\2\u00a8"+
		"\u00a9\7(\2\2\u00a9\u00ab\3\2\2\2\u00aau\3\2\2\2\u00aa|\3\2\2\2\u00aa"+
		"\u0083\3\2\2\2\u00aa\u008a\3\2\2\2\u00aa\u0091\3\2\2\2\u00aa\u0098\3\2"+
		"\2\2\u00aa\u009f\3\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00ad"+
		"\7\24\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af\7\25\2\2\u00af\u00b0\7\7\2\2"+
		"\u00b0\23\3\2\2\2\u00b1\u00b2\7\31\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00b4"+
		"\7\26\2\2\u00b4\25\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\7\3\2\2\u00b7"+
		"\u00b8\7\33\2\2\u00b8\27\3\2\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00bb\7%"+
		"\2\2\u00bb\u00bd\5\34\17\2\u00bc\u00be\5\36\20\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\t\5\2\2\u00c0\33\3\2\2\2\u00c1"+
		"\u00c2\t\6\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\b\20\1\2\u00c4\u00c5\7&\2"+
		"\2\u00c5\u00ca\t\6\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\t\7\2\2\u00c8\u00ca"+
		"\7*\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cf\3\2\2\2\u00cb"+
		"\u00cc\f\5\2\2\u00cc\u00ce\5\36\20\6\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\37\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7)\2\2\u00d3\u00e0\7(\2\2\u00d4\u00d5\7)\2"+
		"\2\u00d5\u00da\5\"\22\2\u00d6\u00d7\7\'\2\2\u00d7\u00d9\5\"\22\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7(\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d4\3\2\2\2\u00e0!\3\2\2\2"+
		"\u00e1\u00e4\5$\23\2\u00e2\u00e4\7\b\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4#\3\2\2\2\u00e5\u00e6\t\b\2\2\u00e6%\3\2\2\2\30\60;FRZ\\"+
		"grw~\u0085\u008c\u0093\u009a\u00a1\u00aa\u00bd\u00c9\u00cf\u00da\u00df"+
		"\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}