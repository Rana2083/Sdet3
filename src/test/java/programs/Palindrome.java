package programs;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=124521;
		int dup=0;
		int rev=0;
		int rem=num;
		while(num>0)
		{
			dup=num%10;//1
			num=num/10;
			rev=rev*10+dup;
			/**
			 * 10
			 * 10+20
			 * 
			 * 
			 */
		}
		if(rem==rev)
		{
			System.out.println("it is palindrome number");
		}
		else
		{
			System.out.println("it is not ");
		}
		
	}

}
