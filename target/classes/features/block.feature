Feature: As a block
  I want to be able to interact with other existing blocks.

  Background:
    Given a block with position x = 5 and y = 5.

  Scenario:
    Then overlapping blocks at position x = 5 and y = 5 will return true.