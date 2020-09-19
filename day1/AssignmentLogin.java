package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementByName("password").sendKeys("leaf@12");
		driver.findElementByXPath("//button[@type='submit']").click();
		
		System.out.println(driver.getTitle());
		
		driver.findElementByPartialLinkText("Log Out").click();
		driver.close();
		

	}

}
