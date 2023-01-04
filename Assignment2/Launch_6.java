package new_package;

import java.util.Arrays;

public class Launch_6 {

	public static void main(String[] args) {
		// WAP to check whether an array is a subset of another array.

		int []array1 = {1,13,4,7,2,10};
		int []array2 = {2,1,10};
		int flag = 0;
		
		Arrays.sort(array1);
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array2.length;j++) {
				if (array2[j]==array1[i]) {
					flag ++;
				}
			}
		}
		System.out.println("Array1 : ");
		for (int elem:array1) {
			System.out.print(elem+" ");
		}
		System.out.println("\nArray2 : ");
		for (int elem:array2) {
			System.out.print(elem+" ");
		}
		
		if (flag==array2.length) {
			System.out.println("\nArray2 is a Subset of Array1");
		}
		else {
			System.out.println("\nArray2 is not a Subset of Array1");
		}
		
	}

}
