package StepDefination;

import BaseLayer.Baseclass;
import PageLayer.PIMPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PTest extends Baseclass{
	static PIMPage pimpage;
 private static String employeeid;
	@When("user is on pim page")
	public void user_is_on_pim_page() {
		 pimpage=new PIMPage();
		 pimpage.clickOnPIMLink();
	}
	@Then("validate user in PIM page using url")
	public void validate_user_in_pim_page_using_url() {
	    Assert.assertEquals(true, pimpage.capturePIMURL().contains("pim"));
	}
	@When("user click on Add button")
	public void user_click_on_add_button() throws InterruptedException {
		Thread.sleep(3000);
	    pimpage.clickOnAddbutton();
	}
	@Then("user is on Add Employee page")
	public void user_is_on_add_employee_page() {
	    Assert.assertEquals(true, pimpage.captureAddPageURL().contains("addEmployee"));
	}
	@Then("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
		pimpage.enteruserdetails("shital", "mohan", "kokare");
	}
	@Then("user can capture employee id")
	public void user_can_capture_employee_id() {
		employeeid=pimpage.captureempid();
		
	}
	@Then("user click on save button")
	public void user_click_on_save_button() throws InterruptedException {
		Thread.sleep(3000);
	 pimpage.clickOnSaveButton();
	}
	@When("user click on employee list")
	public void user_click_on_employee_list() {
	    pimpage.clickOnEmployeeList();
	}

	@When("user enter employee id number")
	public void user_enter_employee_id_number() throws InterruptedException {
		Thread.sleep(3000);
	    pimpage.searchEMPID(employeeid);
	}

	@Then("user click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		Thread.sleep(3000);
		pimpage.clickOnSearchButton();
	}

	@Then("user click on checkbox")
	public void user_click_on_checkbox() throws InterruptedException {
		Thread.sleep(3000);
		pimpage.checkTheCheckBox();
	}

	@Then("click on delete selected")
	public void click_on_delete_selected() throws InterruptedException {
		Thread.sleep(3000);
		pimpage.clickOnDeletedCheckbox();
	}

	@Then("capture pop text")
	public void capture_pop_text() {
		String a=pimpage.popUpText();
		System.out.println(a);
	}

	@Then("click on yes delete button")
	public void click_on_yes_delete_button() throws InterruptedException {
		Thread.sleep(3000);
		pimpage.yesDeleteRecord();  
	}

}
