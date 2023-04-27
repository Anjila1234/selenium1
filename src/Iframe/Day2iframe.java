package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver ();
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
	

	//driver.switchTo().frame(0);
	
	WebElement id =driver.findElement(By.id("iframeResult"));
	//driver.switchTo().frame(0);//index
	//driver.switchTo().frame("iframeResult");//name
	driver.switchTo().frame(id);//weelement
	boolean idname = driver.findElement(By.xpath("/html/body/h1")).isDisplayed();
	if(idname) {
		System.out.println("pass");
	}
	
	
	
	
	
	
	
	
	
	
	}

}
