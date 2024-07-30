package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	
	By user_name = By.xpath("//input[@id='user-name']");
	By pwd = By.xpath("//input[@id='password']");
	By click_button = By.xpath("//input[@id='login-button']");
	By logo = By.className("app_logo");
	
	public void enterUsername(String username) {
		driver.findElement(user_name).sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
		
	}
	
	public void buttonClick() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for up to 10 seconds
        WebElement Button = wait.until(ExpectedConditions.elementToBeClickable(click_button));
		Button.click();
		
	}
	
	public void clickLogin(String username, String password) {
		driver.findElement(user_name).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		
		
	}
	
	public void checkLogoDisplayed() {
		driver.findElement(logo).isDisplayed();
		
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	


}
