// WAP with methods for all start square pattern
class PatternWithMethods1


    {

    	public static void main(String[] args) 
          {

           SquarePattern(); 
           TrianglePattern();

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