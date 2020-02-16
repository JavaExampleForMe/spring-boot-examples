Feature: Parallel4 Group1

  Scenario Outline: Scenario1 in - Parallel4 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 400         | true   |
      | 100          | true   |
      | 200          | true   |
      | 40           | true   |

