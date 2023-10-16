package lg2_q2a;

/**
 *
 * @author EVREN
 */
public class LG2_Q2a {

    public static void main(String[] args) {
        int a = 6, b = 9, c = 10; //see what happens if you change the data type to double for a, b, c
	double e = 4.5, t = 8.7;

	double result;

	//calculating the result
	result = (a + (c + 1 / e) / (b*t / a)) / (c*e / ((b + 1) / b));
	

	//another way for calculating the result
	//result = ( a+(c+1/e) / (b * t/a) )   /  (c*e)/((b+1)/b);


	//displaying the result
	System.out.printf("Result is %.2f \n", result);
    }  
}
