// WAP with methods for all start square pattern
class PatternWithMethods3


    {

    	public static void main(String[] args) 
          {

           // SquarePattern();
           // System.out.println(); 
           //TrianglePattern();
           // System.out.println();
            ReversePattern();
           // System.out.println();
          }
    		
    	
    

	public static void SquarePattern() 
	{
	   int num=4;

	   for(int i=1;i<=num;i++)
	     {
	     	for(int j=1;j<=num;j++)

	     	{
	     		System.out.print("* ");
	     	}
	     	System.out.println();
	     }	

	}



/*      O/P

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>javac PatternWithMethods.java

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>java PatternWithMethods
* * * *
* * * *
* * * *
* * * *

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>

*/



public static void TrianglePattern() 
	{
	   int num=4,odd=7,even=-2,a=1;

	   for(int i=1;i<=num;i++)
	     {
	     	for(int j=1;j<=i;j++)

	     	{
	     		// if(j%2==0)
	     		// {

	     		// }
	     		System.out.print(a++ +" ");
	     	}
	     	System.out.println();
	     }	

/*   O/P  

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>javac PatternWithMethods1.java

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>java PatternWithMethods1
* * * *
* * * *
* * * *
* * * *
*
* *
* * *
* * * *

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>

*/
}
// public static void ReversePattern() 
// 	{
// 	   int num=4;

// 	   for(int i=num;i>=1;i--)
// 	     {
// 	     	for(int j=1;j<=i;j++)

// 	     	{
// 	     		System.out.print("* ");
// 	     	}
// 	     	System.out.println();
// 	     }	

/*                      O/P

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>javac PatternWithMethods2.java

C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>java PatternWithMethods2
* * * *
* * * *
* * * *
* * * *

*
* *
* * *
* * * *

* * * *
* * *
* *
*

}
C:\Users\Admin\Documents\GitHub\Core-Java\Pattern Program Practice>
               */

}



public static void ReversePattern() 
	{
	   int num=4;

	   for(int i=num;i>=1;i--)
	     {
	     	for(int j=1;j<=i;j++)

	     	{
	     		System.out.print("* ");
	     	}
	     	System.out.println();
	     }	


}

}