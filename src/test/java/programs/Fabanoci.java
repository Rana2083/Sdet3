package programs;

public class Fabanoci {

	public static void main(String[] args)
	{
		int num=0;
		int bum=1;
		int temp=0;
		System.out.println(num);
		System.out.println(bum);
		for(int i=1;i<50;i++)
		{
			temp=num+bum;//0+1=1
			System.out.println(temp);
			num=bum;
			bum=temp;
			
			
		}

	}

}
