Feature: Pacman

  Scenario: Pacman eats a fruit
    Given a new Pacman with zero points
    Given a new fruit with one point
    When Pacman eats a fruit
    Then Pacman has one point

  Scenario Outline: the pacman sees a biscuit
    Given the pacman is created with <pointsInitial> points
    When the pacman eats a biscuit what sum <points> points
    Then the pacman at the end of the action of eating the biscuit is left with <endPoints> points

    Examples:
      |pointsInitial| points | endPoints |
      |   10        |   3    |    13     |


    Scenario Outline: pacman collides with a ghost and dies
      Given the pacman with <pointsInitial> points and ghost unweakened
      When  the pacman collides with ghost
      Then  the pacman dies and his points become zero
      Examples:
        | pointsInitial |
        |      0        |
        |     10        |



