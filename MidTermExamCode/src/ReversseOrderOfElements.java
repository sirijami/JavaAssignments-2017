import java.util.ArrayList;


public class ReversseOrderOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversseOrderOfElements obj = new ReversseOrderOfElements();
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		obj.printArrayList(list);
		obj.reverse(list);

	}
	public static <E> void reverse(ArrayList<E> list) {
		int listSize = list.size()-1;
		int i = 0;
		int j = listSize;
		while(i<j){
			E end = list.remove(j);
			E front = list.remove(i);
			list.add(i, end);
			list.add(j, front);
			i++;
			j--;
		}
		printArrayList(list);
		
	}
	public static <E> void printArrayList(ArrayList<E> list){
		for(E listElement :list){
			System.out.print(listElement + " ");			
		}
		System.out.println();
	}

}
