// Generated from Grito.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GritoParser}.
 */
public interface GritoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GritoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GritoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GritoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(GritoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(GritoParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GritoParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GritoParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GritoParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GritoParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void enterInicializacao(GritoParser.InicializacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#inicializacao}.
	 * @param ctx the parse tree
	 */
	void exitInicializacao(GritoParser.InicializacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GritoParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GritoParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(GritoParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(GritoParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#computacoes}.
	 * @param ctx the parse tree
	 */
	void enterComputacoes(GritoParser.ComputacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#computacoes}.
	 * @param ctx the parse tree
	 */
	void exitComputacoes(GritoParser.ComputacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#computacao}.
	 * @param ctx the parse tree
	 */
	void enterComputacao(GritoParser.ComputacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#computacao}.
	 * @param ctx the parse tree
	 */
	void exitComputacao(GritoParser.ComputacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(GritoParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(GritoParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(GritoParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(GritoParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(GritoParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(GritoParser.ArgumentoContext ctx);
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
	 * Enter a parse tree produced by {@link GritoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GritoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GritoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#io}.
	 * @param ctx the parse tree
	 */
	void enterIo(GritoParser.IoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#io}.
	 * @param ctx the parse tree
	 */
	void exitIo(GritoParser.IoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void enterRepeticao(GritoParser.RepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#repeticao}.
	 * @param ctx the parse tree
	 */
	void exitRepeticao(GritoParser.RepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(GritoParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(GritoParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#conjunturas}.
	 * @param ctx the parse tree
	 */
	void enterConjunturas(GritoParser.ConjunturasContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#conjunturas}.
	 * @param ctx the parse tree
	 */
	void exitConjunturas(GritoParser.ConjunturasContext ctx);
	/**
	 * Enter a parse tree produced by {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 */
	void enterConjuntura(GritoParser.ConjunturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GritoParser#conjuntura}.
	 * @param ctx the parse tree
	 */
	void exitConjuntura(GritoParser.ConjunturaContext ctx);
}