import java.util.Scanner;

class sumOfElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements in the array : ");
		
		int sum=0;
		for(int i=0;i<size;i++)
		{
			System.out.print("Element " + (i + 1) + ": ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of Element : "+sum);
	}
}