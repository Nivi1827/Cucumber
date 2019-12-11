package Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefnitions {
        // sample push cmd int a;
	WebDriver driver;
	@Given("^launch the url$")
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");	

	}
	@When("^click on signin$")
   public void Signin()
   {
		driver.findElement(By.xpath("//button[@id='btn1']")).click();
   }
   @When("^Enter Email as \"(.*)\"$")
   public void Email(String mail)
    {
	  driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(mail);
    }
//for 2commands with and coordinator
//@Then("^Enter name as \"(.*)\" and \"(.*)\"$")
//public void name(String fname,String lname)
//{
	//driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(mail);
//}
  @When("^Enter Password as \"(.*)\"$")
  public void Passwd(String pswd)
   {
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pswd);
   }
  @Then("^click Enter button$")
  public void close()
  {
	  driver.findElement(By.id("enterbtn")).click();
  }
}