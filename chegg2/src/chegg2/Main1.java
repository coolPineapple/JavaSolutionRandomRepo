package chegg2;
import java.io.*;
import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		
	}
}


class FileIO {

public static void main(String args[]) {        
    //  C:\jabberwock.txt

	Scanner scc = new Scanner(System.in);
	System.out.println("Enter the Name of File to READ");
	// Here the fname ie. the name of file should contain the whole absolute path of the file
	String inp = scc.next();
	String op = scc.next();
	
	
	
	try {
        File input = new File(inp);
        File output = new File(op);
		Scanner sc1 = new Scanner(input);
        PrintWriter printer = new PrintWriter(output);
        while(sc1.hasNextLine()) {
            String s = sc1.nextLine();
            printer.write(s);
        }
        printer.close();
    }
    catch(FileNotFoundException e) {
        System.err.println("File not found. Please scan in new file.");
    }
}
}