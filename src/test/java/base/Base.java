package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	protected static WebDriver driver;
	
	
	
	protected static WebDriverWait wait = new WebDriverWait(driver,100);

	public static void getURL(String s) {
		driver.get(s);
	}
	
	public static void click(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).click();
	}
	
	public static void sendKeys(By by, String s) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).sendKeys(s);
	}
	
	public static String getText(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).getText();
	}
	
	public static boolean isDisplayed(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).isDisplayed();
	}
	
	public static boolean isEnabled(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		return driver.findElement(by).isEnabled();
	}


}
