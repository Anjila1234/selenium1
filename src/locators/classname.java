package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrangement
System.setProperty("WebDriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");

//action
driver.findElement(By.className("6lux")).sendKeys("anzelakatuwal@gmail.com");
driver.findElement(By.className("input[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("Missumom@1");
driver.findElement(By.className("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).submit();	
	
	}

}
