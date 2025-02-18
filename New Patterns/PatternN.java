class PatternN
{
	public static void main(String[] args) 
	{
	for(int i=1;i<=5;i++)
	  {
	  	for(int j=1; j<=(5-i);j++)
	  	{
           System.out.print("  ");
           }

           for(int j=1;j<=i;j++)
           {
           	if(j==1 ||i==5 || j==i)
           		System.out.print("* ");

           	else 
           		System.out.print("  ");
           
	  	    }
	  	    System.out.println();
	  }	
	  
	}
}

/*

C:\Users\Admin\Documents\GitHub\Core-Java\New Patterns>javac PatternN.java

C:\Users\Admin\Documents\GitHub\Core-Java\New Patterns>java PatternN
        *
      * *
    *   *
  *     *
* * * * *

C:\Users\Admin\Documents\GitHub\Core-Java\New Patterns>

*/