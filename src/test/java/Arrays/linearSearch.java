package Arrays;

public class linearSearch {

	public static void main(String[] args) 
	{
		int value=20;
		int[] a= {10,40,30,60,50,20};
		for(int i=0;i<a.length;i++)
		{
			if(value==a[i])
			{
				System.out.println(value+" it is present inside the array and position in the array is "+i);
			}
		}

	}

}
