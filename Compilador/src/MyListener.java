import antlr.GritoBaseListener;
import antlr.GritoLexer;
import antlr.GritoParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends GritoBaseListener {

    //Checagem de tipo,
    //Checagem de variáveis não declaradas,
    //checagem de declarações duplicadas de variáveis;

    private Map<String,String> tabelaSimbolos = new HashMap<String,String>();


    public void enterNDeclaracao(GritoParser.NDeclaracaoContext ctx) {
        System.out.println("In declaração: "+ctx.getText());

    }

    @Override
    public void exitNDeclaracao(GritoParser.NDeclaracaoContext ctx) {
        System.out.println("Out declaração: "+ctx.getText());
        String tipo = ctx.TIPO().getText();
        String id = ctx.ID().getText();
        for (ParseTree child : ctx.children) {
            System.out.println(child.toStringTree().length());
        }
        if (tabelaSimbolos.containsKey(id)){
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id,tipo);
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




    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}
