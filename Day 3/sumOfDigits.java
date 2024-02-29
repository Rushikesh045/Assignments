//question no 15

class sumOfDigits
{
    public static void main(String args[])
    { 
       int num=123;
       int i=0;
       int sum=0;
       do
       {
          int lDigits=num%10;
          sum=sum+lDigits;
          num=num/10;
          
          
       }
       while(num>0);
       System.out.println(sum);
      
    }
}