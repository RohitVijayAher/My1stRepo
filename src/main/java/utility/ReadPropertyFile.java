package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

	public static String PropertyFile(String value) throws Exception
	{
		Properties prop=new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Windows 10\\eclipse-workspace\\A_FB_FrameWork\\TestData\\config.properties");
	    prop.load(file);
	    return prop.getProperty(value);
	}
}
