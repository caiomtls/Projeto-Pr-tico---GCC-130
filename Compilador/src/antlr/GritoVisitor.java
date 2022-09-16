// Generated from Grito.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GritoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GritoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code BlocoPrograma}
	 * labeled alternative in {@link GritoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoPrograma(GritoParser.BlocoProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoDeclaracoes}
	 * labeled alternative in {@link GritoParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoDeclaracoes(GritoParser.BlocoDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NComandos}
	 * labeled alternative in {@link GritoParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNComandos(GritoParser.NComandosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link GritoParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNDeclaracao(GritoParser.NDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NInicializacao}
	 * labeled alternative in {@link GritoParser#inicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNInicializacao(GritoParser.NInicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NComando}
	 * labeled alternative in {@link GritoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNComando(GritoParser.NComandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAtribuicao}
	 * labeled alternative in {@link GritoParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAtribuicao(GritoParser.NAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NComputacoes}
	 * labeled alternative in {@link GritoParser#computacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNComputacoes(GritoParser.NComputacoesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NComputacao}
	 * labeled alternative in {@link GritoParser#computacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNComputacao(GritoParser.NComputacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link GritoParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNFuncao(GritoParser.NFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NArgumentos}
	 * labeled alternative in {@link GritoParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNArgumentos(GritoParser.NArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NArgumento}
	 * labeled alternative in {@link GritoParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNArgumento(GritoParser.NArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#informacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformacao(GritoParser.InformacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(GritoParser.OperadorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NTermo}
	 * labeled alternative in {@link GritoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNTermo(GritoParser.NTermoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NIo}
	 * labeled alternative in {@link GritoParser#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIo(GritoParser.NIoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NIoStatic}
	 * labeled alternative in {@link GritoParser#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNIoStatic(GritoParser.NIoStaticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoRepticao}
	 * labeled alternative in {@link GritoParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoRepticao(GritoParser.BlocoRepticaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoCondicao}
	 * labeled alternative in {@link GritoParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoCondicao(GritoParser.BlocoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NConjunturas}
	 * labeled alternative in {@link GritoParser#conjunturas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNConjunturas(GritoParser.NConjunturasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NConjuntura}
	 * labeled alternative in {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNConjuntura(GritoParser.NConjunturaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NConjuturaStatic}
	 * labeled alternative in {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNConjuturaStatic(GritoParser.NConjuturaStaticContext ctx);
}