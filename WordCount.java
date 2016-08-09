import java.util.Scanner;


// Have the function WordCount(str) take the str string parameter being passed
// and return the number of words the string contains (ie. "Never eat shredded
// wheat" would return 4). Words will be separated by single spaces.
		
class Main { 
	
public static String WordCount(String str) {
	
	String [] s  = str.split(" ");
	String length = String.valueOf(s.length);
	
	return length;
	}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(WordCount("Never eat shredded wheat")); 
    
  }   
}
