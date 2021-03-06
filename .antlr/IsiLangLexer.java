// Generated from /home/cadu/workspcace/compiladores/Projeto-Compiladores-UFABC-2021/IsiLang.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AP=11, FP=12, AC=13, FC=14, SC=15, VIR=16, OP=17, OPREL=18, ATTR=19, 
		ID=20, NUMBER=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "AP", "FP", "AC", "FC", "SC", "VIR", "OP", "OPREL", "ATTR", "ID", 
			"NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'entao'", "'senao'", "'enquanto'", "'('", "')'", "'{'", "'}'", 
			"';'", "','", null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AP", 
			"FP", "AC", "FC", "SC", "VIR", "OP", "OPREL", "ATTR", "ID", "NUMBER", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u008a\n\23\3\24\3\24\3\25\3\25\7\25\u0090"+
		"\n\25\f\25\16\25\u0093\13\25\3\26\6\26\u0096\n\26\r\26\16\26\u0097\3\26"+
		"\3\26\6\26\u009c\n\26\r\26\16\26\u009d\5\26\u00a0\n\26\3\27\3\27\3\27"+
		"\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\5\2,-//\61\61\4"+
		"\2>>@@\3\2c|\5\2\62\62C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ac\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\58\3\2"+
		"\2\2\7@\3\2\2\2\tG\3\2\2\2\13M\3\2\2\2\rR\3\2\2\2\17Z\3\2\2\2\21]\3\2"+
		"\2\2\23c\3\2\2\2\25i\3\2\2\2\27r\3\2\2\2\31t\3\2\2\2\33v\3\2\2\2\35x\3"+
		"\2\2\2\37z\3\2\2\2!|\3\2\2\2#~\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2"+
		")\u008d\3\2\2\2+\u0095\3\2\2\2-\u00a1\3\2\2\2/\60\7r\2\2\60\61\7t\2\2"+
		"\61\62\7q\2\2\62\63\7i\2\2\63\64\7t\2\2\64\65\7c\2\2\65\66\7o\2\2\66\67"+
		"\7c\2\2\67\4\3\2\2\289\7h\2\29:\7k\2\2:;\7o\2\2;<\7r\2\2<=\7t\2\2=>\7"+
		"q\2\2>?\7i\2\2?\6\3\2\2\2@A\7p\2\2AB\7w\2\2BC\7o\2\2CD\7g\2\2DE\7t\2\2"+
		"EF\7q\2\2F\b\3\2\2\2GH\7v\2\2HI\7g\2\2IJ\7z\2\2JK\7v\2\2KL\7q\2\2L\n\3"+
		"\2\2\2MN\7n\2\2NO\7g\2\2OP\7k\2\2PQ\7c\2\2Q\f\3\2\2\2RS\7g\2\2ST\7u\2"+
		"\2TU\7e\2\2UV\7t\2\2VW\7g\2\2WX\7x\2\2XY\7c\2\2Y\16\3\2\2\2Z[\7u\2\2["+
		"\\\7g\2\2\\\20\3\2\2\2]^\7g\2\2^_\7p\2\2_`\7v\2\2`a\7c\2\2ab\7q\2\2b\22"+
		"\3\2\2\2cd\7u\2\2de\7g\2\2ef\7p\2\2fg\7c\2\2gh\7q\2\2h\24\3\2\2\2ij\7"+
		"g\2\2jk\7p\2\2kl\7s\2\2lm\7w\2\2mn\7c\2\2no\7p\2\2op\7v\2\2pq\7q\2\2q"+
		"\26\3\2\2\2rs\7*\2\2s\30\3\2\2\2tu\7+\2\2u\32\3\2\2\2vw\7}\2\2w\34\3\2"+
		"\2\2xy\7\177\2\2y\36\3\2\2\2z{\7=\2\2{ \3\2\2\2|}\7.\2\2}\"\3\2\2\2~\177"+
		"\t\2\2\2\177$\3\2\2\2\u0080\u0081\7?\2\2\u0081\u008a\7?\2\2\u0082\u008a"+
		"\t\3\2\2\u0083\u0084\7@\2\2\u0084\u008a\7?\2\2\u0085\u0086\7>\2\2\u0086"+
		"\u008a\7?\2\2\u0087\u0088\7#\2\2\u0088\u008a\7?\2\2\u0089\u0080\3\2\2"+
		"\2\u0089\u0082\3\2\2\2\u0089\u0083\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a&\3\2\2\2\u008b\u008c\7?\2\2\u008c(\3\2\2\2\u008d\u0091"+
		"\t\4\2\2\u008e\u0090\t\5\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092*\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0094\u0096\t\6\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009f\3\2\2\2\u0099\u009b\7\60\2\2"+
		"\u009a\u009c\t\6\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u0099\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0,\3\2\2\2\u00a1\u00a2\t\7\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a4\b\27\2\2\u00a4.\3\2\2\2\t\2\u0089\u008f\u0091\u0097\u009d"+
		"\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}