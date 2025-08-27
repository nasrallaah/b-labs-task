
package com.btech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//p[@class='item-added' and contains(text(), 'ضفنا المنتج لمشترياتك')]")
    private WebElement popupModal;

    @FindBy(xpath = "//button[span[text()='شوف مشترياتك']]")
    private WebElement viewCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        click(addToCartButton);
    }

    public void waitForPopup() {
        waitForElementToBeVisible(popupModal);
        System.out.println("pop up detected");
    }

    public void navigateToCart() {
        waitForElementToBeClickable(viewCartButton);
        click(viewCartButton);
        System.out.println("navigated to cart successfully");
    }
}