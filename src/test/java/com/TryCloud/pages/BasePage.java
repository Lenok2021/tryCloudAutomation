package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

  public void iiii(){

  }

}







