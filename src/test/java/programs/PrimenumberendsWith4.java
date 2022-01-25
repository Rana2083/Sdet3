package programs;

public class PrimenumberendsWith4 
{
	public static void main(String[] args)
	{
		int count=0;
		int num=0;
		for(int i=1;i<=50;i++)
		{ 

			for(int j=1;j<i;j++)
			{
				if((i%j==0))
				{
					if(i%10==4)
					{
						num=i;
						count++;
					}
				}
			}
		
		}
		if(count==2)
		{
			System.out.println(num+" it is prime number");
		}
		else
		{
			System.out.println(num+" it is not a prime number");
		}

	}

}