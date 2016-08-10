import java.util.Scanner;

//Have the function LetterCountI(str) take the str parameter being passed and
//return the first word with the greatest number of repeated letters. For
//example: "Today, is the greatest day ever!" should return greatest because it
//has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there
//are no words with repeating letters return -1. Words will be separated by
//spaces.
		
class Main { 
	
public static String LetterCountI(String str) {
	String [] words = str.toLowerCase().replaceAll("[,!+;:<>]", "").split(" "); //remove special characters
	int counter =0; 
	int increment = 0; 
	String repeat = "";
	for(String word : words){
		for (int i = 0 ; i <word.length();i++){
			for(int j = i+1;j<word.length();j++){
				if(word.charAt(i) == word.charAt(j)){ //check each character with all other characters in the word
					increment ++; //if repeated then increment
				}
			}
		}
		
		if(increment > counter){
			repeat = word;
			counter = increment; //set counter to value with the word with most repeated characters
			increment = 0;
		}
	}
	if(!repeat.isEmpty())
	{
		return repeat;
	}
	return "-1";
}

  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCountI("Today, is the greatest day ever!")); 
    
  }   
}
