package programs;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		/**
		 * 6/1===0
		 * 6/2==0
		 * 6/3==0
		 * 6/4!=0
		 * 
		 */
       int num=9;
       int sum=0;
       
       for(int i=1;i<num;i++)
       {
    	   if(num%i==0)
    	   {
    		   sum=sum+i;
    	   }
       }
       if(num==sum)
       {
    	   System.out.println("it is perfect Number");
       }
       else
       {
    	   System.out.println("it is not a perfect number");
       }
	}
}
