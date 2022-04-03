package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TalksPage extends BasePage{


   @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
   public WebElement talkModule;
   @FindBy(xpath = "//input[@class='app-navigation-search__input']")
   public WebElement conversationBox;

   @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
   public WebElement searchInput;

   @FindBy(xpath = "//div[@class='new-message-form__advancedinput']")
   public WebElement messageInput;

  @FindBy(xpath = "//button[@type='submit']")
   public WebElement submitButton;

}
