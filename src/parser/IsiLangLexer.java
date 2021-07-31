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
		T__0=1, T__1=2, T__2=3, T__3=4, AP=5, FP=6, SC=7, OP=8, ATTR=9, ID=10, 
		NUMBER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "AP", "FP", "SC", "OP", "ATTR", "ID", 
		"NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'leia'", "'escreva'", "'('", "')'", 
		"';'", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "AP", "FP", "SC", "OP", "ATTR", "ID", "NUMBER", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13F\n\13\f\13\16"+
		"\13I\13\13\3\f\6\fL\n\f\r\f\16\fM\3\f\3\f\6\fR\n\f\r\f\16\fS\5\fV\n\f"+
		"\3\r\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\3\2\7\5\2,-//\61\61\3\2c|\5\2\62\62C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5$\3\2\2\2\7,\3\2\2\2\t\61\3\2\2"+
		"\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25C\3\2"+
		"\2\2\27K\3\2\2\2\31W\3\2\2\2\33\34\7r\2\2\34\35\7t\2\2\35\36\7q\2\2\36"+
		"\37\7i\2\2\37 \7t\2\2 !\7c\2\2!\"\7o\2\2\"#\7c\2\2#\4\3\2\2\2$%\7h\2\2"+
		"%&\7k\2\2&\'\7o\2\2\'(\7r\2\2()\7t\2\2)*\7q\2\2*+\7i\2\2+\6\3\2\2\2,-"+
		"\7n\2\2-.\7g\2\2./\7k\2\2/\60\7c\2\2\60\b\3\2\2\2\61\62\7g\2\2\62\63\7"+
		"u\2\2\63\64\7e\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7x\2\2\678\7c\2\28"+
		"\n\3\2\2\29:\7*\2\2:\f\3\2\2\2;<\7+\2\2<\16\3\2\2\2=>\7=\2\2>\20\3\2\2"+
		"\2?@\t\2\2\2@\22\3\2\2\2AB\7?\2\2B\24\3\2\2\2CG\t\3\2\2DF\t\4\2\2ED\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\26\3\2\2\2IG\3\2\2\2JL\t\5\2\2K"+
		"J\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NU\3\2\2\2OQ\7\60\2\2PR\t\5\2\2"+
		"QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UO\3\2\2\2UV\3\2\2\2"+
		"V\30\3\2\2\2WX\t\6\2\2XY\3\2\2\2YZ\b\r\2\2Z\32\3\2\2\2\b\2EGMSU\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}