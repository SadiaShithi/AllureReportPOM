package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;

public class Login_page extends Base {
	
	static By loginBar = By.partialLinkText("/account/login");
	static By fillEmail = By.xpath("//*[@type='text']//following::input[6]");
	static By fillPasword = By.xpath("//*[@type='text']//following::input[7]");
	static By loginBtn = By.xpath("//div/form/div[4]/button");
	static By popUpMsg = By.xpath("//div[@class='_2sKwjB']");
	
	public void clickLoginBar() {
		driver.findElement(loginBar);
	}
	
	public void enterEmail(String email) {
		driver.findElement(fillEmail).sendKeys(email);
	}
	
	public void enterPassword(String pw) {
		driver.findElement(fillPasword).sendKeys(pw);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public String getLogintext() {
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(popUpMsg));
		
		Alert alertDialog = driver.switchTo().alert();

		// Get the alert text
		String alertText = alertDialog.getText();
		
		return alertText;
	}
	
}
