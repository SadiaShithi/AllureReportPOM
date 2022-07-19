package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {

	@Before
	public static void setup() {
		ChromeOptions options = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}

	@After
	public static void tearDown() {
		driver.quit();
	}
}
