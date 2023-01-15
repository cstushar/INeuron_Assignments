package package_2;

public class Launch_3 {

	public static void main(String[] args) {
		// WAP to check if “2552” is palindrome or not

		String str = new String("2552");
		String str2 = new String("");
		
		for (int i=str.length()-1; i>=0; i--) {
			str2 = str2+(str.charAt(i));
		}
		System.out.println("Given String is :"+str);
		if (str.equals(str2)) {
			System.out.println("This string is Palindrome");
		}	
		else {
			System.out.println("This string is not Palindrome");
		}
	}
}