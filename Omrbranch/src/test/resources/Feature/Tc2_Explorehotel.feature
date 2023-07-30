@ExploreHotel
Feature: verifying OMR Branch Explore Hotel automation

  Scenario Outline: enter all field and verify select hotel
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify success affter Search"Select Hotel"

    Examples: 
      | userName                | Password   | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: verifying login with valid credentials Multiple RoomType
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify succes affter login"Welcome Diwaker"
    When user enter "<selectState>","<selectCity>","<selectRoomType>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify success message"Select Hotel"
    And user  should verify hotel header name ends room type"<selectRoomType>"

    Examples: 
      | userName                | Passwords  | state      | city    | selectRoomType             | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Deluxe/Suite/Luxury/Studio | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: verifying login with valid credentials Particuler RoomType
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify succes affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify success message"Select Hotel"
    Then user should verify success message"<selectRoom>"

    Examples: 
      | userName                | Password   | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: with out enter field click search and verfiy all 6 error message
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify succes affter login"Welcome Diwaker"
    When user click the search hotel  without entering repective  field
    Then user should verify error message"Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms","Please select no. of adults"

    Examples: 
      | userName                | Password   |
      | diwaker7708@gmail.com | Diwaker@3 |
