package listnerpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class lo {

	
	@Test
	void loginByEmail()
	{
		System.out.println("Login by Email");
		Assert.assertEquals("tushar", "tushar");
	}
     @Test
	void loginByFacebook()
	{
		System.out.println("Login by Facebook");
		Assert.assertEquals("tushar", "tushar");
	}
}
