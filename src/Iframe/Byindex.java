package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjson_parse");
		driver.switchTo().frame(0);
		
		boolean a = driver.findElement(By.id("demo")).isDisplayed();
		
		if(a) {
			System.out.println("pass");
		}

		
	}

}
