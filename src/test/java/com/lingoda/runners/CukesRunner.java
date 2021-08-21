package com.lingoda.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/lingoda/step_definitions",
        dryRun = false,
        tags = "@wip"

 )
public class CukesRunner {
 /*
 Write a basic browser automation framework to validate a Polymer website. The focus should be on the interaction with the browser.
The Web Application under test http://todomvc.com/
The first step should be to load the website, click within the JavaScript tab, and select the Polymer link.
The second step should be: Add two Todo items
Bonus: (optional stretch goal): Edit the content of the second Todo item
 If there are other major priorities or urgent matters that prevent you from completing the challenge, that is understandable, just let me know when you can complete it.
Please confirm you received the test.
  */
}