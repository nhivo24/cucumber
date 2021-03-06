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

public class stepDefinition {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@SuppressWarnings("deprecation")
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/samplepagetest/");
	}
	@When("^I compare the title$")
	public void compare_title() throws Throwable{
		String exp_message = "Sample Page Test";
		String actual = driver.findElement(By.xpath("//h1[contains(text(),'Sample Page Test')]")).getText();
		Assert.assertEquals(exp_message, actual);
		System.out.println("hello world 1");
	}

	@And("^user input Image, Name, Email, Website, Experience, Expertise, Education, click Alert and Comment$")
	public void user_input() throws Throwable {
		driver.findElement(By.name("file-553")).sendKeys("C:\\image\\abc.jpg");
		driver.findElement(By.id("g2599-name")).sendKeys("vothinhi");
		driver.findElement(By.id("g2599-email")).sendKeys("vothinhi@gmail.com");
		driver.findElement(By.id("g2599-website")).sendKeys("https://stackoverflow.com/");
		driver.findElement(By.id("g2599-experienceinyears")).sendKeys("3-5");
		driver.findElement(By.xpath("//label[text()=' Automation Testing']")).click();
		driver.findElement(By.xpath("//label[text()=' Post Graduate']")).click();

		driver.findElement(By.xpath("//button[text()='Alert Box : Click Here']")).click();
		
		Alert alertFirst = driver.switchTo().alert();
		alertFirst.accept();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		Alert alertSecond = driver.switchTo().alert();
		alertSecond.accept();

		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("Sample");

		System.out.println("hello world 1");
	}
	@And("^user submit information$")
	public void submit_form() throws Throwable{
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}

	@Then("^your information has been updated$")
	public void success_message_is_displayed() throws Throwable {
		String exp_message = "go back";
		String actual = driver.findElement(By.xpath("//a[text()='go back']")).getText();
		Assert.assertEquals(exp_message, actual);
		driver.quit();
		System.out.println("hello world 2");
	}

}
