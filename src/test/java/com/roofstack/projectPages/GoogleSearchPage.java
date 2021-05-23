package com.roofstack.projectPages;

import com.roofstack.myRepoUtils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="//input[@class='gLFyf gsfi']")
    public WebElement searchInput;

    @FindBy(xpath="//h3[contains(.,'Roof Stacks: Home Page')]")
    public WebElement searchedItem;

}
