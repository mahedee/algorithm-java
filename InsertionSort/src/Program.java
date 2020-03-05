
public class Program {
	
	// Java program for implementation of Insertion Sort 
	// Time complexity : O(n^2)
	// Best case : n because it that case array is already sorted and inner
	// while loop will never be executed
	
	// Method to sort array using insertion sort 
	public static void insertionSort(int[] A)
	{
		
		int n = A.length;
		
        // Started from second element
        // Array is zero indexed so last element is n-1
		for(int i = 1; i < n; i++)
		{
			int item = A[i];
			
			// Will be consider, left elements accept item
			int j = i - 1;
			
			// Move elements of A[0..i-1], that are greater than key, 
            // to one position ahead of their current position 
        
            // if last element of left side elements of array is less than key
            // then no need to swap. Because key is in appropriate position
            // Check left elements of key from right to left
			
			// if j reach to 0. It means it is in first position of left portion of item
			// if item is greater than A[j], need not swap it's position
			while(j >= 0 && A[j] > item)
			{
				// Move arr[j] to arr[j + 1]
                // arr[j + 1] is in key. So no way to replace
				
				// initially i = j + 1; for example i = 1 and j = 0
				// shift A[j] to A[J+1] position and keep A[j] position empty
				
				A[j + 1] = A[j]; 
				j--;
			}
			
			// A[j+1] is the perpeft position for item
			// which is already kept empty
			// In the previous loop we already decrement j 
			// then we have to increment it by one 
			A[j + 1] = item;
		}
	}
	
	// Print the sorted array to test
	public static void printInsertionSort(int[] A)
	{
		for(int i = 0; i < A.length; i++)
		{
			System.out.print(A[i] + "  ");
		}
	}

	public static void main(String[] args) {
		
		//Array to be sorted
		int A[] = { 5, 2, 3, 1, 4 };
		
		// Call insertion sort algorithm
		insertionSort(A);
		
		// Print sorted array
		printInsertionSort(A);
	}

}
