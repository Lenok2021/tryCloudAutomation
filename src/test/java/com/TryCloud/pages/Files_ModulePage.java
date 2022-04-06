package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Files_ModulePage {


    public Files_ModulePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement fileModule;


    @FindBy(css = "label[for='select_all_files']")
    public WebElement topLeftCheckBox;


    @FindBy(xpath = "//tbody//td[@class='selection']")
    public WebElement checkAllBoxes;
}
