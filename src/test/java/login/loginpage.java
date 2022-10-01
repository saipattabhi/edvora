package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	WebDriver driver;

	public loginpage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@autocomplete=\"username\"]")

	public WebElement username;

	public WebElement username() {

		return username;
	}

	@FindBy(xpath = "//*[@autocomplete=\"current-password\"]")

	public WebElement password;

	public WebElement password() {

		return password;
	}

	@FindBy(xpath="//*[text()='Create Account']")
	
	public WebElement createaccount;
	
	public WebElement createaccount()
	{
		
		return createaccount;
	}
	
}
