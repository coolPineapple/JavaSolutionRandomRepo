package chegg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	// This method reverse(String inString) reverses the inString String by using simple for loop.
    public static String reverse(String inString) {
        
    	 String reverse = "";
         for(int i = inString.length() - 1; i >= 0; i--)
         {
             reverse = reverse + inString.charAt(i);
         }
         return reverse;
    }

    public static void main(String[] args) throws IOException {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Name of File to READ");
    	/* Here the inputFileName and outputFileName ie. the name of file should contain the whole absolute path of the file
    	 * In my case the location of file was
    	 * jabberwock.txt absolute path: C:\Users\Pkyad\Desktop\jabberwock.txt
    	 * output.txt absolute path: C:\Users\Pkyad\Desktop\output.txt
    	*/
    	String inputFileName = sc.next();
    	System.out.println("Enter the Name of File to WRITE");
    	String outputFileName = sc.next();
    	
    	
    	BufferedReader readLine;
    	BufferedWriter writeLine;
    	
    	File inputFile = null;
    	File outputFile = null;
		try {
			inputFile = new File(inputFileName);
			FileReader fileR = new FileReader(inputFile);
			readLine = new BufferedReader(fileR);
			
			outputFile = new File(outputFileName);
			FileWriter fileW = new FileWriter(outputFile);
			writeLine = new BufferedWriter(fileW);
			
			// Here line contains String of line read by readline() method
			String line = readLine.readLine();
			while (line != null) {
				// Printing the input File Line by line
				System.out.println(line);
				// reversing a line by calling in reverse(String inString) method
				String rev = reverse(line);
				// Converting rev to Upper Case 
				String revToUpper = rev.toUpperCase();
				// Finally Writing result to output File
				writeLine.write(revToUpper+"\n");
				
				// Moving the readline pointer to read nest line
				line = readLine.readLine();
				
				
				
				
			}
			/* Closing the resources of file*/
			
			readLine.close();
			writeLine.close();
			sc.close();
			
        } catch (FileNotFoundException e) {
        	System.out.println("File not found. Check the Path of File");

        }

    }

}