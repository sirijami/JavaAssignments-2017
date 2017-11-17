import java.util.Arrays;

public class MissingArrayElement {	
	public static void main(String args[]) {
		MissingArrayElement obj = new MissingArrayElement();
		int[] arr = new int[]{1,2,3,5};
		System.out.print("When array is: ");
		obj.printArrayElements(arr);
		obj.missingNumber(arr);
		System.out.println();
		
		int[] arr1 = new int[]{1,2,3,4,6,7,8};
		System.out.print("When array is: ");
		obj.printArrayElements(arr1);
		obj.missingNumber(arr1);
		System.out.println();
		
		int[] arr2 = new int[]{4,2,5,6};
		System.out.print("When array is: ");
		obj.printArrayElements(arr2);
		obj.missingNumber(arr2);
		System.out.println();
				
		int[] arr3 = new int[]{};
		System.out.print("When array is: ");
		obj.printArrayElements(arr3);
		obj.missingNumber(arr3);
		System.out.println();
		
		int[] arr4 = new int[]{0};
		obj.printArrayElements(arr4);
		obj.missingNumber(arr4);
		System.out.println();
	}
	public void missingNumber(int[] nums) {
	
		if ((nums.length == 0) || (nums == null)) {
			System.out.println("Array is Empty");
			return ;
		} else if (nums.length == 1) {
			System.out.println("only one element is present array");
			return ;
		}	
		Arrays.sort(nums);	
		for ( int i = 0; i< nums.length-1; i++) {
			if ((nums[i] +1) != nums[i+1]) {
				int missingNumber =  nums[i+1] - 1 ;
				System.out.println("the missing number is " + missingNumber);
				return ;
			}
		}
        System.out.println("no missing number");
	}	
    public void printArrayElements (int[] nums) {
    	for (int elements : nums) {
    		System.out.print( elements);
    		System.out.print(" ");
    	}
    	System.out.println("");
    }

}
