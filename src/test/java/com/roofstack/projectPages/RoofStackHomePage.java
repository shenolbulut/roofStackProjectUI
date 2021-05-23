package com.roofstack.projectPages;

import com.roofstack.myRepoUtils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoofStackHomePage {

    public RoofStackHomePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="(//a[@class='nav-link dropdown-toggle'])[3]")
    public WebElement careerBtn;
}
