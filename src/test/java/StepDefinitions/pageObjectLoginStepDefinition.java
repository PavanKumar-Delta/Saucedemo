package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

//public class pageObjectLoginStepDefinition {
//
//	
//	static WebDriver driver;
//	LoginPage login;
//
//	@Given("user is on the Login Page")
//	public void user_is_on_the_login_page() {
//		
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		login = new LoginPage(driver);
//		
//	}
//
//	@When("user enters valid {string} and {string}")
//	public void user_enters_valid_and(String username, String password) {
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@When("clicks on login button")
//	public void clicks_on_login_button() {
//		login.buttonClick();
//		
//	}
//
//	@Then("user navigates to Home Page")
//	public void user_navigates_to_home_page() {
//		//Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
//		login.checkLogoDisplayed();
//		
//		
//	}
//	
//	@And("close the Browser")
//	public void close_the_Browser() {
//		driver.quit();
//		
//	}
//
//}
