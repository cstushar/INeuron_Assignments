package new_package;

public class Launch_1 {

	public static void main(String[] args) {
		
		// WAP to find the duplicates present in an array.
		int [] arr = {10,20,30,40,55,55};
		boolean flag=false;
		
		for (int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) 
			{ 	
				if(arr[i] == arr[j]) 
					{
					System.out.println("Duplicate value found at index "+i+" & "+j);
					flag=true;
					break;
					}								
			}
		}
		
		if(flag==false) 
		{
			System.out.println("no duplicates found");
		}
		
	}}