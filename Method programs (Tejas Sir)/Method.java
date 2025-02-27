class Method
{
     public static void main(String[] args) 
     {
     

     CallMethod();	
     }







public static void CallMethod() 

	{

		int num = 327;
		String str = num+"" +(num*2)+(num*3);
		boolean flag = true;
		// loop which starts from the 1 to 9 characters
		for(char i='1'; i<='9';i++)
		{
			int cnt = 0; // iit char count is equavals to zero for the every new characte
			//fetch char from sting one by one from 0 index
			for(int j=0;j<str.length();j++)
			{
				char ch= str.charAt(j); // char fetched is stored in var ch
				if(ch==i) // if i char mat hes wich ch char if executes
					cnt++; // increment the count if cnt satisfy
			}
			if(cnt!=1) // if cnt of char is not equavalas to 1 then if executes
			{ 
				flag = false; // re init the flag is cnt is not equvals to 1
                break ; // terminating the loop
			}	

			
			}
			if(flag)
			{
				System.out.println(num+" num is Facinating Number");
			}

			else 
			{
				System.out.println(num+" num is not Facinating Number");
			}
		}
		
}


/*              O/P 



C:\Users\Admin\Documents\GitHub\Core-Java\Facinating Number>javac Method.java

C:\Users\Admin\Documents\GitHub\Core-Java\Facinating Number>java Method
327 num is Facinating Number

C:\Users\Admin\Documents\GitHub\Core-Java\Facinating Number>
*/