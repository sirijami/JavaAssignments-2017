import java.util.ArrayList;
import java.util.Arrays;

public class Assignment3 {
	
	public static void main(String args[]) {
		Assignment3 assignment3 = new Assignment3();
		assignment3.testForReverseArray();
		
		Assignment3 addesOne = new Assignment3();
		addesOne.testForPlusOne();
		
		Assignment3 primeNumbersOfNumber = new Assignment3();
		primeNumbersOfNumber.testForGeneratePrimes();
		
		Assignment3 stringIsRotation = new Assignment3();
		stringIsRotation.testForIsRotation();
		
		Assignment3 stringIsPermutation = new Assignment3();
		stringIsPermutation.testForIsPermutation();
		
		Assignment3 encoder = new Assignment3();
		encoder.testForEncoding();
		
		Assignment3 decoder = new Assignment3();
		decoder.testForDecoding();
	}




	/* TO REVERSE AN ARRAY
	 * First check whether the array is empty or not. If empty then return "No elements present in the array".
	 * If array is not empty check whether the length of array is a divisible by 2 or not.
	 * If yes then the array length is a even number. 
	 *     Then swap the elements of corners positions and then the inner elements.
	 * Else if the length is a odd number. 
	 *     Then keep the middle number as it is and swap the corner elements and then the inner elements.
	 * To print the array elements call the "printArrayElements" method. 
	 */
	

	public void reverseArray(int[] nums) {
		int temp = 0;
		if (nums.length != 0) { 
			System.out.println();
		    System.out.print("Elements before reversing ");
			printArrayElements(nums);
			if (nums.length % 2 == 0) {
				for (int i = 0; i < (nums.length)/2 ; i++) {
					temp = nums[i];
			       	nums[i] = nums[(nums.length - 1) - i ];
			       	nums[(nums.length - 1) - i ] = temp;
			    }
				 
			 } else {
				 int middleValue = (nums.length -1 ) / 2 ;
				 for (int i = 0; i < middleValue ; i++) {			        	
			        	temp = nums[i];
			        	nums[i] = nums[(nums.length - 1) - i ];
			        	nums[(nums.length - 1) - i ] = temp;	
			        	}
				 
			 }
			 System.out.println(" ");
			 System.out.print("Elements after reversing ");
			 printArrayElements(nums);
			 } else {
				 System.out.println("Array has no elements");
				 
			 }
	  }

    public void printArrayElements (int[] nums) {
    	for (int elements : nums) {
    		System.out.print( elements);
    		System.out.print(" ");
    	}
    	System.out.println("");
    }
    
    /* TO ADD ONE
	 * First check whether the array is empty or not. If array is not empty then proceed further.
	 * Initialize a carry variable to "1".
	 * Start from the right side of the array and add "1" to last element.Continue this process till it reaches index of "0". 
	 *    If the sum is "10" then it has a carry. 
	 *       Then last element after adding is kept in the result array and carry is reset to 1.
	 *    Else the result is kept in the array and carry is reset to 0.
	 * Comes out of the loop and checks the value of carry. 
	 *    If carry is equal to "1" then it needs a new increased size array to store elements. 
	 * To print the array elements call the "printArrayElements" method. 
	 */
    
    public int[] plusOne(int[] digits) {
		System.out.print("Input Array: ");
		printArrayElements(digits);
		if(digits.length == 0) {
			System.out.println("Array is empty"); 
			return digits;
		}
		int carry = 1;	
		int[] result = new int[digits.length];	
		for (int i = digits.length-1 ; i>=0 ; i--){		
			int sum = digits[i] + carry ;		
			   if (sum == 10){			   
				   carry = 1;
				   result[i] = 0;
			}  else {
				   carry = 0;
				   result[i] = sum ;		  
			}
		}		 		   
		if (carry == 1 ) {			   
			int[] newresult = new int[digits.length + 1];			  
			newresult[0] = 1;			   
			for ( int i= 0; i < result.length ; i++ ) {					   
				newresult[i + 1] = result[i];		
			} 
			return newresult;		
		}
		return result;
	}
    
