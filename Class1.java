package Word_count;

import java.util.Scanner;

public class Class1 {

	
	//main method
	
   public static void main(String args[]){
        String str;
        Class2 c= new Class2();//object of class2
        c.Count_WOrds();
        Scanner scan = new Scanner(System.in);
 
        System.out.print("Enter a Sentence : ");
        str = scan.nextLine();
        
 
        System.out.print("The number of words are : "+c.Count_WOrds(str));
   }

}
