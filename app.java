import java.util.Scanner;
public class App {
   
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int product = multiply();
        System.out.println("The answer is " + product);


        int quotient = divide();

        System.out.println("The answer is " + quotient);
        
    }
        // This method will request for two numbers and will multiply them.
        static int multiply() {
        System.out.println("Please Enter Two Number to multiply ");
        System.out.print("Enter First Number: ");
        int x = scan.nextInt();

        System.out.print("Enter Your Second Number: ");
        int y = scan.nextInt();

        return x * y;
    }
        // This method will request for two numbers and will divide them.
        static int divide() {
        System.out.println("Please Enter Two Number to divide ");
        System.out.print("Enter First Number: ");
        int x = scan.nextInt();

        System.out.print("Enter Your Second Number: ");
        int y = scan.nextInt();

        return x / y;
    }

}




