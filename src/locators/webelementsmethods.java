package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementsmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebElement.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
driver.manage().window().maximize();
Thread.sleep(5000);
//1)Sendkeys
WebElement fn = driver.findElement(By.name("first_name"));
WebElement ln = driver.findElement(By.name("last_name"));
WebElement email = driver.findElement(By.cssSelector("input[name=\"email\"]"));
WebElement comment = driver.findElement(By.name("message"));


fn.sendKeys("Bhagwati");
//enabled
if(fn.isEnabled()) {
	System.out.println("passed");
}
else {
	System.out.println("failed");
}
ln.sendKeys("Katuwal");
email.sendKeys("anzelakatuwal@gmail.com");
comment.sendKeys("Hello");


//2)isdisplayed
//boolean a  = driver.findElement(By.name("first_name")).isDisplayed();
//if(a) {
//	System.out.println("passed");
//}
//else {
//	System.out.println("failed");
//}

//button
driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

	}

}
