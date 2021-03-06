package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class addDefinition {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@SuppressWarnings("deprecation")
	@Given("^user is on website$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}
	
	@When("^I click Bank Manager Login$")
	public void click_bank() throws Throwable{
		driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).click();
		System.out.println("hello world 1");
	}
	@And("^I click add new customer button$")
	public void add_new_customer() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'Add Customer')]")).click();
	}
	
	
	
	@And("user enters Firstname as {string}")
	public void user_input(String Firstname) throws Throwable {
	
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
		
		System.out.println("hello world 1");
	}
	@And("user enters Lastname as {string}")
	public void user_input_lastname(String Lastname) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
			
		System.out.println("hello world 1");
	}
	@And("user enters Postcode as {int}")
	public void user_input_postcode(int Postcode) throws Throwable {
	
		
		driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("" + Postcode);
		
		System.out.println("hello world 1");
	}
	@Then("^user submit$")
	public void submit_form() throws Throwable{
		driver.findElement(By.xpath("//button[contains(text(),'Add Customer')]")).click();
	}

	

}
