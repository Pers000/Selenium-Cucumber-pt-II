$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\features\\Elements.feature");
formatter.feature({
  "name": "Check Elements",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@elements"
    }
  ]
});
formatter.scenario({
  "name": "Verify Text Box element functions",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@elements"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I accessed the site",
  "keyword": "Given "
});
formatter.match({
  "location": "Validate.iAccessedTheSite()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Elements\"",
  "keyword": "And "
});
formatter.match({
  "location": "Click.i_click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Text Box\"",
  "keyword": "When "
});
formatter.match({
  "location": "Click.i_click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.afterstep({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png");
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "I fill \"\" field with \"\"",
  "keyword": "And "
});
formatter.match({
  "location": "Fill.i_fill_field_with(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});