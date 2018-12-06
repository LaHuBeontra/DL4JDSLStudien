// Generated from src/main/java/de/sbernauer/prepro/parser/PrePro.g4 by ANTLR 4.7.1

package de.sbernauer.prepro.parser;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreProLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21, BLOCK_COMMENT=22, LINE_COMMENT=23, 
		TYPE=24, IDENTIFIER=25, STRING_LITERAL=26, NUMERIC_LITERAL=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "WS", "BLOCK_COMMENT", "LINE_COMMENT", "LETTER", 
		"NON_ZERO_DIGIT", "DIGIT", "STRING_CHAR", "TYPE", "IDENTIFIER", "STRING_LITERAL", 
		"NUMERIC_LITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'main'", "'('", "')'", "'{'", "'import'", "';'", 
		"'export'", "'}'", "','", "'returns'", "'return'", "'='", "'print'", "'debug'", 
		"'+'", "'-'", "'*'", "'X'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT", "TYPE", "IDENTIFIER", "STRING_LITERAL", "NUMERIC_LITERAL"
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


	public PreProLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PrePro.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00f0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\6\26\u0092\n\26\r\26\16\26\u0093\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u009c"+
		"\n\27\f\27\16\27\u009f\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\7\30\u00aa\n\30\f\30\16\30\u00ad\13\30\3\30\3\30\3\31\5\31\u00b2\n"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u00d1\n\35\3\36\3\36\3\36\7\36\u00d6\n\36\f\36\16\36\u00d9"+
		"\13\36\3\37\3\37\7\37\u00dd\n\37\f\37\16\37\u00e0\13\37\3\37\3\37\3 \5"+
		" \u00e5\n \3 \3 \3 \7 \u00ea\n \f \16 \u00ed\13 \5 \u00ef\n \3\u009d\2"+
		"!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\32;\33=\34"+
		"?\35\3\2\b\5\2\13\f\16\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\3\2\63;\3\2\62"+
		";\6\2\f\f\17\17$$^^\2\u00f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\3A\3\2\2\2\5J\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2"+
		"\17\\\3\2\2\2\21^\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31q\3\2"+
		"\2\2\33x\3\2\2\2\35z\3\2\2\2\37\u0080\3\2\2\2!\u0086\3\2\2\2#\u0088\3"+
		"\2\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0097"+
		"\3\2\2\2/\u00a5\3\2\2\2\61\u00b1\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2"+
		"\2\2\67\u00b7\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00da\3\2\2\2?\u00e4"+
		"\3\2\2\2AB\7h\2\2BC\7w\2\2CD\7p\2\2DE\7e\2\2EF\7v\2\2FG\7k\2\2GH\7q\2"+
		"\2HI\7p\2\2I\4\3\2\2\2JK\7o\2\2KL\7c\2\2LM\7k\2\2MN\7p\2\2N\6\3\2\2\2"+
		"OP\7*\2\2P\b\3\2\2\2QR\7+\2\2R\n\3\2\2\2ST\7}\2\2T\f\3\2\2\2UV\7k\2\2"+
		"VW\7o\2\2WX\7r\2\2XY\7q\2\2YZ\7t\2\2Z[\7v\2\2[\16\3\2\2\2\\]\7=\2\2]\20"+
		"\3\2\2\2^_\7g\2\2_`\7z\2\2`a\7r\2\2ab\7q\2\2bc\7t\2\2cd\7v\2\2d\22\3\2"+
		"\2\2ef\7\177\2\2f\24\3\2\2\2gh\7.\2\2h\26\3\2\2\2ij\7t\2\2jk\7g\2\2kl"+
		"\7v\2\2lm\7w\2\2mn\7t\2\2no\7p\2\2op\7u\2\2p\30\3\2\2\2qr\7t\2\2rs\7g"+
		"\2\2st\7v\2\2tu\7w\2\2uv\7t\2\2vw\7p\2\2w\32\3\2\2\2xy\7?\2\2y\34\3\2"+
		"\2\2z{\7r\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\36\3\2\2\2\u0080"+
		"\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083\7d\2\2\u0083\u0084\7w\2\2"+
		"\u0084\u0085\7i\2\2\u0085 \3\2\2\2\u0086\u0087\7-\2\2\u0087\"\3\2\2\2"+
		"\u0088\u0089\7/\2\2\u0089$\3\2\2\2\u008a\u008b\7,\2\2\u008b&\3\2\2\2\u008c"+
		"\u008d\7Z\2\2\u008d(\3\2\2\2\u008e\u008f\7\61\2\2\u008f*\3\2\2\2\u0090"+
		"\u0092\t\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\26\2\2\u0096"+
		",\3\2\2\2\u0097\u0098\7\61\2\2\u0098\u0099\7,\2\2\u0099\u009d\3\2\2\2"+
		"\u009a\u009c\13\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\27"+
		"\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00ab"+
		"\3\2\2\2\u00a8\u00aa\n\3\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\b\30\2\2\u00af\60\3\2\2\2\u00b0\u00b2\t\4\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4\64\3\2\2\2\u00b5\u00b6"+
		"\t\6\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\n\7\2\2\u00b88\3\2\2\2\u00b9\u00ba"+
		"\7x\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7e\2\2\u00bc\u00d1\7\65\2\2\u00bd"+
		"\u00be\7x\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7e\2\2\u00c0\u00d1\7\66\2"+
		"\2\u00c1\u00c2\7o\2\2\u00c2\u00c3\7c\2\2\u00c3\u00d1\7v\2\2\u00c4\u00c5"+
		"\7o\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7\u00d1\7\65\2\2\u00c8"+
		"\u00c9\7o\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7v\2\2\u00cb\u00d1\7\66\2"+
		"\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d1"+
		"\7n\2\2\u00d0\u00b9\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0\u00c1\3\2\2\2\u00d0"+
		"\u00c4\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1:\3\2\2\2"+
		"\u00d2\u00d7\5\61\31\2\u00d3\u00d6\5\61\31\2\u00d4\u00d6\5\65\33\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d8\3\2\2\2\u00d8<\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de"+
		"\7$\2\2\u00db\u00dd\5\67\34\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2>\3\2\2\2\u00e3\u00e5\7/\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ee\3\2\2\2\u00e6\u00ef\7\62\2\2"+
		"\u00e7\u00eb\5\63\32\2\u00e8\u00ea\5\65\33\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2"+
		"\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ef"+
		"@\3\2\2\2\16\2\u0093\u009d\u00ab\u00b1\u00d0\u00d5\u00d7\u00de\u00e4\u00eb"+
		"\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}