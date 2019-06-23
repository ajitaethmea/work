package automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import resources.Base;
import resources.CompanyInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class SignUpPage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void DriverInitiation() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("signUpPageUrl"));
		log.info("navigated to signup page");
	}
	
	@Test
	public void SignUpPageNavigation() throws InterruptedException
	{
		//creating object to the class and invoking methods
		CompanyInfo fetchDetail = new CompanyInfo();
		LandingPage newObject = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//entering company profile details
		newObject.companyName().sendKeys(fetchDetail.getCompanyName());
		newObject.countryName().sendKeys(prop.getProperty("country"));
		newObject.companyProfile().sendKeys(prop.getProperty("company"));
		newObject.numberOfEmployees().sendKeys(prop.getProperty("employees"));
		newObject.describeYourself().sendKeys(prop.getProperty("describe"));
		
		//entering random details for amdin
		newObject.adminEmail().sendKeys(fetchDetail.getAdminEmail());
		newObject.adminEmail().getText();
		newObject.adminName().sendKeys(fetchDetail.getAminName());
		newObject.adminPhone().sendKeys(fetchDetail.getAdminNumber());
		
		//entering the secure password
		newObject.linkSecurePassword().click();
		newObject.securePassword();
		newObject.securePasswordButton().click(); 
		
		//selecting checkboxes
		newObject.checkBoxTermsAndConditions().click();
		newObject.checkBoxPrivacyPolicy().click();
		newObject.checkBoxPersonalData().click();
		
		//agreeing to terms and conditions
		newObject.linkTermsAndConditions().click();
		newObject.termsAndConditionsButton().click();
		log.info("Terms and conditions have been accepted");

		
		//agreesing to policies
		newObject.linkPrivacyPolicy().click();
		newObject.scrollDown();
		newObject.privacyPolicyButton().click();
		log.info("Privacy policy has been scrolled and read");
		
		//submitting details for signup
		newObject.signUpSubmitButton().click();
		log.info("signup details has been submitted for account creation");
		Thread.sleep(50000);	
		
				
		//validating url
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, (prop.getProperty("signUpPageUrl")), "URL is not matching");
				
		//validateing dashboardpage
		Assert.assertTrue(newObject.dashboard().isDisplayed(), "Dashboard view is not displayed");
		Assert.assertTrue(driver.findElement(By.name("dashboard")).isDisplayed(), "Dashboard view is not displayed");
			
				
	}
			
		@AfterTest(enabled = true)
		public void closeBrowser()
		{
			
			//closing the window
			driver.close();
		}
		
		
		

	

}
