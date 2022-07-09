package stringDSA;

import java.util.Scanner;

public class StringIndexOf {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter YOur First String ");
		String s1 =sc.nextLine();
		
		System.out.println("Enter YOur Second String");
		String s2 = sc.nextLine();
		
//		here you will get the first index of both string where both string have repeatation like
//		firstly check it by giving first String Value GoGoaGoneGoa and second string Goa
		
		System.out.println(s1.indexOf(s2));
		
		

	}

}
