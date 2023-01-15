package package_2;

public class Launch_7 {

	public static void main(String[] args) {
		// WAP to find if String contains all unique characters.
		
		String str = new String("The quick brown fox jumps over the lazy dog");
		
		System.out.println("Given String is : "+str);
		boolean flag = false ;
		
		char[] strarray = str.toCharArray();
		l1 : { for (int i=0;i<strarray.length;i++) {
			for (int j=i+1;j<strarray.length;j++) {
				if(strarray[i]==strarray[j]) {
					flag  = true;
					break l1;
					}
				}
		      }
		}
		if (flag == false) {
			System.out.println("This string contains all the unique value");
		}
		else {
			System.out.println("This string contains duplicate character");
		}
		

	}

}
