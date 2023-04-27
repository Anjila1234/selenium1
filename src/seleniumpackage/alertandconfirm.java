package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertandconfirm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebElement.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");



//alert
//driver.findElement(By.cssSelector("span[id=button1]")).click();
//driver.switchTo().alert().accept();
//Thread.sleep(5000);
//
////confirm-ok
driver.findElement(By.cssSelector("span[id=button4]")).click();
driver.switchTo().alert().accept();
String accept = driver.findElement(By.id("confirm-alert-text")).getText();
System.out.println(accept);
Thread.sleep(3000);

//confirm-cancel
//driver.findElement(By.xpath("//*[@id=\"button4\"]"));
//driver.switchTo().alert().dismiss();
//String cancel = driver.findElement(By.xpath("//*[@id=\"confirm-alert-text\"]")).getText();
//System.out.println(cancel);
//Thread.sleep(5000);

driver.findElement(By.id("button4")).click();
driver.switchTo().alert().dismiss();
String cancel2 = driver.findElement(By.id("confirm-alert-text")).getText();
System.out.println(cancel2);
driver.quit();

	}

}
