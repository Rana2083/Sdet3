package Arrays;

public class Frequency {

	public static void main(String[] args) 
	{
		int[] a= {12,13,14,13,16};
		//int[] b=new int[a.length];


		for(int i=0;i<a.length;i++)
		{
			int count=1;
			int found=0;

			for(int j=i+1;j<a.length;i++)
			{
				if(j>=i)
				{
					if((a[i]==a[j]) &&  (i!=j))
					{
						count++;
					}
					else if (a[i]==a[j]) 
					{
						found=1;	
					}
				}
			}
			if(found!=1){
				System.out.println("No of times"+a[i]+" "+count);  
			}


		}


	}
}


