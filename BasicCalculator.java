package hello;


    import java.util.Scanner;

    public class BasicCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double num1, num2;

            System.out.println("Enter the first number: ");
            num1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            num2 = sc.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    return;
            }

            System.out.println("The Answer "+ result);
        }
    }

