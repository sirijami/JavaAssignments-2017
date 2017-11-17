
public class RelativeOrder {

	public static void main(String[] args) {
		
		RelativeOrder obj = new RelativeOrder();
		int[] arr = new int[]{2,0,3,5,0};
		System.out.print("When array is: ");
		obj.printArrayElements(arr);
		obj.moveZerosToEnd(arr);
		System.out.println();
		
		int[] arr1 = new int[]{0,0,2,0,3,5};
		System.out.print("When array is: ");
		obj.printArrayElements(arr1);
		obj.moveZerosToEnd(arr1);
		System.out.println();
		
		int[] arr2 = new int[]{2,0,0,0,3,5};
		System.out.print("When array is: ");
		obj.printArrayElements(arr2);
		obj.moveZerosToEnd(arr2);
		System.out.println();
		
		int[] arr3 = new int[]{2,0,};
		System.out.print("When array is: ");
		obj.printArrayElements(arr3);
		obj.moveZerosToEnd(arr3);
		System.out.println();
		
		int[] arr4 = new int[]{};
		System.out.print("When array is: ");
		obj.printArrayElements(arr4);
		obj.moveZerosToEnd(arr4);
		System.out.println();
		
		int[] arr5 = new int[]{0,0};
		System.out.print("When array is: ");
		obj.printArrayElements(arr5);
		obj.moveZerosToEnd(arr5);
		System.out.println();
	}
	public void moveZerosToEnd(int[] nums) {
		if ((nums.length == 0) || (nums == null)) {
			System.out.println("Array is Empty");
			return ;
		} else if (nums.length == 1) {
			System.out.println("only one element is present array");
			return ;
		}
		int i = 0;
		int elementsToInspect = nums.length;
		while(i < elementsToInspect) {
			if(nums[i] == 0) {
				int j = i;
				while (j<nums.length-1) {
					nums[j] = nums[j+1];
					j++;
				}
				nums[nums.length-1] = 0;
				i = i-1;
				elementsToInspect--;
			} 
			i++;
		}
		printArrayElements(nums);			
	}
	
    public void printArrayElements (int[] nums) {
    	for (int elements : nums) {
    		System.out.print( elements);
    		System.out.print(" ");
    	}
    	System.out.println("");
    }

}
