package programs;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int num=153;
		int dup=0;
		int rev=0;
		int rem=num;
		while(num>0)
		{
			dup=num%10;//3,5
			num=num/10;//15,1
			rev=rev+dup*dup*dup;
		}
		if(rev==rem)
		{
			System.out.println("it is Armstrong number");
		}
		else
		{
			System.out.println("it is not Armstrong Number");
		}
		
	}

}
