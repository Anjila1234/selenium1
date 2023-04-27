package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4csserror {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//arrangements
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
//action
WebElement username = driver.findElement(By.cssSelector("input[name=\"username\"]"));
WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

username.sendKeys("dmin");
password.sendKeys("admin123");
login.click();

Thread.sleep(5000);
//assertions
boolean error = driver.findElement(By.cssSelector("p[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")).isDisplayed();
	
	if(error) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
//	driver.close();
	}

}
