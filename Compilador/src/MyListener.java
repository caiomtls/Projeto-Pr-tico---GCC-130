import antlr.GritoBaseListener;
import antlr.GritoLexer;
import antlr.GritoParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends GritoBaseListener {

    //Checagem de tipo,
    //Checagem de variáveis não declaradas,
    //checagem de declarações duplicadas de variáveis;

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();


//    @Override
//    public void enterEveryRule(ParserRuleContext ctx) {
//        System.out.println("entrou na regra:" + ctx.getText());
//    }

    public void enterNDeclaracao(GritoParser.NDeclaracaoContext ctx) {
        System.out.println("In declaração: "+ctx.getText());

    }
    //F
    @Override
    public void exitNDeclaracao(GritoParser.NDeclaracaoContext ctx) {
        System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();

        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
        }
//
        if(ctx.ATRIBUIR() != null) {
            if (tipo.equals("int")) {
                if (ctx.NUM() == null) {
                    System.out.println(id + " deve receber um inteiro");
                }
            } else if (tipo.equals("palavra")) {
                if (ctx.CADEIA() == null) {
                    System.out.println(id + " deve receber uma cadeia");
                }
            }
        }
//        List<ParseTree> filhos = ctx.children;
//        for (ParseTree filho : filhos) {
//            System.out.println(ctx.CADEIA());
//        }
    }

    @Override
    public void exitNFuncao(GritoParser.NFuncaoContext ctx) {
        System.out.println("Out atribuição: "+ctx.getText());
        String id = ctx.ID().getText();
        String func = ctx.FUNC().getText();
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,func);
        }

    }

    @Override
    public void exitNAtribuicao(GritoParser.NAtribuicaoContext ctx) {
        System.out.println("Out atribuição: "+ctx.getText());
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("A variável " + id + " não foi declarada!!!");
        }
    }

    @Override
    public void exitNIo(GritoParser.NIoContext ctx) {
        System.out.println("Out atribuição: "+ctx.getText());
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("A variável " + id + " não foi declarada!!!");
        }
    }

    @Override
    public void exitNArgumento(GritoParser.NArgumentoContext ctx) {
        System.out.println("Out atribuição: "+ctx.getText());
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("A variável " + id + " não foi declarada!!!");
        }
    }

    @Override
    public void exitNConjuntura (GritoParser.NConjunturaContext ctx) {
        System.out.println("Out atribuição: "+ctx.getText());
        String id = ctx.ID().getText();
        if (!tabelaSimbolos.containsKey(id)){
            System.out.println("A variável " + id + " não foi declarada!!!");
        }
    }

//    @Override
//    public void exitInformacao(GritoParser.InformacaoContext ctx) {
//
//        while (ctx.getParent().getText() != )
//        System.out.println("Out informação: "+ctx.getText());
//    }


    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

}
