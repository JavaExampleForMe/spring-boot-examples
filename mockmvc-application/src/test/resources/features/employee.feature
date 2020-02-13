Feature: Check employee controller with cucumuber

  Scenario Outline: get all employees
    Given you have the controller
    When I execute the get command
    Then following 2 employees <EmpId>

    Examples:
      | EmpId |
      | 1     |
      | 2     |

  Scenario: get specific employees
    Given you have the controller
    When I execute the get command on employeeId 1
    Then employee have the following name 'firstName1'

