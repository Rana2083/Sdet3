package programs;

public class PatternProgram {

	public static void main(String[] args) 
	{
		int star=5,space=1;

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");

			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
            if(i<=2) {
            	star=star-2;//5-2=3
    			space=space+1;//1
    			
            }
            else
            {
            	star=star+2;
            	space=space-1;
            	
            }
            System.out.println(" ");
			
		}
	}

}
