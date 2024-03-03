
class invertedRightHalf
{
	public static void main(String args[])
	{
		for(int i=6;i<=10;i++)//row
		{
			String str="";
			for(int j=15;j<=25-i;j++)//space
			{
				str=str+"*";
			}
			System.out.println(str);
		}
	}
}