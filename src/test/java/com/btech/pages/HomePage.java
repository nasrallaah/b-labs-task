package com.btech.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"search\"]")
    private WebElement searchBox;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() {
        driver.get("https://btech.com/ar");
    }

    public void searchForProduct(String searchTerm) {
        type(searchBox, searchTerm);
        searchBox.submit();
    }
}
