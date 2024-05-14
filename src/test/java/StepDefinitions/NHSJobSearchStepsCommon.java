package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * Class defining the steps of execution.
 */

public class NHSJobSearchStepsCommon extends DriverDefintion {
	
	// To get the driver value from class DriverDefinition
	WebDriver driver = getDriver();
	

	@Given("user is on nhs job search page")
	public void user_is_on_nhs_job_search_page() {
		System.out.println("Inside Step - user on nhs job search page");
		driver.navigate().to("https://www.jobs.nhs.uk/candidate/search");
	 
	}

	@When("user enters title into what field")
	public void user_enters_title_into_what_field() {
		System.out.println("Inside Step - user enters preferred job title ");
		driver.findElement(By.id("keyword")).sendKeys("test");
	 
	}
	
	@When("user enters location into where field")
	public void user_enters_location_into_where_field() {
		System.out.println("Inside Step - user enters preferred job location ");
		driver.findElement(By.name("location")).sendKeys("London");
	 
	}
	
	@When("user enters incorrect location into where field")
	public void user_enters_incorrect_location_into_where_field() {
		System.out.println("Inside Step - user enters preferred job location which does not exists ");
		driver.findElement(By.id("location")).sendKeys("India");
	 
	}
	
	@And("user enters employer name into Employer field")
	public void user_enters_employer_name_into_Employer_field() {
		System.out.println("Inside Step - user enters preferred employer name ");
		driver.findElement(By.id("searchOptionsBtn")).click();
		driver.findElement(By.id("employer")).sendKeys("Northampton General Hospital");
	 
	}
	
	@And("user selects payrange from dropdown")
	public void user_selects_payrange_from_dropdown() {
		System.out.println("Inside Step - user selected preferred payrange ");
		driver.findElement(By.id("searchOptionsBtn")).click();
		// explicit wait - to wait for the payRange field visible
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("payRange")));
		Select payRangedropdown = new Select(driver.findElement(By.id("payRange")));
		payRangedropdown.selectByVisibleText("£40,000 to £50,000");
		
	}
	@And("clicks on search button")
	public void clicks_on_search_button() {
		System.out.println("Inside Step -clicks on search button ");
		driver.findElement(By.id("search")).click();
	   
	}

	@Then("user is navigated to the results page")
	public void user_is_navigated_to_the_results_page() {
		System.out.println("Inside Step - user navigated to search results ");
	   
	}
	
	@Then("user is displayed with message 'Location not found'")
	public void user_is_displayed_with_message_Location_not_found() {
		
		// Locate the h2 element by its data-test attribute value
		WebElement locationNotFoundElement = driver.findElement(By.cssSelector("h2[data-test='search-result-query']"));
        
		// Verify that the text is 'Location not found'
		String ExpectedText = "Location not found";
		String ActualText = locationNotFoundElement.getText();
		Assert.assertEquals(ExpectedText, ActualText);
		driver.quit();

	}
	
	@And("results sorted by newest Date Posted")
	public void results_sorted_by_newest_Date_Posted() {
		Select dropdown = new Select(driver.findElement(By.id("sort")));
        dropdown.selectByVisibleText("Date Posted (newest)");
        System.out.println("Inside Step -results sorted by newest Date Posted ");
		driver.quit();
	   
	}

}
