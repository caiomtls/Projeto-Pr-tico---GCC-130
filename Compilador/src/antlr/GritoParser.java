// Generated from Grito.g4 by ANTLR 4.10.1

    package antlr;

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
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	 
		public ProgramaContext() { }
		public void copyFrom(ProgramaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoProgramaContext extends ProgramaContext {
		public TerminalNode DECLARACOES() { return getToken(GritoParser.DECLARACOES, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(GritoParser.ALGORITMO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GritoParser.EOF, 0); }
		public BlocoProgramaContext(ProgramaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterBlocoPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitBlocoPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitBlocoPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			_localctx = new BlocoProgramaContext(_localctx);
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
			setState(44);
			match(EOF);
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
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
	 
		public DeclaracoesContext() { }
		public void copyFrom(DeclaracoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoDeclaracoesContext extends DeclaracoesContext {
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public BlocoDeclaracoesContext(DeclaracoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterBlocoDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitBlocoDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitBlocoDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			int _alt;
			_localctx = new BlocoDeclaracoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TIPO:
						{
						setState(46);
						declaracao();
						}
						break;
					case FUNC:
						{
						setState(47);
						funcao();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(50);
					declaracoes();
					}
					} 
				}
				setState(56);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	 
		public ComandosContext() { }
		public void copyFrom(ComandosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComandosContext extends ComandosContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public NComandosContext(ComandosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandos);
		try {
			int _alt;
			_localctx = new NComandosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					comando();
					setState(58);
					comandos();
					}
					} 
				}
				setState(64);
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
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NDeclaracaoContext extends DeclaracaoContext {
		public TerminalNode TIPO() { return getToken(GritoParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public InicializacaoContext inicializacao() {
			return getRuleContext(InicializacaoContext.class,0);
		}
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public NDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			_localctx = new NDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(TIPO);
			setState(66);
			match(ID);
			setState(67);
			inicializacao();
			setState(68);
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

	public static class InicializacaoContext extends ParserRuleContext {
		public InicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao; }
	 
		public InicializacaoContext() { }
		public void copyFrom(InicializacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NInicializacaoContext extends InicializacaoContext {
		public List<TerminalNode> ATRIBUIR() { return getTokens(GritoParser.ATRIBUIR); }
		public TerminalNode ATRIBUIR(int i) {
			return getToken(GritoParser.ATRIBUIR, i);
		}
		public List<InformacaoContext> informacao() {
			return getRuleContexts(InformacaoContext.class);
		}
		public InformacaoContext informacao(int i) {
			return getRuleContext(InformacaoContext.class,i);
		}
		public NInicializacaoContext(InicializacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoContext inicializacao() throws RecognitionException {
		InicializacaoContext _localctx = new InicializacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inicializacao);
		int _la;
		try {
			_localctx = new NInicializacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ATRIBUIR) {
				{
				{
				setState(70);
				match(ATRIBUIR);
				setState(71);
				informacao();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComandoContext extends ComandoContext {
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
		public NComandoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando);
		try {
			_localctx = new NComandoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(77);
				atribuicao();
				}
				break;
			case ENTRADA:
			case SAIDA:
				{
				setState(78);
				io();
				}
				break;
			case REP:
				{
				setState(79);
				repeticao();
				}
				break;
			case COND:
				{
				setState(80);
				condicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NAtribuicaoContext extends AtribuicaoContext {
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode ATRIBUIR() { return getToken(GritoParser.ATRIBUIR, 0); }
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public List<ComputacaoContext> computacao() {
			return getRuleContexts(ComputacaoContext.class);
		}
		public ComputacaoContext computacao(int i) {
			return getRuleContext(ComputacaoContext.class,i);
		}
		public List<InformacaoContext> informacao() {
			return getRuleContexts(InformacaoContext.class);
		}
		public InformacaoContext informacao(int i) {
			return getRuleContext(InformacaoContext.class,i);
		}
		public NAtribuicaoContext(AtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		int _la;
		try {
			_localctx = new NAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(84);
			match(ATRIBUIR);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << CADEIA) | (1L << ID))) != 0)) {
				{
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(85);
					computacao();
					}
					break;
				case 2:
					{
					setState(86);
					informacao();
					}
					break;
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		public ComputacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computacoes; }
	 
		public ComputacoesContext() { }
		public void copyFrom(ComputacoesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComputacoesContext extends ComputacoesContext {
		public List<ComputacaoContext> computacao() {
			return getRuleContexts(ComputacaoContext.class);
		}
		public ComputacaoContext computacao(int i) {
			return getRuleContext(ComputacaoContext.class,i);
		}
		public List<ComputacoesContext> computacoes() {
			return getRuleContexts(ComputacoesContext.class);
		}
		public ComputacoesContext computacoes(int i) {
			return getRuleContext(ComputacoesContext.class,i);
		}
		public NComputacoesContext(ComputacoesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNComputacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNComputacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNComputacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputacoesContext computacoes() throws RecognitionException {
		ComputacoesContext _localctx = new ComputacoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_computacoes);
		try {
			int _alt;
			_localctx = new NComputacoesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					computacao();
					setState(95);
					computacoes();
					}
					} 
				}
				setState(101);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ComputacaoContext extends ParserRuleContext {
		public ComputacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computacao; }
	 
		public ComputacaoContext() { }
		public void copyFrom(ComputacaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NComputacaoContext extends ComputacaoContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public NComputacaoContext(ComputacaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNComputacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNComputacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNComputacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputacaoContext computacao() throws RecognitionException {
		ComputacaoContext _localctx = new ComputacaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_computacao);
		int _la;
		try {
			_localctx = new NComputacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			termo();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARIT) | (1L << OP_REL) | (1L << OP_LOG))) != 0)) {
				{
				setState(103);
				operador();
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

	public static class FuncaoContext extends ParserRuleContext {
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	 
		public FuncaoContext() { }
		public void copyFrom(FuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NFuncaoContext extends FuncaoContext {
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
		public NFuncaoContext(FuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcao);
		try {
			_localctx = new NFuncaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(FUNC);
			setState(107);
			match(ID);
			setState(108);
			match(AP);
			setState(109);
			argumentos();
			setState(110);
			match(FP);
			setState(111);
			match(BLOCO);
			setState(112);
			comandos();
			setState(113);
			match(RETORNA);
			setState(114);
			conjunturas();
			setState(115);
			match(FL);
			setState(116);
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
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
	 
		public ArgumentosContext() { }
		public void copyFrom(ArgumentosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NArgumentosContext extends ArgumentosContext {
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public List<ArgumentosContext> argumentos() {
			return getRuleContexts(ArgumentosContext.class);
		}
		public ArgumentosContext argumentos(int i) {
			return getRuleContext(ArgumentosContext.class,i);
		}
		public NArgumentosContext(ArgumentosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentos);
		try {
			int _alt;
			_localctx = new NArgumentosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					argumento();
					setState(119);
					argumentos();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ArgumentoContext extends ParserRuleContext {
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
	 
		public ArgumentoContext() { }
		public void copyFrom(ArgumentoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NArgumentoContext extends ArgumentoContext {
		public TerminalNode TIPO() { return getToken(GritoParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode VIRGULA() { return getToken(GritoParser.VIRGULA, 0); }
		public NArgumentoContext(ArgumentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumento);
		int _la;
		try {
			_localctx = new NArgumentoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(126);
				match(VIRGULA);
				}
			}

			setState(129);
			match(TIPO);
			setState(130);
			match(ID);
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
			setState(132);
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
			setState(134);
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
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	 
		public TermoContext() { }
		public void copyFrom(TermoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NTermoContext extends TermoContext {
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public InformacaoContext informacao() {
			return getRuleContext(InformacaoContext.class,0);
		}
		public NTermoContext(TermoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		try {
			_localctx = new NTermoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(136);
				match(ID);
				}
				break;
			case NUM:
			case CADEIA:
				{
				setState(137);
				informacao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IoContext extends ParserRuleContext {
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
	 
		public IoContext() { }
		public void copyFrom(IoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NIoStaticContext extends IoContext {
		public TerminalNode SAIDA() { return getToken(GritoParser.SAIDA, 0); }
		public TerminalNode AP() { return getToken(GritoParser.AP, 0); }
		public InformacaoContext informacao() {
			return getRuleContext(InformacaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(GritoParser.FP, 0); }
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public NIoStaticContext(IoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNIoStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNIoStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNIoStatic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NIoContext extends IoContext {
		public TerminalNode ENTRADA() { return getToken(GritoParser.ENTRADA, 0); }
		public TerminalNode AP() { return getToken(GritoParser.AP, 0); }
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public TerminalNode FP() { return getToken(GritoParser.FP, 0); }
		public TerminalNode FL() { return getToken(GritoParser.FL, 0); }
		public TerminalNode SAIDA() { return getToken(GritoParser.SAIDA, 0); }
		public NIoContext(IoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNIo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_io);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NIoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTRADA:
					{
					setState(140);
					match(ENTRADA);
					setState(141);
					match(AP);
					setState(142);
					match(ID);
					setState(143);
					match(FP);
					setState(144);
					match(FL);
					}
					break;
				case SAIDA:
					{
					setState(145);
					match(SAIDA);
					setState(146);
					match(AP);
					setState(147);
					match(ID);
					setState(148);
					match(FP);
					setState(149);
					match(FL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new NIoStaticContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(SAIDA);
				setState(153);
				match(AP);
				setState(154);
				informacao();
				setState(155);
				match(FP);
				setState(156);
				match(FL);
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

	public static class RepeticaoContext extends ParserRuleContext {
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	 
		public RepeticaoContext() { }
		public void copyFrom(RepeticaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoRepticaoContext extends RepeticaoContext {
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
		public BlocoRepticaoContext(RepeticaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterBlocoRepticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitBlocoRepticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitBlocoRepticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeticao);
		try {
			_localctx = new BlocoRepticaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(REP);
			setState(161);
			match(REPETICAO);
			setState(162);
			conjunturas();
			setState(163);
			match(BLOCO);
			setState(164);
			comandos();
			setState(165);
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
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	 
		public CondicaoContext() { }
		public void copyFrom(CondicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlocoCondicaoContext extends CondicaoContext {
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
		public BlocoCondicaoContext(CondicaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterBlocoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitBlocoCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitBlocoCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condicao);
		try {
			_localctx = new BlocoCondicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(COND);
			setState(168);
			match(CONDICIONAL);
			setState(169);
			conjunturas();
			setState(170);
			match(BLOCO);
			setState(171);
			comandos();
			setState(172);
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
		public ConjunturasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunturas; }
	 
		public ConjunturasContext() { }
		public void copyFrom(ConjunturasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NConjunturasContext extends ConjunturasContext {
		public List<ConjunturaContext> conjuntura() {
			return getRuleContexts(ConjunturaContext.class);
		}
		public ConjunturaContext conjuntura(int i) {
			return getRuleContext(ConjunturaContext.class,i);
		}
		public List<ConjunturasContext> conjunturas() {
			return getRuleContexts(ConjunturasContext.class);
		}
		public ConjunturasContext conjunturas(int i) {
			return getRuleContext(ConjunturasContext.class,i);
		}
		public NConjunturasContext(ConjunturasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNConjunturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNConjunturas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNConjunturas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunturasContext conjunturas() throws RecognitionException {
		ConjunturasContext _localctx = new ConjunturasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conjunturas);
		try {
			int _alt;
			_localctx = new NConjunturasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					conjuntura();
					setState(175);
					conjunturas();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ConjunturaContext extends ParserRuleContext {
		public ConjunturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuntura; }
	 
		public ConjunturaContext() { }
		public void copyFrom(ConjunturaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NConjuturaStaticContext extends ConjunturaContext {
		public InformacaoContext informacao() {
			return getRuleContext(InformacaoContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public NConjuturaStaticContext(ConjunturaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNConjuturaStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNConjuturaStatic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNConjuturaStatic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NConjunturaContext extends ConjunturaContext {
		public TerminalNode ID() { return getToken(GritoParser.ID, 0); }
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public NConjunturaContext(ConjunturaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).enterNConjuntura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GritoListener ) ((GritoListener)listener).exitNConjuntura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GritoVisitor ) return ((GritoVisitor<? extends T>)visitor).visitNConjuntura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunturaContext conjuntura() throws RecognitionException {
		ConjunturaContext _localctx = new ConjunturaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conjuntura);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new NConjunturaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARIT) | (1L << OP_REL) | (1L << OP_LOG))) != 0)) {
					{
					setState(182);
					operador();
					}
				}

				setState(185);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NConjuturaStaticContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ARIT) | (1L << OP_REL) | (1L << OP_LOG))) != 0)) {
					{
					setState(186);
					operador();
					}
				}

				setState(189);
				informacao();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u00011\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002"+
		"\f\u0002@\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004\n\u0004\f\u0004L\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005R\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006X\b"+
		"\u0006\n\u0006\f\u0006[\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007b\b\u0007\n\u0007\f\u0007e\t\u0007\u0001"+
		"\b\u0001\b\u0003\bi\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0005\nz\b\n\n\n\f\n}\t\n\u0001\u000b\u0003\u000b\u0080\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u008b\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0097\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009f\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00b2\b\u0012"+
		"\n\u0012\f\u0012\u00b5\t\u0012\u0001\u0013\u0003\u0013\u00b8\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00bc\b\u0013\u0001\u0013\u0003\u0013\u00bf"+
		"\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0002\u0002"+
		"\u0000\n\n\r\r\u0001\u0000\u0005\u0007\u00c0\u0000(\u0001\u0000\u0000"+
		"\u0000\u00026\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006"+
		"A\u0001\u0000\u0000\u0000\bJ\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000"+
		"\u0000\fS\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010"+
		"f\u0001\u0000\u0000\u0000\u0012j\u0001\u0000\u0000\u0000\u0014{\u0001"+
		"\u0000\u0000\u0000\u0016\u007f\u0001\u0000\u0000\u0000\u0018\u0084\u0001"+
		"\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u008a\u0001"+
		"\u0000\u0000\u0000\u001e\u009e\u0001\u0000\u0000\u0000 \u00a0\u0001\u0000"+
		"\u0000\u0000\"\u00a7\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000"+
		"\u0000&\u00be\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003"+
		"\u0002\u0001\u0000*+\u0005\u0002\u0000\u0000+,\u0003\u0004\u0002\u0000"+
		",-\u0005\u0000\u0000\u0001-\u0001\u0001\u0000\u0000\u0000.1\u0003\u0006"+
		"\u0003\u0000/1\u0003\u0012\t\u00000.\u0001\u0000\u0000\u00000/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000023\u0003\u0002\u0001\u000035\u0001"+
		"\u0000\u0000\u000040\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0003\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009:\u0003\n\u0005\u0000:;\u0003\u0004"+
		"\u0002\u0000;=\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=@\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?\u0005\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\b\u0000"+
		"\u0000BC\u0005\u0017\u0000\u0000CD\u0003\b\u0004\u0000DE\u0005\u0014\u0000"+
		"\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005\u0004\u0000\u0000GI\u0003"+
		"\u0018\f\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\t\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MR\u0003\f\u0006\u0000NR\u0003\u001e\u000f\u0000"+
		"OR\u0003 \u0010\u0000PR\u0003\"\u0011\u0000QM\u0001\u0000\u0000\u0000"+
		"QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000"+
		"\u0000R\u000b\u0001\u0000\u0000\u0000ST\u0005\u0017\u0000\u0000TY\u0005"+
		"\u0004\u0000\u0000UX\u0003\u0010\b\u0000VX\u0003\u0018\f\u0000WU\u0001"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0014\u0000\u0000]\r\u0001\u0000"+
		"\u0000\u0000^_\u0003\u0010\b\u0000_`\u0003\u000e\u0007\u0000`b\u0001\u0000"+
		"\u0000\u0000a^\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000f\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000fh\u0003\u001c\u000e\u0000gi\u0003\u001a"+
		"\r\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0011\u0001"+
		"\u0000\u0000\u0000jk\u0005\t\u0000\u0000kl\u0005\u0017\u0000\u0000lm\u0005"+
		"\u000b\u0000\u0000mn\u0003\u0014\n\u0000no\u0005\f\u0000\u0000op\u0005"+
		"\u0015\u0000\u0000pq\u0003\u0004\u0002\u0000qr\u0005\u0003\u0000\u0000"+
		"rs\u0003$\u0012\u0000st\u0005\u0014\u0000\u0000tu\u0005\u0015\u0000\u0000"+
		"u\u0013\u0001\u0000\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0003\u0014"+
		"\n\u0000xz\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0015"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0080\u0005\u0016"+
		"\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0005\b\u0000\u0000"+
		"\u0082\u0083\u0005\u0017\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0007\u0000\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0007\u0001\u0000\u0000\u0087\u001b\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0005\u0017\u0000\u0000\u0089\u008b\u0003\u0018\f\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u001d\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d"+
		"\u008e\u0005\u000b\u0000\u0000\u008e\u008f\u0005\u0017\u0000\u0000\u008f"+
		"\u0090\u0005\f\u0000\u0000\u0090\u0097\u0005\u0014\u0000\u0000\u0091\u0092"+
		"\u0005\u000f\u0000\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u0094"+
		"\u0005\u0017\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0097\u0005"+
		"\u0014\u0000\u0000\u0096\u008c\u0001\u0000\u0000\u0000\u0096\u0091\u0001"+
		"\u0000\u0000\u0000\u0097\u009f\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u000f\u0000\u0000\u0099\u009a\u0005\u000b\u0000\u0000\u009a\u009b\u0003"+
		"\u0018\f\u0000\u009b\u009c\u0005\f\u0000\u0000\u009c\u009d\u0005\u0014"+
		"\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000"+
		"\u0000\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009f\u001f\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u00a2\u0005\u0012"+
		"\u0000\u0000\u00a2\u00a3\u0003$\u0012\u0000\u00a3\u00a4\u0005\u0015\u0000"+
		"\u0000\u00a4\u00a5\u0003\u0004\u0002\u0000\u00a5\u00a6\u0005\u0015\u0000"+
		"\u0000\u00a6!\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0011\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0010\u0000\u0000\u00a9\u00aa\u0003$\u0012\u0000\u00aa"+
		"\u00ab\u0005\u0015\u0000\u0000\u00ab\u00ac\u0003\u0004\u0002\u0000\u00ac"+
		"\u00ad\u0005\u0015\u0000\u0000\u00ad#\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0003&\u0013\u0000\u00af\u00b0\u0003$\u0012\u0000\u00b0\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4%\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0003\u001a\r\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bf\u0005\u0017\u0000\u0000\u00ba\u00bc\u0003\u001a\r\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003\u0018\f\u0000\u00be\u00b7"+
		"\u0001\u0000\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\'\u0001"+
		"\u0000\u0000\u0000\u001206>JQWYch{\u007f\u008a\u0096\u009e\u00b3\u00b7"+
		"\u00bb\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}