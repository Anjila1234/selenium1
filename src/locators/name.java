package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	
	WebElement email = driver.findElement(By.name("email"));//.sendKeys("anzelakatuwal@gmail.com");
	
			if(email.isDisplayed()) {
				System.out.println("test case pass");
			}
			else {
				System.out.println("Test case fail");
			}
	
	}

}
