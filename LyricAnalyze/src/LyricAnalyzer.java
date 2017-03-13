import java.io.*;
import java.util.*;

public class LyricAnalyzer {
	public static void add(HashMap<String,ArrayList<Integer>> map, String lyricWord, int wordPosition) {
		ArrayList<Integer> list = map.get(lyricWord);
		if(list == null){
			list = new ArrayList<Integer>();
			list.add(wordPosition);
			map.put(lyricWord, list);
		} else {
			list.add(wordPosition);
		}
    }
    public static void displayWords(HashMap<String, ArrayList<Integer>> map) {
    	Object[] keyData = map.keySet().toArray();
    	Arrays.sort(keyData);   	
   
    	for(Object key: keyData){
    		ArrayList<Integer> list = map.get(key);
    		System.out.print(key + ": ");
            for(Integer values:list){
            	System.out.print(values + " ");
            }
            System.out.println();
    	}
    }

   public static void displayLyrics(HashMap<String, ArrayList<Integer>> map) {
	   int totalWords = 0;
	   	Object[] keyData = map.keySet().toArray();
    	for(Object key: keyData){
    		ArrayList<Integer> list = map.get(key);
    		int num = list.size();
            totalWords = num + totalWords;
    	}
//    	System.out.println("the length" + totalWords);
    	String[] lyricWords = new String[totalWords + 1];
    	for(String str : lyricWords) str = new String("");   	
      	 
    	 for(String key : map.keySet()){
    		 for (int index: map.get(key)){
    			if (index < 0) {
    				lyricWords[(-1) * index] = (String) key + "\n";
    			}else {
        			lyricWords[index] = (String) key + " ";				
    			}
    		 }  		 
    	 }
    	 for (int i = 1; i < lyricWords.length; i++) {
    		 System.out.print(lyricWords[i]);
    	 }	
   }

    public static int count(HashMap<String, ArrayList<Integer>> map) {
		return map.size();
    }

    public static String mostFrequentWord(HashMap<String, ArrayList<Integer>> map) {
    	int max = 0;
    	String maxString = "";
    	for(String key: map.keySet()){
    			int valueSize = map.get(key).size();
    			if(max <= valueSize) {
    				max = valueSize;
    				maxString = key;
    			}
    	}
		return maxString;  
    }


    public static void main(String[] args) throws IOException {
        HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>>();
        int position = 1;  //word position index start from 1


        String pathname = "/Users/sirishaepari/Documents/workspace/LyricAnalyze/src/test4.txt";
        File f = new File(pathname);
        BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream(f)));
        String line = "";
        while (true) {
            line = br.readLine();
            if (line == null || line.length() == 0) {
                break;
            }
            String[] arr = line.trim().split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (i != arr.length - 1) {
                    add(map, arr[i].toUpperCase(), position++);
                } else {
                    add(map, arr[i].toUpperCase(), (-1) * position);
                    position++;
                }
            }
        }
        br.close();
//        System.out.println(map.toString());       
       displayLyrics(map);
       System.out.println();
       displayWords(map);
       System.out.println();
       System.out.println("The number of unique words in the lyric is: " + count(map));
       System.out.println();
       System.out.println("Most frequent word: " + mostFrequentWord(map));
    }

}
