package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebChrome.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");



//checkbox
List <WebElement> d = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
for(int i = 0; i< d.size(); i++) {
	if(d.get(i).isSelected()) {
		System.out.println("all are checked");
	}
	else {
	d.get(i).click();
	}
	
}
	
	

	
	}

}
