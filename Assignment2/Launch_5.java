package new_package;

public class Launch_5 {

	public static void main(String[] args) {
		// WAP to sort an array using Selection Sort Algorithm.
		
		int [] arr = {10,5,4,1,2,35,40};
		
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[j]<arr[i]) {
					int temp =arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for (int elem:arr) {
			System.out.print(elem +" ");
		}
		

	}

}
