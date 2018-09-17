import java.util.*;

public class PubModelling {
    public static void main (String[] args){
        manager();

    }

    public static void server(int a){

        if(a == 1){
            System.out.println("Server: Hi, Please tell me your order");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            user(1);
        }
        else if (a == 2) {
            System.out.println("Server: Please tell me your age: ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            user(2);
        }
        else if(a == 3){
            System.out.println("Server: Order Served");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }

        else {
            if(a < 18){
                System.out.println("Server: Sorry! We cannot server you alcholic drinks ");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                chief();
            }
            else{
                System.out.println("Server: Your order will be served soon!");
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                chief();

            }
        }
    }

    public static void user (int b) {

        int age;
        Scanner input = new Scanner(System.in);

        if(b==1)
        {
            System.out.println("User: Food order given");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.println("User: Drinks order given");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            server(2);
        }
        else {
            age = input.nextInt();
            server(age);
        }
    }

    public static void chief () {
        System.out.println("Chief: order recieved - 20 minutes to go");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("Bartender: order recieved - 10 minutes to go");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("Chief: Order ready");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("Bartender: Order ready");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        server(3);

    }

    public static void manager (){
        Random rand = new Random();
        int n = rand.nextInt(4)+1;

        System.out.println("Manager: Server "+n+", Please note down the order from the new user.");
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        server(1);

    }

}
