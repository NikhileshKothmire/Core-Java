/*
a
1 2
b c d
3 4 5 6
e f g h i

*/

class Pattern17_9
{
	public static void main(String[] args) 
	{
		int a=2;
		for (int i=1;i<=5 ;i++ ) 
		{
		for (int j=1;j<=i ;j++ )
		 {
		 	System.out.print(a +"");
		 	a = a+2;
			 	
			}	
			System.out.println();
		}
	}
}

