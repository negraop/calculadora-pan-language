// Generated from PanLang.g4 by ANTLR 4.13.2
package br.com.negraop.calculadora.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PanLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AP=6, FP=7, SC=8, OP_S=9, OP_P=10, 
		ATTR=11, VIR=12, ID=13, NUMBER=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "AP", "FP", "SC", "OP_S", "OP_P", 
			"ATTR", "VIR", "ID", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'numero'", "'leia'", "'escreva'", 
			"'('", "')'", "';'", null, null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "AP", "FP", "SC", "OP_S", "OP_P", 
			"ATTR", "VIR", "ID", "NUMBER", "WS"
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


	public PanLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PanLang.g4"; }

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
		"\u0004\u0000\u000fm\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0003\fU\b\f\u0001\f\u0005\fX\b\f\n\f\f\f["+
		"\t\f\u0001\r\u0004\r^\b\r\u000b\r\f\r_\u0001\r\u0001\r\u0004\rd\b\r\u000b"+
		"\r\f\re\u0003\rh\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u0001\u0000\u0006\u0002\u0000++--\u0002\u0000**//\u0002"+
		"\u0000AZaz\u0003\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r\r  p\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003(\u0001"+
		"\u0000\u0000\u0000\u00051\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000"+
		"\u0000\t=\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000\u0000\rG\u0001"+
		"\u0000\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000"+
		"\u0000\u0013M\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017"+
		"Q\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001b]\u0001"+
		"\u0000\u0000\u0000\u001di\u0001\u0000\u0000\u0000\u001f \u0005p\u0000"+
		"\u0000 !\u0005r\u0000\u0000!\"\u0005o\u0000\u0000\"#\u0005g\u0000\u0000"+
		"#$\u0005r\u0000\u0000$%\u0005a\u0000\u0000%&\u0005m\u0000\u0000&\'\u0005"+
		"a\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005f\u0000\u0000)*\u0005"+
		"i\u0000\u0000*+\u0005m\u0000\u0000+,\u0005p\u0000\u0000,-\u0005r\u0000"+
		"\u0000-.\u0005o\u0000\u0000./\u0005g\u0000\u0000/0\u0005;\u0000\u0000"+
		"0\u0004\u0001\u0000\u0000\u000012\u0005n\u0000\u000023\u0005u\u0000\u0000"+
		"34\u0005m\u0000\u000045\u0005e\u0000\u000056\u0005r\u0000\u000067\u0005"+
		"o\u0000\u00007\u0006\u0001\u0000\u0000\u000089\u0005l\u0000\u00009:\u0005"+
		"e\u0000\u0000:;\u0005i\u0000\u0000;<\u0005a\u0000\u0000<\b\u0001\u0000"+
		"\u0000\u0000=>\u0005e\u0000\u0000>?\u0005s\u0000\u0000?@\u0005c\u0000"+
		"\u0000@A\u0005r\u0000\u0000AB\u0005e\u0000\u0000BC\u0005v\u0000\u0000"+
		"CD\u0005a\u0000\u0000D\n\u0001\u0000\u0000\u0000EF\u0005(\u0000\u0000"+
		"F\f\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\u000e\u0001\u0000\u0000"+
		"\u0000IJ\u0005;\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0007\u0000"+
		"\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0007\u0001\u0000\u0000"+
		"N\u0014\u0001\u0000\u0000\u0000OP\u0005=\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QR\u0005,\u0000\u0000R\u0018\u0001\u0000\u0000\u0000SU\u0007"+
		"\u0002\u0000\u0000TS\u0001\u0000\u0000\u0000UY\u0001\u0000\u0000\u0000"+
		"VX\u0007\u0003\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u001a\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0007\u0004\u0000\u0000"+
		"]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`g\u0001\u0000\u0000\u0000ac\u0005.\u0000"+
		"\u0000bd\u0007\u0004\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001"+
		"\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"h\u001c\u0001\u0000\u0000\u0000ij\u0007\u0005\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000kl\u0006\u000e\u0000\u0000l\u001e\u0001\u0000\u0000\u0000"+
		"\u0007\u0000TWY_eg\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}