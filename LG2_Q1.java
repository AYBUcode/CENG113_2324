package lg2_q1;

import java.util.Scanner;

/**
 *
 * @author EVREN
 */
public class LG2_Q1 {

    public static void main(String[] args) {
        //variable declarations
	int num1, num2, sum, diff,pro;

	//getting numbers from the user
    Scanner input = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	num1 = input.nextInt();

	System.out.print("Enter the second number: ");
	num2 = input.nextInt();

	//calculations
	sum = num1 + num2;
	diff = num1 - num2;
	pro = num1*num2;

	//displaying the result on the screen
	System.out.print("\nThe difference of the two numbers " + diff);
	System.out.print("\nThe sum of the two numbers "+ sum);
	System.out.println("\nThe product of the two numbers "+ pro);
    } 
}
