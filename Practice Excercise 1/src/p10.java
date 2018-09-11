import java.util.Scanner;

public class p10 {
    public static void main(String[] args){
        System.out.println("Enter the string:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("Enter the number:");
        int num = scan.nextInt();
        System.out.print(s);
        int i=num;
        while(i>0) {
            System.out.print(s.substring(s.length() - num, s.length()));
            i--;
        }
    }
}
