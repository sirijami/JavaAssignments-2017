
public class TicTacToe {
	private Character playerMark;
	private char[][] board;

	public static void main(String[] args) {
		TicTacToe obj = new TicTacToe();	
		int[][] stepsForXVerticalWin = {{0,0},{1,2},{1,0},{2,1},{2,0},{0,1},{0,2},{0,0},{1,1},{2,2}};
		int[][] stepsForXHorizontalWin = {{0,0},{1,2},{0,1},{2,1},{0,2},{0,1},{0,2},{0,0},{1,1},{2,2}};
		int[][] stepsForXLeftToRightDiagonalWin = {{0,0},{1,2},{1,1},{2,1},{2,2},{0,1},{0,2},{0,0},{1,1},{2,2}};
		int[][] stepsForXRightToLeftWin = {{0,2},{1,2},{1,1},{2,1},{2,0},{0,1},{0,2},{0,0},{1,1},{2,2}};
		int[][] stepsForBoardFullButNoWinner = {{0,2},{0,1},{1,1},{2,0},{1,0},{0,0},{2,2},{1,2},{2,1}};

		int[][] steps = {{0,0},{1,2},{1,0},{2,1},{2,0},{0,1},{0,2},{0,0},{1,1},{2,2}};
		obj.runGame(obj, stepsForBoardFullButNoWinner);
    }
	
	public TicTacToe(){
		board = new char[3][3];
		playerMark = 'X';		
		initializeBoard();
		System.out.println("Start the game..First player 'X' can start");
		printBoard();
		System.out.println("-------------------");
		
	}
	
	public void runGame(TicTacToe obj, int steps[][]) {
		for (int i = 0; i < steps.length; i++) {
			obj.placeMark(steps[i][0], steps[i][1]);
			if (!obj.checkForWin()) {				
				obj.changePlayer();
			} else {
				System.out.println("Start a new game");
				obj.initializeBoard();
				obj.printBoard();
				System.out.println("-------------------");
			}
         }
	}
	
	public void initializeBoard() {
		for(int row=0; row < board.length ; row++){
			for(int col=0; col< board[0].length; col++) {
				board[row][col] = '*';
			}
		}		
	}
	
	public void printBoard() {
		for(int row=0; row < board.length; row++) {
			System.out.print("|");
			for(int col=0; col < board[0].length; col++){
				System.out.print( board[row][col]);			
			}
			System.out.print("|");
			System.out.println(" ");
		}
	}
	
	public boolean isBoardFull() {
		boolean isFull = true;
		for(int row = 0; row < board.length; row++) {
			for(int col =0; col < board[0].length; col++) {
				if(board[row][col] == '*') {
					isFull = false;				
				}
			}
		}
		return isFull;		
	}
	
	public boolean checkForWin() {
		if (checkForHorizontalWin()) {
			System.out.println("Horizontal win happened for player " + playerMark);
			return true;
		} else if (checkForVerticalWin()) {
			System.out.println("Vertical win happened for player " + playerMark);
			return true;
		} else if (checkForDiagonalWin()) {
			System.out.println("Diagonal win happened for player " + playerMark);
			return true;
		}
		return false;
	}
	
	public void changePlayer() {
		/* Before placing mark check for whether board if full or not */
		if (isBoardFull() == true) {
			System.out.println("Board is full..Start a new game");
			playerMark = 'O';
			//Starting new game
			initializeBoard();
		}
		if (playerMark == 'X') {
			playerMark = 'O';			
		} else {
			playerMark = 'X';
		}
	}
	
	public boolean placeMark(int row , int col) {
		System.out.println(playerMark + " plays at location (" + row + ", " + col + ")");
		if (row >= 0 && row <= 3) {
				if (col >=0 && col <=3) { 
					if (board[row][col] == '*') {
						board[row][col] = playerMark;
						printBoard();
						return true;
					} else {
					System.out.println("Place is not empty.. Can't overwrite!!");
					}				
				}
			}			
		return false;		
      }
	
	public boolean checkForHorizontalWin() {
		boolean hasWon = false;
		for (int i = 0 ; i< board.length; i++) {
			for (int j = 0 ; j < board.length - 1; j++) {
				if( (board[i][j] == board[i][j+1]) && board[i][j] != '*') {
					if(j == board.length-2) {
						hasWon = true;
					}
					continue;
				} else {
						break;
				}
			}
		}
		return hasWon;
     }	

    public boolean checkForVerticalWin() {
    	boolean hasWon = false;
    	for (int j=0; j<board.length; j++) {
    		for (int i=0; i<board.length -1; i++) {
    			if(board[i][j] == board[i+1][j] && board[i][j] != '*') {
    				if (i==board.length - 2) {
    					hasWon = true;
    				}
    				continue;
    			} else {
    				break;
    			}
    		}
    	}
    	return hasWon;
      }
	 
    public boolean checkForDiagonalWin() {
    	boolean hasWon = false;
    	// This is to check the diagonal from left to right
		for (int i = 0, j = 0 ; (i< board.length-1) && (j < board[i].length-1); i++, j++) {
			if ((board[i][j] == board[i + 1][j + 1]) && board[i][j] != '*') {
				if (j == board.length - 2) {
					hasWon = true;
				}
				continue;
			} else { 
				break;
			}
		}
		if(hasWon) {
			System.out.println("Left to right Diagonal Win for player " + playerMark);
			return true;			
		}
		
		// This checks the diagonal from right to left
		for (int i = 0, j = board[i].length -1; (i< board.length-1) && (j>0); i++, j--) {
			if ((board[i][j] == board[i + 1][j - 1]) && board[i][j] != '*') {
				if (j == board.length - 2) {
					hasWon = true;
				}
				continue;
			} else {
				break;
			}
		}
		if(hasWon) {
			System.out.println("Right to left Diagonal Win for player " + playerMark);
			return true;			
		}
		return false;	
	}
}
	