    /* TO GENERATE PRIME NUMBERS 
	 * First check whether the number is 1 or 0. if it's true than print they are not prime numbers. 
	 * In the main loop it continues till the number.
	 * In the inner loop if the number is not divisible by any number then it stores that number as it's a prime number. 
	 * Likewise all prime numbers are stored in the array list. 
	 * Then the printArrayElements is called to print all the prime numbers till that number.
	 */      
   
    public int[] generatePrimes(int n) {
		 System.out.println();
		 System.out.println( "Prime numbers till " + n +" are : " );		
		 if ((n == 1)||(n==0)) { 
				 System.out.println(n + " is not a prime number");
				 
		 }
		 ArrayList<Integer> listOfPrimeNumbers = new ArrayList<Integer>();	
		 for (int i=2;i <= Math.abs(n); i++) {
			ArrayList<Integer> factorOfi = new ArrayList<Integer>();
			 for (int j =2 ; j <= i/2; j++ ) {
				 if ( i%j == 0) {
					 factorOfi.add(j);
				 }
			 }
			 if(factorOfi.isEmpty()) {
				 listOfPrimeNumbers.add(i);
				 
			 }
		 }
		 int[] arr = new int[listOfPrimeNumbers.size()];
		 for (int i=0; i < arr.length; i++) {
			 if (n > 0) {
				 arr[i]= listOfPrimeNumbers.get(i).intValue();		    		
				 
			 } else {		    		
				 arr[i] = -1*listOfPrimeNumbers.get(i).intValue();
				 }
			 
		 }
		 return arr;
		 
    }
    
    /* TO CHECK STRING2 IS ROTATION OF STRING1 
	 * First convert both the strings to lower case so that we can compare case sensitive strings. 
	 * Then check for corner cases like whether strings are empty or have white space or are of different length.
	 * If any of the above case are true 
	 *     Then returned false.
	 * Else 
	 *     Concatenate string1 twice and store the result in a new variable string.
	 *     for ex: string1 is "siri" than the concatenated string is" sirisiri".
	 * Then call the "isSubstring" and pass concatenated string and string2 in the arguments.
	 * And check whether the substring of the concatenated string matches with string2.
	 * If yes
	 *     Then return true
	 * Else
	 *     return false    
	 */   
    
    public boolean isRotation(String s1,String s2) {
		if (  (s1 == null) 
				|| (s2 == null)
				|| (s1.isEmpty() && s2.isEmpty())) {
			System.out.println("Both the strings are empty");
			return false;
			
		}
		
		if (s1.contains(" ") && s2.isEmpty() ||(s1.isEmpty() && s2.contains(" "))) {
			System.out.println("Strings are empty");
			return false;
			
		}
		
		if (s1.contains(" ") && !s2.isEmpty()  || s2.contains(" ") && !s1.isEmpty()) {
			if (s1.contains(" ") && s2.contains(" ")) {
				System.out.println("Both Strings contains empty white space");
				return false;
			}
			
			System.out.println("strings are not of same length");
			return false;		
		}
		
		if (s1.length()!= s2.length()) {
			System.out.println("strings are not of same length");
			return false;	
		}

		 String concatedString = s1+s1;
	     boolean isRotation = isSubstring(concatedString, s2);
	     if (isRotation) {
	    	 System.out.println(s1 + " is rotation of " + s2);
	     } else {
	    	 System.out.println(s1 + " is NOT a rotation of " + s2);
	     }
	     return isRotation;
	}
	
	
	public  boolean isSubstring(String concatedString,String s2) {
		if (concatedString.contains(s2)) {
		    return true;	    
		} 
		   return false;
	}
	
    /* TO CHECK STRING1 IS PERMUTATION OF STRING2 
	 * Check for all corner cases like the strings are empty or length are not equal or strings have white space. 
	 * If any of the case is true 
	 *    Then return false.
	 * Else 
	 *    Take two different char arrays to store characters of strings respectively.
	 *    Use ".toCharArray" to convert the string to characters.
	 *    Then use "Sort" function which sorts the elements in char array in alphabetical order.
	 *    Now check whether the elements of both array are same or not using "array.equals". 
	 * If yes 
	 *    Then s1 is permutation of s2 
	 * Else 
	 *    They are not.
	 */   
	
