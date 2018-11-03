package testCases;

import org.openqa.selenium.WebDriver;
import pageObjects.*;
import constants.Constants;
import constants.ExcelUtils;

public class InvoicesPageTest {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,"InvoicesPage");
}
	public static String InvoicesPage(WebDriver driver) throws Exception {
	    Thread.sleep(2000);
	    InvoicesPage.setClientsPage(driver);
		return null;
}
	public static String invoicesList (WebDriver driver) throws Exception{
		Thread.sleep(2000);
		InvoicesPage.setSelectClient(driver);
		return "Pass";
		
	}
}
