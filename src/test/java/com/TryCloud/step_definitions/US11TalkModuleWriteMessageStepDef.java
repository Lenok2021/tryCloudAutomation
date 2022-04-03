package com.TryCloud.step_definitions;

import com.TryCloud.pages.DashboardPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.LoginPageAdam;
import com.TryCloud.pages.TalksPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US11TalkModuleWriteMessageStepDef {

    LoginPageAdam loginPageAdam = new LoginPageAdam();
    TalksPage talksPage = new TalksPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String module) {
        // Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        // loginPageAdam.login();
        dashboardPage.clickModule(module);


    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);


    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
        talksPage.searchInput.sendKeys("User12" + Keys.ENTER);
        WebElement conversation = Driver.getDriver().findElement(By.xpath("//a[@aria-label='Conversation, User12']"));
        conversation.click();
    }

    @When("user write a message")
    public void user_write_a_message() {
        talksPage.messageInput.click();
        talksPage.messageInput.sendKeys("Hello");

    }

    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        talksPage.submitButton.click();

    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {

        WebElement postedMessage = Driver.getDriver().findElement(By.xpath("//*[.='Hello']"));
        Assert.assertTrue(postedMessage.isDisplayed());

    }


}
