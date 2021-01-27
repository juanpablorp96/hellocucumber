Feature: Wikipedia Home Page
  Validation on the Wiki Home Page

  Scenario Outline: Search
    Given I'm in the wikipedia home page
    When I search "<text>"
    Then I should see the article title "<expected>"

  Examples:
    | text | expected |
    | Java | Java     |
    | Java | Aaa      |
    | Java | Java     |
