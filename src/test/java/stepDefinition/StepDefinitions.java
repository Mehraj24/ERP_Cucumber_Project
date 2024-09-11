package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinitions  extends  FunctionLibrary {
	@Given("Launch Browser")
	public void launch_Browser() throws Throwable{
	    driver = FunctionLibrary.startBrowser();
	}

	@When("Launch Url")
	public void launch_Url() {
	    FunctionLibrary.openUrl();
	}

	@When("Wait for Username with {string} and {string}")
	public void wait_for_Username_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData) {
	   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) {
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("Click login button with {string} and {string}")
	public void click_login_button_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("wait for logout link with {string} and {string}")
	public void wait_for_logout_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Wait for Supplier link with {string} and {string}")
	public void wait_for_Supplier_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click Supplier link with {string} and {string}")
	public void click_Supplier_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for Add icon with {string} and {string}")
	public void wait_for_Add_icon_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click Add icon button with {string} and {string}")
	public void click_Add_icon_button_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for Supplier Number with {string} and {string}")
	public void wait_for_Supplier_Number_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Capture Supplier Number with {string} and {string}")
	public void capture_Supplier_Number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	   FunctionLibrary.captureSupNum(LocatorType, LocatorValue);
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue) {
	   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("click add button with {string} and {string}")
	public void click_add_button_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for Confirm ok button with {string} and {string}")
	public void wait_for_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click confirm ok button with {string} and {string}")
	public void click_confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for alert ok button with {string} and {string}")
	public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click Alert ok button with {string} and {string}")
	public void click_Alert_ok_button_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Verify Supplier Number")
	public void verify_Supplier_Number() throws Throwable {
	    FunctionLibrary.supplierTable();
	}

	@When("click logout with {string} and {string}")
	public void click_logout_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Close Browser")
	public void close_Browser() {
	   FunctionLibrary.closeBrowser();
	}

	@When("Wait for Customer link with {string} and {string}")
	public void wait_for_Customer_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click customer link with {string} and {string}")
	public void click_customer_link_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for customer Number with {string} and {string}")
	public void wait_for_customer_Number_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Capture Customer Number with {string} and {string}")
	public void capture_Customer_Number_with_and(String LocatorType, String LocatorValue) throws Throwable {
	   FunctionLibrary.captureCustNum(LocatorType, LocatorValue);
	}

	@When("Verify Customer Number")
	public void verify_Customer_Number() throws Throwable {
	   FunctionLibrary.customerTable();
	}
}

