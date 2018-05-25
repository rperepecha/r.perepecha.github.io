Feature: Delete post in VK
  As an user
  I want to delete my post

  Scenario: Successful post delete
    When User click on the "pull-down menu" button
    And User click on the "Удалить" button
    Then User see deleated post
