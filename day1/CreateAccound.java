package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccound {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement userName = driver.findElementById("username");
		userName.sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Click on CRF/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementByXPath("(//input[@name='accountName'])[2]").sendKeys("MNW IT India");
		driver.findElementByName("description").sendKeys("Selenium Automation tester");	
		driver.findElementByName("groupNameLocal").sendKeys("Subramanian");
		driver.findElementByName("officeSiteName").sendKeys("Im in On Site");
		driver.findElementById("annualRevenue").sendKeys("2000");
		WebElement industry = driver.findElementByName("industryEnumId");
		Select dropDown = new Select(industry);
		dropDown.selectByValue("IND_SOFTWARE");
		
		WebElement ownerShip = driver.findElementByName("ownershipEnumId");
		Select dropDown1 = new Select(ownerShip);
		dropDown1.selectByVisibleText("S-Corporation");	
		
		WebElement source = driver.findElementByName("dataSourceId");
		Select dropDown2 = new Select(source);
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing = driver.findElementById("marketingCampaignId");
		Select dropDown3 = new Select(marketing);
		dropDown3.selectByIndex(6);
		
		WebElement state = driver.findElementByName("generalStateProvinceGeoId");
		Select dropDown4 = new Select(state);
		dropDown4.selectByValue("TX");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
	}
	
}
