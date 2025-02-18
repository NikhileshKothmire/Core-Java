// 18 Feb 2025 ( Tuesday - WAP for Neon Number  )
import java.util.Scanner;
class NeonNumber
{

	public static void main(String[] args) 
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.print(" Enter the number ");	
	    int num= sc.nextInt();
	    int temp=num;
	    int len=0;
	    int sqr = num*num;
	    int sum=0;
	    for( int i=sqr;i>0;i/=10)
	    	{

	    		sum+= (i%10);
	    	}

	    if(sum==temp)
	    {
	    	System.out.println(num+" is Neon Number");
	    }

	    else 
	    {
	    	System.out.println(num+"  is not Neon Number");
	    }
	 }
}

/*             O/P


*/