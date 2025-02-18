// ISBN Number

class ISBNNumber
{

	public static void main(String[] args) 
	{

	Long num = 1259060977L;
    int sum = 0;
    for(Long i= num,j=1;i>0;i/=10,j++)
    {
    	Long rem = i%10;
    	sum+=(rem*j);
    }
    if(sum%11==0)
    {
    	System.out.println(num+" is valid ISBN Number");
    }
    else 
    {
    	System.out.println(num+" is not valid ISBN number");
    }
	}
}