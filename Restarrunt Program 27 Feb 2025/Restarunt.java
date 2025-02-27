// Restarunt program with the menu card and other options (27 Feb 2025)
import java.util.Scanner;
class Restaurant
{
        static String name; //null
		static long contact; // 0
		static String address; // null

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in)
        for(; ; )
        	 {
        	 	System.out.println()
        	 	System.out.println("      JAVA Ka DHABa");
        	 	System.out.println();
        	 	System.out.println(" 1.    CREATE Account");
        	 	System.out.println(" 2.    Existing User");
        	 	System.out.println();
        	    System.out.println("  Enter an option :");
        	    int opt = sc.nextInt();
        	    System.out.println();
        	    switch(opt)

        	    {
        	    	CASE 1 : CreateAccount(sc);  break;
        	    	CASE 2 : Login(sc); break;
        	    	deault : System.out.println(" INVALID INPUT"); break;

        	    }

        	 }
	}
	public static void CreateAccount(Scanner sc)
	{
		System.out.println("         REGISTRATION  ");
		System.out.println();
		System.out.println(" NAME :");
		name = sc.next();
		System.out.println(" PHONE : ");
		contact = sc.nextlong();
		System.out.println(" ADDRESS ");
		sc.nextline();
		address = sc.nextline();
		System.out.println();
		System.out.println(" ACCOUNT CREATED SUCCESSFULLY ");
	}

	public static void login(Scanner sc)
	   {

	   	if(name == null)
	   		
	   }
	
}