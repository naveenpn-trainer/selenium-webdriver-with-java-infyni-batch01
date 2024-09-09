Feature: Math Utility Subtract

  Scenario:  Subtracting two positive numbers
    Given two numbers 4 and 4
    When I sub both the numbers
    Then the result should be 0


  Scenario:  Subtract a positive and a negative number
    Given two numbers 4 and -2
    When I sub both the numbers
    Then the result should be 6