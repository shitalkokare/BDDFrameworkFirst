package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.UtilsClass;

public class LoginPage extends Baseclass{

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public void typeUsernameAndPassword(String uname,String pass)
	{
		UtilsClass.enterData(username, uname);
		UtilsClass.enterData(password, pass);
		
	}
	public void clickonloginbutton()
	{
		UtilsClass.clickOnElement(login);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
