Feature: CucumberJava

Scenario: Login functionality exists

Given I have open the browser
When I open Goibibo website
Then user enter From Destination, Final Destination
Then user select departure date
Then user select travel details and travel class
And user click on search button
And user click on book button
Then user review the fare summary details