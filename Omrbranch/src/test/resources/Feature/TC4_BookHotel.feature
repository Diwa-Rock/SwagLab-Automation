@BookHotel
Feature: verifying OMR Branch HotelBooking automation

  Scenario Outline: verifying OMR Branch  book hotel without Gst and special request with card
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify success message after search hotel "Select Hotel"
    And user the first hotel name and save the hotel name,price
    And user should accept the popup alert
    Then user should verify success message after select hotel name "Book Hotel"
    When user add guest deatils"<selectSalutation>","<firtstName>","<lastName>","<mobilNumber>" and "<email>" without givig any special request
    And user select  payment options Credit/Debit/ATM Card and enter the card details"<card type>"
      | selectCard | cardNumber       | cardName | month | year | cvv |
      | visa       | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | Amex       | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | Mastercard | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | Discover   | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | visa       | 5555555555552222 | Diwaker  | April | 2026 | 912 |
      | Amex       | 5555555555552222 | Diwaker  | April | 2026 | 912 |
      | Mastercard | 5555555555552222 | Diwaker  | April | 2026 | 912 |
      | Discover   | 5555555555552222 | Diwaker  | April | 2026 | 912 |
    Then user should verify  after success message"Booking is Confirmed"
    Then user should verify  the same hotel is booking or not

    Examples: 
      | userName              | Password  | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild | selectSalutation | firtstName | lastName | mobilNumber | email                   | select Card Type |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 | Mr.              | Guhan      | G        |  9812093489 | guhanguhan635@gmail.com | Credit Card      |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 | Mr.              | Guhan      | G        |  9812093489 | guhanguhan635@gmail.com | Debit Card       |

  Scenario Outline: verifying OMR Branch  book hotel with Gst and special request with card
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify success message after search hotel "Select Hotel"
    And user the first hotel name and save the hotel name,price
    And user should accept the popup alert
    Then user should verify success message after select hotel name "Book Hotel"
    When user add guest deatils"<selectSalutation>","<firtstName>","<lastName>","<mobilNumber>" and "<email>" without givig any special request
    And user enter gst details"<regNo>","<companyName>" and "<companyAddress>"
    And user enter sepcial reqest"<special reqest>"
    And user select  payment options Credit/Debit/ATM Card and enter the card details"<card type>"
      | selectCard | cardNumber       | cardName | month | year | cvv |
      | visa       | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | Amex       | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | Mastercard | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | Discover   | 5555555555552223 | Diwaker  | April | 2026 | 912 |
      | visa       | 5555555555552222 | Diwaker  | April | 2026 | 912 |
      | Amex       | 5555555555552222 | Diwaker  | April | 2026 | 912 |
      | Mastercard | 5555555555552222 | Diwaker  | April | 2026 | 912 |
      | Discover   | 5555555555552222 | Diwaker  | April | 2026 | 912 |
    Then user should verify  after success message"Booking is Confirmed"
    Then user should verify  the same hotel is booking or not

    Examples: 
      | userName              | Password  | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild | selectSalutation | firtstName | lastName | mobilNumber | email                   | regNo      | companyName            | companyAddress | request               | select Card Type |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 | Mr.              | Guhan      | G        |  9812093489 | guhanguhan635@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | need parking facility | Credit Card      |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 | Mr.              | Guhan      | G        |  9812093489 | guhanguhan635@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | need parking facility | Debit Card       |

  Scenario Outline: verifying all error message at OMR Branch  book hotel with Gst and special request with card without entering card details
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user search Hotel"<state>","<city>","<selectRoom>","<checkIn>","<checkOut>","<NoOfRoom>","<NoOfAdults>" and "<NoOfChild>"
    Then user should verify success message after search hotel "Select Hotel"
    And user the first hotel name and save the hotel name,price
    And user should accept the popup alert
    Then user should verify success message after select hotel name "Book Hotel"
    When user add guest deatils"<selectSalutation>","<firtstName>","<lastName>","<mobilNumber>" and "<email>" without givig any special request
    And user enter gst details"<regNo>","<companyName>" and "<companyAddress>"
    And user enter sepcial reqest"<special reqest>"
    And user select  payment options Credit/Debit/ATM Card and select submit without entering the card details
    Then user should verify the all the error message"Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date" and "Please provide your Card's security code"
