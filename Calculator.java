import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //num1 prompt
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //num2 prompt
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        //prompt to choose operation type
        System.out.print("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        //operations via switch
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            //if/else statement to handle division by zero errors
            case '/':
                //anything other than zero is fine
                if (num2 !=0){
                    result = num1 / num2;
                } 
                else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
        }

        //display results 'if' operation is valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        //close scanner
        scanner.close();
    }
    
}
