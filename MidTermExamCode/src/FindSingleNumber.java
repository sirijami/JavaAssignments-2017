import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class FindSingleNumber {
	
	public static void main(String args[]) {
		int[] arr = new int[]{2,2,5,4,5,6,4};
		int[] arr1 = new int[]{2,2,5,5,4,4,5,6,6,1};
		FindSingleNumber obj = new FindSingleNumber();
		int singleNumber1 = obj.singleNumber(arr);
		System.out.println(singleNumber1);
		int singleNumber2 = obj.singleNumber(arr1);
		System.out.println(singleNumber2);		    
    }
	public static int singleNumber(int[] nums){
		if(nums.length == 1){
			return nums[0];
		}
		

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i= 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])){
				int value = map.get(nums[i]);
				value++;
				map.put(nums[i], value);
			}else {
				map.put(nums[i], 1);
			}
		}
		
		//Find the single value element
		for(Entry<Integer, Integer>  mapData : map.entrySet()){
			if(mapData.getValue().equals(1)){
				return mapData.getKey();				
			}			
		}
		/* Since the method signature doesn't have any exception handling case. 
		 * Am returning 0 when no single element found.
		 */	
		return 0;		
	}

}
