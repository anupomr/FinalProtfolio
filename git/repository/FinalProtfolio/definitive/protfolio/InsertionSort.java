package definitive.protfolio;

public class InsertionSort {
	public static int arr[]= new int [31];
	//Insertion Sort 
	public static int [] ins_Sort(int A[], int size) {
		arr=A;
		int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
		return arr;
	}
	public static void displayArray() {
		for (int i = 0; i < InsertionSort.arr.length; i++) {
			System.out.println(InsertionSort.arr[i]);
		}
	}

	public static void main(String[] args) {
	
		
		int[] myArray = { 5, 2, 4, 6, 1, 3,9 };
		InsertionSort.ins_Sort(myArray, myArray.length);
		InsertionSort.displayArray();


	}

}
