import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String str) { 
  	String newWord = "";
  	String a = str.toLowerCase();
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
		    for(int i = 0; i < a.length(); i++){
    
    	        if( a.charAt(i) == 'z'){
		            newWord += alphabet.charAt(0);
		            break;
		        } 
	
		        for (int j = 0; j < alphabet.length(); j++){
		            // if they match perform replacement 
		            if(a.charAt(i) == alphabet.charAt(j)){
		                newWord += alphabet.charAt(j+1);
		                break;
		            }
		            // if the current char is not contained on the alphabet string (spaces, numbers and so on) copy it as it is
		            else if (alphabet.indexOf(a.charAt(i)) == -1){
		               newWord += a.charAt(i);
		               break;
		            }
		        }
		    }
		    //Capitalize each vowel to UpperCase
		    for(int i = 0 ; i <newWord.length();i++){
		    	if (newWord.charAt(i) == 'a' || newWord.charAt(i) == 'e' || newWord.charAt(i) == 'i'
						|| newWord.charAt(i) == 'o' || newWord.charAt(i) == 'u') {
					String front = newWord.substring(0, i);
					String replaced = String.valueOf(newWord.charAt(i)).toUpperCase();
					String back = newWord.substring(i + 1);
					newWord = front + replaced + back;
				}
		    }
       
    return newWord;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
