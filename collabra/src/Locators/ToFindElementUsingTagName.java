package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindElementUsingTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com");
		
		driver.findElement(By.tagName("a")).click();


	}

}