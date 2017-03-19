import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class UniqueTwoCharacterStrings {

	public static void main(String[] args) {
		
		UniqueTwoCharacterStrings obj = new UniqueTwoCharacterStrings();
		String resultString1 = obj.generateStrings("abcd", "efgh");
		System.out.println(resultString1);
		String resultString2 = obj.generateStrings("acdc", "abba");
		System.out.println(resultString2);
	}
	public static String generateStrings(String s1, String s2) {
		
		TreeSet<String> uniqueTwoCharString = new TreeSet<String>();
		String element;
		for(int i = 0; i < s1.length(); i++){
			for(int j = 0; j< s2.length(); j++){
				element =  Character.toString(s1.toUpperCase().charAt(i)) + Character.toString(s2.toUpperCase().charAt(j));
				uniqueTwoCharString.add(element);				
			}
		}
	     Iterator<String> it = uniqueTwoCharString.iterator();
	     String returnString = "";
	     while(it.hasNext()){
	    	 returnString = returnString + it.next() + " ";
	     }
	     return returnString;
	}

}
