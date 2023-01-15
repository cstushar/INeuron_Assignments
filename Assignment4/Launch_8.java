package package_2;

public class Launch_8 {

	public static void main(String[] args) {
		// WAP to find the maximum occurring character in a String.
		String str = new String("grass is great ");
		System.out.println("Given String is : "+str);
		
		int []index = new int[26];
		int a = 0 ;
		int max = index[0];
		
		for (int i = 0; i < str.length(); i++) {
	         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
	            a = str.charAt(i) - 'A';
	         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
	            a = str.charAt(i) - 'a';
	      }
	      index[a]++;
	   }
		
		for (int i=0; i<index.length;i++) {
			if(max < index[i]) {
				max = index[i];
				a = i;
		}}
		System.out.println("most occuring character is : "+ (char)(a+65));
		
	}}