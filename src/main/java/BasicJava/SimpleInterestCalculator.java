/**
 * 
 */
package BasicJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleInterestCalculator {
	public static void main(String[] args) throws IOException {
		
		int P,R,T;
		Scanner scanner = new Scanner(System.in); // To inpur the data stream
		System.out.print("Principle: ");
		P = scanner.nextInt();
		System.out.print("Rate: ");
		R = scanner.nextInt();
		System.out.print("Time: ");
		T = scanner.nextInt();
        System.out.println("The simple interest will be charged INR "+ ((P*R*T)/100));   
        
	}

}
