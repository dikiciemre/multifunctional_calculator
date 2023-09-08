import java.util.Scanner;

public class plus extends Main {

    public void plus(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers you want to add");
        System.out.print("First number is:");
        int a = input.nextInt();
        System.out.print("Second number is:");
        int b = input.nextInt();

        System.out.println("Result :" + (a+b));

    }
}
