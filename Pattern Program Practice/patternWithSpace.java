/ * Patern program for to print triangle star
    *
   * *
  * * *
 * * * *   

* /
class patternWithSpace
{
	public static void main(String[] args) 
	{
	   int num=4;

	   for(int i=1;i<=num;i++)
	     {
	     	for(int j=1;j<=i;j++)

	     	{
	     		System.out.print("*   ");
	     	}
	     	System.out.println();
	     }	

	}
}