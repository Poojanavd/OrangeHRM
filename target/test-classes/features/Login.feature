Feature: Login Page features

  @valid
  Scenario Outline: login functionality
    Given user enters valid <username> and <password>
    And clicks on Login button
    Then Dashboard page is been displayed

    Examples: 
      | username | password |
      | admin    | admin123 |

  Scenario: invalid login
    Given user enters invalid <username> and <password>
    And clicks on Login button
    Then "Invalid credentials" message should be displayed

  Scenario: when username and password field left blank
    Given user keep the username and password field blank
    And clicks on Login button
    Then "Username cannot be empty" message should be displayed

  Scenario: Forgot your password is a link
    Given user is on orangeHRM login page
    Then "Forgot your password?" is a link

  Scenario Outline: verify the links for orangeHRM social sites
    Given user clicks on <socialsite> icon
    Then <link> should be open in new tab

    Examples: 
      | socialsite | link                                                                                                                                                   |
      | likendin   | https://www.linkedin.com/signup/cold-join?session_redirect=https%3A%2F%2Fwww%2Elinkedin%2Ecom%2Fgroups%3Fhome%3D%26gid%3D891077&trk=login_reg_redirect |
      | facebook   | https://www.facebook.com/OrangeHRM                                                                                                                     |
      | twitter    | https://twitter.com/orangehrm                                                                                                                          |
      | youtube    | https://www.youtube.com/c/OrangeHRMInc/videos                                                                                                          |

  Scenario: Verify the footer of the login page
    Given user is on orangeHRM login page
    Then footer should contain the below text
      """
      OrangeHRM 4.8
      © 2005 - 2021 OrangeHRM, Inc. All rights reserved.
      """

  Scenario: verify the broken links on login page
    Given user is on orangeHRM login page
    Then there should be no broken link available
