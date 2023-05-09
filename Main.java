import ensp.automate.lexer.Lexer;
import ensp.automate.lexer.LexerException;
import ensp.automate.node.EOF;
import ensp.automate.node.Token;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Saisir une phrase: ");
            Lexer lex = new Lexer(new PushbackReader(
                   new InputStreamReader(System.in), 1024));
            Token token = null;

            while(!(token instanceof EOF)){
                token = lex.next();
                System.out.println(token.toString() + " ==> " + token.getClass().getSimpleName());
            }

        } catch (LexerException | IOException e) {
            System.out.println("\nAn error occurs: " +e.getMessage());
        }
    }
}