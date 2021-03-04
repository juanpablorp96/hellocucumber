@YouTube
Feature: Youtube Home Page
  Validation on the Youtube Home Page

  Scenario: Check best of YouTube section
    Given I am in the YouTube home page
    Then I should see the following elements under best of YouTube section
      | Music      |
      | Sports     |
      | Gaming     |
      | News       |
      | Live       |
      | Learning   |
      | 360° Video |

  Scenario: Open video
    Given I am in the YouTube home page
    When I open a video
    And I skip the video ad
    Then I should see the video playing
    When I pause the video in time "0:02"
    Then I should see the play button
