import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int operator, num1 = 0, num2 = 0;
        double result;
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Welcome to Java Calculator");
                
                // Validate num1 input
                while (num1 == 0) {
                    System.out.print("Enter first number: ");
                    
                    if (!sc.hasNextDouble()) {
                        System.out.println("Invalid input. Please enter a number.");
                        sc.next();
                        continue;
                    }
                    
                    num1 = (int) sc.nextDouble();
                }
                
                System.out.println("\n 1- Add \n 2- Subtract \n 3- Multiply \n 4- Divide \n 5- Square root \n 6- Raise to the power");
                System.out.println("Choose Operator ");
                
                // Validate operator input
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    sc.next();
                }
                
                operator = sc.nextInt();
                
                 // Validate num2 input for all operators except square root
                 if (operator != 5) {
                     while (num2 == 0) {
                         System.out.print("Enter second number: ");
                         
                         if (!sc.hasNextDouble()) {
                             System.out.println("Invalid input. Please enter a number.");
                             sc.next();
                             continue;
                         }
                         
                         num2 = (int) sc.nextDouble();
                     }
                 }

                 switch(operator) {
                    case 1:
                        result = num1 + num2;
                        System.out.printf("%d + %d = %.4f",num1,num2,result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.printf("%d - %d = %.4f",num1,num2,result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.printf("%d * %d = %.4f",num1,num2,result);
                        break;
                    case 4:
                        
                        // Handle divide by zero error
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero.");
                            break;
                        }
                        
                        result = (double) num1 / num2;
                        System.out.printf("%d / %d = %.4f",num1,num2,result);
                        break;
                    case 5:
                        
                        // Handle negative input error
                        if (num1 < 0) {
                            System.out.println("Cannot calculate square root of a negative number.");
                            break;
                        }
                        
                        result = Math.sqrt(num1);
                        System.out.printf("Square root of %d = %.4f",num1,result);
                        break;
                    case 6:
                        
                         // Validate num2 input for raising to the power operator
                         double power = -1.0; // initialize to invalid value
                         
                         while (power < 0) {
                             System.out.print("Enter power: ");
                             
                             if (!sc.hasNextDouble()) {
                                 System.out.println("Invalid input. Please enter a number.");
                                 sc.next();
                                 continue;
                             }
                             
                             power = sc.nextDouble();
                             
                             if (power < 0) {
                                 System.out.println("Power cannot be negative. Please enter a non-negative value.");
                             }
                         }
                         
                         result = Math.pow(num1, power);
                         System.out.printf("%d raised to the power of %.4f = %.4f",num1,power,result);
                         break;
                    default:
                        System.out.println("Invalid operator");
                }
                
                // Reset values for next calculation
                num1 = 0;
                num2 = 0;
                
                // Ask user if they want to continue or exit
                System.out.println("\nType 'e' to exit, or any other key to continue.");
                input = sc.next();
            } while (!input.equals("e"));
        }
        
        System.out.println("Thank you for using Java Calculator!");
    }
}