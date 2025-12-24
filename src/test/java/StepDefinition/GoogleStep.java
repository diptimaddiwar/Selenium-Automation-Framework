package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStep{
	WebDriver driver;
	
	@Given("User is on the Google home page")
	//@BeforeStep()
	public void user_is_on_the_google_home_page() {
		driver=new ChromeDriver();
		driver.get("http://google.com");
		 
	}

	@When("User type in search box <{string}> click on serach button")
	public void user_type_in_search_box_click_on_serach_button(String searchitem) {
	
		WebElement element= driver.findElement(By.name("q"));
	    element.sendKeys(searchitem);
	}
	@Then("<{string}> page opens")
	public void page_opens(String expectedtitle) {
	    String actualTitle=driver.getTitle();
	    if(actualTitle.contains(expectedtitle))
	    {
	    	System.out.println("You are on correct page");
	    }
	    else
	    {
	    	System.out.println("Expected"+expectedtitle+"but found"+"actual title");
	    }
	}



}
