import java.util.ArrayList;
import java.util.Arrays;

public class MaximumDistinctNumber {	
	public static void main(String args[]) { 
		MaximumDistinctNumber obj = new MaximumDistinctNumber();
		int[] arr = new int[]{7,2,2,3,5,4,5};
		System.out.print("When array is: ");
		obj.printArrayElements(arr);
		obj.thirdMaximumDistintNumber(arr);
		
		int[] arr1 = new int[]{8,2,2,6,5,4,5};
		System.out.print("When array is: ");
		obj.printArrayElements(arr1);
		obj.thirdMaximumDistintNumber(arr1);	
		
		int[] arr2 = new int[]{};
		System.out.print("When array is: ");
		obj.printArrayElements(arr2);
		obj.thirdMaximumDistintNumber(arr2);	
		
		int[] arr3 = new int[]{1,2,0};
		System.out.print("When array is: ");
		obj.printArrayElements(arr3);
		obj.thirdMaximumDistintNumber(arr3);	
		
		int[] arr4 = new int[]{2,2};
		System.out.print("When array is: ");
		obj.printArrayElements(arr4);
		obj.thirdMaximumDistintNumber(arr4);
		
		int[] arr5 = new int[]{3,2,1};
		System.out.print("When array is: ");
		obj.printArrayElements(arr5);
		obj.thirdMaximumDistintNumber(arr5);
		
		int[] arr6 = new int[]{2,2,3,1};
		System.out.print("When array is: ");
		obj.printArrayElements(arr6);
		obj.thirdMaximumDistintNumber(arr6);
   }

	public void thirdMaximumDistintNumber(int[] arr) {
		
		if ((arr.length == 0) || (arr == null)) {
			System.out.println("Array is Empty");
			return ;
		} else if (arr.length == 1) {
			System.out.println("The maximum number is: " + arr[0]);
			return ;
		}		
		if (arr.length == 2) {
			if (arr[0] == arr[1]) {
				System.out.println("The maximum number is :" + arr[0]);
				return ;
			} else if (arr[0] > arr[1]) {
				System.out.println("The maximum number is :" + arr[0]);
				return ;
			} else {
				System.out.println("The maximum number is : " + arr[1]);
				return ;
			}
		}
		Arrays.sort(arr);
		ArrayList<Integer> store = new ArrayList<Integer>();
		int LastElement = arr[arr.length-1];
		for (int i = arr.length-2; i>= 0 ;i-- ) {
			if( (LastElement != arr[i]) &&  !(store.contains(arr[i])) ) {
				store.add(arr[i]);			
			}
		}	
		System.out.println("The third maximum distinct number in the array is " + store.get(1));
    }
	
	public void printArrayElements (int[] nums) {
		for (int elements : nums) {
			System.out.print( elements);
	        System.out.print(" ");
	        }
	    	System.out.println("");
	}	
	public void printList(ArrayList<Integer> list) {
	    for(Integer elem : list){
	        System.out.print(elem + "  ");
	    }
	}
}
