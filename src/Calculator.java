import java.util.Scanner;

public class Calculator {
    static void addition(int num1, int num2) {
        System.out.println("Sum of "+num1+" and "+num2+" = "+(num1+num2));
    }g

    static void subraction(int num1, int num2) {
        System.out.println("Subtraction of "+num1+" and "+num2+" = "+(num1-num2));
    }

    static void multiplication(int num1, int num2) {
        System.out.println("product of "+num1+" and "+num2+" = "+(num1*num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------ Menu -----------------");
        System.out.println("1 -> Addition");
        System.out.println("2 -> Subtraction");
        System.out.println("3 -> Multiplication");
        System.out.println("4 -> Division");
        System.out.println("-----------------------------------------");
        System.out.print("Please select an operation: ");
        int operation = sc.nextInt();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (operation)
        {
            case(1):
                addition(num1, num2);
                break;
            case(2):
                subraction(num1, num2);
                break;
            case(3):
                multiplication(num1, num2);
                break;
        }
    }
}
