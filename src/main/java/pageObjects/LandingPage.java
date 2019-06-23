package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;



public class LandingPage {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	
	By companyName=By.xpath("//*[@id='broker_name']");
	By countryName=By.xpath("//*[@id='broker_address_country']");
	By inslyAddress=By.xpath("//*[@id='broker_tag']");
	By companyProfile=By.xpath("//*[@id='prop_company_profile']");
	By numberOfEmployees=By.xpath("//*[@id='prop_company_no_employees']");
	By describeYourself=By.xpath("//*[@id='prop_company_person_description']");
	By adminEmail=By.xpath("//*[@id='broker_admin_email']");
	By adminName=By.xpath("//*[@id='broker_admin_name']");
	By password=By.xpath("//*[@id='broker_person_password']");
	By passwordRepeat=By.xpath("//*[@id='broker_person_password_repeat']");
	By linkSecurePassword=By.xpath("//*[@id='field_broker_person_password']/td[2]/div/a");
	By securePassword=By.xpath("//*[@id='insly_alert']/b");
	By securePasswordButton=By.cssSelector("div[class*='ui-dialog-buttonset']");
	By adminPhone=By.xpath("//*[@id='broker_admin_phone']");
	By checkBoxTermsAndConditions=By.xpath("//*[@id='field_terms']/td[2]/div/div/label[1]/span");
	By checkBoxPrivacyPolicy=By.xpath("//*[@id='field_terms']/td[2]/div/div/label[2]/span");
	By checkBoxPersonalData=By.xpath("//*[@id='field_terms']/td[2]/div/div/label[3]/span");
	By linkTermsAndConditions=By.xpath("//*[@id='field_terms']/td[2]/div/div/label[1]/a");
	By linkPrivacyPolicy=By.xpath("//*[@id='field_terms']/td[2]/div/div/label[2]/a");
	By termsAndConditionsButton=By.xpath("//*[@class='ui-dialog-buttonset']/button[1]");
	By privacyPolicyButton=By.xpath("/html/body/div[3]/div[1]/a/span");
	By lastElement=By.xpath("//div[@id='document-content']/*[last()]");
	By signUpSubmitButton=By.xpath("//*[@id='submit_save']");
	By dashboard=By.xpath("//*[@id='page-dashboard']/ul/li[1]/a");
		
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement companyName()
	{
		return driver.findElement(companyName);
	}
	
	public WebElement countryName()
	{
		return driver.findElement(countryName);
	}
	
	public WebElement companyProfile()
	{
		return driver.findElement(companyProfile);
	}
	
	public WebElement numberOfEmployees()
	{
		return driver.findElement(numberOfEmployees);
	}
	
	public WebElement describeYourself()
	{
		return driver.findElement(describeYourself);
	}
	
	public WebElement adminEmail()
	{
		return driver.findElement(adminEmail);
	}
	
	public WebElement adminName()
	{
		return driver.findElement(adminName);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement passwordRepeat()
	{
		return driver.findElement(passwordRepeat);
	}
	
	public WebElement linkSecurePassword()
	{
		return driver.findElement(linkSecurePassword);
	}
	
	public void securePassword()
	{
		log.info("Secure Password is:   "+driver.findElement(securePassword).getText());
	}
	
	public WebElement securePasswordButton()
	{
		return driver.findElement(securePasswordButton);
	}
	
	public WebElement adminPhone()
	{
		return driver.findElement(adminPhone);
	}
	
	public WebElement checkBoxTermsAndConditions()
	{
		return driver.findElement(checkBoxTermsAndConditions);
	}
	
	public WebElement checkBoxPrivacyPolicy()
	{
		return driver.findElement(checkBoxPrivacyPolicy);
	}
	
	public WebElement checkBoxPersonalData()
	{
		return driver.findElement(checkBoxPersonalData);
	}
	
	public WebElement linkTermsAndConditions()
	{
		return driver.findElement(linkTermsAndConditions);
	}
	
	public WebElement termsAndConditionsButton()
	{
		return driver.findElement(termsAndConditionsButton);
	}
	
	public WebElement linkPrivacyPolicy()
	{
		return driver.findElement(linkPrivacyPolicy);
	}
	
	public WebElement privacyPolicyButton()
	{
		return driver.findElement(privacyPolicyButton);
	}
	
	public void scrollDown() 
	{
		// Select last child of content div
		WebElement element = driver.findElement(lastElement); 
		// Scroll to last child node
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


	}
	
	public WebElement signUpSubmitButton()
	{
		return driver.findElement(signUpSubmitButton);
	}
	
	public WebElement dashboard()
	{
		return driver.findElement(dashboard);
	}
	

	

}
