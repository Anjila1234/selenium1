package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1byID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iframe comes from another source
System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver ();
driver.get("http://www.webdriveruniversity.com/IFrame/index.html");


//ById	
	
WebElement a = driver.findElement(By.id("frame"));
	
driver.switchTo().frame(a);
System.out.println(driver.getTitle());

boolean a1 = driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[1]/a")).isDisplayed();
	if(a1) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	driver.switchTo().parentFrame();
	System.out.println(driver.getTitle());
	}

}
