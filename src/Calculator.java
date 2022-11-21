import java.util.Scanner;

import static java.lang.System.exit;

public class Calculator {
    static void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of "+num1+" and "+num2+" = "+(num1+num2));
    }

    static void subraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Subtraction of "+num1+" and "+num2+" = "+(num1-num2));
    }

    static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("product of "+num1+" and "+num2+" = "+(num1*num2));
    }

    static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        float value = (float) num1/num2;
        System.out.println(String.format("Division of %d and %d = %.1f", num1, num2, value));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("------------------ Menu -----------------");
            System.out.println("1 -> Addition");
            System.out.println("2 -> Subtraction");
            System.out.println("3 -> Multiplication");
            System.out.println("4 -> Division");
            System.out.println("5 -> Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Please select an operation: ");
            int operation = sc.nextInt();

            switch (operation) {
                case (1):
                    addition();
                    break;
                case (2):
                    subraction();
                    break;
                case (3):
                    multiplication();
                    break;
                case (4):
                    division();
                    break;
                case (5):
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!!!");
            }
        }
    }
}
