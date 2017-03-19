import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle obj = new PascalTriangle();
		System.out.println(obj.getRow(0));
		System.out.println(obj.getRow(1));
		System.out.println(obj.getRow(2));
		System.out.println(obj.getRow(3));
		System.out.println(obj.getRow(4));
		System.out.println(obj.getRow(5));
		System.out.println(obj.getRow(6));
		System.out.println(obj.getRow(7));
	}
	public ArrayList<Integer> getRow(int rowIndex){	
		ArrayList<Integer> pascal0 = new ArrayList<Integer>();
		pascal0.add(1);		
		ArrayList<Integer> pascal1 = new ArrayList<Integer>();
		pascal1.add(1);
		pascal1.add(1);		
		if(rowIndex == 0){
			return pascal0;
		}
		if(rowIndex == 1){
			return pascal1;
		} 
		ArrayList<Integer> previousPascalList = pascal1;
		ArrayList<Integer> currentPascalList;
		for(int k = 2; k <= rowIndex ; k++){
			currentPascalList = new ArrayList<Integer>();
			currentPascalList.add(previousPascalList.get(0));
			for(int i = 0; i < previousPascalList.size(); i++){
				if (i == previousPascalList.size() - 1) {
					currentPascalList.add(previousPascalList.get(i));
				} else {
					currentPascalList.add(previousPascalList.get(i) + previousPascalList.get(i+1));	
				}			
			}
			previousPascalList = currentPascalList;
		}
		return previousPascalList;		
	}

}
