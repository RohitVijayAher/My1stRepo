package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class CreateNewAccount extends TestBase{

	//objectRepository
	@FindBy(xpath="//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")private WebElement CreateNewAcc;
	@FindBy(xpath="//input[@name='firstname']")private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']")private WebElement SurName;
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement EmailId;
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")private WebElement ReEmailId;
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement Password;
	@FindBy(xpath="//select[@name='birthday_day']")private WebElement Day;
	@FindBy(xpath="//select[@name='birthday_month']")private WebElement Month;
	@FindBy(xpath="//select[@name='birthday_year']")private WebElement Year;
	@FindBy(xpath="//input[@name='sex' and @value='2']")private WebElement Male;
//	@FindBy(xpath="//img[@class='_8idr img']")private WebElement Close;
	
	public CreateNewAccount()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyCreateNewAcc()
	{
		CreateNewAcc.click();
	}
	
	public void NewAccountCreation() throws Exception  
	{
		FirstName.sendKeys(utility.ReadExcelFile.ExcelFile(0, 0));
		SurName.sendKeys(utility.ReadExcelFile.ExcelFile(1, 1));
		EmailId.sendKeys(utility.ReadExcelFile.ExcelFile(2, 2));
		ReEmailId.sendKeys(utility.ReadExcelFile.ExcelFile(2, 2));
		Password.sendKeys(utility.ReadExcelFile.ExcelFile(3, 3));
	
		Actions ac=new Actions(driver);
		ac.moveToElement(Day).click().perform();
		for(int i=0;i<=3;i++)
		{
			Thread.sleep(500);
			ac.sendKeys(Keys.DOWN).build().perform();
		}
		ac.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		Select mn=new Select(Month);
		mn.selectByVisibleText("Mar");
		Thread.sleep(1000);
		
		Select yr=new Select(Year);
		yr.selectByValue("1998");
		Thread.sleep(1000);
		
		ac.moveToElement(Male).click().build().perform();
		
	}
	
}
