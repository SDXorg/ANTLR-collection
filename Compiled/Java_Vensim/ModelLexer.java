// Generated from Model.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Encoding=10, UnitsDoc=11, Group=12, Sketch=13, Star=14, Div=15, Plus=16, 
		Minus=17, Less=18, LessEqual=19, Greater=20, GreaterEqual=21, Equal=22, 
		TwoEqual=23, NotEqual=24, Exclamation=25, Id=26, Const=27, StringLiteral=28, 
		Keyword=29, Whitespace=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"Encoding", "UnitsDoc", "Group", "Sketch", "Star", "Div", "Plus", "Minus", 
		"Less", "LessEqual", "Greater", "GreaterEqual", "Equal", "TwoEqual", "NotEqual", 
		"Exclamation", "Id", "IdChar", "Nondigit", "Digit", "Const", "IntegerConst", 
		"NonzeroDigit", "FloatingConst", "FractionalConstant", "ExponentPart", 
		"Sign", "DigitSeq", "StringLiteral", "SCharSequence", "SChar", "EscapeSequence", 
		"Keyword", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "','", "']'", "'('", "')'", "':NOT:'", "'^'", "':AND:'", 
		"':OR:'", null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'<'", "'<='", 
		"'>'", "'>='", "'='", "'=='", "'<>'", "'!'", null, null, null, "':NA:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Encoding", 
		"UnitsDoc", "Group", "Sketch", "Star", "Div", "Plus", "Minus", "Less", 
		"LessEqual", "Greater", "GreaterEqual", "Equal", "TwoEqual", "NotEqual", 
		"Exclamation", "Id", "Const", "StringLiteral", "Keyword", "Whitespace"
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


	public ModelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Model.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u012c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\6\13y\n\13"+
		"\r\13\16\13z\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0083\n\f\f\f\16\f\u0086"+
		"\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095"+
		"\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a0\n\16\f\16\16"+
		"\16\u00a3\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u00c5\n\33\f\33\16\33\u00c8\13"+
		"\33\3\33\3\33\3\33\7\33\u00cd\n\33\f\33\16\33\u00d0\13\33\3\33\3\33\3"+
		"\33\5\33\u00d5\n\33\3\33\5\33\u00d8\n\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\5\37\u00e2\n\37\3 \6 \u00e5\n \r \16 \u00e6\3!\3!\3\"\3\"\5"+
		"\"\u00ed\n\"\3\"\3\"\3\"\5\"\u00f2\n\"\3#\5#\u00f5\n#\3#\3#\3#\3#\3#\5"+
		"#\u00fc\n#\3$\3$\5$\u0100\n$\3$\3$\3$\5$\u0105\n$\3$\5$\u0108\n$\3%\3"+
		"%\3&\6&\u010d\n&\r&\16&\u010e\3\'\3\'\5\'\u0113\n\'\3\'\3\'\3(\6(\u0118"+
		"\n(\r(\16(\u0119\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\6,\u0127\n,\r,\16,\u0128"+
		"\3,\3,\4\u0084\u0093\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\29\2;\2=\35?\2A\2C\2E\2G\2I\2K\2M\36O\2Q\2S\2U\37W \3\2\13"+
		"\6\2//\62;C\\c|\6\2\62;C\\aac|\5\2C\\aac|\3\2\62;\3\2\63;\4\2--//\6\2"+
		"\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\5\2\13\f\17\17\"\"\u0135\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2=\3\2\2\2\2M\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3"+
		"\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23q\3\2\2\2\25v\3\2\2\2\27\u0080\3\2\2"+
		"\2\31\u008b\3\2\2\2\33\u009a\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2"+
		"!\u00aa\3\2\2\2#\u00ac\3\2\2\2%\u00ae\3\2\2\2\'\u00b0\3\2\2\2)\u00b3\3"+
		"\2\2\2+\u00b5\3\2\2\2-\u00b8\3\2\2\2/\u00ba\3\2\2\2\61\u00bd\3\2\2\2\63"+
		"\u00c0\3\2\2\2\65\u00d4\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd"+
		"\3\2\2\2=\u00e1\3\2\2\2?\u00e4\3\2\2\2A\u00e8\3\2\2\2C\u00f1\3\2\2\2E"+
		"\u00fb\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K\u010c\3\2\2\2M\u0110\3\2"+
		"\2\2O\u0117\3\2\2\2Q\u011b\3\2\2\2S\u011d\3\2\2\2U\u0120\3\2\2\2W\u0126"+
		"\3\2\2\2YZ\7]\2\2Z\4\3\2\2\2[\\\7.\2\2\\\6\3\2\2\2]^\7_\2\2^\b\3\2\2\2"+
		"_`\7*\2\2`\n\3\2\2\2ab\7+\2\2b\f\3\2\2\2cd\7<\2\2de\7P\2\2ef\7Q\2\2fg"+
		"\7V\2\2gh\7<\2\2h\16\3\2\2\2ij\7`\2\2j\20\3\2\2\2kl\7<\2\2lm\7C\2\2mn"+
		"\7P\2\2no\7F\2\2op\7<\2\2p\22\3\2\2\2qr\7<\2\2rs\7Q\2\2st\7T\2\2tu\7<"+
		"\2\2u\24\3\2\2\2vx\7}\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{|\3\2\2\2|}\7\177\2\2}~\3\2\2\2~\177\b\13\2\2\177\26\3\2\2\2\u0080"+
		"\u0084\7\u0080\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7~\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\f"+
		"\2\2\u008a\30\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7,\2\2\u008d\u008e"+
		"\7,\2\2\u008e\u008f\7,\2\2\u008f\u0093\3\2\2\2\u0090\u0092\13\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7~\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\b\r\2\2\u0099\32\3\2\2\2\u009a\u009b\7^\2\2"+
		"\u009b\u009c\7^\2\2\u009c\u009d\7^\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0"+
		"\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\b\16\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\36\3\2\2\2\u00a8\u00a9"+
		"\7\61\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\"\3\2\2\2\u00ac\u00ad"+
		"\7/\2\2\u00ad$\3\2\2\2\u00ae\u00af\7>\2\2\u00af&\3\2\2\2\u00b0\u00b1\7"+
		">\2\2\u00b1\u00b2\7?\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7@\2\2\u00b4*\3\2"+
		"\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b7\7?\2\2\u00b7,\3\2\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9.\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7?\2\2\u00bc\60"+
		"\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7@\2\2\u00bf\62\3\2\2\2\u00c0"+
		"\u00c1\7#\2\2\u00c1\64\3\2\2\2\u00c2\u00c6\59\35\2\u00c3\u00c5\5\67\34"+
		"\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00d5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\59\35\2\u00ca"+
		"\u00cd\5\67\34\2\u00cb\u00cd\7\"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3"+
		"\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\67\34\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d5\5M\'\2\u00d4\u00c2\3\2\2\2\u00d4\u00c9\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5\63\32\2\u00d7\u00d6\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\66\3\2\2\2\u00d9\u00da\t\3\2\2\u00da"+
		"8\3\2\2\2\u00db\u00dc\t\4\2\2\u00dc:\3\2\2\2\u00dd\u00de\t\5\2\2\u00de"+
		"<\3\2\2\2\u00df\u00e2\5? \2\u00e0\u00e2\5C\"\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2>\3\2\2\2\u00e3\u00e5\5;\36\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7@\3"+
		"\2\2\2\u00e8\u00e9\t\6\2\2\u00e9B\3\2\2\2\u00ea\u00ec\5E#\2\u00eb\u00ed"+
		"\5G$\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f2\3\2\2\2\u00ee"+
		"\u00ef\5K&\2\u00ef\u00f0\5G$\2\u00f0\u00f2\3\2\2\2\u00f1\u00ea\3\2\2\2"+
		"\u00f1\u00ee\3\2\2\2\u00f2D\3\2\2\2\u00f3\u00f5\5K&\2\u00f4\u00f3\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7"+
		"\u00fc\5K&\2\u00f8\u00f9\5K&\2\u00f9\u00fa\7\60\2\2\u00fa\u00fc\3\2\2"+
		"\2\u00fb\u00f4\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fcF\3\2\2\2\u00fd\u00ff"+
		"\7g\2\2\u00fe\u0100\5I%\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0108\5K&\2\u0102\u0104\7G\2\2\u0103\u0105\5I%\2"+
		"\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108"+
		"\5K&\2\u0107\u00fd\3\2\2\2\u0107\u0102\3\2\2\2\u0108H\3\2\2\2\u0109\u010a"+
		"\t\7\2\2\u010aJ\3\2\2\2\u010b\u010d\5;\36\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fL\3\2\2\2"+
		"\u0110\u0112\7$\2\2\u0111\u0113\5O(\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7$\2\2\u0115N\3\2\2\2\u0116\u0118"+
		"\5Q)\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011aP\3\2\2\2\u011b\u011c\n\b\2\2\u011cR\3\2\2\2\u011d"+
		"\u011e\7^\2\2\u011e\u011f\t\t\2\2\u011fT\3\2\2\2\u0120\u0121\7<\2\2\u0121"+
		"\u0122\7P\2\2\u0122\u0123\7C\2\2\u0123\u0124\7<\2\2\u0124V\3\2\2\2\u0125"+
		"\u0127\t\n\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\b,\2\2\u012b"+
		"X\3\2\2\2\31\2z\u0084\u0093\u00a1\u00c6\u00cc\u00ce\u00d4\u00d7\u00e1"+
		"\u00e6\u00ec\u00f1\u00f4\u00fb\u00ff\u0104\u0107\u010e\u0112\u0119\u0128"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}