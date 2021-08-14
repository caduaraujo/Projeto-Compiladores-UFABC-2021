// Generated from IsiLang.g4 by ANTLR 4.7.1
package parser;
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, OP_REL=9, 
		AP=10, FP=11, SC=12, OP=13, ATTR=14, ID=15, NUMBER=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "OP_REL", 
		"AP", "FP", "SC", "OP", "ATTR", "ID", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'leia'", "'escreva'", "'se'", "'{'", 
		"'}'", "'senao'", null, "'('", "')'", "';'", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "OP_REL", "AP", 
		"FP", "SC", "OP", "ATTR", "ID", "NUMBER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nZ\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20h"+
		"\n\20\f\20\16\20k\13\20\3\21\6\21n\n\21\r\21\16\21o\3\21\3\21\6\21t\n"+
		"\21\r\21\16\21u\5\21x\n\21\3\22\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3"+
		"\2\b\4\2>>@@\5\2,-//\61\61\3\2c|\5\2\62\62C\\c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\3%\3\2\2\2\5.\3\2\2\2\7\66\3\2\2\2\t;\3\2\2\2\13C\3\2"+
		"\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3"+
		"\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!m\3\2\2\2#y\3\2"+
		"\2\2%&\7r\2\2&\'\7t\2\2\'(\7q\2\2()\7i\2\2)*\7t\2\2*+\7c\2\2+,\7o\2\2"+
		",-\7c\2\2-\4\3\2\2\2./\7h\2\2/\60\7k\2\2\60\61\7o\2\2\61\62\7r\2\2\62"+
		"\63\7t\2\2\63\64\7q\2\2\64\65\7i\2\2\65\6\3\2\2\2\66\67\7n\2\2\678\7g"+
		"\2\289\7k\2\29:\7c\2\2:\b\3\2\2\2;<\7g\2\2<=\7u\2\2=>\7e\2\2>?\7t\2\2"+
		"?@\7g\2\2@A\7x\2\2AB\7c\2\2B\n\3\2\2\2CD\7u\2\2DE\7g\2\2E\f\3\2\2\2FG"+
		"\7}\2\2G\16\3\2\2\2HI\7\177\2\2I\20\3\2\2\2JK\7u\2\2KL\7g\2\2LM\7p\2\2"+
		"MN\7c\2\2NO\7q\2\2O\22\3\2\2\2PQ\7?\2\2QZ\7?\2\2RZ\t\2\2\2ST\7@\2\2TZ"+
		"\7?\2\2UV\7>\2\2VZ\7?\2\2WX\7#\2\2XZ\7?\2\2YP\3\2\2\2YR\3\2\2\2YS\3\2"+
		"\2\2YU\3\2\2\2YW\3\2\2\2Z\24\3\2\2\2[\\\7*\2\2\\\26\3\2\2\2]^\7+\2\2^"+
		"\30\3\2\2\2_`\7=\2\2`\32\3\2\2\2ab\t\3\2\2b\34\3\2\2\2cd\7?\2\2d\36\3"+
		"\2\2\2ei\t\4\2\2fh\t\5\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j \3"+
		"\2\2\2ki\3\2\2\2ln\t\6\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pw\3"+
		"\2\2\2qs\7\60\2\2rt\t\6\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vx"+
		"\3\2\2\2wq\3\2\2\2wx\3\2\2\2x\"\3\2\2\2yz\t\7\2\2z{\3\2\2\2{|\b\22\2\2"+
		"|$\3\2\2\2\t\2Ygiouw\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}