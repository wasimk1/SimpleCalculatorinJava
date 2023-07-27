package simplecalculator;

import java.util.Scanner;

/**
 *
 * @author wasim
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Double num1, num2, total;
        Integer select = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number= ");
        num1 = sc.nextDouble();
        System.out.print("Enter the 2nd number= ");
        num2 = sc.nextDouble();

        System.out.println("Choose the mode of Operator below:\n1: Addition\n2: Substractions\n3: Multiplication\n4: Division");
        select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Addtion of " + num1 + " and " + num2 + " = " + (total = num1 + num2));
                break;
            case 2:
                System.out.println("Substraction of " + num1 + " and " + num2 + " = " + (total = num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of " + num1 + " and " + num2 + " = " + (total = num1 * num2));
                break;
            case 4:
                System.out.println("Division of " + num1 + " and " + num2 + " = " + (total = num1 / num2));
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("\n\nDeveloped by Wasim Khan");
    }

}
