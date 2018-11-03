package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientsPage {
	private static WebElement element = null;
	
	public static WebElement getClientsPage (WebDriver driver) {
		WebElement getClientsPage = driver.findElement(By.xpath("//i[contains(text(),'account_box')]"));
		return getClientsPage;
	}
	public static void setClientsPage (WebDriver driver) {
		getClientsPage(driver).click();
	}
	
	
	public static WebElement getAddNewClient (WebDriver driver) {
		WebElement getAddNewClient = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return getAddNewClient;
	}
	public static void clickAddNewClient (WebDriver driver) {
		getAddNewClient(driver).click();
	}
	
	
	public static WebElement getBackToClientList (WebDriver driver) {
		WebElement getBackToClientList = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn--active v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return getBackToClientList;
	}
	public static void clickBackToClientList(WebDriver driver) {
		getBackToClientList(driver).click();
	}
	
	
	public static WebElement getClientName (WebDriver driver) {
		WebElement getClientName = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return getClientName;
	}
	public static void setClientName (WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);
	}
	
	
	public static WebElement getContactName (WebDriver driver) {
		WebElement getContactName = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getContactName;
	}
	public static void setContactName (WebDriver driver, String contactName) {
		getContactName(driver).sendKeys(contactName);
	}
	
	
	public static WebElement getEmail (WebDriver driver) {
		WebElement getEmail = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return getEmail;
	}
	public static void setEmail (WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}
	
	
	public static WebElement getRegistryNumber (WebDriver driver) {
		WebElement getRegistryNumber = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getRegistryNumber;
	}
	public static void setRegistryNumber (WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);
	}
	
	
	public static WebElement getCountriesClient (WebDriver driver) {
		WebElement getCountriesClient = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return getCountriesClient;
	}
	public static void setCountriesClient (WebDriver driver, String countries) throws InterruptedException{
		Actions builder = new Actions(driver);
		Actions country = builder
		.moveToElement(getCountriesClient(driver))
		.click()
		.sendKeys(countries);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}
	
	public static WebElement getCity (WebDriver driver) {
		WebElement getCity = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getCity;
	}
	public static void setCity (WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	
	
	public static WebElement getStreet (WebDriver driver) {
		WebElement getStreet = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return getStreet;
	}
	public static void setStreet (WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}
	
	
	public static WebElement getZip (WebDriver driver) {
		WebElement getZip = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return getZip;
	}
	public static void setZip (WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}
	
	
	public static WebElement getCode (WebDriver driver) {
		WebElement getCode = driver.findElement(By.xpath("//div[@class='v-input code-field v-text-field']//input[@type='text']"));
		return getCode;
	}
	public static void setCode (WebDriver driver, String code) {
		getCode(driver).sendKeys(code);
	}
	
	
//	public static WebElement getDateAdded (WebDriver driver) {
//		WebElement getDateAdded = driver.findElement(By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
//		return getDateAdded;
//	}
//	public static void setDateAdded (WebDriver driver) {
//	}
//	
//	
//	public static WebElement getAgreementDate (WebDriver driver) {
//		WebElement getAgreementDate = driver.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
//		return getAgreementDate;
//	}
//	public static void setAgreementDate (WebDriver driver) {
//		
//	}
	
	
	public static WebElement getStatus (WebDriver driver) {
		WebElement getStatus = driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple primary--text']"));
		return getStatus;
	}
	public static void setStatus(WebDriver driver, String status )
	{
		String currentStatus = getStatus(driver).getText();
		String cs = currentStatus.split(":")[1].trim();
		if(!status.equals(cs))
		{
			getStatus(driver).click();
		}
	}
	
	
}