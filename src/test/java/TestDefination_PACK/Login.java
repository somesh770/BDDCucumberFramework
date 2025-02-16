package TestDefination_PACK;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login {

	WebDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Given("User Navigate to LoginPage")
	public void user_navigate_to_login_page() {

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User Enter Valid Email and Password")
	public void user_enter_valid_email_as_and_password_as() {
		
		WebElement emailboxElement = driver.findElement(By.id("input-email"));
		emailboxElement.clear();
		emailboxElement.sendKeys("somesh@gmail.com");
		
		
		WebElement passwordboxElement = driver.findElement(By.id("input-password"));
		passwordboxElement.clear();
		passwordboxElement.sendKeys("Test@1234");
	}

	@When("User Click on Login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@SuppressWarnings("deprecation")
	@Then("User should navigate to Dashboard")
	public void user_should_navigate_to_dashboard() {
		
	boolean islogoutdisply = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
	
	Assert.assertEquals(islogoutdisply, false);
	}

}
