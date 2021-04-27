package io.cucumber.skeleton;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
public static WebDriver driver;
String path="E:\\cucumber-java-skeleton-main\\TestData\\phptravels.properties";

	
	
	public void openBrowser(String browser){
		switch(browser.toLowerCase()) {
		case"chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MyPC\\Desktop\\SAMPLE\\chromedriver.exe");
			driver=new ChromeDriver();
			break;		
			
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void launchApplication(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	public String getPropValue(String key) throws IOException {
		FileReader file=new FileReader(path);
		Properties prop=new Properties();
		prop.load(file);
		System.out.println(prop.getProperty(key));
		return prop.getProperty(key);
	}
	
	public void click(By by) {		
			
		driver.findElement(by).click();
	}
	
	public void click(WebElement ele) {	
		
		ele.click();
	}
	
	public void sendKeys(By by,String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public String captureText(By by) {
		return driver.findElement(by).getText();
	}
	
	public String captureText(WebElement ele) {
		return ele.getText();
	}
	
	public void waitUntilElementClikable(By by) {
		WebDriverWait wait=new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void waitUntilTextContains(String text,By by) {
		WebDriverWait wait=new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
		
	}
	
	public void TillPageLoad() {
		new WebDriverWait(driver, 120).until(
			      webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
	}
	public void quitDriver() {
		driver.quit();
	}
	
	public Home getHomePageObject() {
		return new Home();
	}
	
}
