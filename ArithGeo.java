import java.util.Scanner;

// Have the function ArithGeo(arr) take the array of numbers stored in arr and
// return the string "Arithmetic" if the sequence follows an arithmetic pattern
// or return "Geometric" if it follows a geometric pattern. If the sequence
// doesn't follow either pattern return -1. An arithmetic sequence is one where
// the difference between each of the numbers is consistent, where as in a
// geometric sequence, each term after the first is multiplied by some constant
// or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example:
// [2, 6, 18, 54]. Negative numbers may be entered as parameters, 0 will not be
// entered, and no array will contain all the same elements.
		
class Main { 
	
public static String ArithGeo(int [] n) {
	
	int diff = n[1] - n[0];
	int constant = n[1]/n[0];
	boolean a = false;
	boolean g = false;
	
	for(int i = 0 ;i<n.length-1;i++){
	
		if(diff == n[i+1]-n[i]){ //checking the difference between each of the numbers is consistent
			a = true;
		}
		
		if (constant*n[i] == n[i+1]){ //checking for common ratio 
			g = true;
			a = false;
		}
	}
	if (a ==true){
		return "Arthimetic";
	}
	if (g==true){
		return "Geometric";
	}
	return "-1";
}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int [] numbers = {2,6,18,54};
    System.out.print(ArithGeo(numbers)); 
    
  }   
}
