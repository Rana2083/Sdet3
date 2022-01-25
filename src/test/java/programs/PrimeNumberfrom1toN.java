package programs;

public class PrimeNumberfrom1toN {

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=500;i++)
		{
			int count=0;
			int num=i;
		   for(int j=1;j<=i;j++)
			{
				
				if(num%j==0)
				{
					count++;
				}
		
			}
		
		if(count==2)
		{
		System.out.println(num+"it is prime number");
		}
		else
		{
			System.out.println(num +"it is not a prime number");
		}
	}

}
}