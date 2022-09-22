@regression
Feature: US#1 - Create Task
  As a ToDo App user
  I should be able to create a task
  So I can manage my tasks

  Background:
    Given Avenue Code QA Test site is open
    And the ToDo user enters a valid username and password
    Then My Tasks link should appear on the NavBar

  Scenario: 1.Create Task (Happy path)
    Given the ToDo user navigates to My Tasks
    When the ToDo user type new task name "Valid task"
    Then Task with text "Valid task" should be created

  Scenario: 2.The user should see a message on the top part saying that list belongs to the logged user (Bug-893)
    When the ToDo user navigates to My Tasks
    Then "Hey Roy, this is your todo list for today:" tittle should appear

  Scenario Outline: 3.The task should require at least three characters so the user can enter it (Bug-894)
    Given the ToDo user navigates to My Tasks
    When the ToDo user type new task name <Name>
    Then Task with text <Name> should not be created
    Examples:
      | Name |
      | "a"  |
      | "ab" |

  Scenario: 4.The task name should not allows empty characters or blank spaces (Bug-895)
    Given the ToDo user navigates to My Tasks
    When the ToDo user type new task name " "
    Then Task with text "Empty" should not be created

  Scenario: 5.The task name should not allow more than 250 characters (Bug-900)
    Given the ToDo user navigates to My Tasks
    When the ToDo user type new task name "TestFailed!Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed volutpat sapien nisi, sit amet condimentum quam ornare sed. Mauris eu congue sapien, sit amet pharetra massa. Nulla hendrerit libero in nulla molestie vestibulum. Nulla venenatis at"
    Then Task with text "TestFailed!" should not be created