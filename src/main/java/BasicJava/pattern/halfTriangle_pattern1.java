/**
 * Pattern
 * 1
 * 1 2
 * 1 2 3 
 * 1 2 3 4 
 * 1 2 3 4 5
 * 
 */


package BasicJava.pattern;

import java.util.Scanner;

public class halfTriangle_pattern1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		// using while loop
		int i = 1;
		while (i <= n) {
			int j=1;
			while (j <= i) {
				System.out.print(j + " ");
				j++;				
			}
			i++;
			System.out.println();
		}
	}

}
