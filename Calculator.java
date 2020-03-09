import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        double val1;                              //The first value
        double val2;                              //The second value
        double result = 0.0;                      //The result
        int menuSelect;                           //User menu selection
        boolean inBounds = true;                  //Test if they gave a good menu selection

        //Run the Program
        System.out.print("Enter first operand: ");
        val1 = scnr.nextDouble();
        System.out.print("Enter second operand: ");
        val2 = scnr.nextDouble();

        //Calculator Menu
        System.out.println("\nCalculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        //Prompt user for selection
        System.out.print("\nWhich operation do you want to perform? ");
        menuSelect = scnr.nextInt();

        //Perform operation
        switch (menuSelect){
            case 1:
                result = val1 + val2;
                break;
            case 2:
                result = val1 - val2;
                break;
            case 3:
                result = val1 * val2;
                break;
            case 4:
                result = val1 / val2;
                break;
            default:
                inBounds = false;
                System.out.println("Error: Invalid selection! Terminating program.");
        }

        if (inBounds) {
            System.out.println("The result of the operation is " + result + ". Goodbye!");
        }
    }
}
