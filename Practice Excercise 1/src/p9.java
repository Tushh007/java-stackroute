import java.util.Scanner;

public class p9 {
    public static void main(String args[])
    {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String input =s.nextLine();

        int i=input.length()-1;
        while(i>=0)
        {
            char ch=input.charAt(i);
            System.out.print(ch);
            i--;
        }
    }

}
