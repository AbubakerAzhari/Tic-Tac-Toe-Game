package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class tictactoe extends JFrame{

	Main main = new Main();
	
	public JButton button1= new JButton();
	public JButton button2= new JButton();
	public JButton button3= new JButton();
	public JButton button4= new JButton();
	public JButton button5= new JButton();
	public JButton button6= new JButton();
	public JButton button7= new JButton();
	public JButton button8= new JButton();
	public JButton button9= new JButton();
	public JTextField TXT= new JTextField();
	public JLabel welcome = new JLabel();
	public JLabel tictac = new JLabel();
	public JLabel replay = new JLabel();
	public JLabel abu = new JLabel();
	public JButton yes = new JButton();
	public JButton no = new JButton();
	public JLabel number = new JLabel();
	
	
	public tictactoe(){
		initcomponents();
	}
	
	
	public void initcomponents(){
	
		welcome.setText("Welcome to Tic Tac Toe game.. Have Fun!");
		welcome.setForeground(new Color(10,20 ,100));
		welcome.setFont(new Font("Tahoma",Font.BOLD, 13) );
		
		tictac.setText("Tic Tac Toe");
		tictac.setFont(new Font("Tahoma",Font.BOLD, 15) );
		
		TXT.setFont(new Font("Tahoma",Font.BOLD, 14) );
		TXT.setForeground(new Color(20,20 ,100));
		TXT.setHorizontalAlignment(JTextField.CENTER);
		
		replay.setText("Do You Want To Play Again? Yes Or No.. ");
		replay.setForeground(new Color(10,20 ,100));
		replay.setFont(new Font("Tahoma",Font.BOLD, 13) );
		replay.setHorizontalAlignment(JLabel.CENTER);
		
		abu.setText("THE01 By Abubaker Azhari ");
		abu.setForeground(new Color(100,10,10));
		abu.setHorizontalAlignment(JLabel.CENTER);
		
		yes.setText("Yes");
		yes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				yesActionperformed(e);
			}
		});
		
		no.setText("No");
		no.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				noActionperformed(e);
			}
		});
		
		setTitle("Tic Tac Toe");
		Container container = getContentPane();
		
		button1.setText("");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button1ActionPerformed(e);
			}
		});
		
		button2.setText("");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button2ActionPerformed(e);
			}
		});
		
		button3.setText("");
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button3ActionPerformed(e);
			}
		});
		
		button4.setText("");
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button4ActionPerformed(e);
			}
		});
		
		button5.setText("");
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button5ActionPerformed(e);
			}
		});
		
		button6.setText("");
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button6ActionPerformed(e);
			}
		});
		
		button7.setText("");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button7ActionPerformed(e);
			}
		});
		
		button8.setText("");
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button8ActionPerformed(e);
			}
		});
		
		button9.setText("");
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				button9ActionPerformed(e);
			}
		});
		
		
		GroupLayout contentlayout = new GroupLayout(container);
		container.setLayout(contentlayout);
		
		contentlayout.setHorizontalGroup(contentlayout.createSequentialGroup()
				.addGroup(contentlayout.createSequentialGroup()
						.addContainerGap(30,Short.MAX_VALUE)
						.addGroup(contentlayout.createParallelGroup()
								.addGroup(contentlayout.createSequentialGroup()
										.addContainerGap(115,Short.MAX_VALUE)
										.addComponent(tictac, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(115,Short.MAX_VALUE))
								.addGroup(contentlayout.createSequentialGroup()
										.addContainerGap(25,Short.MAX_VALUE)
										.addComponent(welcome,GroupLayout.PREFERRED_SIZE, 280,GroupLayout.PREFERRED_SIZE)
										.addContainerGap(25,Short.MAX_VALUE))
								.addGroup(contentlayout.createSequentialGroup()
										.addComponent(button1,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(button2,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(button3,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addGroup(contentlayout.createSequentialGroup()
										.addComponent(button4,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(button5,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(button6,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addGroup(contentlayout.createSequentialGroup()
										.addComponent(button7,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(button8,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(button9,GroupLayout.PREFERRED_SIZE,100,GroupLayout.PREFERRED_SIZE))
								.addComponent(TXT, GroupLayout.PREFERRED_SIZE, 330,GroupLayout.PREFERRED_SIZE )
								.addGroup(contentlayout.createSequentialGroup()
										.addComponent(replay,GroupLayout.PREFERRED_SIZE,330,GroupLayout.PREFERRED_SIZE))
								.addGroup(contentlayout.createSequentialGroup()
										.addContainerGap(55,Short.MAX_VALUE)
										.addComponent(yes, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(no, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(55,Short.MAX_VALUE))
								.addComponent(abu,GroupLayout.PREFERRED_SIZE,330,GroupLayout.PREFERRED_SIZE)
								.addComponent(number,GroupLayout.PREFERRED_SIZE,330,GroupLayout.PREFERRED_SIZE))
						.addContainerGap(30,Short.MAX_VALUE)));
		
		
		contentlayout.setVerticalGroup(contentlayout.createParallelGroup()
				.addGroup(contentlayout.createSequentialGroup()
				      .addContainerGap(30,Short.MAX_VALUE)
				      .addGroup(contentlayout.createSequentialGroup()
				    		  .addComponent(tictac, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				    		  .addContainerGap(10,Short.MAX_VALUE)
				    		  .addComponent(welcome,GroupLayout.PREFERRED_SIZE, 30,GroupLayout.PREFERRED_SIZE)
				    		  .addContainerGap(30,Short.MAX_VALUE)
				    		  .addGroup(contentlayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    				  .addComponent(button1,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(button2,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(button3,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
				    		  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				    		  .addGroup(contentlayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    				  .addComponent(button4,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(button5,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(button6,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
				    		  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				    		  .addGroup(contentlayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    				  .addComponent(button7,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(button8,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(button9,GroupLayout.PREFERRED_SIZE,40,GroupLayout.PREFERRED_SIZE))
				    		  .addContainerGap(40,Short.MAX_VALUE)
				    		  .addComponent(TXT, GroupLayout.PREFERRED_SIZE, 30,GroupLayout.PREFERRED_SIZE)
				    		  .addContainerGap(30,Short.MAX_VALUE)
				    		  .addGroup(contentlayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    				  .addComponent(replay,GroupLayout.PREFERRED_SIZE,30,GroupLayout.PREFERRED_SIZE))
				    		  .addGroup(contentlayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    				  .addComponent(yes, GroupLayout.PREFERRED_SIZE,30,GroupLayout.PREFERRED_SIZE)
				    				  .addComponent(no, GroupLayout.PREFERRED_SIZE,30,GroupLayout.PREFERRED_SIZE))
				    		  .addContainerGap(40,Short.MAX_VALUE)
				    		  .addComponent(abu, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				    		  .addComponent(number,GroupLayout.PREFERRED_SIZE,20,GroupLayout.PREFERRED_SIZE))
				      .addContainerGap(10,Short.MAX_VALUE)));
		
		
		pack();
		setLocationRelativeTo(getOwner());
	}
	
	private void button1ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button1.getText().equals("")){
				if(main.playerTurn == true){
					button1.setText("X");
					button1.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button1.setText("O");
					button1.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}
	}
	
	private void button2ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button2.getText().equals("")){
				if(main.playerTurn == true){
					button2.setText("X");
					button2.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button2.setText("O");
					button2.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}	
	}
	
	private void button3ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button3.getText().equals("")){
				if(main.playerTurn == true){
					button3.setText("X");
					button3.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button3.setText("O");
					button3.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}
	}
	
	private void button4ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button4.getText().equals("")){
				if(main.playerTurn == true){
					button4.setText("X");
					button4.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button4.setText("O");
					button4.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}
	}
	
	private void button5ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button5.getText().equals("")){
				if(main.playerTurn == true){
					button5.setText("X");
					button5.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button5.setText("O");
					button5.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}
	}
	
	private void button6ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button6.getText().equals("")){
				if(main.playerTurn == true){
					button6.setText("X");
					button6.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button6.setText("O");
					button6.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}
	}
	
	private void button7ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button7.getText().equals("")){
				if(main.playerTurn == true){
					button7.setText("X");
					button7.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
					
				}else{
					button7.setText("O");
					button7.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
					
				}
			}
		}
	}
	
	private void button8ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button8.getText().equals("")){
				if(main.playerTurn == true){
					button8.setText("X");
					button8.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
				}else{
					button8.setText("O");
					button8.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
				}
			}
		}
	}
	
	private void button9ActionPerformed(ActionEvent e){
		if(main.playerWon == false & main.computerWon == false){
			if(button9.getText().equals("")){
				if(main.playerTurn == true){
					button9.setText("X");
					button9.setForeground(Color.BLUE);
					main.playerTurn = false;
					TXT.setText("Now Player 2 Turn");
					main.chekforwin();
				}else{
					button9.setText("O");
					button9.setForeground(Color.red);
					main.playerTurn = true;
					TXT.setText("Now Player 1 Turn");
					main.chekforwin();
				}
			}
		}
	}
	
	private void yesActionperformed(ActionEvent e){
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
		main.playerTurn = true;
		main.computerTurn = false;
		main.computerWon = false;
		main.playerWon = false;
		TXT.setText("");
		replay.setVisible(false);
		yes.setVisible(false);
		no.setVisible(false);
	}
	
	private void noActionperformed(ActionEvent e){
		System.exit(0);
	}

}
