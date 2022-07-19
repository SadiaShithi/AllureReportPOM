package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

	protected static WebDriver driver;
	
	public static void getURL(String s) {
		driver.get(s);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void sendKeys(By by, String s) {
		driver.findElement(by).sendKeys(s);
	}
	
	public static String getText(By by) {
		return driver.findElement(by).getText();
	}
	
	public static boolean isDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean isEnabled(By by) {
		return driver.findElement(by).isEnabled();
	}


}
