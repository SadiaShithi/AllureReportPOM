package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Base {

	private WebDriver driver;
	public static WebDriverWait wait;
	
	public Base() {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		WebDriverManager.chromedriver().setup();
	
		this.driver = new ChromeDriver(option);
		Base.wait = new WebDriverWait(driver,100);
	
	}
	public void getURL( String s) {
		
		this.driver.get(s);
		
	}
//	
//	public  void click(By by) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//		this.driver.findElement(by).click();
//	}
//	
//	public static void sendKeys(By by, String s) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//		driver.findElement(by).sendKeys(s);
//	}
//	
//	public static String getText(By by) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//		return driver.findElement(by).getText();
//	}
//	
//	public static boolean isDisplayed(By by) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//		return driver.findElement(by).isDisplayed();
//	}
//	
//	public static boolean isEnabled(By by) {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//		return driver.findElement(by).isEnabled();
//	}


}
