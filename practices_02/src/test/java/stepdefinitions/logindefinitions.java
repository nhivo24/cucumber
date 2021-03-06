package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindefinitions {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@SuppressWarnings("deprecation")
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}
	@When("^I click customer login$")
	public void customer_login() throws Throwable{
		driver.findElement(By.xpath("//button[contains(text(),'Customer Login')]")).click();
		System.out.println("hello world 1");
	}

	@And("^I select my name$")
	public void select_name() throws Throwable {
		driver.findElement(By.xpath("//option[contains(text(),'Harry Potter')]")).click();
		System.out.println("hello world 1");
	}
	@Then("^user submit information$")
	public void submit_form() throws Throwable{
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.quit();
	}

	
}
