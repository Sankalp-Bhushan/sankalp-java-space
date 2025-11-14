LLDSnakeLadder
  ├── Main.java
  ├── Game.java
  ├── Board.java
  ├── Cell.java
  ├── Jump.java
  ├── Dice.java
  ├── Player.java

Class Relationships
Game
 ├── uses Board
 │     └── contains List<Cell>
 │             └── each Cell may have Jump (Snake/Ladder)
 ├── uses Dice
 ├── manages Queue<Player>
 └── declares Player as winner
