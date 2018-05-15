Feature: Pacman

  Scenario Outline: the pacman sees a fruit
    Given a pacman is created with <pointsInitial> points
    When a pacman eats a fruit that sum <points> points
    Then a pacman at the end of the action of eating the fruit is left with <endPoints> points

    Examples:
      |pointsInitial| points | endPoints |
      |      6      |    4   |     10    |


  Scenario Outline: the pacman sees a biscuit
    Given the pacman is created with <pointsInitial> points
    When the pacman eats a biscuit that sum <points> points
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

  Scenario Outline: pacman collides with a ghost weaked
    Given pacman with <pointsInitial> points and ghost weakened
    When  pacman collides with ghost weakened
    Then  pacman not dies and ghost loses the body
    Examples:
      | pointsInitial |
      |     10        |


  Scenario Outline: pacman sees a pellet
    Given the pacman with <pointsInitial> points and ghost unweakened with <ghostLife>
    When pacman eats a pellet
    Then the ghost gets weakened

    Examples:
      | pointsInitial | ghostLife |
      |        0      |     10    |

  Scenario Outline: pacman collides with a bodyless pacman
    Given pacman with <pointsInitial> points and a bodyless ghost
    When pacman collides with bodyless ghost
    Then pacman not dies

    Examples:
      | pointsInitial |
      |      10       |