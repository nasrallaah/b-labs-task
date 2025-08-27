
package com.btech.tests;

import com.btech.pages.HomePage;
import com.btech.pages.ProductPage;
import com.btech.pages.SearchResultsPage;
import com.btech.utils.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BTechSearchTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Config.getTimeout()));
    }

    @Test
    public void testSearchAndAddToCart() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();
        homePage.searchForProduct("iphone");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.verifyFirstProductHasImage();
        searchResultsPage.clickFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
        productPage.waitForPopup();
        productPage.navigateToCart();


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}