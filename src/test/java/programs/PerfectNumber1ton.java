package programs;

public class PerfectNumber1ton {

	public static void main(String[] args)
	{
		for(int i=1;i<100;i++)
		{
			int num=i;
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(num%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==num)
			{
				System.out.println(num+ " it is perfect Number");
			}
			else
			{
				System.out.println(num+"it is not perfect number  ");
			}
		}

	}

}
