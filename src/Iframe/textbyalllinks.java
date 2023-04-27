package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbyalllinks {
public static void main(String[] args) {
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver ();
	
	driver.get("http://www.webdriveruniversity.com/");
		
	


	List<WebElement> a1 = driver.findElements(By.tagName("a")); 
a1.size();

//get the text of all links

for(int i = 0; i< a1.size(); i++) {
	System.out.println(a1.get(i).getText());
	

//value of href attribute
System.out.println(a1.get(i).getAttribute("href"));

}
}
}
