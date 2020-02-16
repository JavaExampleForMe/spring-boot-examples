Feature: Parallel1 Group1

  Scenario Outline: Scenario1 in - Parallel1 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 10           | true   |
      | 100         | true   |

  Scenario Outline: Scenario2 in - Parallel1 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 10           | true   |
      | 100         | true   |
      | 200          | true   |
      | 400          | true   |

