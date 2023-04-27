package windowshandlerpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class day1secondpart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe")	;
	ChromeDriver driver = new ChromeDriver ();
	
	driver.get("http://www.webdriveruniversity.com/");	
		
 driver.findElement(By.cssSelector("a[id=\"button-clicks\"]")).click();
	String a1 = driver.getWindowHandle();
	System.out.println(a1);
	
	Set<String> a2 = driver.getWindowHandles();
	System.out.println(a2);
	
//	Iterator <String> a3 = a2.iterator();
//	
//	while(a3.hasNext())	{
//		a3.next();
//	}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
