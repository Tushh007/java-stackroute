import java.util.*;

public class ConsonantVowel {

    public static void main(String[] args){

        String word;
        Scanner answer = new Scanner(System.in);

        do{
            System.out.print("Enter a word: ");
            word = answer.nextLine();
        } while (!word.matches("[a-zA-z]+"));

        Check(word);
    }

    public static void Check(String word) {

        int length = word.length();

        for (int i = 0; i < length; i++) {
            char cv = word.charAt(i);
            if (cv == 'a' || cv == 'e' || cv == 'i' || cv == 'o' || cv == 'u' || cv == 'A' || cv == 'E' || cv == 'I' || cv == 'O' || cv == 'U') {
                System.out.print(cv + " - is a vowel ");
            } else {
                System.out.print(cv + " - is a consonent ");
            }
        }
    }
}
