import java.util.*; 
import java.io.*;

class Main {  
  public static String FirstReverse(String str) { 
  
   String temp = "";
   for (int i = str.length()-1;i>=0;i--){
       temp = temp + str.charAt(i);
   }
    return temp;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
