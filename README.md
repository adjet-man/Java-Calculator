# Introduction
This is a Java program that implements a simple calculator. The program takes user input for two numbers and an operator, performs the corresponding operation on the numbers, and prints the result to the console.
# 
The program uses a Scanner object to read user input from the console. It first prompts the user to enter the first number and validates that the input is a valid double value. If not, it prompts the user again until valid input is received.
#
Next, it displays a menu of available operators and prompts the user to choose one. It then validates that this input is a valid integer value. If not, it prompts the user again until valid input is received.
#
If the chosen operator requires a second number (i.e., all operators except square root), then the program prompts the user to enter this number and validates that it is a valid double value. If not, it prompts the user again until valid input is received.
#
Finally, based on the chosen operator, it performs an arithmetic operation on num1 and num2, or calculates square root or raises num1 to a power specified by num2. The result of this operation is stored in result variable which is then printed out using formatted output with 4 decimal places.
# Conclusion
The program also handles potential errors such as division by zero or taking square root of negative numbers by displaying appropriate error messages.
The program runs in an infinite loop until "e" is entered by user to exit from calculator.
