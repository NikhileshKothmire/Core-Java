// 18 Feb 2025 ( Tuesday - WAP for Automorphic Number  )
import java.util.Scanner;
class AutomorphicNumber
{

	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.print(" Enter the number ");	
	    int num= sc.nextInt();
	    int len=0;
	    int div = 1;
	    for( int i=num;i>0;i/=10)
	    	len++;

	    for(int i=1;i<=len;i++)
	    	div*= 10;

	    if(num== (num*num)%div)
	    {
	    	System.out.println(num+" is Automorphic Number");
	    }

	    else 
	    {
	    	System.out.println(num+"  is not Automorphic Number");
	    }
	 }
}

/*             O/P

C:\Users\Admin\Documents\GitHub\Core-Java\AutomorphicNumber>java AutomorphicNumber
 Enter the number 7
7  is not Automorphic Number

C:\Users\Admin\Documents\GitHub\Core-Java\AutomorphicNumber>
C:\Users\Admin\Documents\GitHub\Core-Java\AutomorphicNumber>java AutomorphicNumber
 Enter the number 327
327  is not Automorphic Number

C:\Users\Admin\Documents\GitHub\Core-Java\AutomorphicNumber>java AutomorphicNumber
 Enter the number 76
76 is Automorphic Number

C:\Users\Admin\Documents\GitHub\Core-Java\AutomorphicNumber>

*/