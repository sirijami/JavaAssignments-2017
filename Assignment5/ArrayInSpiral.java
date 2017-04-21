import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayInSpiral {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,3, 10},
				                  {4,5,6, 11},
				                  {7,8,9, 12}};
		ArrayInSpiral obj = new ArrayInSpiral();
		List<Integer> integers = obj.spiralOrder(arr);
		obj.printArrayList(integers);	
    }
	
	public List<Integer> spiralOrder(int[][] arr) {
		int startOfRow = 0;
		int endOfRow = arr.length;
		int startOfCol = 0;
		int endOfCol = arr[0].length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while( startOfRow < endOfRow && startOfCol < endOfCol) {
			//Start traverse from startOfCol till you reach endOfCol and add those values to list.
			
			for (int i = startOfCol; i < endOfCol; i++) {
				list.add(Integer.valueOf(arr[startOfRow][i]));
			}
		    startOfRow++ ;
		    
		    // This reads the value from the last column and adds in the list. 
		    for ( int i = startOfRow ; i < endOfRow ; i++) {
		    	list.add(Integer.valueOf(arr[i][endOfCol-1]));
		    }
		    endOfCol--;
		    
		    //It checks whether there is a row to read then it reads the last row from backwards.
		    if (startOfRow < endOfRow) {
		    	for (int i = endOfCol-1; i >= startOfCol ; i-- ){
		    		list.add(Integer.valueOf(arr[endOfRow-1][i]));
		        }
		    	endOfRow--;
		    }
		    
		    // It checks whether there is a column which have not traversed yet then it reads the column.
		    if (startOfCol < endOfCol) {
		    	for (int i = endOfRow-1; i >= startOfRow; i--) {
		    		list.add(Integer.valueOf(arr[i][startOfCol]));
		    	}
		    	startOfCol++;
	        }					
		}
		return list;
   }
	// This method prints all array list items	
	public  void printArrayList(List<Integer> integers) {
	    for (Integer integer : integers) {
	        System.out.print(integer + " ");
	    }
	    System.out.println();
	}

}
