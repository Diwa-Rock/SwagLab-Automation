@Login
Feature: verifying OMR Branch hotel Login Automation

  Scenario Outline: verifying login with valid credentials
    Given user is on the OMR Barnch hotel Page
    When user login"<userName>","<Password>"
    Then user should verify succes message after login"Welcome Diwaker"

    Examples: 
      | userName                | Password   |
      |diwaker7708@gmail.com| |Diwaker@3|
Feature: verifying OMR Branch hotel Login Automation

  Scenario Outline: verifying login with valid credentials
    Given user is on the OMR Barnch hotel Page
    When user login"<userName>","<Password>"
    Then user should verify succes message after login"Welcome Diwaker"

    Examples: 
      | userName                | Password   |
      | diwaker7708@gmail.com | Diwaker@3 |

  Scenario Outline: verifying login with valid credentials using ENTER key
    Given user is on the OMR Branch hotel Page
    When user login"<userName>","<Password>" with Enter key
    Then user should verify message after login "Welcome Diwaker"

    Examples: 
      | userName                | Password   |
      | diwaker7708@gmail.com  | Diwaker@3  |

  Scenario Outline: verifying login with invalid credentials
    Given user is  on the OMR Branch hotel page
    When user login"<userName>","<Password>"
    Then user should verify erro message after login"Invalid Login details or Your Password might have expired"

    Examples: 
      | userName                | Password |
      | diwaker7708@gmail.com  | Diwaker@3  |
       

  Scenario Outline: verifying login with valid credentials using ENTER key
    Given user is on the OMR Branch hotel Page
    When user login"<userName>","<Password>" with Enter key
    Then user should verify message after login "Welcome Diwaker"

    Examples: 
      | userName                | Password   |
      | diwaker7708@gmail.com  | Diwaker@3  |

  Scenario Outline: verifying login with invalid credentials
    Given user is  on the OMR Branch hotel page
    When user login"<userName>","<Password>"
    Then user should verify erro message after login"Invalid Login details or Your Password might have expired"

    Examples: 
      | userName                | Password |
      | diwaker7708@gmail.com  | Diwaker@3  |
