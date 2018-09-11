import java.util.*;

public class loops {
    public static void main(String[] args){

        //String iter;
        int iter;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter number of iteration: ");
            iter = input.nextInt();
            //iter = input.nextLine();
        } while(iter < 0);
        //while (!iter.matches("[0-9]+"));

        //int number = Integer.parseInt(iter);

        System.out.println(iteration(iter));
    }

    public static String iteration(int iter){
        String sum = "";
        for(int i = 1; i < iter+1; i++)
        {
            for(int j = 0; j < i; j++){
                //System.out.print(i);
                sum = sum + i;
            }
        }
        return sum;
    }
}
