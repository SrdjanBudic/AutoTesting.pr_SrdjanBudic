package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Constants;
import constants.ExcelUtils;

public class LogInPage {
	private static WebElement webElement = null;
	
	
	public static WebElement getUserName(WebDriver driver){
		webElement = driver.findElement(By.xpath("//input[@id='login-form-email']"));
		return webElement;
		}
	public static void setUserName (WebDriver driver, String userName) {
		getUserName(driver).sendKeys(userName);
	}

	
	public static WebElement getPassword(WebDriver driver){
		webElement = driver.findElement(By.xpath("//input[@id='login-pass']"));
		return webElement;
	}
	public static void setPaswword (WebDriver driver, String password) {
		getPassword(driver).sendKeys(password);
	}
	

	public static WebElement getLogIn(WebDriver driver){
		webElement = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return webElement;
		}
	public static void clickLogIn (WebDriver driver) {
		getLogIn(driver).click();
	}
}
