// Patern program for to print triangle star (triangle star pattern)
class patternTriangleStar
{
	public static void main(String[] args) 
	{
	   int num=4;

	   for(int i=1;i<=num;i++)
	     {
	     	for(int j=1;j<=i;j++)

	     	{
	     		System.out.print("* ");
	     	}
	     	System.out.println();
	     }	

	}
}

/*   O/P

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>java patternTriangleStar.java
*
* *
* * *
* * * *

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>
*/
