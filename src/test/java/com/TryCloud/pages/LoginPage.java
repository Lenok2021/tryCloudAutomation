package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id = 'user']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id = 'password']")
    public WebElement userPasswordInput ;

    @FindBy(xpath = "//input[@id = 'submit-form']")
    public WebElement loginButton ;

    @FindBy(xpath = "//p[@class = 'warning wrongPasswordMsg']")
    public WebElement wrongPasswordMes ;

    @FindBy(xpath = "//a[@id = 'lost-password']")
    public WebElement forgetPassword ;

    @FindBy (xpath = "//input[@id = 'reset-password-submit']")
    public WebElement resetPasswordButton ;

    @FindBy(xpath = "//p[@class = 'update']")
    public WebElement getResetPasswordMessage;

    @FindBy(partialLinkText = "Back to login")
    public WebElement backToLoginButton ;




}
