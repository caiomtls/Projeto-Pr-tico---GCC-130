import antlr.GritoLexer;
import antlr.GritoParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AnalisadorSemantico {
    public static void main(String[] args){
        //parsing the input
        GritoParser parser = getParser("/home/caio/IdeaProjects/Compilador/src/teste/codigoteste.txt");

        //obter arvore
        ParseTree ast = parser.programa();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }


    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static GritoParser getParser(String fileName){
        GritoParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            GritoLexer lexer = new GritoLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GritoParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}
