Feature: Parallel10 Group1

  Scenario Outline: Scenario10 in - Parallel10 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 1000          | true   |
      | 30           | true   |

