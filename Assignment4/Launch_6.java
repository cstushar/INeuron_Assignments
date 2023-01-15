package package_2;

public class Launch_6 {

	public static void main(String[] args) {
		// WAP to implement Pangram
		
		String str = "The quick brown fox jumps over the lazy dog";
		boolean []index = new boolean[26];
		int a = 0;
		boolean flag = true;
		
		
		  for (int i = 0; i < str.length(); i++) {
		         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
		            a = str.charAt(i) - 'A';
		         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
		            a = str.charAt(i) - 'a';
		      }
		      index[a] = true;
		   }
	
		for (int j =0; j<index.length;j++) {
			if(index[j] == false) {
				flag = false;
			}
		}
		System.out.println("String is : "+str);
		if(flag == true) {
			System.out.println("This string is pangram");
		}
		else {
			System.out.println("This string is not pangram");
		}
		
		
	}

}