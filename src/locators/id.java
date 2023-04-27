package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class id {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//Arrangement
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgwNDY0MjAzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");

		//Action
		driver.findElement(By.id("email")).sendKeys("anzelakatuwal@gmail.com");
		;
		driver.findElement(By.id("pass")).sendKeys("Missumom@1");
		driver.findElement(By.id("loginbutton")).click();
		
		//Assertation
		boolean display = 
	driver.findElement(By.id("ssrb_root_start")).isDisplayed();
		if(display) {
			System.out.println("passed");
			
		}
		else {
			System.out.println("failed");
		}
	}

}
