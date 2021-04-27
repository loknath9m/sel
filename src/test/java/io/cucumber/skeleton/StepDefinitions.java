package io.cucumber.skeleton;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinitions extends BaseClass{
	
	@Given("I open browser")
	public void i_open_browser() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		openBrowser(getPropValue("browser"));
	}

	@Given("I logged in to application")
	public void i_logged_in_to_application() throws Exception, IOException {
	    // Write code here that turns the phrase above into concrete actions
		launchApplication(getPropValue("url"));
	}

	@When("I click on register link")
	public void i_click_on_register_link() {
	    // Write code here that turns the phrase above into concrete actions
		getHomePageObject().navigateToRegisterPage();
	}

	@Then("I should see register page")
	public void i_should_see_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertTrue(getHomePageObject().headerText().contains("ccount with us"));
	}
	
	@Before
	public void abc() {
		System.out.println("Before hooks");
	}
	
	@After
	public void close() {
		System.out.println("after hooks");
		quitDriver();
	}
	
	@BeforeStep
	public void sdf() {
		System.out.println("before each step");
	}
	
	@AfterStep
	public void fgh() {
		System.out.println("after each step");
	}
}
