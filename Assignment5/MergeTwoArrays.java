import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String args[]) {
		int[] exactNums1 = new int[]{2,3,4,5,9};
		int[] nums1 = new int[10];
		int[] nums2 = new int[]{1,12,23,44,65};
		
		//Calculating length of both arrays
		int m = exactNums1.length;
		int n = nums2.length;
		// Assigning the values of array to another array which is of size two times of both the arrays.  
		for (int i = 0; i < exactNums1.length ; i++ ) {
			      nums1[i] = exactNums1[i];
		}		
		//printArrayElements(nums1);
		MergeTwoArrays obj = new MergeTwoArrays();
		obj.merge(nums1, m, nums2, n );	    
	}		
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//Checking for empty strings
		if (n == 0 && m == 0){
			System.out.println("Both have empty string");
			return ;
		}
		//Checking values of arrays from backwards.
		int i = m-1;
		int j = n-1;
		
		//This pointer traverse backwards from nums1 array's last index(i.e 9 in this case)
		int k = (m+n) - 1;		
		
		while (i >= 0 && j >= 0) {
			//Finds the largest number from both arrays and stores the largest value at kth position.
			if (nums1[i] < nums2[j]) {
				nums1[k] = nums2[j];
				k--;
				j--;	
			} else if (nums1[i] >= nums2[j]) {
				nums1[k] = nums1[i];
				k--;
				i--;
			}			
		}
		while (i>=0) {
			nums1[k] = nums1[i];
			k--;
			i--;
		}
		while (j>=0) {
			nums1[k] = nums2[j];
			k--;
			j--;
		}
		printArrayElements(nums1);
	}
	
	//Prints array elements		
	public static void printArrayElements (int[] nums) {
	    	for (int elements : nums) {
	    		System.out.print( elements);
	    		System.out.print(" ");
	    	}
	    	System.out.println("");
	    }

}
