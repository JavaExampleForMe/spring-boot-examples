Feature: Parallel8 Group1

  Scenario Outline: Scenario1 in - Parallel8 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 300          | true   |
      | 810           | true   |

