import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord(String sen) { 
  //check if string is empty 
    if (sen == null){
     return "String is Empty!";
}
        String sw=""; //variable to store the shortest word
	String lw=""; //to store the longest word
        int s=sen.length(); //length of imput string
	int l=0; //to store the length of words when comparing
        String words[]=sen.split(" "); //split the string 
        for(String word:words) //for each word compare against the first word
        {
                if(word.length()<s) //check if the word is shorter then the string length (initially)
                {
                        sw=word; //first word is set as the shortest word
                        s = word.length(); //setting the lenght equal to the first word
                }
                if(word.length()>l) 
                { 
                        lw=word; //first word is set as the longest word
                        l = word.length(); //
                }
        }
        return lw;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}
