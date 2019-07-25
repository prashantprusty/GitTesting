package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	

	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	
	// validate pageTitle
	
	public String validateLoginPageTitle(){
		
		return driver.getTitle();
	}
	
	
public HomePage login(String uname, String pwd){
	
	userName.sendKeys(uname);
	password.sendKeys(pwd);
	loginBtn.click();
	return new HomePage();
}
	
	

}
