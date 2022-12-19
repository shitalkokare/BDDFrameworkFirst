package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;

public class HomePage extends Baseclass{

	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean validateLogo()
	{
		return logo.isDisplayed();
	}
	public String captureTitle()
	{
		return driver.getTitle();
	}
	public String captureURL()
	{
		return driver.getCurrentUrl();
	}
}
