/*gerald manyasa#@2105029
 * SCOPE: the main  agenda for the program is when a  child enters a number it check whether it is divisible within the range of 0-9
 * we use if statement when the number is entered it checks until when the number reaches a given criteria as per the statement
 * */

package Name;//name of our folder
import java.util.Scanner;//// It is the easiest way to read input in a Java program
public class divisibility_test {//here is the class name
public static void main(String[]args)//this is the main function

{
	int number_entered;
	Scanner input =new Scanner(System.in);
	System.out.print("hey child,kindly enter the number to be tested");
	number_entered=input.nextInt();//allows input from the user

	System.out.print("\n");//this is the line break
if (number_entered  %2==0) //the if function
{
	System.out.println(number_entered+" is divisible by 2");
}

else if (number_entered  %3==0) 
{
	System.out.println(number_entered+ "is divisible by 3");
}		
if (number_entered  %4==0) 
{
	System.out.println(number_entered+ " is divisible by 4");
}
else if (number_entered  %5==0) 
{
	System.out.println(number_entered+ " is divisible by 5");
}
else if (number_entered  %6==0) 
{
	System.out.println(number_entered+ "is divisible by 6");
}
else if (number_entered  %7==0) 
{
	System.out.println(number_entered+ " is divisible by 7");
}
else if (number_entered  %8==0) 
{
	System.out.println(number_entered+ "  is divisible by 8");
}
else if (number_entered  %9==0) 
{
	System.out.println(number_entered+ " is divisible by 9");
}
else 
{
	System.out.println(number_entered+ "is not within 0-9 divisibility");
}
System.out.print("\n");
}
}
