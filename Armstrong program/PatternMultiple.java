class PatternAll
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=1;j++)
			{
				System.out.println("  ");
			}
			for(int j=1;j>=i;i++)
			{
				System.out.println("* ");
			}
		}
	}
}