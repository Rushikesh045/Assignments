//question no. 1

import java.util.Scanner;
class calculateAverage
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        double array[]={5,4,3,9,7,9};
        double sum=0;
        for(int i=0;i<array.length;i++)
        {
           sum=sum+array[i];
        }
        System.out.println(sum);
        double average=sum/(array.length);
        System.out.println(average);
   }
}