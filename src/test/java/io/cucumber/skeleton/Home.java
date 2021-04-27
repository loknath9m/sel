package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Home extends BaseClass{
	

	
	
	
	public WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));

	
	
	public  WebElement headerText=driver.findElement(By.className("header-lined"));
	
	public WebElement homeMenu=driver.findElement(By.xpath("//li[@menuitemname='Home']"));
	
	public void navigateToRegisterPage() {
		//click(homeMenu);
		click(register);
	}
	
	public String headerText() {
		return captureText(headerText);
	}
	

}
