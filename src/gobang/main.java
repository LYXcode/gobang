package gobang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
public static void main(String[] arg) throws IOException {
	int posX=0;
	int posY =0;
	Judgeman judgeman = new Judgeman();
	Chessboard chessboard = new Chessboard();
    chessboard.initBoard();
	String inputString = null;
	BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	 while((inputString = bReader.readLine())!=null) {
   String[] posArrStrings = inputString.split(" ");
  try {
	  posX=Integer.parseInt(posArrStrings[0]);
	   posY=Integer.parseInt(posArrStrings[1]);
} catch (Exception e) {
	System.out.print("Please enter number!\n");
} 
  if ((posX>=15||posX<0)||(posY>=15||posY<0)) {
	System.out.print("please place on the board!\n");
	chessboard.printBoard();
	continue;
}
   chessboard.setBoard(posX, posY, Chessman.WHITE.getChessman());
   chessboard.printBoard();
   judgeman.isWon(posX, posY, chessboard, Chessman.WHITE.getChessman());
   System.out.print("Please enter number!\n");
	}
}

}