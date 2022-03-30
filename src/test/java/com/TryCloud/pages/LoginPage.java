package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{



    @FindBy(xpath = "//input[@id = 'user']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id = 'password']")
    public WebElement userPasswordInput ;

    @FindBy(xpath = "//input[@id = 'submit-form']")
    public WebElement loginButton ;





}
