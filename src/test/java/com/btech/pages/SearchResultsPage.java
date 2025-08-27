package com.btech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"product_view_0\"]")
    private WebElement firstProduct;

    @FindBy(xpath = "//*[@id=\"product_view_0\"]//img")
    private WebElement firstProductImage;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyFirstProductHasImage() {
        waitForElementToBeVisible(firstProductImage);
        Assert.assertTrue(firstProductImage.isDisplayed(), "First product should have an image");
        Assert.assertNotNull(firstProductImage.getAttribute("src"), "Image source should not be null");
        System.out.println("First Product Has An Image ");
    }

    public void clickFirstProduct() {
        click(firstProduct);
    }
}