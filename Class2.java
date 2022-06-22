package Word_count;

public class Class2 {
 String str;
 
 //constructor
 
 public void CLass2(String str) {
	 this.str=str;
	 
 }
 // Method for count words and return the number of words
 
 public static int Count_WOrds(String str) {
	  int count=1;
	        for(int i=0; i<=str.length()-1; i++){
	            if(str.charAt(i) == ' ' && str.charAt(i+1)!=' '){
	                count++;
	            }
	        }
  
	  return count;
  }

public void Count_WOrds() {
	// TODO Auto-generated method stub
	
}
 
 }
	

