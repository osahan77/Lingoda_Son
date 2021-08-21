$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/JavaScript.feature");
formatter.feature({
  "name": "User joins JavaScript tab",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the TodoMVC page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.lingoda.step_definitions.JavaScriptStepDefs.user_is_on_the_TodoMVC_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on \"JavaScript\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.lingoda.step_definitions.JavaScriptStepDefs.user_should_click_on_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on \"Polymer\" link",
  "keyword": "And "
});
formatter.match({
  "location": "com.lingoda.step_definitions.JavaScriptStepDefs.user_should_click_on_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be edit Todo items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User adds \"Todo1 item\" as a Todo item1",
  "keyword": "And "
});
formatter.match({
  "location": "com.lingoda.step_definitions.PolymerStepDefs.user_adds_as_a_Todo_item1(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User adds \"Todo2 item\" as a Todo item2",
  "keyword": "And "
});
formatter.match({
  "location": "com.lingoda.step_definitions.PolymerStepDefs.user_adds_as_a_Todo_item2(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User edits the content of the \"Todo2 item\" Todo item2",
  "keyword": "Then "
});
formatter.match({
  "location": "com.lingoda.step_definitions.PolymerStepDefs.user_edits_the_content_of_the_Todo_item2(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});