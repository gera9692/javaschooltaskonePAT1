/*21/05029
 * gerald manyasa
 * SCOPE: this  program allows the user to enter their second name .
 * the user enters the age
 * the program through the length property it display the number of words in the name
 * the program via the age it determines if the age of the programmer is even or odd,
 * 
 * 
 */
package Name;//the name of the folder
import java.util.Scanner;// It is the easiest way to read input in a Java program
/**
 * @author my documentation
 *
 */
public class name_counter {
	public static void main(String[]args)
	{
		//here is where i introduce my variable to store my value
	Short  Sname ;
	int age;

	
		Scanner input = new Scanner(System.in);//Here, we have created an object of Scanner named input 
	
	System.out.println("enter your age");
	age=input.nextInt();//allows input of values
	//Scanner reader =new Scanner(System.in);
	System.out.println("enter your age");
	age=input.nextInt();
	if (age %2==0)//divide by modulus where if there is no remainder it will output even and otherwise it will output odd
		System.out.print(age+"is even");
		else
			System.out.print(age + "odd");
	
	System.out.println("enter your surname");

	Sname=input.nextString();
	int counter=Sname.split("\\s").length;
	System.out.println("the  number of characters in your surname is:"+(counter)+"bytes" );
	

		
	}

}
/*String words = "One Two Three Four";
int countWords = words.split("\\s").length;
System.out.println(countWords);*/