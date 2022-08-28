// Generated from Grito.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GritoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARACOES=1, ALGORITMO=2, RETORNA=3, ATRIBUIR=4, OP_ARIT=5, OP_REL=6, 
		OP_LOG=7, TIPO=8, FUNC=9, NUM=10, AP=11, FP=12, CADEIA=13, ENTRADA=14, 
		SAIDA=15, CONDICIONAL=16, COND=17, REPETICAO=18, REP=19, FL=20, BLOCO=21, 
		VIRGULA=22, ID=23, WS=24, ErrorChar=25, COMENTARIO=26;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_comandos = 2, RULE_declaracao = 3, 
		RULE_inicializacao = 4, RULE_comando = 5, RULE_atribuicao = 6, RULE_computacoes = 7, 
		RULE_computacao = 8, RULE_funcao = 9, RULE_argumentos = 10, RULE_argumento = 11, 
		RULE_informacao = 12, RULE_operador = 13, RULE_termo = 14, RULE_io = 15, 
		RULE_repeticao = 16, RULE_condicao = 17, RULE_conjunturas = 18, RULE_conjuntura = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "comandos", "declaracao", "inicializacao", 
			"comando", "atribuicao", "computacoes", "computacao", "funcao", "argumentos", 
			"argumento", "informacao", "operador", "termo", "io", "repeticao", "condicao", 
			"conjunturas", "conjuntura"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARACOES'", "'ALGORITMO'", "'RETORNA'", "'='", null, null, 
			null, null, "'funcao'", null, "'('", "')'", null, "'LER'", "'IMPRIMIR'", 
			null, "'?'", "'enquanto'", "'@'", "'!'", "'#'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARACOES", "ALGORITMO", "RETORNA", "ATRIBUIR", "OP_ARIT", "OP_REL", 
			"OP_LOG", "TIPO", "FUNC", "NUM", "AP", "FP", "CADEIA", "ENTRADA", "SAIDA", 
			"CONDICIONAL", "COND", "REPETICAO", "REP", "FL", "BLOCO", "VIRGULA", 
			"ID", "WS", "ErrorChar", "COMENTARIO"
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

	@Override
	public String getGrammarFileName() { return "Grito.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GritoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode DECLARACOES() { return getToken(GritoParser.DECLARACOES, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(GritoParser.ALGORITMO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(DECLARACOES);
			setState(41);
			declaracoes();
			setState(42);
			match(ALGORITMO);
			setState(43);
			comandos();
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaracao();
				setState(46);
				declaracoes();
				}
				break;
			case ALGORITMO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandos);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTRADA:
			case SAIDA:
			case COND:
			case REP:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				comando();
				setState(52);
				comandos();
				}
				break;
			case EOF:
			case RETORNA:
			case BLOCO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GritoParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public InicializacaoContext inicializacao() {
			return getRuleContext(InicializacaoContext.class,0);
		}
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(TIPO);
				setState(58);
				match(ID);
				setState(59);
				inicializacao();
				setState(60);
				match(FL);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				funcao();
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

	public static class InicializacaoContext extends ParserRuleContext {
		public TerminalNode ATRIBUIR() { return getToken(GritoParser.ATRIBUIR, 0); }
		public InformacaoContext informacao() {
			return getRuleContext(InformacaoContext.class,0);
		}
		public InicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoContext inicializacao() throws RecognitionException {
		InicializacaoContext _localctx = new InicializacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inicializacao);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATRIBUIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ATRIBUIR);
				setState(66);
				informacao();
				}
				break;
			case FL:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				atribuicao();
				}
				break;
			case ENTRADA:
			case SAIDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				io();
				}
				break;
			case REP:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				repeticao();
				}
				break;
			case COND:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				condicao();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode ATRIBUIR() { return getToken(GritoParser.ATRIBUIR, 0); }
		public ComputacaoContext computacao() {
			return getRuleContext(ComputacaoContext.class,0);
		}
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(ATRIBUIR);
			setState(78);
			computacao();
			setState(79);
			match(FL);
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

	public static class ComputacoesContext extends ParserRuleContext {
		public ComputacaoContext computacao() {
			return getRuleContext(ComputacaoContext.class,0);
		}
		public ComputacoesContext computacoes() {
			return getRuleContext(ComputacoesContext.class,0);
		}
		public ComputacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterComputacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitComputacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitComputacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputacoesContext computacoes() throws RecognitionException {
		ComputacoesContext _localctx = new ComputacoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_computacoes);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				computacao();
				setState(82);
				computacoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComputacaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ComputacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterComputacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitComputacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitComputacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputacaoContext computacao() throws RecognitionException {
		ComputacaoContext _localctx = new ComputacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_computacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			termo();
			setState(88);
			operador();
			setState(89);
			termo();
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

	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(GritoParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode AP() { return getToken(GritoParser.AP, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode FP() { return getToken(GritoParser.FP, 0); }
		public List<TerminalNode> BLOCO() { return getTokens(GritoParser.BLOCO); }
		public TerminalNode BLOCO(int i) {
			return getToken(GritoParser.BLOCO, i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RETORNA() { return getToken(GritoParser.RETORNA, 0); }
		public ConjunturasContext conjunturas() {
			return getRuleContext(ConjunturasContext.class,0);
		}
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(FUNC);
			setState(92);
			match(ID);
			setState(93);
			match(AP);
			setState(94);
			argumentos();
			setState(95);
			match(FP);
			setState(96);
			match(BLOCO);
			setState(97);
			comandos();
			setState(98);
			match(RETORNA);
			setState(99);
			conjunturas();
			setState(100);
			match(FL);
			setState(101);
			match(BLOCO);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentos);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				argumento();
				setState(104);
				argumentos();
				}
				break;
			case FP:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GritoParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode VIRGULA() { return getToken(GritoParser.VIRGULA, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumento);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(TIPO);
				setState(110);
				match(ID);
				}
				break;
			case VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(VIRGULA);
				setState(112);
				match(TIPO);
				setState(113);
				match(ID);
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

	public static class InformacaoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(GritoParser.CADEIA, 0); }
		public TerminalNode NUM() { return getToken(GritoParser.NUM, 0); }
		public InformacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterInformacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitInformacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitInformacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InformacaoContext informacao() throws RecognitionException {
		InformacaoContext _localctx = new InformacaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_informacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==CADEIA) ) {
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode OP_ARIT() { return getToken(GritoParser.OP_ARIT, 0); }
		public TerminalNode OP_LOG() { return getToken(GritoParser.OP_LOG, 0); }
		public TerminalNode OP_REL() { return getToken(GritoParser.OP_REL, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARIT) | (1L << OP_REL) | (1L << OP_LOG))) != 0)) ) {
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public InformacaoContext informacao() {
			return getRuleContext(InformacaoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(ID);
				}
				break;
			case NUM:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				informacao();
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

	public static class IoContext extends ParserRuleContext {
		public TerminalNode ENTRADA() { return getToken(GritoParser.ENTRADA, 0); }
		public TerminalNode AP() { return getToken(GritoParser.AP, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode FP() { return getToken(GritoParser.FP, 0); }
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public TerminalNode SAIDA() { return getToken(GritoParser.SAIDA, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitIo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_io);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTRADA:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(ENTRADA);
				setState(125);
				match(AP);
				setState(126);
				match(ID);
				setState(127);
				match(FP);
				setState(128);
				match(FL);
				}
				break;
			case SAIDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(SAIDA);
				setState(130);
				match(AP);
				setState(131);
				termo();
				setState(132);
				match(FP);
				setState(133);
				match(FL);
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

	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(GritoParser.REP, 0); }
		public TerminalNode REPETICAO() { return getToken(GritoParser.REPETICAO, 0); }
		public ConjunturasContext conjunturas() {
			return getRuleContext(ConjunturasContext.class,0);
		}
		public List<TerminalNode> BLOCO() { return getTokens(GritoParser.BLOCO); }
		public TerminalNode BLOCO(int i) {
			return getToken(GritoParser.BLOCO, i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(REP);
			setState(138);
			match(REPETICAO);
			setState(139);
			conjunturas();
			setState(140);
			match(BLOCO);
			setState(141);
			comandos();
			setState(142);
			match(BLOCO);
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

	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(GritoParser.COND, 0); }
		public TerminalNode CONDICIONAL() { return getToken(GritoParser.CONDICIONAL, 0); }
		public ConjunturasContext conjunturas() {
			return getRuleContext(ConjunturasContext.class,0);
		}
		public List<TerminalNode> BLOCO() { return getTokens(GritoParser.BLOCO); }
		public TerminalNode BLOCO(int i) {
			return getToken(GritoParser.BLOCO, i);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(COND);
			setState(145);
			match(CONDICIONAL);
			setState(146);
			conjunturas();
			setState(147);
			match(BLOCO);
			setState(148);
			comandos();
			setState(149);
			match(BLOCO);
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

	public static class ConjunturasContext extends ParserRuleContext {
		public ConjunturaContext conjuntura() {
			return getRuleContext(ConjunturaContext.class,0);
		}
		public ConjunturasContext conjunturas() {
			return getRuleContext(ConjunturasContext.class,0);
		}
		public ConjunturasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunturas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterConjunturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitConjunturas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitConjunturas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunturasContext conjunturas() throws RecognitionException {
		ConjunturasContext _localctx = new ConjunturasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conjunturas);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ARIT:
			case OP_REL:
			case OP_LOG:
			case NUM:
			case CADEIA:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				conjuntura();
				setState(152);
				conjunturas();
				}
				break;
			case FL:
			case BLOCO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ConjunturaContext extends ParserRuleContext {
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ConjunturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuntura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterConjuntura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitConjuntura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitConjuntura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunturaContext conjuntura() throws RecognitionException {
		ConjunturaContext _localctx = new ConjunturaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conjuntura);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_ARIT:
			case OP_REL:
			case OP_LOG:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				operador();
				setState(158);
				termo();
				}
				break;
			case NUM:
			case CADEIA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				termo();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00028\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003@\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004E\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007V\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nl\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bs\b\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e{\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0088"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u009c\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00a2\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0002\u0002\u0000\n\n\r\r\u0001\u0000\u0005\u0007\u009d\u0000"+
		"(\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u00047\u0001"+
		"\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000"+
		"\u0000\nJ\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eU\u0001"+
		"\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000"+
		"\u0000\u0014k\u0001\u0000\u0000\u0000\u0016r\u0001\u0000\u0000\u0000\u0018"+
		"t\u0001\u0000\u0000\u0000\u001av\u0001\u0000\u0000\u0000\u001cz\u0001"+
		"\u0000\u0000\u0000\u001e\u0087\u0001\u0000\u0000\u0000 \u0089\u0001\u0000"+
		"\u0000\u0000\"\u0090\u0001\u0000\u0000\u0000$\u009b\u0001\u0000\u0000"+
		"\u0000&\u00a1\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003"+
		"\u0002\u0001\u0000*+\u0005\u0002\u0000\u0000+,\u0003\u0004\u0002\u0000"+
		",\u0001\u0001\u0000\u0000\u0000-.\u0003\u0006\u0003\u0000./\u0003\u0002"+
		"\u0001\u0000/2\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001-\u0001"+
		"\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000"+
		"\u000034\u0003\n\u0005\u000045\u0003\u0004\u0002\u000058\u0001\u0000\u0000"+
		"\u000068\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\b\u0000\u0000:;\u0005"+
		"\u0017\u0000\u0000;<\u0003\b\u0004\u0000<=\u0005\u0014\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000>@\u0003\u0012\t\u0000?9\u0001\u0000\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005\u0004\u0000"+
		"\u0000BE\u0003\u0018\f\u0000CE\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000FK\u0003\f"+
		"\u0006\u0000GK\u0003\u001e\u000f\u0000HK\u0003 \u0010\u0000IK\u0003\""+
		"\u0011\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0017\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0003\u0010"+
		"\b\u0000OP\u0005\u0014\u0000\u0000P\r\u0001\u0000\u0000\u0000QR\u0003"+
		"\u0010\b\u0000RS\u0003\u000e\u0007\u0000SV\u0001\u0000\u0000\u0000TV\u0001"+
		"\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000"+
		"V\u000f\u0001\u0000\u0000\u0000WX\u0003\u001c\u000e\u0000XY\u0003\u001a"+
		"\r\u0000YZ\u0003\u001c\u000e\u0000Z\u0011\u0001\u0000\u0000\u0000[\\\u0005"+
		"\t\u0000\u0000\\]\u0005\u0017\u0000\u0000]^\u0005\u000b\u0000\u0000^_"+
		"\u0003\u0014\n\u0000_`\u0005\f\u0000\u0000`a\u0005\u0015\u0000\u0000a"+
		"b\u0003\u0004\u0002\u0000bc\u0005\u0003\u0000\u0000cd\u0003$\u0012\u0000"+
		"de\u0005\u0014\u0000\u0000ef\u0005\u0015\u0000\u0000f\u0013\u0001\u0000"+
		"\u0000\u0000gh\u0003\u0016\u000b\u0000hi\u0003\u0014\n\u0000il\u0001\u0000"+
		"\u0000\u0000jl\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000l\u0015\u0001\u0000\u0000\u0000mn\u0005\b\u0000\u0000"+
		"ns\u0005\u0017\u0000\u0000op\u0005\u0016\u0000\u0000pq\u0005\b\u0000\u0000"+
		"qs\u0005\u0017\u0000\u0000rm\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000"+
		"\u0000s\u0017\u0001\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\u0019"+
		"\u0001\u0000\u0000\u0000vw\u0007\u0001\u0000\u0000w\u001b\u0001\u0000"+
		"\u0000\u0000x{\u0005\u0017\u0000\u0000y{\u0003\u0018\f\u0000zx\u0001\u0000"+
		"\u0000\u0000zy\u0001\u0000\u0000\u0000{\u001d\u0001\u0000\u0000\u0000"+
		"|}\u0005\u000e\u0000\u0000}~\u0005\u000b\u0000\u0000~\u007f\u0005\u0017"+
		"\u0000\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0088\u0005\u0014\u0000"+
		"\u0000\u0081\u0082\u0005\u000f\u0000\u0000\u0082\u0083\u0005\u000b\u0000"+
		"\u0000\u0083\u0084\u0003\u001c\u000e\u0000\u0084\u0085\u0005\f\u0000\u0000"+
		"\u0085\u0086\u0005\u0014\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087|\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0088"+
		"\u001f\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0013\u0000\u0000\u008a"+
		"\u008b\u0005\u0012\u0000\u0000\u008b\u008c\u0003$\u0012\u0000\u008c\u008d"+
		"\u0005\u0015\u0000\u0000\u008d\u008e\u0003\u0004\u0002\u0000\u008e\u008f"+
		"\u0005\u0015\u0000\u0000\u008f!\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u0011\u0000\u0000\u0091\u0092\u0005\u0010\u0000\u0000\u0092\u0093\u0003"+
		"$\u0012\u0000\u0093\u0094\u0005\u0015\u0000\u0000\u0094\u0095\u0003\u0004"+
		"\u0002\u0000\u0095\u0096\u0005\u0015\u0000\u0000\u0096#\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0003&\u0013\u0000\u0098\u0099\u0003$\u0012\u0000\u0099"+
		"\u009c\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b"+
		"\u0097\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"%\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u001a\r\u0000\u009e\u009f"+
		"\u0003\u001c\u000e\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u00a2"+
		"\u0003\u001c\u000e\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\'\u0001\u0000\u0000\u0000\f17?DJUkrz\u0087"+
		"\u009b\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}