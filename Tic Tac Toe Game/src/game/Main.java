package game;

import game.tictactoe;

public class Main {

	public static tictactoe board = new tictactoe();
	
	public static boolean playerTurn = true;
	public static boolean computerTurn = false;
	public static boolean playerWon = false;
	public static boolean computerWon = false;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(board.isVisible() == false){
			board.setVisible(true);
		}
		board.replay.setVisible(false);
		board.yes.setVisible(false);
		board.no.setVisible(false);
	}
	
	public static void chekforwin(){
		
		if(board.button1.getText().equals("X")){
			if(board.button2.getText().equals("X")){
				if(board.button3.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button4.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button6.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button7.getText().equals("X")){
			if(board.button8.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button1.getText().equals("X")){
			if(board.button4.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button2.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button8.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button3.getText().equals("X")){
			if(board.button6.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button1.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button9.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button3.getText().equals("X")){
			if(board.button5.getText().equals("X")){
				if(board.button7.getText().equals("X")){
					playerWon = true;
					board.TXT.setText("Player 1 Won (X).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = false;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button1.getText().equals("O")){
			if(board.button2.getText().equals("O")){
				if(board.button3.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button4.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button6.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button7.getText().equals("O")){
			if(board.button8.getText().equals("O")){
				if(board.button9.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button1.getText().equals("O")){
			if(board.button4.getText().equals("O")){
				if(board.button7.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button2.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button8.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button3.getText().equals("O")){
			if(board.button6.getText().equals("O")){
				if(board.button9.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button1.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button9.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(board.button3.getText().equals("O")){
			if(board.button5.getText().equals("O")){
				if(board.button7.getText().equals("O")){
					playerWon = false;
					board.TXT.setText("Player 2 Won (O).. Congratulations!");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
					computerWon = true;
					playerTurn = false;
					computerTurn = false;
				}
			}
		}
		
		if(playerWon == true || computerWon == true){
		}else{
			if(board.button1.getText()!= ("") & board.button2.getText()!= ("") 		
				& board.button3.getText()!= ("") & board.button4.getText()!= ("")
				& board.button5.getText()!= ("") & board.button6.getText()!= ("")
				& board.button7.getText()!= ("") & board.button8.getText()!= ("")
				& board.button9.getText()!= ("") )
			{
					board.TXT.setText("WOOO, Awosome And Smart Competition :) ");
					board.replay.setVisible(true);
					board.yes.setVisible(true);
					board.no.setVisible(true);
			}
		}
		
		
		
	}

}
