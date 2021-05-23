package com.roofstack.projectPages;

import com.roofstack.myRepoUtils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CareerPage {
    public CareerPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css=".post-title")
    public List<WebElement> positionList;


    public void getPosition(String positionName){
        for (WebElement position : positionList) {
            if(position.getText().contains(positionName)){
                position.click();
            }

        }

    }
}
