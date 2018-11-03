package appExecution;

import org.openqa.selenium.WebDriver;

import pageObjects.LogInPage;
import constants.Constants;
import constants.ExcelUtils;

public class SignInExecution {
	
	public static void SetUpExcel() throws Exception {
	    ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,Constants.LogInSheet);
		}
	
	public static void SignIn (WebDriver driver) throws Exception{
		  ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData,Constants.LogInSheet);
		String userName = ExcelUtils.getCellData(0, 1);
		String password = ExcelUtils.getCellData(1, 1);
		System.out.println(userName);
		System.out.println(password);
		
		LogInPage.setUserName(driver, userName);
		LogInPage.setPaswword(driver, password);
		LogInPage.clickLogIn(driver);
	}
}
