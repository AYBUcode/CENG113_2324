package lg2_q2b;

import java.util.Scanner;

/**
 *
 * @author EVREN
 */
public class LG2_Q2b {

    public static void main(String[] args) {
        //solution B
	int a, b, c;
	double result, e, t;
        
        Scanner input = new Scanner(System.in);
        
	System.out.printf("\nEnter the values of a, b and c:");
	a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

	System.out.printf("\nEnter the values of e and t:");
        e = input.nextDouble();
        t = input.nextDouble();

	//calculating the result
	result = (a + (c + 1 / e) / (b*t / a)) / (c*e / ((b + 1) / b));

	/*
	//another way for calculating the result
	result = ( a+(c+1/e) / (b * t/a) )   /  (c*e)/((b+1)/b);
	*/

	//displaying the result
	System.out.printf("Result is %.3f \n", result);
    }
}
