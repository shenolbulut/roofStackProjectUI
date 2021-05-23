Feature: RoofStack Task
  @wip
  Scenario: UI Task Steps
    Given Google’a 'Roof Stack Yazılım' şeklinde arama yapılır.
    When Sonuclar listesinden https://roofstacks.com adresine girilir.
    Then Kariyer sayfasına gidilir.
    And İlanlar arasından Product pozisyonu seçilir.
    And Lead Product Tester seçilir.
    And Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.
    And SendCV butonuna basarak bir dosya upload edelim
    And Eposta adresine e-mail adresinizi girelim
    And Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım