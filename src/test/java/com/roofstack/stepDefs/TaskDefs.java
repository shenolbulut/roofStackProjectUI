package com.roofstack.stepDefs;


import com.roofstack.projectPages.*;
import com.roofstack.myRepoUtils.MyMethods;
import com.roofstack.myRepoUtils.DataReader;
import com.roofstack.myRepoUtils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.Keys;

public class TaskDefs {
    GoogleSearchPage googleHomePage = new GoogleSearchPage();
    RoofStackHomePage homePage = new RoofStackHomePage();
    CareerPage careerPage = new CareerPage();
    ProductPage productPage = new ProductPage();
    TestLeadPage testLeadPage = new TestLeadPage();

    @Given("Google’a {string} şeklinde arama yapılır.")
    public void google_a_şeklinde_arama_yapılır(String searchWords) {

        Driver.get().get(DataReader.get("url"));

        googleHomePage.searchInput.sendKeys(searchWords);
        MyMethods.waitFor(1);
        googleHomePage.searchInput.sendKeys(Keys.ENTER);


    }

    @When("Sonuclar listesinden https:\\/\\/roofstacks.com adresine girilir.")
    public void sonuclarListesindenHttpsRoofstacksComAdresineGirilir() {
        MyMethods.waitForClickablility(googleHomePage.searchedItem,10).click();
    }

    @Then("Kariyer sayfasına gidilir.")
    public void kariyer_sayfasına_gidilir() {
        MyMethods.waitForClickablility(homePage.careerBtn,10).click();


    }

    @Then("İlanlar arasından Product pozisyonu seçilir.")
    public void i̇lanlar_arasından_Product_pozisyonu_seçilir() {

        try{
            careerPage.getPosition("Product");
        }catch (Exception e ){
            e.printStackTrace();
        }


    }

    @Then("Lead Product Tester seçilir.")
    public void lead_Product_Tester_seçilir() {
        MyMethods.waitForClickablility(productPage.leadProductTester,10).click();

    }

    @Then("Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.")
    public void lead_Product_Tester_sayfasında_sayfanın_gelip_gelmediği_doğruluğu_kontrol_edilir() {
        MyMethods.waitFor(1);
        assertTrue(productPage.head.getText().equals("Lead Product Tester"));

    }

    @Then("SendCV butonuna basarak bir dosya upload edelim")
    public void sendcv_butonuna_basarak_bir_dosya_upload_edelim() {
        MyMethods.waitForClickablility(testLeadPage.sendCV,10).click();

    }

    @Then("Eposta adresine e-mail adresinizi girelim")
    public void eposta_adresine_e_mail_adresinizi_girelim() {
        testLeadPage.mailInput.sendKeys(DataReader.get("email"));
    }

    @Then("Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım")
    public void sample_bir_dosya_yükleyelim_ve_upload_butonuna_basarak_dosyayı_paylaşalım() {

        testLeadPage.chooseFile.sendKeys("C:\\Users\\SAMSUNG\\Desktop\\CV.docx");
        MyMethods.waitForClickablility(testLeadPage.submitBtn,10).click();
        MyMethods.waitFor(5);
        assertTrue(testLeadPage.uploadFull.isDisplayed());

    }



}
