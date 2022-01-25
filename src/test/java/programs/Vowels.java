package programs;

public class Vowels {

	public static void main(String[] args) {
		
				String s="This is a really simple sentence";
				String str=s.toLowerCase();
				int count=0;
				int count2=0;
				
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||s.charAt(i)=='a'||s.charAt(i)=='a')
					{
						count++;
					}
					else if(str.charAt(i)!=' ')
					{
						count2++;
					}
				}
				System.out.println("vovels in the given String is:"+count);
				System.out.println("consonants in the given String is:"+count2);

			}

		}

	


