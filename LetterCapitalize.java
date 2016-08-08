import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterCapitalize(String str) { 
  
   String words []  = str.split(" ");
	String newWord = "";
	for(String word : words){
		String replace = word.substring(0,1).toUpperCase(); //Capitalize the first character of each word in the string
		newWord += replace + word.substring(1) + " "; //adding the Capialized character at the beginning of the string
}
	return newWord;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}
