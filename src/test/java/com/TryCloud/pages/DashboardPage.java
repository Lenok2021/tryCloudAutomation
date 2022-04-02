package com.TryCloud.pages;

import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends LoginPage{

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//ul[@id='appmenu']//li[@id='more-apps']//preceding-sibling::li")
    public List<WebElement> mainModules;


    public List<String> ModuleNames(){
        List<String> modules = new ArrayList<>();

        for (WebElement each : mainModules) {
            BrowserUtils.hover(each);
            BrowserUtils.sleep(1);
            modules.add(each.getText());
        }

        return modules;

    }


    public void clickModule(String moduleName){

         Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//span[normalize-space(.)='"+moduleName+"']/..")).click();

    }







}
