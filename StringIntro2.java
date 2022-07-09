package stringDSA;

public class StringIntro2 {

	public static void main(String[] args) {
		String str1 ="You are a great man Mr.Lee";
		String str2 ="You are a great man Mr.Lee";
		if(str1==str2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		String str3 =new String("You are a great man Mr.Lee");
		if(str1==str3) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
