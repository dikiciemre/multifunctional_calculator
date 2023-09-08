import java.util.Scanner;

public class minus extends Main {

    public void minus(){

        Scanner input = new Scanner(System.in);

         System.out.println("Please enter two numbers you want to subtract.");
         System.out.print("First number is:");
         int a = input.nextInt();
         System.out.print("Second number is:");
         int b = input.nextInt();

        System.out.println("Result : " + (a-b));

    }
}
