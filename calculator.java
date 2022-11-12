/* gerald manyasa @ 2105029
 * java programmer
 * the user enters the two values and chooses within the operation for execution
/* gerald manyasa @ 2105029
 * java programmer
 * this program allows user to enter values and the program checks and does the calculation based on the operation chosen
 * 

*/
package Name;//folder name

import java.util.Scanner;//the easiest way to read in a java program

public class calculator {

	public static void main(String[] args) {
		int result=0, value1, value2;
		char operation = ' ';

		Scanner input = new Scanner(System.in);
		System.out.println("enter the first value");
		value1 = input.nextInt();
		System.out.println("enter the second value");
		value2 = input.nextInt();
		System.out.println("choose an operation between multiply,add,divide and subtract ");
		input.nextLine();//user is allowed to input values
		operation = input.nextLine().charAt(0);//The charAt() method returns the character at the specified index in a string
		System.out.print(operation);
		if (operation == '+') {
			result = value1 + value2;
			System.out.println(operation);
		} else if (operation == '*') {
			result = value1 * value2;
			System.out.println(operation);
		} else if (operation == '/') {
			result = value1 / value2;
			System.out.println(operation);
		} else if (operation == '-') {
			result = value1 - value2;
			System.out.println(operation);
		} 
		System.out.printf("%d\n",result);//%d is used also in java here it lso present the value as an output and shows the  value outputed is a double
	}
}

// if(operation="*")
