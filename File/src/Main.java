import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
//	public static String [] fileArray(String filename){//read the oliver.txt
//		String [] file= new String[wordCount(filename)];//array for the words in oliver.txt
//		  
//		try{
//
//		File input = new File(filename);
//		reader = new Scanner(input);
//
//		while(reader.hasNext()){
//		int i=0;
//		String line = reader.nextLine();
//		line = line.replaceAll("[^a-zA-Z\\s]", " ");
//		line = line.replaceAll("\\s+", " ").trim();
//
//		String [] temp = line.split(" ");
//
//
//		for (int j = 0; j < temp.length; j++) {
//		file[j]=temp[j];
//		}//for
//
//		}//while
//		  
//		}//try
//		catch(Exception ex){
//		System.out.println("File error!");
//		}//catch
//		  
//		return file;
//		}//inputFile
//	
	
	public static void main(String[] args) {
		fileArray1("C:\\Users\\Pkyad\\Desktop\\testt.txt");
		
//		for (int i =0;i<allWords.length;i++) {
//			System.out.println(allWords[i]);
//		}
//		
	}
	// file name "C:\\Users\\Pkyad\\Desktop\\testt.txt"
	public static String [] fileArray1(String filename){
			String[] all_words= {};
	        String strLine = "";
	        List<String> list = new ArrayList<String>();
	        try {
	             BufferedReader br = new BufferedReader(new FileReader(filename));
	              while (strLine != null)
	               {
	                strLine = br.readLine();
	                String[] Words = strLine.split(" ");
	                
	                for (int i =0;i<Words.length ; i++) {
	                
	                	list.add(Words[i]);
	                }
	               }
	                
	              all_words = new String[list.size()];
	              list.toArray(all_words);
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	        
	        return all_words;
	        
	     }
	
	
	
	}
	

