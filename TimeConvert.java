class Main { 
	
public static String TimeConvert(int num) {
	int hours = 0;
	int min= 0;
	if (num>0){
		hours = num/60;
		min = num %60;

		return hours + ":" + min;
	}
	
	return "0";
} 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(93)); 
    
  }   
}
