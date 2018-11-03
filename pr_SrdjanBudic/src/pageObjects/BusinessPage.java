package pageObjects;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {
	private static WebElement element = null;
	public static WebElement getBusinessPage (WebDriver driver) {
		WebElement getBusinessPage = driver.findElement(By.xpath("//i[contains(text(),'business')]"));
				return getBusinessPage;
	}
	public static void setBusinessPage (WebDriver driver) {
		getBusinessPage(driver).click();
	}
	
	public static WebElement getAddNewBusiness (WebDriver driver) {
		WebElement getAddNewBusiness = driver.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));
		return getAddNewBusiness;
	}
	public static void  setNewBusiness (WebDriver driver) {
		getAddNewBusiness(driver).click();
	}
	
	
	public static WebElement getBackToBusiness (WebDriver driver){
		WebElement getBackToBusiness = driver.findElement(By.xpath("//i[contains(text(),'arrow_back')]"));
		return getBackToBusiness;
	}
	public static void clickBackToBusiness (WebDriver driver) {
		getBackToBusiness(driver).click();
	}
	
	
	public static  WebElement getBusinessName (WebDriver driver){
		WebElement getBusinessName = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return getBusinessName;
	}
	public static void setBusinessName (WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}
	
	
	public static  WebElement getCountries (WebDriver driver){
		WebElement getCountries = driver.findElement(By.xpath("//input[@id='business-form-country']"));
		return getCountries;
	}
	public static void SetCountry(WebDriver driver, String countryName) throws InterruptedException {  
	Actions builder = new Actions(driver);
	Actions country = builder
	.moveToElement(getCountries(driver))
	.click()
	.sendKeys(countryName);
	country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	country.perform();
	}
	
	
	public static  WebElement getCity (WebDriver driver){
		 WebElement getCity = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return getCity;
	}
	public static void setCity (WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	
	
	public static  WebElement getStreet (WebDriver driver){
		WebElement getStreet = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return getStreet;
	}
	public static void setStreet (WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}
	
	
	public static  WebElement getZip (WebDriver driver){
		WebElement getZip = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return getZip;
	}
	public static void setZip (WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}
	
	
	public static  WebElement getRegistryNumber (WebDriver driver){
		 WebElement getRegistryNumber = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return getRegistryNumber;
	}
	public static void setRegistryNumber (WebDriver driver, String registryNumber) {
		getRegistryNumber(driver).sendKeys(registryNumber);
	}
	
	
	public static WebElement getButtonSave (WebDriver driver) {
		WebElement getButtonSave = driver.findElement(By.id("business-form-save-btn"));
		return getButtonSave;
	}
	public static void clickButtonSave (WebDriver driver) {
		getButtonSave(driver).click();
	}
	
	
	public static WebElement getAddBankButtonNew (WebDriver driver) {
		WebElement getAddBankButtonNew = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		return getAddBankButtonNew;
	}
	public static void clickAddBankButtonNew (WebDriver driver) {
		getAddBankButtonNew(driver).click();
	}
	
	
	public static  WebElement getBankName (WebDriver driver){
		WebElement getBankName = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return getBankName;
	}
	public static void setBankName (WebDriver driver, String bankName) {
		getBankName(driver).sendKeys(bankName);
	}
	
	
	public static  WebElement getAccountNumber (WebDriver driver){
		WebElement getAccountNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return getAccountNumber;
	}
	public static void setAccountNumber (WebDriver driver, String accountNumber) {
		getAccountNumber(driver).sendKeys(accountNumber);
	}
	
	
	public static  WebElement getSwiftNumber (WebDriver driver){
		WebElement getSwiftNumber = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return getSwiftNumber;
	}
	public static void setSwiftNumber (WebDriver driver, String swiftNumber) {
		getSwiftNumber(driver).sendKeys(swiftNumber);
	}
	
	
	public static  WebElement getPaymentInstructions (WebDriver driver){
		WebElement getPaymentInstructions = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return getPaymentInstructions;
	}
	public static void setPaymentInsturctions (WebDriver driver, String paymentInstructions) {
		getPaymentInstructions(driver).sendKeys(paymentInstructions);
	}
	
	
	public static WebElement getCurrency(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
        return element;
    }

    public static List<WebElement> getCurrencyLabel(WebDriver driver) {
        List<WebElement> currencyList = new ArrayList<WebElement>();
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
        return currencyList;
    }

    public static void setCurrency(WebDriver driver, String currencyName) {
        Actions builder = new Actions(driver);
        WebElement currencyList = getCurrency(driver);
        Actions currency = builder.moveToElement(currencyList).click();
        currency.perform();
        List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
        for (WebElement e : CurrencyLabel) {
            if (e.getText().equals(currencyName)) {
                e.click();
            }
        }
    }
	
	public static  WebElement getAddBankAccountSave (WebDriver driver){
		WebElement getAddBankAccountSave = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return getAddBankAccountSave;
	}
	public static void clickAddBankAccountSave (WebDriver driver) {
		getAddBankAccountSave(driver).click();
	}
	
	
	public static  WebElement getCancel (WebDriver driver){
		WebElement getCancel =driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		return getCancel;
	}
	public static void clickCancel(WebDriver driver) {
		getCancel(driver).click();
	}

}
