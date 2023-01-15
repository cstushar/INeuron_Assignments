package package_2;

public class Launch_4 {

	public static void main(String[] args) {
		// WAP to count the number of consonants, vowels, special characters in a String
	
		String str = new String("happy&#$%aeiou%%");
		System.out.println("Given String is : "+str);
		
		int spaces = 0;
		int consonants = 0;
		int vowels = 0;
		int splchar = 0;
		char[] strarray = str.toCharArray();
		for (int i=0;i<strarray.length;i++) {
				
				if(strarray[i]==(' ')) {
					spaces++;
				}
				else if(strarray[i]==('a') || strarray[i]==('A') || 
						strarray[i]==('e') || strarray[i]==('E') || 
						strarray[i]==('i') || strarray[i]==('I') ||
						strarray[i]==('o') || strarray[i]==('O') ||
						strarray[i]==('u') || strarray[i]==('U')) {
					vowels++;
				}
				else if(strarray[i]==('!') || strarray[i]==('@') || 
						strarray[i]==('$') || strarray[i]==('#') || 
						strarray[i]==('%') || strarray[i]==('*') ||
						strarray[i]==('^') || strarray[i]==('&') ||
						strarray[i]==(')') || strarray[i]==('(')) {
					splchar++;
				}
				else {
					consonants++;
				}
			}
		
		System.out.println("No of consonants in given string :"+consonants);
		System.out.println("No of vowels in given string :"+vowels);
		System.out.println("No of spaces in given string :"+spaces);
		System.out.println("No of special character in given string :"+splchar);
	}

}
