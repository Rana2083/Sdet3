package programs;

public class HappyNumber 
{
	public static void main(String[] args)
	{
		int num=25;
		int backup=num;
		int rem,sum,hap ,rev,gep,rum=0;
		/**
		 * num=129
		 * rem=num%10=9
		 * rum=num/10=12
		 * rev=rum%10==2
		 * gep=rum/10==1
		 * hap=rem*rem+rev*rev+gep*gep;
		 */
		       
				  
	
		while(num>0)
		{
			   rem=num%10;
				  rum=num/10;
				  rev=rum%10;
				  gep=rum/10;
				  hap=rem*rem+rev*rev+gep*gep;
			      num=hap;	
//			if(num>=100)
//			{
//				rem=num%10;//0
//				sum=num/10;//
//				rev=sum%10;
//				gep=sum/10;
//				hap=(rem*rem)+(rev*rev)+(gep*gep);
//				num=hap;
//			}
	
		if(num==1)
		{
			System.out.println(backup+" it is a happy number");
		    break;
		}
	
	
	}
}
}
