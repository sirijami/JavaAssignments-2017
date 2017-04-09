import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;


public class FileAnalyzer {

	public static void main(String[] args) throws IOException {
		try {
	        System.out.println("Filename: ");
	        Scanner in = new Scanner(System.in);
	        String name = in.nextLine();
	        FileCounter counter = new FileCounter();
	        FileReader reader = new FileReader(name);
	        Scanner fileIn = new Scanner(reader);
	        counter.read(fileIn);    
	        fileIn.close();
	        System.out.println("Characters: " + counter.getCharacterCount());
	        System.out.println("Words: " + counter.getWordCount());
	        System.out.println("Lines : " + counter.getLineCount());
        } catch (FileNotFoundException e) {
	        System.out.println("No such file");
        }
	}
}
