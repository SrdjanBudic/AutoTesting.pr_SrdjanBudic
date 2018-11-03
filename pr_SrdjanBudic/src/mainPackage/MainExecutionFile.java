package mainPackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;

import pageObjects.*;
import testCases.BusinessPageTest;
import testCases.ClientsPageTestCorrect;
import testCases.InvoicesPageTest;
import constants.Constants;

import constants.ExcelUtils;

import appExecution.SignInExecution;

public class MainExecutionFile {
	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {


    driver = new ChromeDriver();
    Thread.sleep(2000);

    driver.get(Constants.URL);
    SignInExecution.SignIn(driver);
    
    
    
    InvoicesPageTest.InvoicesPage(driver);
    InvoicesPageTest.invoicesList(driver);
    
    
//    Client Page Tests: Correct
//    ClientsPageTestCorrect.ClientsPage(driver);
//    ClientsPageTestCorrect.addNewClient(driver);
    
    
//    Business Page Test: Correct
    
//    BusinessPageTest.BusinessPage(driver); 
//    BusinessPageTest.AddNewBusiness(driver);
//    BusinessPageTest.addBankAccount(driver);
    
    



    ExcelUtils.setCellData("Pass", 1, 3);

	}

}

