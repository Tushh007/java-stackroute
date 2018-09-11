import java.util.*;

public class PalindromeChecker {

    public static void main(String[] args) {

        int number, f_sum = 0, r_num = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter an integer number: ");
            number = input.nextInt();
        } while (number < 0);

        r_num = reverse(number);
        f_sum = sum(r_num);

        if (number != r_num)
            System.out.println(number + " is not a palindrome");
        else if (f_sum < 25){
            System.out.println(number + " is palindrome and the sum of even numbers is less than 25");
        }
        else
            System.out.println(number + " is palindrome and the sum of even numbers is greater than 25");


    }

    public static int reverse(int number) {

        int num, r_num = 0;

        //Reversing the given input
        r_num = number % 10;
        number = number / 10;

        while (number > 0) {
            num = number % 10;
            r_num = r_num * 10 + num;
            number = number / 10;
        }

        return r_num;
    }

    public static int sum(int r_num) {

        int num, t_num, sum = 0, count = 1;

        t_num = r_num;

        while (t_num > 0) {
            t_num = t_num/10;
            count++;
        }
        //adding all the even numbers
        for (int i = 1; i < count+1; i++) {
            num = r_num % 10;
            if (num % 2 == 0) {
                sum = sum + (r_num % 10);
                r_num = r_num / 10;
            } else
                r_num = r_num / 10;
        }

        return sum;
    }
}


        /*int num, f_num = 0, sum = 0;
        f_num = r_num;
        //adding all the even numbers
        for(int i = 1; i < count+1; i++){
            if(i % 2 == 0){
                sum = sum + (r_num % 10);
                r_num = r_num / 10;
            }
            else
                r_num = r_num / 10;
        }*/