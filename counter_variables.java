/*21/05029
 * gerald manyasa
 * SCOPE: this  program allows the user to enter their second name .
 * the user enters the age
 * the program through the length property it display the number of words in the name
 * the program via the age it determines if the age of the programmer is even or odd,
 * please when testing click with arrow at the end of the statement and pace enter once and later press at the end of the statement 
 * you can also  press enter but it will land u in a compile eror
 */

package Name;//the name of the folder

import java.util.Arrays;
import java.util.Scanner;// It is the easiest way to read input in a Java program
/**
 * @author my documentation
 *
 */
public class counter_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String sname, display;
		 int age;
	      Scanner s = new Scanner(System.in);
	      
	      System.out.println("what is your name : ");//user is allowed to enter the name
	      sname = s.nextLine();
	      
	      System.out.println("oooh and what about your age : ");//user is allowed to enter tthe age
	      age = s.nextInt();
	      
	      if(age%2 == 0) {//if there is no remainder then it is divisible
	    	  display = "And your age is an even number";
	      } else {
	    	 display = "And your age is an odd number";
	      }
	      
	      
	      
	      System.out.println("The length of your name is :"+sname.length() + "\n"+display);
}
}
