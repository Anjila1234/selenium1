import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties pro = new Properties();
		
	FileInputStream FIS =	new FileInputStream("C:\\Users\\User\\eclipse-workspace\\seleniumanjila\\src\\test.properties");
		
	pro.load(FIS);	
	String browser = pro.getProperty("browser");
	System.out.println(browser);
//		
//		if(browser == "chrome") {
//
//			System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
//			ChromeDriver driver = new ChromeDriver ();
//			driver.get(pro.getProperty("baseurl"));
//		}
//		else {
//
//			System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver");
//			FirefoxDriver driver = new FirefoxDriver ();
//		}
		
		
		FileOutputStream FOS = new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\seleniumanjila\\src\\test.properties");
		pro.setProperty("Name", "Anjila");
		pro.store(FOS, "storing the name");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
