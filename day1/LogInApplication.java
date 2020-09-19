package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInApplication {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement username = driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		driver.findElementById("createLeadForm_companyName").sendKeys("MNW IT India Pvt Ltd");
		driver.findElementById("createLeadForm_firstName").sendKeys("Kameshwar");
		driver.findElementById("createLeadForm_lastName").sendKeys("Subramanian");
	    Select dropDown = new Select(source);
		dropDown.selectByVisibleText("Employee");
		
		WebElement createLeadForm_marketingCampaignId = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown1 = new Select(createLeadForm_marketingCampaignId);
		dropDown1.selectByValue("9001");
		
		WebElement createLeadForm_industryEnumId = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2 = new Select(createLeadForm_industryEnumId);
		List<WebElement> options = dropDown2.getOptions();
		int size = options.size();
		dropDown2.selectByIndex(size-2);
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3 = new Select(ownership);
		List<WebElement> options2 = dropDown3.getOptions();
		int size1 =options2.size();
		dropDown3.selectByIndex(size1-2);
		
		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropDown4 = new Select(country);
		dropDown4.selectByVisibleText("India");
		
		driver.findElementByName("submitButton").click();
		
		

	}

}
