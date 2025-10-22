Feature: Basic Calculator Operations
  As a user
  I want to perform basic arithmetic operations
  So that I can get correct results

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 3
    Then the result should be 8

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 5 from 10
    Then the result should be 5

  Scenario Outline: Multiply two numbers
    Given I have a calculator
    When I multiply <num1> by <num2>
    Then the result should be <expectedResult>
    Examples:
      | num1 | num2 | expectedResult |
      | 2    | 3    | 6              |
      | 4    | 5    | 20             |