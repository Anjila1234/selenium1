package seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabledselectedwebelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

//enable
//boolean enable = driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isEnabled();
//System.out.println(enable);
//
//if(enable) {
//	System.out.println("passed");
//}
//else {
//	System.out.println("failed");
//}
//
boolean enable1 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled();
System.out.println(!enable1);
if(enable1){
	System.out.println("passed");
}
//else {
//	System.out.println("failed");
//}
//boolean enable2 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isEnabled();
//System.out.println(enable2);
//if(enable2){
//	System.out.println("passed");
//}
//else {
//	System.out.println("failed");
//}
//
////selected
//boolean s1 = driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isSelected();
//System.out.println(s1);
//if(s1){
//	System.out.println("passed");
//}
//else {
//	System.out.println("failed");
//}
//boolean s2 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isSelected();
//System.out.println(s2);
//
//if(s2){
//	System.out.println("passed");
//}
//else {
//	System.out.println("failed");
//}
//boolean s3 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected();
//
//System.out.println(s3);
//if(s3) {
//	System.out.println("passed");
//}
//else {
//	System.out.println("failed");
//}


//Radio Buttons

WebElement a =driver.findElement(By.cssSelector("input[value=\"green\"]"));
a.click();

if(a.isSelected()) {
	System.out.println("passed");
}
else {
 System.out.println("failed");
}

	
	
WebElement b =driver.findElement(By.cssSelector("input[value=\"blue\"]"));
a.click();

if(b.isSelected()) {
	System.out.println("passed");
}
else {
 System.out.println("failed");
}
	
	

WebElement c =driver.findElement(By.cssSelector("input[value=\"purple\"]"));
a.click();

if(c.isSelected()) {
System.out.println("passed");
}
else {
System.out.println("failed");
}
Thread.sleep(5000);
driver.manage().window().maximize();


List <WebElement> c1 = driver.findElements(By.cssSelector("input[value=\"purple\"]"));
for(int i = 0; i< c1.size(); i++) {
	if(c1.get(i).isEnabled()){
		System.out.println("passed");
	}
	else {
		System.out.println("failed");
	}
	
	
}





	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
