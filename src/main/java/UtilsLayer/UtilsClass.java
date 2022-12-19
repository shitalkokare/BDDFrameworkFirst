package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.Baseclass;

public class UtilsClass extends Baseclass{

	
	public static void enterData(WebElement wb,String value)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickOnElement(WebElement wb)
	{
		if((wb.isDisplayed())&&(wb.isEnabled()))
		{
			wb.click();
		}
	}
}
