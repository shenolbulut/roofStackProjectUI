package com.roofstack.projectPages;

import com.roofstack.myRepoUtils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLeadPage {
    public TestLeadPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath="/html/body/main/div[3]/div/div[2]/div/div[1]/div/a/h3")
    public WebElement sendCV;

    @FindBy(id="email")
    public WebElement mailInput;

    @FindBy(xpath="//input[@id='file']")
    public WebElement chooseFile;

    @FindBy(xpath="//input[@id='btn_upload']")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[@style='width: 100%;']")
    public WebElement uploadFull;






}
