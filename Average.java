/* gerald manyasa @ 2105029
 * java programmer
 * this program propmts the user to enter marks of the five units and gives the summ and outputs the average in two decimal points
 * */
package Name;
import java.util.Scanner;// It is the easiest way to read input in a Java program
import java.math.RoundingMode;//Specifies a rounding behavior for numerical operations capable of discarding precision
import java.text.DecimalFormat;// It has a variety of features designed to make it possible to parse and format numbers in any locale
public class Average {
	private static final DecimalFormat df=new DecimalFormat("0.00");
	public static void main(String[]args)
	{//introduction of variables to to thir data types
		int C_prog,data_structure,networking,Financial,entrepreurship, sum;
		double average;
		
	Scanner input=new Scanner(System.in);//(System .in )allows inputing of values
	System.out.println("enter your programming marks");
	C_prog=input.nextInt();// user inputs values
	System.out.println("enter your data structure");
	data_structure=input.nextInt();
	System.out.println("enter your networking");
	networking=input.nextInt();
	System.out.println("enter your financial mnagment");
	Financial=input.nextInt();
	System.out.println("enter your entrepreuship");
	entrepreurship=input.nextInt();
	sum=C_prog+data_structure+networking+Financial+entrepreurship;
	average=sum/5;
	System.out.printf(" your average is:"+average);
	

	}
	
	
	

}
