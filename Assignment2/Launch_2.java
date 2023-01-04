package new_package;
public class Launch_2 {

static int partition(int [] arr ,int low ,int high) {
	int pivot = arr[high];
	int left = (low-1) ;
	for (int j=low ;j<=high-1;j++) {
		if (arr[j] < pivot){
            left++; 
            int temp=arr[left];
            // increment index of smaller element
            arr[left]=arr[j];
            arr[j]=temp;
        }
    }
	int temp=arr[left+1];
    arr[left+1]=arr[high];
    arr[high]=temp;
    return (left + 1);
	}

static void quickSort(int []arr,int low,int high){
	if (low<high) {
		
		 int pi = partition(arr,low,high);
		 quickSort(arr, low, pi-1);  // Before pi
	     quickSort(arr, pi + 1, high); // After pi
	}
}

static void printing(int arr[]) {
	for (int elem : arr) {
		System.out.print(elem +" ");
	}
}

	public static void main(String[] args) {
		// WAP to sort an array using Quick Sort Algorithm.
		
		int [] array = {10,2,1,3,25,4};
		int low=0;
		int high=array.length;
		System.out.println("UnSorted Array :");
		printing(array);
		System.out.println("");
		quickSort(array,0,high-1);
		System.out.println("Sorted Array :");
		printing(array);
		
	}
}
