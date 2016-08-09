import java.util.Scanner;


// Have the function ABCheck(str) take the str parameter being passed and return
// the string true if the characters a and b are separated by exactly 3 places
// anywhere in the string at least once (ie. "lane borrowed" would result in
// true because there is exactly three characters between a and b). Otherwise
// return the string false.
		
class Main { 
	
public static String ABCheck(String str) {
	int a = 0;
	int b = 0;
	
	String temp = str.replaceAll("\\s",""); //removing spaces
	for(int i = 0; i <temp.length();i++){
		
			if (temp.charAt(i) == 'a') {
				a = i;
			}
			if (temp.charAt(i) == 'b') {
				b = i;
			}
			if (b-a == 3) {
				return "true";
			}

		}

		return "False";
	}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ABCheck("lane borrowed")); 
    
  }   
}
