@Wikipedia
Feature: Wikipedia Home Page
  Validation on the Wiki Home Page

  Scenario: Check languages
    Given I am in the wikipedia home page
    Then I should see the language links
      | English   |
      | Deutsch   |
      | Español   |
      | Français  |
      | Italiano  |
      | Polski    |
      | Português |

  Scenario Outline: Search
    Given I am in the wikipedia home page
    When I search "<text>"
    Then I should see the article title "<expected>"

    Examples:
      | text | expected |
      | Java | Java     |
      | Java | Java     |
      | Java | Java     |

  Scenario: Check Talk Tab title
    Given I am in the wikipedia home page
    When I search "Java"
    Then I should see the "Talk" tab
    When I click on the Talk tab
    Then I should see the "Talk:Java" title
