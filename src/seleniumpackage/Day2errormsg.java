package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2errormsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
		
		//arrangements
		ChromeDriver driver = new ChromeDriver();
     
		driver.get("https://facebook.com");
		
		driver.manage().window().fullscreen();
		//action
		driver.findElement(By.id("email")).sendKeys("anzelakatuwal@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("missumom@1");
		driver.findElement(By.name("login")).click();
		
		//assertions
		boolean errorMessage = driver.findElement(By.id("error_box")).isDisplayed();
		if(errorMessage) {
			System.out.println("pass");
		}
		else
			System.out.println("fail");
	}


}
