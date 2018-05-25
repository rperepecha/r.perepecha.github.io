Feature: Create post in VK
  As an user
  I want to create new post

  Scenario: Successful post create
    When User click on the "Что у вас нового" button
    And And fill in "Field" with "Это тест на ввод данных для поста"
    And User click on the "Отправить" button
    Then User see new created post
