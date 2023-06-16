Feature: Login ang Logout Feature


  Scenario: Login  and Logout test Scenacio
    Given that i will open the page
    Then I will click on account button
    Then I will click on login button
    And I will add the email address :"georgianatest16@gmail.com"
    And I will add the password: "testpaSS@."
    And I will click Sign in button
    Then I will click on account button
    Then I will click on Log out button

 Feature: Searching through all categories Feature
   Scenario Outline: Searching through all categories Scenario
     Given that i will open the page
     Then I will click on account button
     Then I will click on login button
     And I will add the email address :"georgianatest16@gmail.com"
     And I will add the password: "testpaSS@."
     And I will click Sign in button
     And I click on fetite section
     And I click on section : "<Articole petrecere>"
     Examples:
       |  Articole petrecere   |
       | Jucarii copii         |
       | Kids electronics      |
       | Carucioare copii      |
       | Scaune auto           |
       | Camera copilui        |
       | La plimbare           |
       | Jucarii exterior      |
       | Alimentatie           |
       | Igiena si ingrijire   |
       | Gradinita si scoala   |
       | Hrana bebelusi        |
       | Haine si imbracaminte |