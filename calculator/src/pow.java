import java.util.Scanner;

public class pow {

    public void pow(){

        int result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers.");
        System.out.print("First number is ( base):");
        int a = input.nextInt();
        System.out.print("Second number is (ceiling):");
        int b = input.nextInt();


        for (int i = 0; i < b; i++) {
             result *= a;
        }
System.out.println("Result : " + result);
    }
}
