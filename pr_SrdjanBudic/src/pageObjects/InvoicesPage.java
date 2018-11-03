package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InvoicesPage {

	public static WebElement getClientsPage (WebDriver driver) {
		WebElement getClientsPage = driver.findElement(By.xpath("//i[contains(text(),'library_books')]"));
		return getClientsPage;
	}
	public static void setClientsPage (WebDriver driver) {
		getClientsPage(driver).click();
	}
	public static WebElement getSelectClient (WebDriver driver) {
		WebElement getSelectClient = driver.findElement(By.xpath("//div[@class='v-input client-name-select v-text-field v-select']//div[@class='v-select__selections']"));
		return getSelectClient;
	}
	public static WebElement getAllClients (WebDriver driver) {
		WebElement getAllClients = driver.findElement(By.xpath("//div[contains(text(),'All clients')]"));
		return getAllClients;
	}
	public static void setSelectClient (WebDriver driver) {
		Actions builder = new Actions(driver);
		builder
		.moveToElement(getSelectClient(driver))
		.click()
		.moveToElement(getAllClients(driver))
		.click();
	}

}
