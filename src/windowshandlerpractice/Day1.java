package windowshandlerpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");

		driver.findElement(By.cssSelector("a[id=\"contact-us\"")).click();
		Thread.sleep(5000);
		String firstwindow = driver.getWindowHandle();
		System.out.println(firstwindow);

		Set<String> secondwindow = driver.getWindowHandles();
		System.out.println(secondwindow);

//		Iterator<String> a1 = secondwindow.iterator();
//		String mother = a1.next();
//		System.out.println(mother);
//
//		String daughter = a1.next();
//		System.out.println(daughter);
//
//
//		driver.switchTo().window(daughter);
//		driver.findElement(By.cssSelector("h2[name=\"contactme\"]")).isDisplayed();
//
//		driver.switchTo().window(mother);
//		System.out.println(mother);


	}

}
