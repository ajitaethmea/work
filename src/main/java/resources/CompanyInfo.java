package resources;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompanyInfo extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	String companyName;
	
	String adminName;
	String adminEmail;
	String adminNumber;

	
	public String getCompanyName() 
	{
		return companyName = RandomStringUtils.randomAlphabetic(7);
		
	}
	
	public String getAminName() 
	{
		 return adminName= RandomStringUtils.randomAlphabetic(5)+" "+RandomStringUtils.randomAlphabetic(5);
	}
	
	public String getAdminEmail() 
	{
		adminEmail=RandomStringUtils.randomAlphabetic(5)+"@gmail.com";
		log.info("Amin Email_ID is:  "+adminEmail);
		return adminEmail;
	}
	
	public String getAdminNumber() 
	{
		return adminNumber=RandomStringUtils.randomNumeric(10);
	}
	


}
