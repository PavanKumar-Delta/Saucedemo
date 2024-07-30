package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePageFactory;
import pageFactory.LoginPageFactory;

public class pageFactoryLoginStepDefinition {

	
	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory homepage;

	@Given("user is on the Login Page")
	public void user_is_on_the_login_page() {
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		login = new LoginPageFactory(driver);
		
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button(){
		login.click_on_button();;
		
	}

	@Then("user navigates to Home Page")
	public void user_navigates_to_home_page() {
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
		homepage = new HomePageFactory(driver);
		homepage.is_Logo_Displayed();
		
		
	}
	
	@And("close the Browser")
	public void close_the_Browser() {
		driver.quit();
		
	}

}
