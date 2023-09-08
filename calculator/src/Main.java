import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        minus minus1 = new minus();
        divide divide1 = new divide();
        multiplied multiplied1 = new multiplied();
        plus plus1 = new plus();
        pow pow1 = new pow();
        mode mode1 = new mode();

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MULTİFUNCTİONAL CALCULATOR\n");
        System.out.println("1-Minus \n2-divide \n3-multiplied \n4-plus \n5-pow \n6-mode");
        System.out.print("Please press the action you want to perform..");
        int select = input.nextInt();



        if(select == 1){
            minus1.minus();
        }else if(select == 2){
            divide1.divide();
        } else if (select == 3) {
            multiplied1.multiplied();
        } else if (select == 4) {
            plus1.plus();
        } else if (select == 5) {
            pow1.pow();
        } else if (select == 6) {
            mode1.mode();
        } else{
            System.out.println("select a valid transaction ! ");
        }
    }

}