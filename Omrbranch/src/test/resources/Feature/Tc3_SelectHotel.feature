@SelectHotel
Feature: verifying OMR Branch SelectHotel automation

  Scenario Outline: verifying navigate to hotel popup accepting
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    And user the first hotel name and save the hotel name,price
    And user should accept the popup alert 
     Then user should verify success message after select hotel name "Book Hotel"

    Examples: 
      | userName                | Password   | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: verifying navigate in the hotel  same page popup dissmiss
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    And user the first hotel name and save the hotel name,price
   And user should dismiss the popup alert
    Then user should verify success message after search hotel "Select Hotel"

    Examples: 
      | userName                | Password   | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: verifying hotel name are in ascending order when user click name ascending
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
   Then user should verify success message after search hotel "Select Hotel"
    When user select the search by name ascending order
    Then user should verify  after click the name ascending all the hotel names in ascending

    Examples: 
      | userName                | Password   | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: verifying select hotel with listed hotel after unselect room Type
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify after search Hotel success message"Select Hotel"
    When user unselect the "<selectRoom>"
    Then user sholud be verify unselect selectroom all the hotel type is displayed

    Examples: 
      | userName                | Password   | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |
