/**
 * Pattern
 * 1
 * 2 3
 * 4 5 6 
 * 7 8 9 10 
 * 
 */
package BasicJava.pattern;

import java.util.Scanner;

public class halfTriangle_pattern2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int i=1, val =1;
		while(i<=n) {
			int j=1;
			while(i<=j) {
				System.out.print(val+"" );
				val++;
				j++;
			}
			i++;
			System.out.println("");
		}
	}

}
