Feature: Login With Different Scenarios


  @PositiveLogin
  Scenario Outline:Verify login with valid credentials
    Given  user on the login page
    When user enter username "<username>"
    And user enter passcode "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page


    Examples:
      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |





  @NegativeLogin
  Scenario Outline:Verify login with valid credentials
    Given  user on the login page
    When user enter  invalid username "<username>"
    And user enter invalid passcode "<password>"
    And user click the login button
    Then verify "<message>" message should be displayed

    Examples:

      | username | password    | message                     |
      | User9    | Wrong       | Wrong username or password. |
      | Wrong    | Userpass123 | Wrong username or password. |
      | Wrong    | Wrong       | Wrong username or password. |

