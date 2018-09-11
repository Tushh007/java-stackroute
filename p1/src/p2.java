import java.util.Scanner;
    public class p2 {
        public static void main(String args[])
        {
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("enter any number");
            n = s.nextInt();

            if((n % 2) == 0 && n > 20 && n <30)
            {
                System.out.println("Jerry");
            }
            if((n%2)!=0&&n>20&&n<30)
                System.out.println("Tom");
        }
    }
