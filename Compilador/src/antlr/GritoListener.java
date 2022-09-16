// Generated from Grito.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GritoParser}.
 */
public interface GritoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code BlocoPrograma}
	 * labeled alternative in {@link GritoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterBlocoPrograma(GritoParser.BlocoProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoPrograma}
	 * labeled alternative in {@link GritoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitBlocoPrograma(GritoParser.BlocoProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracoes}
	 * labeled alternative in {@link GritoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracoes(GritoParser.BlocoDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracoes}
	 * labeled alternative in {@link GritoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracoes(GritoParser.BlocoDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NComandos}
	 * labeled alternative in {@link GritoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterNComandos(GritoParser.NComandosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComandos}
	 * labeled alternative in {@link GritoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitNComandos(GritoParser.NComandosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GritoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(GritoParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GritoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(GritoParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInicializacao}
	 * labeled alternative in {@link GritoParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void enterNInicializacao(GritoParser.NInicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicializacao}
	 * labeled alternative in {@link GritoParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void exitNInicializacao(GritoParser.NInicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link GritoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterNComando(GritoParser.NComandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link GritoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitNComando(GritoParser.NComandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GritoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNAtribuicao(GritoParser.NAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GritoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNAtribuicao(GritoParser.NAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NComputacoes}
	 * labeled alternative in {@link GritoParser#computacoes}.
	 * @param ctx the parse tree
	 */
	void enterNComputacoes(GritoParser.NComputacoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComputacoes}
	 * labeled alternative in {@link GritoParser#computacoes}.
	 * @param ctx the parse tree
	 */
	void exitNComputacoes(GritoParser.NComputacoesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NComputacao}
	 * labeled alternative in {@link GritoParser#computacao}.
	 * @param ctx the parse tree
	 */
	void enterNComputacao(GritoParser.NComputacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NComputacao}
	 * labeled alternative in {@link GritoParser#computacao}.
	 * @param ctx the parse tree
	 */
	void exitNComputacao(GritoParser.NComputacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link GritoParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterNFuncao(GritoParser.NFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link GritoParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitNFuncao(GritoParser.NFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NArgumentos}
	 * labeled alternative in {@link GritoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterNArgumentos(GritoParser.NArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NArgumentos}
	 * labeled alternative in {@link GritoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitNArgumentos(GritoParser.NArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NArgumento}
	 * labeled alternative in {@link GritoParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterNArgumento(GritoParser.NArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NArgumento}
	 * labeled alternative in {@link GritoParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitNArgumento(GritoParser.NArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#informacao}.
	 * @param ctx the parse tree
	 */
	void enterInformacao(GritoParser.InformacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#informacao}.
	 * @param ctx the parse tree
	 */
	void exitInformacao(GritoParser.InformacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(GritoParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(GritoParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NTermo}
	 * labeled alternative in {@link GritoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterNTermo(GritoParser.NTermoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NTermo}
	 * labeled alternative in {@link GritoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitNTermo(GritoParser.NTermoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NIo}
	 * labeled alternative in {@link GritoParser#io}.
	 * @param ctx the parse tree
	 */
	void enterNIo(GritoParser.NIoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NIo}
	 * labeled alternative in {@link GritoParser#io}.
	 * @param ctx the parse tree
	 */
	void exitNIo(GritoParser.NIoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NIoStatic}
	 * labeled alternative in {@link GritoParser#io}.
	 * @param ctx the parse tree
	 */
	void enterNIoStatic(GritoParser.NIoStaticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NIoStatic}
	 * labeled alternative in {@link GritoParser#io}.
	 * @param ctx the parse tree
	 */
	void exitNIoStatic(GritoParser.NIoStaticContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoRepticao}
	 * labeled alternative in {@link GritoParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoRepticao(GritoParser.BlocoRepticaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoRepticao}
	 * labeled alternative in {@link GritoParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoRepticao(GritoParser.BlocoRepticaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoCondicao}
	 * labeled alternative in {@link GritoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterBlocoCondicao(GritoParser.BlocoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoCondicao}
	 * labeled alternative in {@link GritoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitBlocoCondicao(GritoParser.BlocoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NConjunturas}
	 * labeled alternative in {@link GritoParser#conjunturas}.
	 * @param ctx the parse tree
	 */
	void enterNConjunturas(GritoParser.NConjunturasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NConjunturas}
	 * labeled alternative in {@link GritoParser#conjunturas}.
	 * @param ctx the parse tree
	 */
	void exitNConjunturas(GritoParser.NConjunturasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NConjuntura}
	 * labeled alternative in {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 */
	void enterNConjuntura(GritoParser.NConjunturaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NConjuntura}
	 * labeled alternative in {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 */
	void exitNConjuntura(GritoParser.NConjunturaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NConjuturaStatic}
	 * labeled alternative in {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 */
	void enterNConjuturaStatic(GritoParser.NConjuturaStaticContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NConjuturaStatic}
	 * labeled alternative in {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 */
	void exitNConjuturaStatic(GritoParser.NConjuturaStaticContext ctx);
}