package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			//here we can add code for the firefox or any other browser as required
			//driver = new FirefoxDriver();
		}
	
		
		return driver;
		
	}
	
	public void getScreenshot() throws Exception{

        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File DestFile=new File("./screenshot/"+System.currentTimeMillis()+".png");
        FileUtils.copyFile(SrcFile, DestFile);
        
        }



	
	

	
	
	


}
