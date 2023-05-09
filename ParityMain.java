import ensp.parity.lexer.Lexer;
import ensp.parity.node.Start;
import ensp.parity.parser.Parser;
import org.w3c.dom.css.Counter;

import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Scanner;

public class ParityMain {
    public static void main(String[] args) {
        try {
            System.out.println("Parity Checker\n Entree une sequence de a et b:");
            String str = new Scanner(System.in).nextLine();
//Create a Parser instance
            Parser p = new Parser(new Lexer(new PushbackReader(
                    new StringReader(str), 1024)));
//Parse input and build the syntax tree.
            Start tree = p.parse();
//Apply tree translation on the syntax tree
            System.out.println("Mot reconnu......................");
            //System.out.print("\nNombre de a dans le mot: ");
            //tree.apply(new Counter());
            System.exit(0);
        } catch(Exception e) {
            System.out.println("Mot non reconnu \nError pccurs: " + e.getMessage());
        }
    }
}
