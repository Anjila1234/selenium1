package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1part2 {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");	
				
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("c");
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='submit-button']")).click();
		if(driver.getCurrentUrl().contains("Carrots")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
