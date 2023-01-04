package new_package;

public class Launch_3 {

	public static void main(String[] args) {
		// WAP to sort an array using Bubble Sort Algorithm.
		
		int [] arr = {10,14,12,5,3,1,0};
		
		int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                
		}
		
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}

}
