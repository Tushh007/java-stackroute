import java.util.Scanner;
import java.util.Arrays;
public class p7 {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String s = Integer.toString(num);
        int l = s.length();
        int[] arr = new int[l];

        for(int i=0;i<l;i++){
            arr[i]=num%10;
            num=num/10;
        }
        Arrays.sort(arr);
        for(int i=0;i<l;i++){

            System.out.print(arr[i]);
        }

        int sum=0;
        for(int i=0;i<l;i++){
            if(IsEven(arr[i])){
                sum=sum+arr[i];
            }
        }

        if(sum>15){
            System.out.println(" True");
        }
        else{
            System.out.println(" False");
        }
    }

    public static boolean IsEven(int num){
        if(num%2 ==1){
            return false;
        }
        else return true;
    }
}
