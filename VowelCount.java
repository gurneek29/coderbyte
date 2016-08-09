import java.util.Scanner;


// Have the function VowelCount(str) take the str string parameter being passed
// and return the number of vowels the string contains (ie. "All cows eat grass"
// would return 5). Do not count y as a vowel for this challenge.
		
class Main { 
	
public static String VowelCount(String str) {
	int a = 0;
	int e = 0;
	int i = 0;
	int o = 0;
	int u = 0;
	
	String temp = str.replaceAll("\\s","").toLowerCase(); //removing spaces
	for(int k = 0; k <temp.length();k++){
		
			if (temp.charAt(k) == 'a') {
				a++;
			}
			if (temp.charAt(k) == 'e') {
				e++;
			}
			if (temp.charAt(k) =='i') {
				i++;
			}
			if (temp.charAt(k) =='o') {
				o++;
			}
			if (temp.charAt(k) =='u') {
				u++;
			}
			
			
		}
	String result = "Vowel Count: " + "a: " + a + "," + "e: " + e + "," + "i: " + i + "," + "o: " + o + "," + "u: " + u; //or use a StringBuilder

	return result;
	}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(VowelCount("All cows eat grass")); 
    
  }   
}

