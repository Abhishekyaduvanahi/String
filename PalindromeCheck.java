package stringDSA;

import java.util.Scanner;

public class PalindromeCheck {
	
	public static boolean isPal(String s1) {
		int begin =0;
		int end = s1.length()-1;
		while(begin<end) {
			if(s1.charAt(begin)!=s1.charAt(end)) 
				return false;
			
			begin++;
			end--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter YOur String ");
		String s1 =sc.nextLine();
		
		
		
	}

}
