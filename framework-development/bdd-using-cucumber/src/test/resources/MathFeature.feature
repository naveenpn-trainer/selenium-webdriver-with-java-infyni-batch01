Feature: Testing Simple Math Utility

Scenario:  Adding two positive numbers
  Given two numbers 4 and 4
  When I add both the numbers
  Then the result should be 8


Scenario:  Adding a positive number and a negative number
  Given two numbers 4 and -4
  When I add both the numbers
  Then the result should be 0