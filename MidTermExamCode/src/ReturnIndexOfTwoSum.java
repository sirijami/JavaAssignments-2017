import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;


public class ReturnIndexOfTwoSum {

	public static void main(String[] args) {
		int[] arr = new int[]{2,7,11,15};
		int[] arr1 = new int[]{-2,7,-11,15};
		ReturnIndexOfTwoSum obj = new ReturnIndexOfTwoSum();
		printArray(obj.twoSum(arr,9));
		printArray(obj.twoSum(arr1,-4));
	}

	public int[] twoSum(int[] nums, int target){
		int[] indices = new int[2];
		int[] emptyArray = new int[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length ; i++){
			 map.put(nums[i] , i) ;
		}
//		Check for the sum same as target and return the indices
		for(int i = 0; i < nums.length ; i++){
			int secondNumber = target - nums[i];
			if((map.containsKey(secondNumber)) && (i != map.get(secondNumber))) {
				indices[0]= i;
				indices[1] = map.get(secondNumber);
				
				return indices;
			}			
		}
		return emptyArray;				
	}
	public static void printArray(int[] list){
		for(int listElement :list){
			System.out.print( listElement + " ");			
		}
		System.out.println();
	}

}
