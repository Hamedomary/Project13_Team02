Feature: google_search_feature


  @iphone
  Scenario: TC01_iphone_search
    Given User is on the google home page
    When User Search for iphone
    Then Verify the result contains iphone