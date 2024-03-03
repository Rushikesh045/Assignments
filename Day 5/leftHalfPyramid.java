
import java.util.Scanner;
class leftHalfPyramid
{
	
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter number ");
		//int n=sc.nextInt();
		for(int i=4;i<=8;i++)//row
		{
			String str=" ";
			for(int j=10;j<=i+6;j++)//space
			{
				str=str+"* ";
			}
			
			
			System.out.println(str);
		}
	}
}