package com.lingoda.pages;

import com.lingoda.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePage {
/*
 Write a basic browser automation framework to validate a Polymer website. The focus should be on the interaction with the browser.
The Web Application under test http://todomvc.com/
The first step should be to load the website, click within the JavaScript tab, and select the Polymer link.
The second step should be: Add two Todo items
Bonus: (optional stretch goal): Edit the content of the second Todo item
 If there are other major priorities or urgent matters that prevent you from completing the challenge, that is understandable, just let me know when you can complete it.
Please confirm you received the test.
  */


    @FindBy(id = "new-todo")
    public WebElement createItemBox;

    @FindBy(id = "edit")
    public WebElement editbox;

    public WebElement createdItem(String str){

        return Driver.get().findElement(By.xpath("//label[.='"+str+"']"));
    }
}
