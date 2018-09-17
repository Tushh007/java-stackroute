import java.util.*;

public class PubModelling {
    public static void main (String[] args){
        manager();

    }

    public static int server(int a){

        if(a == 1){
            System.out.println("Hi, Please tell me your order");
            user(1);
        }
        else if (a == 2) {
            System.out.println("Please tell me your age: ");
            user(2);
        }
        else if(b ==3){
            System.out.println("Order Served");
        }

        else {
            if(a < 18){
                System.out.println("Sorry! We cannot server you alcholic drinks ");
                cheif();
            }
            else{
                System.out.println("Your order will be served soon!");
                cheif();

            }
        }

    }

    public static void user (int b) {

        int age;
        Scanner input = new Scanner(System.in);

        if(b==1)
        {
            System.out.println("Food");
            System.out.println("Food order given");
            System.out.println("drinks");
            System.out.println("Drinks order given");
            server(2);
        }
        else {
            age = input.nextInt();
            server(age);
        }
    }

    public static void cheif () {
        System.out.println("Cheif: order recieved - 20 minutes to go");
        System.out.println("order ready");
        server(3);

    }

    public static int manager (){
        Random rand = new Random();
        int n = rand.nextInt(4)+1;

        System.out.print("Server "+n+", Please server the order to new user!");
        server(1);

    }

}
