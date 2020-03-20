@all
Feature: sample feature1

  @smoke @regression
  Scenario: Cucumber
    Given Go to google page
    When Enter search "cucumber"

  @smoke @regression
  Scenario: Sachin Tendulkar
    Given Go to google page
    When Enter search "Sachin Tendulkar"
