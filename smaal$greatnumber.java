package Name;
import java.util.Scanner;   // we call it Java. util because it utilises the class
public class smaal$greatnumber {
	

	 //our class name
		public static void main(String[]args)
		{
			Scanner input=new Scanner(System.in); // allows inputing of values
			int f_num, s_num, t_num;
			System.out.print("input  your first number here");//instruct the user to enter the data
			
			f_num= input.nextInt(); // allows the inputing of data into  the system
	System.out.print("input  your second number here");
			
			s_num= input.nextInt();
	System.out.print("input  your third number here");
			
			t_num= input.nextInt();
			if ((f_num>s_num)==true) // here we will use the repetition function
			{
				if(f_num>t_num) {
					System.out.print( "the largest number is:"+f_num);
					
				}
				else
				{
					System.out.print("the smallest number is:"+t_num);//output once the boolean turns false
				}
			}
			if ((f_num>s_num)==false)
			{
				if(s_num>t_num)
				{
					System.out.print( "the largest number is :"+s_num);
				}
				else
				{ 
					System.out.print("the smallest number is :"+t_num); // outputs this nce the boolean turns true
				}
			}
			System.out.print("\n");
			//this is to display the smallest
			
			
			if ((f_num<s_num)==false) // here we will use the repetition function
			{
				if(f_num<t_num) {
					System.out.print( "the largest number is:"+f_num);
					
				}
				else
				{
					System.out.print("the smallest number is:"+t_num);//output once the boolean turns false
				}
			}
			if ((f_num<s_num)==true)
			{
				if(s_num<t_num)
				{
					System.out.print( "the largest number is :"+s_num);
				}
				else
				{ 
					System.out.print("the smallest number is :"+t_num); // outputs this nce the boolean turns true
				}
			}
		}
				


}
