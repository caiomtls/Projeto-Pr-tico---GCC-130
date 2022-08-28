// Generated from Grito.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link GritoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GritoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(GritoParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(GritoParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GritoParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#inicializacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacao(GritoParser.InicializacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GritoParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(GritoParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#computacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputacoes(GritoParser.ComputacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#computacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputacao(GritoParser.ComputacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(GritoParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(GritoParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(GritoParser.ArgumentoContext ctx);
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
	 * Visit a parse tree produced by {@link GritoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(GritoParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#io}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo(GritoParser.IoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#repeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticao(GritoParser.RepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(GritoParser.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#conjunturas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunturas(GritoParser.ConjunturasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjuntura(GritoParser.ConjunturaContext ctx);
}