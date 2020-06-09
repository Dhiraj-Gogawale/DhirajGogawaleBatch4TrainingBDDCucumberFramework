package newstepDefination;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.annotation.en.And;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
public class cucumberJava {

	WebDriver driver = null; 

	@Given("^I have open the browser$")

	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : " +projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\Driver\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(); 
	} 

	@When("^I open Goibibo website$") 
	public void goToGoibibo() { 
		driver.get("https://www.goibibo.com/"); 
	} 

	@Then("^user enter From Destination, Final Destination$") 
	public void enterDetails() { 
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys("Pune, India (PNQ)");
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys("Mumbai (BOM)");
	}

	@Then("^Then user select departure date$")
	public void departureDate() {
		driver.findElement(By.xpath("//*[@id=\"fare_20200630\"]")).click();	
	}

	@Then("^user select travel details and travel class$")
	public void travelclassdetails() {
		driver.findElement(By.xpath("//span[@class='dF alignItemsCenter ico14 textOverflow blueGrey']")).click();
	}

	@And("^user click on search button$")
	public void clickSearchBtn() {
		driver.findElement(By.xpath("//button[@id='gi_search_btn']")).click();
	}

	@And("^And user click on book button$")
	public void clickBookbtn() {
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/div[2]/span/span/input")).click();
	}


	@Then("^user review the fare summary details$") 
	public void verifyText() {
		WebElement mytext = driver.findElement(By.xpath("//span[contains(text(),'Fare Summary')]"));
		String text = mytext.getText();
		System.out.println("Text is " +text);
		String Expectedtext = "Fare Summary";
		if(text.contains("Expectedtext")) {

			System.out.println("Expected text is matched");

		}else{

			System.out.println("Expected text did not matched");

		}
		System.out.println("Test is completed");
	}

}
