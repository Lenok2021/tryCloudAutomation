package com.TryCloud.step_definitions;

import com.TryCloud.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MainModules_StepDefinitions {


    DashboardPage mainModulesPage = new DashboardPage();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {

        mainModulesPage.login();

    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {

        List<String> actualMainModules = mainModulesPage.ModuleNames();

        Assert.assertEquals("invalid modules name",expectedModules,actualMainModules);
    }





}
