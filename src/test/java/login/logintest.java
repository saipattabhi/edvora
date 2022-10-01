package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class logintest extends base {
	
	WebDriver driver;
	
	
	public void logintest() throws IOException
	{
		
		driver=intializedriver();
		

		driver = intializedriver();

		driver.get(prop.getProperty("url"));

		loginpage login = new loginpage(driver);

		login.username.sendKeys("username");

		login.password.sendKeys("password");

		login.createaccount.click();
		
		
	}
	
	

}
