class invertedFullPyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//row
		{
			String str="";
			if((i%2)!=0)
			{
				for(int j=1;j<=(6-i);j++)//space
			{
				str=str+" * ";
			}
			}
			else
			{
				for(int j=1;j<=(1/2)*i;j++)//space
			{
				str=str+" * ";
			}
			}
			System.out.println(str);
		}
	}
}