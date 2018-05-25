Feature: Edit post in VK
  As an user
  I want to edit my post


  Background: User navigates to main page
    Given User is on the "Main" page on URL "www.vk.com"


  Scenario: Successful edit post
    When User click on the "pull-down menu" button 
    And Click on the "Редактировать " button
    And User fill in "В строке ввода текста" with "Измененный текст"
    Then And user click on the "Отправить" button
