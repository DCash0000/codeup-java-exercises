import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args) {
        ServerNameGenerator server = new ServerNameGenerator();
        String[] adjectives = {"aggressive", " agreeable", "brave", "calm", "delightful", "eager", "faithful", "attractive","fit", "fancy"};
        String[] nouns = {"mother", "father", "lion", "tiger", "bear", "table", "truck", "book", "iPad", "coat"};
        System.out.println("Here is your server name: ");
        System.out.println(server.returnElement(adjectives, nouns));
    }

    public String returnElement(String[] adjectives, String[] noun){
        int rndAdj = new Random().nextInt(adjectives.length);
        int rndNoun = new Random().nextInt(noun.length);
        return(adjectives[rndAdj] + " - " + noun[rndNoun]);
    }
}
