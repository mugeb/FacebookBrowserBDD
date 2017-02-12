Feature: CreateGroup
  Creates a group in Facebook Browser

  Scenario: Creates a group in Facebook
    Given Bojo opens the Facebook in Google Chrome
    And Bojo logs in with xxxxxxxxxx@gmail.com and xxxxxxxxxxxxx
    And Bojo clicks Account Settings button
    Then Bojo clicks Create Group button
    And Bojo names the group as Bojo Tester Team
    And Bojo adds an email of a friend which is xxxxxxxxxxxx@gmail.com
    And Bojo clicks the privacy settings button
    Then Bojo sets the group privacy as Secret Group
    And Bojo clicks Create button
    Then Bojo choose an icon Bear and clicks OK
    And Bojo checks if the group has been created successfully
    And Bojo write a Welcome post: Welcome to our secret group!

