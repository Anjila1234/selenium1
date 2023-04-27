package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		
		
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		//double click 
//		WebElement click = driver.findElement(By.xpath("//div[@id='double-click']"));
//		act.doubleClick(click).build().perform();
//		//driver.quit();
//		
//		if(click.getAttribute("class").equals("div-double-click double")) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("false");
//		}
		
		
		//click and hold
//		WebElement hold = driver.findElement(By.cssSelector("div[id='click-box']"));
//		
//		act.clickAndHold(hold).build().perform();
//		if(hold.getText().contains("Well done! keep holding that click now.....")) {
//			System.out.println("Test case pass");
//		}
		
		
//		hold.click();
//		
//		if(hold.getText().equals("Dont release me!!!")) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		
		//Drag and drop
//		WebElement drag = driver.findElement(By.cssSelector("div[id=\"draggable\"]"));
//		WebElement drop = driver.findElement(By.cssSelector("div[id=\"droppable\"]"));
//		
//		System.out.println(drop.getText());
//		act.dragAndDrop(drag, drop).build().perform();
//		System.out.println(drop.getText());
		
		//Hover
//		WebElement hover =driver.findElement(By.cssSelector("#div-hover > div.dropdown.hover > button"));
//		act.moveToElement(hover).build().perform();
	//context click to perform right click
WebElement context =driver.findElement(By.cssSelector("#main-header"));
act.contextClick(context).build().perform();
		
		
		
		
		
		
	}

}
