package stringDSA;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter YOur First String ");
		String s1 =sc.nextLine();
		
		System.out.println("Enter YOur Second String");
		String s2 = sc.nextLine();
		
		String s3 = s1+s2;
		
		System.out.println("The value after Concatenation of two String");
		System.out.println(s3);
		
		
		
		

	}

}
