/*
 * package com.newtours.qa.stepdefinition;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select; import io.cucumber.java.After; import
 * io.cucumber.java.Before; import io.cucumber.java.en.And; import
 * io.cucumber.java.en.When;
 * 
 * public class HooksLogin { WebDriver driver; String expectedTitle =
 * "Welcome: Mercury Tours";
 * 
 * @Before public void user_is_already_on_login_page() {
 * System.setProperty("webdriver.chrome.driver",
 * "..\\CucumberMavenProject\\Drivers\\chromedriver.exe"); driver = new
 * ChromeDriver(); driver.manage().window().maximize();
 * driver.get("http://www.newtours.demoaut.com/");
 * System.out.println("User navigates to URL"); }
 * 
 * @And("username and password are entered") public void
 * username_and_password_are_entered() { //String actualtitle =
 * driver.getTitle();
 * driver.findElement(By.cssSelector("input[name='userName']")).sendKeys(
 * "sinha.litton@gmail.com");
 * driver.findElement(By.cssSelector("input[name='password']")).sendKeys(
 * "India@123"); System.out.println("User enters login details "); }
 * 
 * @When("user clicks on signin button") public void
 * user_clicks_on_signin_button() {
 * driver.findElement(By.cssSelector("input[name='login']")).click();
 * System.out.println("User clicks login button"); }
 * 
 * @And("user creates a trip") public void user_creates_a_trip() {
 * System.out.println("User creates a trip");
 * driver.findElement(By.cssSelector("input[value='oneway']")).click();
 * WebElement departingFrom =
 * driver.findElement(By.cssSelector("select[name='fromPort']")); Select
 * selectDeparture = new Select(departingFrom);
 * selectDeparture.selectByVisibleText("London"); WebElement fromMonth =
 * driver.findElement(By.cssSelector("select[name='fromMonth']")); Select
 * selectFromMonth = new Select(fromMonth);
 * selectFromMonth.selectByVisibleText("March"); WebElement toMonth =
 * driver.findElement(By.cssSelector("select[name='toMonth']")); Select
 * selectToMonth = new Select(toMonth);
 * selectToMonth.selectByVisibleText("April");
 * driver.findElement(By.cssSelector("input[value='First']")).click();
 * WebElement airline =
 * driver.findElement(By.cssSelector("select[name='airline']")); Select
 * selectAirline = new Select(airline);
 * selectAirline.selectByVisibleText("Unified Airlines");
 * driver.findElement(By.cssSelector("input[name='findFlights']")).click();
 * System.out.println("User created a trip"); }
 * 
 * @After ("user closes the browser") public void user_closes_the_browser() {
 * driver.quit(); } }
 */