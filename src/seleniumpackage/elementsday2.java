package seleniumpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementsday2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebChrome.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");

////getsize
//driver.findElement(By.id("contact_me")).getSize();
//Dimension d = driver.findElement(By.id("contact_me")).getSize();
//System.out.println(d.height);
//System.out.println(d.width);
//d.getHeight();
//d.getWidth();
//
////getlocation
//System.out.println(driver.findElement(By.id("contact_me")).getLocation());
//Point p = driver.findElement(By.id("contact_me")).getLocation();
//System.out.println(p.x);
//System.out.println(p.y);

//getattributes
//String a1 = driver.findElement(By.name("contactme")).getAttribute("class");
//System.out.println(a1);
//
//
//
//// tag name
//String a2 = driver.findElement(By.name("contactme")).getTagName();
//System.out.println(a2);
////driver.quit();
//
////getText
String a3 = driver.findElement(By.cssSelector("h2")).getText();
	System.out.println(a3);
	if(a3.contains("CONTACT US"))
		System.out.println("passed");
		else {
			System.out.println("FAILED");
		}
	
//	//getcssvalue
//	System.setProperty("WebChrome.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
//	ChromeDriver driver = new ChromeDriver();
//	driver.get("file:///C:/Users/User/Desktop/zorbahtml/day5/selemium.html");
//	
//	WebElement a9 = driver.findElement(By.cssSelector("h1"));
//	String a10 = a9.getCssValue("class");
//	
//	System.out.println(a10);
	
	}
	}


