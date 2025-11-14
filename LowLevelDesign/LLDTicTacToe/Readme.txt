LLDTicTacToe
  ├── Main.java
  ├── TicTacToeGame.java
  ├── Model
  │    ├── Board.java
  │    ├── PieceType.java
  │    ├── Player.java
  │    ├── PlayingPiece.java
  │    ├── PlayingPieceX.java
  │    ├── PlayingPieceO.java
 
TicTacToeGame
 ├── uses Board
 │ └── contains PieceType[][] boardMatrix
 ├── manages Queue<Player> (for turns)
 │ └── each Player has PlayingPiece
 │ ├── which extends PlayingPieceX or PlayingPieceO
 │ └── each holds a PieceType (X or O)
 └── controls game flow — initialize, play turns, and check winner

Board
 ├── uses PieceType to represent symbols on cells
 ├── provides methods for adding pieces and checking winner
 └── used by TicTacToeGame

Player
 ├── has String name
 └── has PlayingPiece (X or O)
 
PlayingPiece (abstract)
 ├── has PieceType pieceType
 ├── extended by PlayingPieceX and PlayingPieceO
 │ ├── both define their own PieceType (X / O)
 │ └── used by Player
 
Main
 └── creates TicTacToeGame and starts the game