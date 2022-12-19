package StepDefination;

import BaseLayer.Baseclass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;
import junit.framework.Assert;


public class HTest extends Baseclass{
	private HomePage homepage;
	
	@Then("user varify home page title")
	public void user_varify_home_page_title() {
		 homepage=new HomePage();
		//Assert.assertEquals(true, homepage.captureTitle().contains("HRM"));
			
	}
	@Then("user varify home page logo")
	public void user_varify_home_page_logo() {
		Assert.assertEquals(true, homepage.validateLogo());
	}
	@Then("user varify home page url")
	public void user_varify_home_page_url() {
	    Assert.assertEquals(true, homepage.captureURL().contains("hrm"));
	}

}
