package domkauf.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSteps {
    @Managed WebDriver driver;


    @Test


    @Given("^User navigates to dom-kauf website on the home page$")
    public void user_navigates_to_dom_kauf_website_on_the_home_page() throws Throwable {
        driver.get("https://dom-kauf.com/ru/");
        this.driver.manage().window().maximize();
    }

    @When("^User clicks on the login button$")
    public void user_clicks_on_the_login_button() throws Throwable {
        driver.findElement(By.xpath("//span[contains(text(), 'Войти')]")).click();

    }

    @When("^User enters a valid username \"([^\"]*)\"$")
    public void user_enters_a_valid_username(String username) throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[2]/div/div/div[2]/div/div[1]/form/div[3]/input")).sendKeys(username);

    }

    @When("^User enters a valid password \"([^\"]*)\"$")
    public void user_enters_a_valid_password(String password) throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"index\"]/div[1]/div/div/div[2]/div/div[1]/form/div[4]/input")).sendKeys(password);

    }

    @When("^User clicks on sign in button$")
    public void user_clicks_on_sign_in_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"cart\"]/div[1]/div/div/div[2]/div/div[1]/form/div[6]/button")).click();

    }

    @Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable  {
        WebElement LogAccess=driver.findElement(By.xpath("//span[contains(text(), 'Добро пожаловать')]"));
        Assert.assertEquals(true, LogAccess.isDisplayed());


    }

    @When("^User clicks on the search field$")
    public void user_clicks_on_the_search_field() throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/input[2]")).click();


    }

    @When("^User fills down the name of item$")
    public void user_fills_down_the_name_of_item() throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/input[2]")).sendKeys("Молоток для отбивания мяса");

    }

    @When("^User presses search button$")
    public void user_presses_search_button() throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"search_form\"]/div/button")).click();

    }

    @Then("^Users should see a chosen item$")
    public void users_should_see_a_chosen_item() throws Throwable  {
        WebElement SearchAccess=driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/div/div/article/div/div[2]/div[1]/a"));
        Assert.assertEquals(true, SearchAccess.isDisplayed());
    }

    @When("^User clicks on a chosen item$")
    public void user_clicks_on_a_chosen_item() throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/div/div/article/div/div[2]/div[1]/a")).click();

    }

    @When("^User adds a chosen item into cart$")
    public void user_adds_a_chosen_item_into_cart() throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")).click();

    }

    @When("^User clicks on checkout button$")
    public void user_clicks_on_checkout_button() throws Throwable  {
        driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div[2]/a")).click();

    }

    @Then("^User should see his cart with chosen item$")
    public void user_should_see_his_cart_with_chosen_item() throws Throwable  {
        WebElement CartAddItem=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a"));
        Assert.assertEquals(true, CartAddItem.isDisplayed());

    }





}
