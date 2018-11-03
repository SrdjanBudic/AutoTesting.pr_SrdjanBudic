package testCases;
import javax.xml.bind.ParseConversionEvent;

import org.openqa.selenium.WebDriver;

import pageObjects.BusinessPage;
import pageObjects.LogInPage;
import constants.Constants;
import constants.ExcelUtils;
public class BusinessPageTest {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,"BusinessPage");
}
	
	public static String BusinessPage(WebDriver driver) throws Exception
	{
		  Thread.sleep(2000);
		BusinessPage.setBusinessPage(driver);
		return null;
	}
	
	public static String AddNewBusiness(WebDriver driver) throws Exception {
	    Thread.sleep(2000);
			ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,Constants.BusinessPage);
			BusinessPage.setNewBusiness(driver);
			
			String businessName = ExcelUtils.getCellData(1, 1);
			System.out.println(businessName);
			String countryName = ExcelUtils.getCellData(2, 1);
			System.out.println(countryName);
			String city = ExcelUtils.getCellData(3, 1);
			System.out.println(city);
			String street = ExcelUtils.getCellData(4, 1);
			System.out.println(street);
			String zip = ExcelUtils.getCellData(5, 1);
			System.out.println(zip);
			int rNumber = ExcelUtils.getNumericalCellData(6, 1);
			String registryNumber =  Integer.toString(rNumber);
			System.out.println(registryNumber);
			
			BusinessPage.setBusinessName(driver, businessName);
			BusinessPage.SetCountry(driver, countryName);
			BusinessPage.setCity(driver, city);
			BusinessPage.setStreet(driver, street);
			BusinessPage.setZip(driver, zip);
			BusinessPage.setRegistryNumber(driver, registryNumber);
			
			
			return "Pass";
	  }	
	  
	public static String addBankAccount (WebDriver driver) throws Exception{
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,Constants.BusinessPage);
		 Thread.sleep(2000);
			String bankName = ExcelUtils.getCellData(9, 1);
			System.out.println(bankName);
			int accNumber = ExcelUtils.getNumericalCellData(11, 1);
			String accountNumber = Integer.toString(accNumber);
			System.out.println(accountNumber);
			int swiNumber = ExcelUtils.getNumericalCellData(11, 1);
			String swiftNumber = Integer.toString(swiNumber);
			System.out.println(swiftNumber);
			String paymentInstructions = ExcelUtils.getCellData(12, 1);
			System.out.println(paymentInstructions);
			String currencyName = ExcelUtils.getCellData(13, 1);
			
			BusinessPage.clickAddBankButtonNew(driver);
			BusinessPage.setBankName(driver, bankName);
			BusinessPage.setAccountNumber(driver, accountNumber);
			BusinessPage.setSwiftNumber(driver, swiftNumber);
			BusinessPage.setPaymentInsturctions(driver, paymentInstructions);
			BusinessPage.setCurrency(driver, currencyName);
			BusinessPage.clickAddBankAccountSave(driver);
			BusinessPage.clickButtonSave(driver);
			
			return "Pass";
	}
}