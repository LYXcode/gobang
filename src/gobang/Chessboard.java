package gobang;

public class Chessboard {
	static String lString="lin";
final int BOARD_SIZE = 15;
String [][] board;
public void initBoard() {
	
	board = new String[BOARD_SIZE][BOARD_SIZE];
	
	for(int i = 0;i<BOARD_SIZE;i++) {
		
		for(int j = 0;j<BOARD_SIZE;j++) {
			board[i][j]="ʮ";
			
		}
	}
}
public void printBoard() {
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[i].length;j++) {
			System.out.print(board[i][j]);
		}
		System.out.print("\n");
	}
	
}
public void setBoard(int posX,int posY,String chessman) {
	board[posX][posY]=chessman;
}
public String[][] getBoard() {
	
	return this.board;
	
}
}
