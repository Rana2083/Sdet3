import org.testng.annotations.Test;

public class TestNG
{
	@Test(priority = -1)
	public void Aetup()
	{
		System.out.println("email");
	}
	@Test(priority = 0)
	public void A()
	{
		System.out.println("twitter");
	}

}
