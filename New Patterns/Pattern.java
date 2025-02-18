/*
2
46
81012
14161820
222426

*/

class Pattern17_7
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


/*                  O/P

C:\Users\Admin\Documents\GitHub\Core-Java\New Patterns>javac Pattern.java

C:\Users\Admin\Documents\GitHub\Core-Java\New Patterns>java Pattern
2
46
81012
14161820
2224262830

C:\Users\Admin\Documents\GitHub\Core-Java\New Patterns>

*/