	public  boolean isPermutation(String s1, String s2) {
		if (  (s1 == null) 
				|| (s2 == null)
				|| (s1.isEmpty() && s2.isEmpty())) {
			System.out.println("Both the strings are empty");
			return false;
			
		}	
		if (s1.contains(" ") && s2.isEmpty() ||(s1.isEmpty() && s2.contains(" "))) {
			System.out.println("Strings are empty");
			return false;
			
		}
		if (s1.contains(" ") && !s2.isEmpty()  || s2.contains(" ") && !s1.isEmpty()) {
			if (s1.contains(" ") && s2.contains(" ")) {
				System.out.println("Both Strings contains empty white space");
				return false;
			}
			
			System.out.println("strings are not of same length");
			return false;
		}
	
		if (s1.length() != s2.length()) {
			System.out.println("strings are not of same length");
			return false;
		}		
		char[] charectersOfs1 =s1.toCharArray();
		char[] charectersofs2 =s2.toCharArray();
		Arrays.sort(charectersOfs1);
		Arrays.sort(charectersofs2);
	    boolean result = Arrays.equals(charectersOfs1, charectersofs2);    
	    if( result){
	    	System.out.println(s1+ " is permutation of " +s2);
	    } else {
	    	System.out.println(s1+ " is NOT permutation of " +s2);
	    }
		return result;    
   }
	
    /* TO ENCODE THE STRING
	 * Read the first character in the string and checks whether next char is same as previous or not. 
	 * Continue checking till it gets all the char same as first character and then store the count value. 
	 * Once it reaches a number which is not a char as first number 
	 *   Then it prints the count value and the first character and resets the value of count to 1.
	 * This process continues till it reaches the end of the string.
	 */   
	
	public  String encoding(String s) { 
		   String encode = "";
		   int count = 1;
		   if((s == null)|| (s.isEmpty())){
			   System.out.println("Empty string");
		   }
		   if ((s.length() != 0)) {
			   for (int i=0 ; i <= s.length()-1; i++) {
				   char alphabet = s.charAt(i);
				   if( i== s.length()-1) {
					   encode = encode + count + s.charAt(i) ;
					   break;
				   }
				   if (alphabet == s.charAt(i+1)) {
					   count = count+1;	
				   } else {
					   encode = encode + count + s.charAt(i)  ;
					   count = 1;
				   }
			   	}
			   	System.out.println(encode);  
		   } else {
			   System.out.println("It's an empty string");
		   }
		   return encode ;
	   }
	
    /* TO DECODE THE STRING
     * Check whether the string is empty or null.
     * If true
     *     Then return the empty string
     * Else
     *     Create two Pointer variables.
     *     Check the first substring in the string.
     *           if the substring is a integer 
     *              Then check for next element.
     *              Continue this process as long as the next element is not a integer.
     *           else (when the next char is a not an integer)
     *               Then Print the substring that many times.
     * Continue this process till it reaches to the end of the string.                 
	 */   
	
	public String decoding(String str) {
		if ((str == null) || (str.length() == 0)) {
			System.out.println("String is empty");
			return str;
		}
		String resultString = "";
		int startOfInteger = 0;
		int endOfInteger = startOfInteger;
		for (int i=0; i<str.length(); i++) {
			if (isInteger(str.substring(startOfInteger, i+1))) {
				endOfInteger++;
			} else {
				int frequency = Integer.parseInt(str.substring(startOfInteger, endOfInteger));
				startOfInteger = i+1;
				endOfInteger = startOfInteger;
				
				for (int j=0; j<frequency; j++) {
					resultString = resultString + str.substring(i, i+1);
				}
			}
		}
		return resultString;
	}
		
	public boolean isInteger(String s) {
		try{
			Integer.parseInt(s);
			return true;
		} catch(NumberFormatException e){
				return false;
		}
	}
	
//   TEST CASES:
	
