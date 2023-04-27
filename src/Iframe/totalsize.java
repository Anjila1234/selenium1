package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalsize {
public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	//driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");

	
		
	

//total no of iframe inside the page
//	System.out.println(driver.findElements(By.tagName("iframe")).size());	


//total no of links
	List<WebElement> a1 = driver.findElements(By.tagName("a")); 
//System.out.println(a1.size());




}
}
