import java.util.*;

public class TomJerry {
    public static void main(String[] args){

        int number;
        String ans;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter an integer number: ");
            number = input.nextInt();
        } while (number < 0);

        ans = oddeven (number);

        if (ans == "odd" && (number > 20 && number < 30)) {
            System.out.println("Tom");
        }
        else if (ans == "even" && (number > 20 && number < 30)){
            System.out.println("Jerry");
        }
        else {
            System.exit(0);
        }
    }

    public static String oddeven (int number) {
         if(number % 2 != 0)
         {
             return "odd";
         }
         else
         {
             return "even";
         }

    }
}
