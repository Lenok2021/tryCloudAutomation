package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_Defs {

    LoginPage loginPage = new LoginPage();

    // 1. valid credentials
    @Given("user on the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enter username {string}")
    public void user_enter_username(String username) {

        loginPage.userNameInput.sendKeys(username);

    }

    @When("user enter passcode {string}")
    public void user_enter_passcode(String password) {
        loginPage.userPasswordInput.sendKeys(password);

    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();

    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {

        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));

    }

    //2.invalid credentials


    @When("user enter  invalid username {string}")
    public void user_enter_invalid_username(String invalidUserName) {
        loginPage.userNameInput.sendKeys(invalidUserName);
    }

    @When("user enter invalid passcode {string}")
    public void user_enter_invalid_passcode(String invalidPassword) {
        loginPage.userPasswordInput.sendKeys(invalidPassword);
    }



    }




