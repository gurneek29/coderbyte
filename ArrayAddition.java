import java.util.Arrays;
import java.util.Scanner;

//Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
//and return the string true if any combination of numbers in the array can be
//added up to equal the largest number in the array, otherwise return the
//string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output
//should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty,
//will not contain all the same elements, and may contain negative numbers.
		
class Main { 
	
public static String ArrayAdditionI(int [] n) {
	int sum = 0;
	boolean equal = false;
	Arrays.sort(n); //sort the array in ascending order
	int largest = n[n.length-1]; //store the last element as largest
	int secondLast = n.length - 2;
	
	for (int i = secondLast; i >= 0; i--) { //loop through till second last element
		if (sum > largest) { 
				sum = 0;
			}
			if (sum <= largest) { //keep adding elements until sum <=largest number
				sum += n[i];
				if (sum == largest) {
					equal = true;
				}
			}
		}
		if (equal == true) {
			return "TRUE";
		}
		return "FALSE!!!";
	
}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int [] numbers = {4, 6, 23, 10, 1, 3};
    System.out.print(ArrayAdditionI(numbers)); 
    
  }   
}
