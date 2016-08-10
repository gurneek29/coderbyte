import java.util.Scanner;


// Have the function ExOh(str) take the str parameter being passed and return
// the string true if there is an equal number of x's and o's, otherwise return
// the string false. Only these two letters will be entered in the string, no
// punctuation or numbers. For example: if str is "xooxxxxooxo" then the output
// should return false because there are 6 x's and 5 o's.
		
class Main { 
	
public static String ExOh(String str) {
	int x = 0;
	int o = 0;
	
	for (int i = 0 ;i <str.toLowerCase().length();i++){
	if(str.charAt(i) == 'x'){
		x++;
	}
	if(str.charAt(i)=='o'){
		o++;
	}
    }
	if(x==o){
	 return "true";
	}
return "false";
}
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ExOh("xxooxxxooxo")); 
    
  }   
}
