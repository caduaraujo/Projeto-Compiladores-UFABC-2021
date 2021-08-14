// Generated from IsiLang.g4 by ANTLR 4.7.1
package parser;

	import DataStructures.IsiSymbol;
	import DataStructures.IsiVariable;
	import DataStructures.IsiSymbolTable;
	import ast.*;
	import Exceptions.IsiSemanticException;
	import Exceptions.IsiWarning;
	import java.util.ArrayList;
	import java.util.Stack;
	

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AP=11, FP=12, AC=13, FC=14, SC=15, VIR=16, OP=17, OPREL=18, ATTR=19, 
		ID=20, NUMBER=21, WS=22, TEXTO=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "AP", "FP", "AC", "FC", "SC", "VIR", "OP", "OPREL", "ATTR", "ID", 
		"NUMBER", "WS", "TEXTO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'numero'", "'texto'", "'leia'", "'escreva'", 
		"'se'", "'entao'", "'senao'", "'enquanto'", "'('", "')'", "'{'", "'}'", 
		"';'", "','", null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "AP", 
		"FP", "AC", "FC", "SC", "VIR", "OP", "OPREL", "ATTR", "ID", "NUMBER", 
		"WS", "TEXTO"
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


		private int _tipo;
		private String _varName;
		private String _varValue; 
		private boolean _used;
		protected IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private int hashMapSize;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		
		private String _readID;
		private String _writeID;
		private String _writeText;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		private ArrayList<AbstractCommand> loopContent;
		
		public void verificaID(String id){
			if(!symbolTable.exists(id)){
				throw new IsiSemanticException("Symbol "+id+" not declared");
			}					
			else{
				
				IsiSymbol symbol = symbolTable.get(id);
				symbol.setUsed(true);

			}
		}
		
		public void exibeComandos(){
			for(AbstractCommand c : program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}
		
		public void symbolNotUsed(){
			hashMapSize = symbolTable.getSize();
			if(hashMapSize > 0){
				String[] notUsedSymbols = new String[hashMapSize];
			
			
				for(int j = 0; j < hashMapSize; j++){
					notUsedSymbols[j] = null;
				}
				int i = 0;
				
				for(String id : symbolTable.keySet()) {
					if(!symbolTable.get(id).isUsed()){
						notUsedSymbols[i] = symbolTable.get(id).getName();
						i++;
					}
				}
			
			 	if(notUsedSymbols[0] != null){
			 		String notUsedSymbolsToString = "";
			 		for(int j=0; j<hashMapSize; j++){
			 			if(notUsedSymbols[j] == null) break;
			 			notUsedSymbolsToString += notUsedSymbols[j]+"; " ;
			 		}
			 		System.out.println(); 
					System.out.println ("WARNING: Variables not used: " + notUsedSymbolsToString);
				}
				
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00b2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008c\n\23\3\24\3\24\3\25\3\25"+
		"\7\25\u0092\n\25\f\25\16\25\u0095\13\25\3\26\6\26\u0098\n\26\r\26\16\26"+
		"\u0099\3\26\3\26\6\26\u009e\n\26\r\26\16\26\u009f\5\26\u00a2\n\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00ac\n\30\f\30\16\30\u00af\13"+
		"\30\3\30\3\30\3\u00ad\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\b"+
		"\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62\62C\\c|\3\2\62;\5\2\13\f\17\17\"\""+
		"\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\3\61\3\2\2\2\5:\3\2\2\2\7B\3\2\2\2\tI\3\2\2\2\13O\3\2\2\2"+
		"\rT\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23e\3\2\2\2\25k\3\2\2\2\27t\3\2\2"+
		"\2\31v\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080\3"+
		"\2\2\2%\u008b\3\2\2\2\'\u008d\3\2\2\2)\u008f\3\2\2\2+\u0097\3\2\2\2-\u00a3"+
		"\3\2\2\2/\u00a7\3\2\2\2\61\62\7r\2\2\62\63\7t\2\2\63\64\7q\2\2\64\65\7"+
		"i\2\2\65\66\7t\2\2\66\67\7c\2\2\678\7o\2\289\7c\2\29\4\3\2\2\2:;\7h\2"+
		"\2;<\7k\2\2<=\7o\2\2=>\7r\2\2>?\7t\2\2?@\7q\2\2@A\7i\2\2A\6\3\2\2\2BC"+
		"\7p\2\2CD\7w\2\2DE\7o\2\2EF\7g\2\2FG\7t\2\2GH\7q\2\2H\b\3\2\2\2IJ\7v\2"+
		"\2JK\7g\2\2KL\7z\2\2LM\7v\2\2MN\7q\2\2N\n\3\2\2\2OP\7n\2\2PQ\7g\2\2QR"+
		"\7k\2\2RS\7c\2\2S\f\3\2\2\2TU\7g\2\2UV\7u\2\2VW\7e\2\2WX\7t\2\2XY\7g\2"+
		"\2YZ\7x\2\2Z[\7c\2\2[\16\3\2\2\2\\]\7u\2\2]^\7g\2\2^\20\3\2\2\2_`\7g\2"+
		"\2`a\7p\2\2ab\7v\2\2bc\7c\2\2cd\7q\2\2d\22\3\2\2\2ef\7u\2\2fg\7g\2\2g"+
		"h\7p\2\2hi\7c\2\2ij\7q\2\2j\24\3\2\2\2kl\7g\2\2lm\7p\2\2mn\7s\2\2no\7"+
		"w\2\2op\7c\2\2pq\7p\2\2qr\7v\2\2rs\7q\2\2s\26\3\2\2\2tu\7*\2\2u\30\3\2"+
		"\2\2vw\7+\2\2w\32\3\2\2\2xy\7}\2\2y\34\3\2\2\2z{\7\177\2\2{\36\3\2\2\2"+
		"|}\7=\2\2} \3\2\2\2~\177\7.\2\2\177\"\3\2\2\2\u0080\u0081\t\2\2\2\u0081"+
		"$\3\2\2\2\u0082\u0083\7?\2\2\u0083\u008c\7?\2\2\u0084\u008c\t\3\2\2\u0085"+
		"\u0086\7@\2\2\u0086\u008c\7?\2\2\u0087\u0088\7>\2\2\u0088\u008c\7?\2\2"+
		"\u0089\u008a\7#\2\2\u008a\u008c\7?\2\2\u008b\u0082\3\2\2\2\u008b\u0084"+
		"\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"&\3\2\2\2\u008d\u008e\7?\2\2\u008e(\3\2\2\2\u008f\u0093\t\4\2\2\u0090"+
		"\u0092\t\5\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094*\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098"+
		"\t\6\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00a1\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009e\t"+
		"\6\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2,\3\2\2\2\u00a3\u00a4\t\7\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\b\27\2\2\u00a6.\3\2\2\2\u00a7\u00ad\7$\2\2\u00a8\u00a9\7^\2\2\u00a9\u00ac"+
		"\7$\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\60\3\2\2\2\13\2\u008b"+
		"\u0091\u0093\u0099\u009f\u00a1\u00ab\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}