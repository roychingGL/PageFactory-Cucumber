@regression
Feature: US#2 - Create SubTask
  As a ToDo App user
  I should be able to create a subtask
  So I can break down my tasks into smaller pieces

  Background:
    Given Avenue Code QA Test site is open
    And the ToDo user enters a valid username and password
    Then My Tasks link should appear on the NavBar
    And the ToDo user navigates to My Tasks

  Scenario: 1. Create Subtask (Happy path)
    Given the ToDo user select Manage Subtasks button of the first task on the list
    And Modal dialog should be open
    When the ToDo user type new subtask name "Valid Description"
    And the ToDo user type "12/31/2022" Due Date
    And the ToDo user selects Add
    Then Subtask with text "Valid Description" should be created

  Scenario: 2. Task description should be read-only (Bug-896)
    When the ToDo user select Manage Subtasks button of the first task on the list
    Then Modal dialog should be open
    And Task description should not be editable

  Scenario: 3. SubTask Description should not allows more than 250 characters (Bug-897)
    Given the ToDo user select Manage Subtasks button of the first task on the list
    And Modal dialog should be open
    When the ToDo user type new subtask name "TestFailed!Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed volutpat sapien nisi, sit amet condimentum quam ornare sed. Mauris eu congue sapien, sit amet pharetra massa. Nulla hendrerit libero in nulla molestie vestibulum. Nulla venenatis at"
    And the ToDo user selects Add
    Then Subtask with text "TestFailed!" should not be created

  Scenario Outline: 4. Subtask due date should have MM/dd/yyyy format (Bug-898)
    Given the ToDo user select Manage Subtasks button of the first task on the list
    And Modal dialog should be open
    And the ToDo user type new subtask name "SubTask test description"
    When the ToDo user type <Example> Due Date
    And the ToDo user selects Add
    Then Subtask with text "SubTask test description" should not be created
    Examples:
      | Example      |
      | "a"          |
      | "15/35/2021" |

  Scenario: 5. Task Description and Due Date should be required fields (Bug-899)
    Given the ToDo user select Manage Subtasks button of the first task on the list
    And Modal dialog should be open
    When the ToDo user selects Add
    Then Subtask with text "empty" should not be created