package seleniumpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

		driver.findElement(By.id("contact-us")).click();
		Thread.sleep(5000);
//String firstwindow = driver.getWindowHandle();
//System.out.println(firstwindow);
//set <String> secondwindow = driver.getWindowHandles();
	}

}
