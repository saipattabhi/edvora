package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class register extends base {

	WebDriver driver;

	public void register() throws IOException {

		driver = intializedriver();

		driver.get(prop.getProperty("url"));

		loginpage login = new loginpage(driver);

		login.username.sendKeys("username");

		login.password.sendKeys("password");

		login.createaccount.click();

		driver.switchTo().alert().accept();

	}

}
