package gobang;

public class Judgeman {
//	int posX;
//	int posY;
//	Chessboard chessboard;
//	String chessman;
//	public Judge(int posX,int posY,Chessboard chessboard,String chessman) {
//		
//		this.posX=posX;
//		this.posY=posY;
//		this.chessboard=chessboard;
//		this.chessman=chessman;
//	}
	//判断左右方向left to right
	public Boolean leftToRight(int posX,int posY,Chessboard chessboard,String chessman) {
		
		int numL2R=0;
		for(int i=posY;i>=0;i--) {
			if (chessboard.board[posX][i].equals(chessman)) {
				numL2R++;
			}
			else {
				break;
			}
		}
		for(int i=posY+1;i<15;i++) {
			if (chessboard.board[posX][i].equals(chessman)) {
				numL2R++;
			}
			else {
				break;
			}
		}
		
		if (numL2R>=5) {
			return true;
		}
		else {
			return false;
		}
	}
	//判断上下方向 UP TO DOWN
	public boolean upToDown(int posX,int posY,Chessboard chessboard,String chessman) {
		int numU2D=0;
		for (int i = posX;i>=0; i--) {
			if (chessboard.board[i][posY].equals(chessman)) {
				numU2D++;
			}
			else {
				break;
			}
		}
		for(int i=posX+1;i<15;i++) {
			if (chessboard.board[i][posY].equals(chessman)) {
				numU2D++;
			}
			else {
				break;
			}
		}
		if (numU2D>=5) {
			return true;
		}
		else {
			return false;
		}
	}
	//判断左上到右下
	public boolean ltRutD(int posX,int posY,Chessboard chessboard,String chessman) {
		int num=0;
		for (int i = 0; i < 5; i++) {
			try {
				if (chessboard.board[posX-i][posY-i].equals(chessman)) {
					num++;
				}
				else {
					
					break;
				}
				
			} catch (Exception e) {
				break;
			}
		}
		for (int i = 1; i < 5; i++) {
			try {
				if (chessboard.board[posX+i][posY+i].equals(chessman)) {
					num++;
				}
				else {
					break;
				}
			} catch (Exception e) {
				break;
			}
			
		}
		if(num>=5) {
			return true;
		}
		else {
			return false;
		}
	}
	//判断左上到右下
	public boolean rtLutD(int posX,int posY,Chessboard chessboard,String chessman) {
		int num=0;
		for (int i = 0; i < 5; i++) {
			try {
				if (chessboard.board[posX-i][posY+i].equals(chessman)) {
					num++;
				}
				else {
					break;
				}
			} catch (Exception e) {
				
				break;
			}
		}
		for (int i = 1; i < 5; i++) {
			try {
				if (chessboard.board[posX+i][posY-i].equals(chessman)) {
					num++;
				}
				else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
		if(num>=5) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isWon(int posX,int posY,Chessboard chessboard,String chessman) {
		if(leftToRight(posX, posY, chessboard, chessman)||upToDown(posX, posY, chessboard, chessman)||ltRutD(posX, posY, chessboard, chessman)||rtLutD(posX, posY, chessboard, chessman)) {
			System.out.print(chessman+"win");
			return true;
		}
		else {
			return false;
		}
	}

}
