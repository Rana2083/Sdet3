package Arrays;

public class BinarySearch {

	public static void main(String[] args)
	{
		int value=67;
		int[] a= {20,43,54,45,47,67,76};
		int end,start,mid;
		start=0;
		end=a.length-1;
		mid=(start+end/2);
		for(int i=0;i<a.length;i++)
		{
			
			if(a[mid]<value)
			{
				start=mid+1;
			}
			if(a[mid]==value) {
				System.out.println(value +"it is present in the array");
			}
			
		}

	}

}
