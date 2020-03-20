@all
Feature: sample feature2

	@smoke
  Scenario: Eclipse
    Given Go to google page1
    When Enter search1 "eclipse"

  	@smoke
  Scenario: Extent Reports
    Given Go to google page1
    When Enter search1 "extentreport"
