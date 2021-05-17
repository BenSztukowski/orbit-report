import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Cipher {


    public static void main(String[] args) {

        ArrayList<Character> ALPHABET = new ArrayList<> (Arrays.asList('a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' ,
                'h' , 'i' ,
            'j' , 'k' , 'l' ,
                'm' , 'n' ,
                'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' , '.' , ',' , ' ' ));
        ArrayList<Character>[] characterArray = new ArrayList[0];
        for (char c: ALPHABET){
            characterArray. add(ALPHABET.subList(ALPHABET.indexOf(c)));
        }

        System.out.println(ALPHABET);
        String message;
        String cypher;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Encrypt\n2. Decrypt");
        Integer task = input.nextInt();
        input.close();

        if (task == 1){
            System.out.println("Encryption mode\nEnter message to be encrypted:");
            message = input.nextLine();
            System.out.println("Enter cypher:");
            cypher = input.nextLine();
        } else if(task == 2){
            System.out.println("Decryption mode\nEnter encrypted message:");
        }
    }
}
