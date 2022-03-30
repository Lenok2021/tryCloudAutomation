package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US14_searchItem_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login();
    }

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        WebElement magnifierButton = Driver.getDriver().findElement(By.xpath("//a[@class='header-menu__trigger']"));
        magnifierButton.click();
    }

    @When("users search any existing file\\/folder\\/username")
    public void users_search_any_existing_file_folder_user_name() {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchBox.sendKeys("Java");
    }

    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {
        String expectedFile = "Java";
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//h3[@title='Java']"));
        Assert.assertTrue("Java is not displayed", actualResult.isDisplayed());
    }


}
