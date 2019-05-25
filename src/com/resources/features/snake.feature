Feature: As a snake
  I want to be able to grow

  Background:
    Given a snake exist with size 4 block at position x = 5 and y = 10.

  Scenario:
    Then after eating 10 apples the size should be 14 blocks.
    And after eating 5 apples the size should be 19 blocks.

  Scenario:
    Then it's position would be at x = 5 and y = 10.