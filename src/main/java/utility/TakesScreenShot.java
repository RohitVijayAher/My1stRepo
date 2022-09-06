package utility;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenShot {

	public static void ScreenShot(WebDriver driver,String MethodName) throws Exception
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Windows 10\\eclipse-workspace\\A_FB_FrameWork\\ScreenShot\\" + MethodName + ".png");
	    FileHandler.copy(source, destination);
	}
}
