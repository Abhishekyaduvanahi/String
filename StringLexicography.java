package stringDSA;

import java.util.*;
public class StringLexicography {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter YOur First String ");
		String s1 =sc.nextLine();
		
//		String s1 ="him";
		System.out.println("Enter YOur Second String");
		String s2 = sc.nextLine();
		
//		String s2 ="her";
		
		// The below applied condition is for checking lexico....of two enter String.
		int check=s1.compareTo(s2);
		if(check==0) {
			System.out.println("String you entered is Same");
			
		}
		if(check>0) {
			System.out.println("The string you entered in that String (First is greater than Second String)");
		}
		if(check<0) {
			System.out.println("The string you entered in that String (First is smaller than First Second String)");
		}

	}

}
