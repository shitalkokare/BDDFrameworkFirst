package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilsLayer.UtilsClass;

public class PIMPage extends Baseclass {

	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimlink;
	
	public PIMPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPIMLink()
	{
		UtilsClass.clickOnElement(pimlink);
	}
	public String capturePIMURL()
	{
		return driver.getCurrentUrl();
	}
	
	@FindBy(xpath="//button[text()=' Add ']")
	private WebElement clickAdd;

	public void clickOnAddbutton()
	{
		UtilsClass.clickOnElement(clickAdd);
	}
	public String captureAddPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	@FindBy(name="firstName")
	private WebElement firstName;

	@FindBy(name="middleName")
	private WebElement middleName;

	@FindBy(name="lastName")
	private WebElement lastName;
	
	public void enteruserdetails(String fname,String mname,String lname)
	{
		UtilsClass.enterData(firstName, fname);
		UtilsClass.enterData(middleName, mname);
		UtilsClass.enterData(lastName, lname);
	}
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empid;
	
	public String captureempid()
	{
		return empid.getAttribute("value");
	}
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement savebutton;
	public void clickOnSaveButton()
	{
		UtilsClass.clickOnElement(savebutton);
	}
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement Emplistclick;
	public void clickOnEmployeeList()
	{
		UtilsClass.clickOnElement(Emplistclick);
	}
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement searchempid;
	public void searchEMPID(String id)
	{
		UtilsClass.enterData(searchempid,id);
	}
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement search;
	
	public void clickOnSearchButton()
	{
		UtilsClass.clickOnElement(search);
	}
	@FindBy(xpath="(//span[contains(@class,'oxd-checkbox-i')])[1]")
	private WebElement clickcheckbox;
	
	public void checkTheCheckBox()
	{
		UtilsClass.clickOnElement(clickcheckbox);
	}
	@FindBy(xpath="//button[text()=' Delete Selected ']")
	private WebElement clickdelete;
	public void clickOnDeletedCheckbox()
	{
		UtilsClass.clickOnElement(clickdelete);
	}
	
	@FindBy(xpath="//div[@class='orangehrm-text-center-align']")
	private WebElement popuptext;
	
	
	public String popUpText()
	{
		return popuptext.getText();
	}
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	private WebElement yesdelete;
	
	public void yesDeleteRecord()
	{
		UtilsClass.clickOnElement(yesdelete);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
