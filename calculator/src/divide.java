import java.util.Scanner;

public class divide extends Main {

    public  void divide(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers you want to divide by.");
        System.out.print("First number is:");
        int a = input.nextInt();
        System.out.print("Second number is:");
        int b = input.nextInt();

        System.out.println("Result :" + (a/b));

    }
}
