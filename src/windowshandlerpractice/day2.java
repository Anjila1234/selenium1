package windowshandlerpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

//		driver.get("http://www.webdriveruniversity.com/");
//
////driver.findElement(By.id("contact-us")).click();
//		driver.findElement(By.cssSelector("a[id=\"contact-us\"]")).click();
//		String p =driver.getWindowHandle();
//		System.out.println(p);
//		
		driver.get("http://www.webdriveruniversity.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]")).click();
		String parent = driver.getWindowHandle(); // it shows only parent window id
		System.out.println(parent);

		Set<String> child = driver.getWindowHandles(); // it shows both parent and child
		System.out.println(child);
		Iterator<String> a = child.iterator();
		String aparent = a.next();
		String achild = a.next();
		driver.switchTo().frame(achild);

	}

}
