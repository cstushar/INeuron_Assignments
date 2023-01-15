package package_2;

public class Launch_1 {

	public static void main(String[] args) {
		
		// WAP to remove Duplicates from a String.
		String str = new String("happy ending");
		System.out.println("Given String is : "+str);
		
		char[] strarray = str.toCharArray();
		for (int i=0;i<strarray.length;i++) {
			for (int j=i+1;j<strarray.length;j++) {
				
				if(strarray[i]==strarray[j]) {
					strarray[j] = ' ';
					}
				}
			}	
	
		for(char ch : strarray) {
			System.out.print(ch);
			}		    
		}

}
