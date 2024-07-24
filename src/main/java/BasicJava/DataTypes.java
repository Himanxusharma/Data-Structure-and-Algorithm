package BasicJava;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		int a=10,b=5;
		System.out.println("sum of two number : "+(a+b));
		
		
		Scanner scanner= new Scanner(System.in);
		int i = scanner.nextInt(); // 4 byte
		short s = scanner.nextShort(); //2 byte
		long l = scanner.nextLong(); // 8 byte
		double d = scanner.nextDouble(); // 8 byte
		float f = scanner.nextFloat(); // 4 byte
		char c ; //2 byte
		boolean b1; //2
		
		int z =10;
		long l1 =z;
		long l2 = 1234567L;
		z= (int)l2;
		float n = 1000.009f;
		
		
		
		String abc= scanner.next();
		String def = scanner.nextLine();
		
		
		
	}

}
