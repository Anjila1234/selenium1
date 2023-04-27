package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementsday1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");


// sendkeys -input/textarea
WebElement fn = driver.findElement(By.cssSelector("input[name=\"first_name\"]"));
WebElement ln = driver.findElement(By.cssSelector("input[name=\"last_name\"]"))	;
WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
WebElement comment = driver.findElement(By.cssSelector("textarea[name=\"message\"]"));

fn.sendKeys("Anjila");
ln.sendKeys("Katuwal");
email.sendKeys("anzelakatuwal@gmail.com");
comment.sendKeys("I am learning QA");
	
	
	//isDisplayed - it will display boolean value
boolean firstname = fn.isDisplayed();
if(firstname) {
	System.out.println("passed");}
	else {
		System.out.println("failed");	
}

// button
WebElement submit = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
	submit.click();
	
	// clear
	ln.clear();
	}

}
