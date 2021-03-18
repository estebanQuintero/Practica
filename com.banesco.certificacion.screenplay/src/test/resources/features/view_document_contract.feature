Feature: Single Contract for Banking Products and Services
  I want to see and be able to download the PDF Single Contract for Banking Products and Services

  Scenario: View the document of contract
    Given I go to the companies home page
    When I enter savings accounts through the deposit menu and select document
    Then I should see that the document is correct

