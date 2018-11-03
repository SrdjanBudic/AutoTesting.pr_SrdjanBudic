package testCases;
import pageObjects.*;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import constants.ExcelUtils;

public class ClientsPageTestCorrect {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,"ClientsPage");
}
	public static String ClientsPage (WebDriver driver) throws InterruptedException {
	    Thread.sleep(2000);
	ClientsPage.setClientsPage(driver);
	return null;
	}
	
	public static String addNewClient (WebDriver driver)  throws Exception{
	    Thread.sleep(2000);
	    ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,"ClientsPage");
	    
	    
	    String clientName = ExcelUtils.getCellData(1, 1);
	    String contactName = ExcelUtils.getCellData(2, 1);
	    String email = ExcelUtils.getCellData(3, 1);
	    int regNumber = ExcelUtils.getNumericalCellData(4, 1 );
	    String registryNumber = Integer.toString(regNumber);
	    String city = ExcelUtils.getCellData(5, 1);
	    String street = ExcelUtils.getCellData(6, 1);
	    String zip = ExcelUtils.getCellData(7, 1);
	    String code = ExcelUtils.getCellData(8, 1);
	    String countries = ExcelUtils.getCellData(9, 1);
	    String status = ExcelUtils.getCellData(10, 1);

	    ClientsPage.clickAddNewClient(driver);
	    ClientsPage.setClientName(driver, clientName);
	    ClientsPage.setContactName(driver, contactName);
	    ClientsPage.setEmail(driver, email);
	    ClientsPage.setRegistryNumber(driver, registryNumber);
	    ClientsPage.setCity(driver, city);
	    ClientsPage.setStreet(driver, street);
	    ClientsPage.setZip(driver, zip);
	    ClientsPage.setCode(driver, code);
	    ClientsPage.setCountriesClient(driver, countries);
	    ClientsPage.setStatus(driver, status);

	    
	    
	    return "Pass";
	}
}
