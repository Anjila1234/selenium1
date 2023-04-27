package seleniumpackage;

import java.util.Iterator;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement button = driver.findElement(By.id("radio-buttons"));
		List <WebElement> c1 = button.findElements(By.cssSelector("input[type=\"radio\"]"));
	for(int i = 0; i< c1.size(); i++) {
//		System.out.println(c1.get(i).getAttribute("value"));
		
		String name = c1.get(i).getAttribute("value");
		
			if(name.equals("blue")) {
				c1.get(i).click();
			
			Iterator <WebElement> name1 = c1.iterator();
			while (name1.hasNext()) {
				if(!name1.next().isSelected()) {
					System.out.println("It is not selected");
				}
				else {
					System.out.println("It is selected");
				}
				
				}}}
	
	
	driver.quit();
	
	
	}

			}
	
		

	


