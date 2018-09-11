import java.util.*;
import java.util.InputMismatchException;

public class p1 {

    public static void main(String[] args){

        int number, num, count = 0;

        Scanner input = new Scanner(System.in);
        do {
                System.out.println("Enter a number");
                number = input.nextInt();
        } while(number < 0);

        do {
            num = number%10;
            num = num*10;

            number = number/10;
            count++;
        } while (number > 0);
    }
}

