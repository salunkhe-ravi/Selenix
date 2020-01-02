$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/payments/feat1.feature");
formatter.feature({
  "name": "sample feature1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@payments"
    }
  ]
});
formatter.scenario({
  "name": "Cucumber",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@payments"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Go to google page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionTest.given()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter search \"cucumber\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionTest.when(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});