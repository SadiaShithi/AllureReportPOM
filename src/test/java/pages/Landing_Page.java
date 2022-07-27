package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;

public class Landing_Page extends Base {

	static By popUp = By.xpath("/html/body/div[2]/div/div/button");
	static By searchBox = By.xpath("//input[@name='q']");
	static By hitIcon = By.xpath("//button[@type='submit']");
	static By slider = By.xpath("//div[2]/div[@class='_3FdLqY']");
	static By items = By.xpath("//div[@class='_3pLy-c row']/div[1]/div[1]");
	static By itemPrice = By.xpath("//div[@class='_3pLy-c row']/div[2]/div[1]/div[1]/div[1]");

	public void closePopUp() {
		driver.findElement(popUp).click();
	}

	public void searchItem(String s) {
		driver.findElement(searchBox).sendKeys(s);
	}

	public void hitSearch() {
		driver.findElement(hitIcon).click();
	}

	public void slideMe(int px) {
		
		WebElement slideMe = driver.findElement(slider);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(slider));
		
		Actions action = new Actions(driver); 
		
		//slides the slider
		action.dragAndDropBy(slideMe, px, 0).perform();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(slider));
		
		//scrolls down on the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

	}

	public void makeList() {
		
		List<WebElement> products = driver.findElements(items);
		List<WebElement> productPrices = driver.findElements(itemPrice);

		try {
			if (products.size() == productPrices.size()) {
				System.out.println("Making A List of Products Below...");
			}
		} 
		catch (ArithmeticException e) {
			System.out.println("Please check the xpaths again.");
		}
		
		System.out.println("\nS/N			Product Names				Product's Price");
		
		for (int i = 0; i < products.size(); i++) {
			System.out.println(i + 1 + ". " + products.get(i).getText() + "	-	" + productPrices.get(i).getText());
		}
	}

	public void expensiveItem() {
		
		List<WebElement> productPrices = driver.findElements(itemPrice);
		int f = 0;
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for (WebElement price : productPrices) {
			
			//String Manipulation to remove the "$" from Price Text & casting into int
			String s = price.getText();//gets each item price
			char r = s.charAt(0); //here "r" stores the first char
			String S = s.replace(r, ' ').trim(); //"r" is replaced by a " " & trimmed
			String num = S.replace(",", "").trim();//"," is replaced by "" & trimmed
			int n = Integer.parseInt(num); // n stores the casted int value of the String
			
			//adding n in the new List through the looping 
			numbers.add(n);
			
		}
		
		Collections.sort(numbers); //sorting the numbers List in Ascending order
		
		f = numbers.get(numbers.size()- 1); //f stores the highest number of the List
		
		System.out.print("The most expensive product in the list costs $" + f);

		 
	}

}
