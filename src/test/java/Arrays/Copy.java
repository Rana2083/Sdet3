package Arrays;

public class Copy {

	public static void main(String[] args) 
	{

		int a[]= {0,1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.print(b[i]);
		}
		
	}

}
