import java.util.Arrays;
import java.util.Scanner;


//Have the function AlphabetSoup(str) take the str string parameter being
//passed and return the string with the letters in alphabetical order (ie.
//hello becomes ehllo). Assume numbers and punctuation symbols will not
//be included in the string

class Main { 
	
public static String AlphabetSoup(String str) {
	
   if(!str.isEmpty()){
    char[] chars = str.toCharArray(); //convert string into array of characters
    Arrays.sort(chars); //use the sort method or implement QuickSort
    String sorted = new String(chars); //get the String value
    
   return sorted;
 }
return "Invalid Input!!";
 }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(AlphabetSoup("hello")); 
    
  }   
}
