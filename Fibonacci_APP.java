package fibonacci_app;

import java.util.Scanner;
import java.io.PrintStream;

public class Fibonacci_APP {
	//Creating scanner and main function
	static Scanner usin = new Scanner(System.in);
	public static void main(String[] args) {
		
		//creating variables and vectors
		PrintStream so = System.out;
		int length;
		so.println("Enter the length of the Fibonacci sequence: ");
		length = usin.nextInt();
		int [] Fibonacci = new int[length];
		
		//Setting initial values in the vector
		Fibonacci[0] = 1;
		Fibonacci[1] = 1;
		
		//Entering the values into the vector
		for (int i = 2; i <= length - 1; i++) {
			Fibonacci[i] = Fibonacci[i-2] + Fibonacci[i-1];
		}
		//Printing the values from the vector into the command window
		for (int i = 0; i <= length -1; i++) {
			so.print(Fibonacci[i] + " ");
		}
	}
}
