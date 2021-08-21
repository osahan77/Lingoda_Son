package com.lingoda.step_definitions;

import com.lingoda.pages.PolymerPage;
import com.lingoda.utilities.BrowserUtils;
import com.lingoda.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PolymerStepDefs {
/*
Write a basic browser automation framework to validate a Polymer website. The focus should be on the interaction with the browser.
The Web Application under test http://todomvc.com/
The first step should be to load the website, click within the JavaScript tab, and select the Polymer link.
The second step should be: Add two Todo items
Bonus: (optional stretch goal): Edit the content of the second Todo item
 If there are other major priorities or urgent matters that prevent you from completing the challenge, that is understandable, just let me know when you can complete it.
 */
    WebDriver driver = Driver.get();
    PolymerPage polymerPage = new PolymerPage();
    WebDriverWait wait = new WebDriverWait(driver,20);

    @When("User adds {string} item")
    public void userAddsItem(String toDoItem) {
        polymerPage.createItemBox.sendKeys(toDoItem + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(polymerPage.createdItem(toDoItem)));
    }

    @Then("User should see the created {string} item")
    public void userShouldSeeTheCreatedItem(String arg0) {

        Assert.assertTrue(polymerPage.createdItem(arg0).isDisplayed());

    }

    @When("User adds {string} as a Todo item1")
    public void user_adds_as_a_Todo_item1(String item1) {
        polymerPage.createItemBox.sendKeys(item1 + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @When("User adds {string} as a Todo item2")
    public void user_adds_as_a_Todo_item2(String item2) {
        polymerPage.createItemBox.sendKeys(item2 + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @Then("User edits the content of the {string} Todo item2")
    public void user_edits_the_content_of_the_Todo_item2(String str) {

        ((JavascriptExecutor) driver).executeScript("var evt = document.createEvent('MouseEvents');" +
                "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);" +
                "arguments[0].dispatchEvent(evt);", polymerPage.createdItem(str));

                ((JavascriptExecutor) driver).executeScript("arguments[0].value ='';", polymerPage.editbox);

                polymerPage.editbox.sendKeys("I got it!" + Keys.ENTER);


//                SECOND WAY WITH Using SendKeys method

//        for (int i = 0; i < str.length(); i++) {
//
//            polymerPage.editbox.sendKeys(Keys.BACK_SPACE);
//        }
//        polymerPage.editbox.sendKeys("I got it!" + Keys.ENTER);

//        BrowserUtils.waitFor(2);




//        driver.navigate().refresh();
//        polymerPage.createdItem(str).clear();


//




//        Actions act = new Actions(driver);
//        WebElement btnElement = polymerPage.createdItem(str);
//        act.doubleClick(btnElement).perform();
//
//        for (int i = 0; i < str.length(); i++) {
//            polymerPage.editbox.sendKeys(Keys.BACK_SPACE);
//        }
//
//        polymerPage.editbox.sendKeys("I got it!" + Keys.ENTER);
//
//        BrowserUtils.waitFor(2);

//        polymerPage.createdItem(str).sendKeys(Keys.DELETE);
//        polymerPage.editbox.sendKeys(Keys.DELETE);






    }

}
