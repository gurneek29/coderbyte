import java.util.Scanner;


// Have the function SimpleSymbols(str) take the str parameter being passed and
// determine if it is an acceptable sequence by either returning the string true
// or false. The str parameter will be composed of + and = symbols with several
// letters between them (ie. ++d+===+c++==a) and for the string to be true each
// letter must be surrounded by a + symbol. So the string to the left would be
// false. The string will not be empty and will have at least one letter.

public class Main { 
	
public static String SimpleSymbols(String str) { 
	String temp = str.toLowerCase();
	String result="";
	for(int i = 0 ; i <temp.length()-1;i++){
		if(temp.charAt(i)!= '+' && temp.charAt(i)!= '='){
			if(temp.charAt(i) >='a' && temp.charAt(i)<='z' && (temp.charAt(i-1)== '+' && temp.charAt(i+1)=='+')){
					result = "TRUE";
				}
			else {
				result = "FALSE!! Not every alphabet is surrounded by a '+' symbol." + "Failed at :-->" + temp.charAt(i);
			}
			}
		}
	return result;
	 
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols("+d+===+c+====a+")); //should be false 
    //System.out.print(SimpleSymbols("+d+===+c+====+a+")); //should be true 
    
  }   
}
