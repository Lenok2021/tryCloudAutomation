package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US1_Login_Step_Defs {

    LoginPage loginPage = new LoginPage();

    // login with valid credentials

    @Given("user on  the login page")
    public void user_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {

        loginPage.login(username,password);
    }

    @When("user click login button")
    public void user_click_login_button() {

        loginPage.loginButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));


    }

    //login with invalid credentials

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("{string} message should be displayed")
    public void message_should_be_displayed(String expectedMessage) {

        Assert.assertEquals(expectedMessage,loginPage.warningMessage.getText());


    }

    }




