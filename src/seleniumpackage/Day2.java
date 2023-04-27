package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
		
		//arrangements
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		
		//action
		driver.findElement(By.id("email")).sendKeys("anzelakatuwal@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Missumom@1");
		driver.findElement(By.name("login")).click();
		
		
		//assertions
		boolean elementOnDashBoard = driver.findElement(By.id("facebook")).isDisplayed();
		if(elementOnDashBoard) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		
	}
	
	
	

}