	public void testForDecoding() {
		System.out.println(decoding("10s15m5r"));
		System.out.println(decoding(""));
		System.out.println(decoding("0s1r"));
		System.out.println(decoding("9s5r"));
	}

	public void testForEncoding() {
		encoding("sssrrmm");
		encoding("sssrrm");
		encoding("ssrmnss");
		encoding("");
		encoding("ssssssssssssssrmnss");
		encoding("AAaasssaaRR");
		encoding("ssssssssssmmmmmmmmmmmmmmmrrrrr");
		
    }

	public void testForIsPermutation() {
		isPermutation("siri", "riss"); 
		isPermutation("siri", "riiS");
		isPermutation("siri", "risi");
		isPermutation("Siri", "riss");
		isPermutation("sir i", "rimss");
		isPermutation(" ", "");
		isPermutation("", " ");
		isPermutation("", "");
		isPermutation(" ", "siri");
	    isPermutation("siri", " ");
		isPermutation("siri", "");
		isPermutation("", "siri");
		 	    
    }

	public void testForIsRotation() {
		
		System.out.println("Is Rotation:" + isRotation("sirIsha", "ishasir"));
		isRotation(" ", " ");
		isRotation("sirIsha", "shairs");
		isRotation(" ", "");
		isRotation(" ", "shairs");
		isRotation("sirIsha",  " ");
		isRotation("", "");
		isRotation("s", "s");
		isRotation("s", " ");
	    isRotation("s", "sh");
		isRotation("", " ");
		isRotation("sirisha", "isharis");
		isRotation("sirIsha1", "isha1sir");
		isRotation("sirIsha12", "isha12sir");
		isRotation("$$", "$$");
		isRotation("%$$", "$$%");
		isRotation(null, null);
		isRotation(null, "siri");
		
	    
    }

    public void testForGeneratePrimes(){
    	
		int[] primeNumbers;
		
		primeNumbers = generatePrimes(-49);
		printArrayElements(primeNumbers);
		
		primeNumbers = generatePrimes(0);
		printArrayElements(primeNumbers);
		
		primeNumbers = generatePrimes(1);
		printArrayElements(primeNumbers);
		
		
		primeNumbers = generatePrimes(100);
		printArrayElements(primeNumbers);
		
		primeNumbers = generatePrimes(300);
		printArrayElements(primeNumbers);
		
		primeNumbers = generatePrimes(49);
		printArrayElements(primeNumbers);
		
		primeNumbers = generatePrimes(3);
		printArrayElements(primeNumbers);
		
		primeNumbers = generatePrimes(5);
		printArrayElements(primeNumbers);
		
    }
    
    public void testForPlusOne(){
		int[] output;
		
		output = plusOne(new int[]{9, 9, 9});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
		
		output = plusOne(new int[]{9, 8, 9});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
		
		output = plusOne(new int[]{});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
		
		output = plusOne(new int[]{0});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();	
		
		output = plusOne(new int[]{1});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
			
		output = plusOne(new int[]{0, 1});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
		
		output = plusOne(new int[]{1, 0, 0, 0});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
		
		output = plusOne(new int[]{10, 11, 10});
		System.out.print("Output Array: ");
		printArrayElements(output);
		System.out.println();
    }
 
 	public void testForReverseArray() {
		int[] array = new int[]{1,2,3,4};
		int[] array1 = new int[]{1,2,3,4,5};
		int[] array2 = new int[]{};
		int[] array3 = new int[]{1,2};
		int[] array4 = new int[]{-1,2};
		int[] array5 = new int[]{11,2,63,4,85};
		int[] array6 = new int[]{0,-10,5};

		reverseArray(array);
		System.out.println();
		
		reverseArray(array1);
		System.out.println();
		
		reverseArray(array2);
		System.out.println();
		
		reverseArray(array3);
		System.out.println();
		
		reverseArray(array4);
		System.out.println();
		
		reverseArray(array5);
	    System.out.println();
	    
		reverseArray(array6);
		System.out.println();
	}
 }
