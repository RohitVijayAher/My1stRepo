package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
	public void initialization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(utility.ReadPropertyFile.PropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
}
