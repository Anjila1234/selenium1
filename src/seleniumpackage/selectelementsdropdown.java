package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectelementsdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebChrome.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Select class only applies to drop down with select as tagNAme
//	      We need to pass select element to constructor
//	      byValue , byIndex , byText	

//		WebElement a = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select s = new Select(a);
//		s.selectByIndex(1);
//
//		WebElement b = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select s1 = new Select(b);
//		s1.selectByValue("python");
//		Thread.sleep(2000);

		WebElement c = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select s2 = new Select(c);
		s2.selectByVisibleText("Python");
		Thread.sleep(2000);
	}

}
