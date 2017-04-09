import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.w3c.dom.css.Counter;


public class FileCounter {
	
	
	private int numberOfCharacters ;
	private int numberOfWords ;
	private int numberOfLines;

	public FileCounter() {
		numberOfCharacters = 0;
		numberOfWords = 0;
		numberOfLines = 0;
    }

	public void read(Scanner in) {
	
		// Once all lines have been read, read function terminates
		while(in.hasNextLine()){
			// If nextLine is present, 
			// Save that line in a string
			// Count number of words in the string
			// For this, use space as a delimiter and split lineString into multiple words
			// Next count total characters, by going over all words in the string
			// Increment numberOfLines count
			String line = in.nextLine();
//			System.out.println("line " + numberOfLines + " :" + line);
			numberOfLines++;
			
			String[] words = line.split(" ");
			numberOfWords = numberOfWords + words.length;
			
			for (String word : words)
            {
                //Updating the charCount               
                numberOfCharacters = numberOfCharacters + word.length();
            }					
		}
    }

	public String getCharacterCount() {
		return String.valueOf(numberOfCharacters);

    }

	public String getWordCount() {
	    return String.valueOf(numberOfWords);
    }

	public String getLineCount() {
		return String.valueOf(numberOfLines);
	    
    }

	
	

}
