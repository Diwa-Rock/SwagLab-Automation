@CancelBooking
Feature: verifying OMR Branch Cancel Booking automation

  Scenario Outline: verifying OMR Branch hotel booking and cancel using order id
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker@3"
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
    Then user should verify success message "Booking is confirmed" and save te generated order id
    And user should verify whether the same hotel is booked
    When user navigate to my booking page
    Then user should verify the success message after navigate to booking page"Bookings"
    When user search the generated order id
    Then user should verify the same order id is displayed
    And user should  verify the same hotel is displayed
    And user should verify same hotel prize is displayed
    When user click the edit buttion checkin date"<checkIn>"
    Then user should verify success message after  edit the checkin date "Booking updated successfully"
    When user search the generated order id
    Then user should verify the same order id is displayed
    And user should  verify the same hotel is displayed
    And user should verify same hotel prize is displayed
    When user click the cancel button
    And user should accept the popup alert
    Then user should verify the success message after cancel boooking "Your booking Cancelled successfully"

    Examples: 
      | userName              | Password  | state      | city    | selectRoom | checkIn   | checkOut  | NoOfRoom | NoOfAdults | NoOfChild |
      | diwaker7708@gmail.com | Diwaker@3 | Tamil Nadu | Chennai | Luxury     | 023-06-20 | 023-06-28 | 1-One    | 2-Two      |         1 |

  Scenario Outline: verifying OMR Branch hotel booking and modify first booking
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user navigate to my booking page
    Then user should verify the success message after navigate to booking page"Bookings"
    When user click the cancel button
    And user should accept the popup alert
    Then user should verify the success message after cancel boooking "Your booking Cancelled successfully"
      | userName              | Password  |
      | diwaker7708@gmail.com | Diwaker@3 |

  Scenario Outline: verifying OMR Branch hotel booking and modify existing booking
    Given user is on the Omr Branch hotel page
    When user login "<userName>","<Password>"
    Then user should verify success affter login"Welcome Diwaker"
    When user navigate to my booking page
    Then user should verify the success message after navigate to booking page"Bookings"
    When user search the existing orderid"<orderId>"
    Then user should verify the same order id is displayed
    When user click the cancel button
    And user should accept the popup alert
    Then user should verify the success message after cancel boooking "Your booking Cancelled successfully"
      | userName               | Password   | orderId    |
      | guhanguhn635@gmail.com | Guhan1432@ | VJLPK01192 |
