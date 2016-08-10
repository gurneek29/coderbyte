import java.util.Scanner;

// Have the function Palindrome(str) take the str parameter being passed and
// return the string true if the parameter is a palindrome, (the string is the
// same forward as it is backward) otherwise return the string false. For
// example: "racecar" is also "racecar" backwards. Punctuation and numbers
// will not be part of the string.
		
class Main { 
	
public static String Palindrome(String str) {
	String original = str.toLowerCase();
	String reversed = "";
	for(int i = original.length()-1;i>=0;i--){
		reversed += String.valueOf(original.charAt(i));
	}
	if(reversed.equals(original)){
		return "true";
	}
	return "false";
	
	
}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(Palindrome("RACECAR")); 
    
  }   
}
