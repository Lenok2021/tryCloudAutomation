package com.TryCloud.step_definitions;

import com.TryCloud.pages.Files_ModulePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US4_Files_Module_step_definitions {

    LoginPage loginPage = new LoginPage();


    Files_ModulePage files_modulePage = new Files_ModulePage();
    @When("the user clicks {string} module")
    public void the_user_clicks_module(String string) {
        loginPage.login("user7","Userpass123");
        BrowserUtils.sleep(3);
        files_modulePage.fileModule.click();

    }
    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {
        String expectedTitle = "Files - TryCloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
        files_modulePage.fileModule.click();
        files_modulePage.topLeftCheckBox.click();

    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        List<WebElement> list = new ArrayList<>();
        for (WebElement each : list) {
            Assert.assertTrue(each.isSelected());

        }
        Assert.assertTrue(files_modulePage.checkAllBoxes.isSelected());
    }

}
