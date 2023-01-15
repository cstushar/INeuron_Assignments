package package_2;

public class Launch_2 {

	public static void main(String[] args) {
		// WAP to print Duplicates characters from the String.
		String str = new String("happy ending");
		System.out.println("Given String is : "+str);
		int flag = 0 ;
		
		char[] strarray = str.toCharArray();
		for (int i=0;i<strarray.length;i++) {
			for (int j=i+1;j<strarray.length;j++) {
				
				if(strarray[i]==strarray[j]) {
					flag = j;
					System.out.println( "Duplicates Value Found : "+strarray[flag]);
					break;
					}
				
				}
			  
			}
		}

	}

