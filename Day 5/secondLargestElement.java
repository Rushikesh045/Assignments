import java.util.Scanner;

class secondLargestElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter elements in the array : ");
       
		for(int i=0;i<size;i++)
		{
			System.out.print("Element " + (i + 1) + ": ");
			arr[i]=sc.nextInt();
			
		}
		int Max=arr[0];
		int secondMax=arr[0];
        for(int i=1;i<size;i++)
		{
			if (arr[i] > Max) {
                secondMax = Max;
                Max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != Max) {
                secondMax = arr[i];
            }
		}
		System.out.println("Second max value : "+secondMax);
	}
}