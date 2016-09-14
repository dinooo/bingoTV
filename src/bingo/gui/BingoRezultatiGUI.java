package bingo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class BingoRezultatiGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void startBingoRezultatiGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BingoRezultatiGUI window = new BingoRezultatiGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BingoRezultatiGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 802, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblIgrac1 = new JLabel(BingoStartGUI.igrac1.getImeIgrac());
		lblIgrac1.setBounds(12, 39, 70, 15);
		frame.getContentPane().add(lblIgrac1);



		JLabel lblJackPot1 = new JLabel("JACK POT:");
		lblJackPot1.setBounds(87, 12, 200, 15);
		frame.getContentPane().add(lblJackPot1);

		String red1 = "";
		String red2 = "";
		String red3 = "";

		for (Integer i : BingoGUI.tik1r1) {
			red1 = red1 + String.valueOf(i) + " ";
		}
		for (Integer i : BingoGUI.tik1r2) {
			red2 = red2 + String.valueOf(i) + " ";
		}
		for (Integer i : BingoGUI.tik1r3) {
			red3 = red3 + String.valueOf(i) + " ";
		}

		if(BingoGUI.tik1_15 == 1){

			JLabel lblJackpot1r1 = new JLabel("");
			lblJackpot1r1.setBounds(87, 39, 200, 15);
			lblJackpot1r1.setText(red1);
			frame.getContentPane().add(lblJackpot1r1);

			JLabel lblJackpot1r2 = new JLabel("");
			lblJackpot1r2.setBounds(87, 66, 200, 15);
			lblJackpot1r2.setText(red2);
			frame.getContentPane().add(lblJackpot1r2);

			JLabel lblJackpot1r3 = new JLabel("");
			lblJackpot1r3.setBounds(87, 93, 200, 15);
			lblJackpot1r3.setText(red3);
			frame.getContentPane().add(lblJackpot1r3);
		}

		JLabel lblDeseterac1 = new JLabel("Deseterac:");
		lblDeseterac1.setBounds(299, 12, 200, 15);
		frame.getContentPane().add(lblDeseterac1);

		if(BingoGUI.tik1_10 == 1){

			JLabel lblDeseterac1r1 = new JLabel("");
			lblDeseterac1r1.setBounds(299, 39, 200, 15);
			frame.getContentPane().add(lblDeseterac1r1);

			JLabel lblDeseterac1r2 = new JLabel("");
			lblDeseterac1r2.setBounds(299, 66, 200, 15);
			frame.getContentPane().add(lblDeseterac1r2);

			JLabel lblDeseterac1r3 = new JLabel("");
			lblDeseterac1r3.setBounds(299, 93, 200, 15);
			frame.getContentPane().add(lblDeseterac1r3);

			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r1) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r2)){
				lblDeseterac1r1.setText(red1);
				lblDeseterac1r2.setText(red2);
			}
			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r1) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r3)){
				lblDeseterac1r1.setText(red1);
				lblDeseterac1r3.setText(red3);
			}
			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r3) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r2)){
				lblDeseterac1r3.setText(red3);
				lblDeseterac1r2.setText(red2);
			}

		}


		JLabel lblPeterac = new JLabel("Peterac:");
		lblPeterac.setBounds(511, 12, 200, 15);
		frame.getContentPane().add(lblPeterac);

		if(BingoGUI.tik1_5 == 1){

			JLabel lblPeterac1r1 = new JLabel("");
			lblPeterac1r1.setBounds(511, 39, 200, 15);
			frame.getContentPane().add(lblPeterac1r1);

			JLabel lblPeterac1r2 = new JLabel("");
			lblPeterac1r2.setBounds(511, 66, 200, 15);
			frame.getContentPane().add(lblPeterac1r2);

			JLabel lblPeterac1r3 = new JLabel("");
			lblPeterac1r3.setBounds(511, 93, 200, 15);
			frame.getContentPane().add(lblPeterac1r3);

			if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r1) ){
				lblPeterac1r1.setText(red1);
			}
			else if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r2) ){
				lblPeterac1r2.setText(red2);
			}	
			if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik1r3) ){
				lblPeterac1r3.setText(red3);
			}	
		}


		/*
		 * igrac2
		 */
		JLabel lblIgrac2 = new JLabel(BingoStartGUI.igrac2.getImeIgrac());
		lblIgrac2.setBounds(12, 150, 70, 15);
		if(BingoStartGUI.brIgraca2 != 1 )
			frame.getContentPane().add(lblIgrac2);


		String red12 = "";
		String red22 = "";
		String red32 = "";

		for (Integer i : BingoGUI.tik2r1) {
			red12 = red12 + String.valueOf(i) + " ";
		}
		for (Integer i : BingoGUI.tik2r2) {
			red22 = red22 + String.valueOf(i) + " ";
		}
		for (Integer i : BingoGUI.tik2r3) {
			red32 = red32 + String.valueOf(i) + " ";
		}

		if(BingoGUI.tik2_15 == 1){

			JLabel lblJackpot2r1 = new JLabel("");
			lblJackpot2r1.setBounds(87, 150, 200, 15);
			lblJackpot2r1.setText(red12);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblJackpot2r1);

			JLabel lblJackpot2r2 = new JLabel("");
			lblJackpot2r2.setBounds(87,177, 200, 15);
			lblJackpot2r2.setText(red22);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblJackpot2r2);

			JLabel lblJackpot2r3 = new JLabel("");
			lblJackpot2r3.setBounds(87, 204, 200, 15);
			lblJackpot2r3.setText(red32);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblJackpot2r3);

		}

		if(BingoGUI.tik2_10 == 1){

			JLabel lblDeseterac2r1 = new JLabel("");
			lblDeseterac2r1.setBounds(299, 150, 200, 15);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblDeseterac2r1);

			JLabel lblDeseterac2r2 = new JLabel("");
			lblDeseterac2r2.setBounds(299, 177, 200, 15);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblDeseterac2r2);

			JLabel lblDeseterac2r3 = new JLabel("");
			lblDeseterac2r3.setBounds(299, 204, 200, 15);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblDeseterac2r3);

			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r1) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r2)){
				lblDeseterac2r1.setText(red12);
				lblDeseterac2r2.setText(red22);
			}
			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r1) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r3)){
				lblDeseterac2r1.setText(red12);
				lblDeseterac2r3.setText(red32);
			}
			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r3) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r2)){
				lblDeseterac2r3.setText(red32);
				lblDeseterac2r2.setText(red22);
			}

		}

		if(BingoGUI.tik2_5 == 1){

			JLabel lblPeterac2r1 = new JLabel("");
			lblPeterac2r1.setBounds(511, 150, 200, 15);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblPeterac2r1);

			JLabel lblPeterac2r2 = new JLabel("");
			lblPeterac2r2.setBounds(511, 177, 200, 15);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblPeterac2r2);

			JLabel lblPeterac2r3 = new JLabel("");
			lblPeterac2r3.setBounds(511, 204, 200, 15);
			if(BingoStartGUI.brIgraca2 != 1 )
				frame.getContentPane().add(lblPeterac2r3);

			if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r1) ){
				lblPeterac2r1.setText(red12);
			}
			else if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r2) ){
				lblPeterac2r2.setText(red22);
			}	
			if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik2r3) ){
				lblPeterac2r3.setText(red32);
			}	
		}


		/*
		 * igrac3
		 */
		JLabel lblIgrac3 = new JLabel(BingoStartGUI.igrac3.getImeIgrac());
		lblIgrac3.setBounds(12, 254, 70, 15);
		if(BingoStartGUI.brIgraca3 != 1 )
			frame.getContentPane().add(lblIgrac3);


		String red13 = "";
		String red23 = "";
		String red33 = "";

		for (Integer i : BingoGUI.tik3r1) {
			red13 = red13 + String.valueOf(i) + " ";
		}
		for (Integer i : BingoGUI.tik3r2) {
			red23 = red23 + String.valueOf(i) + " ";
		}
		for (Integer i : BingoGUI.tik3r3) {
			red33 = red33 + String.valueOf(i) + " ";
		}

		if(BingoGUI.tik3_15 == 1){

			JLabel lblJackpot3r1 = new JLabel("42");
			lblJackpot3r1.setBounds(87, 254, 200, 15);
			lblJackpot3r1.setText(red13);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblJackpot3r1);

			JLabel lblJackpot3r2 = new JLabel("43");
			lblJackpot3r2.setBounds(87,281, 200, 15);
			lblJackpot3r2.setText(red23);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblJackpot3r2);

			JLabel lblJackpot3r3 = new JLabel("43");
			lblJackpot3r3.setBounds(87, 300, 200, 15);
			lblJackpot3r3.setText(red33);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblJackpot3r3);

		}

		if(BingoGUI.tik3_10 == 1){

			JLabel lblDeseterac3r1 = new JLabel("1");
			lblDeseterac3r1.setBounds(299, 254, 200, 15);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblDeseterac3r1);

			JLabel lblDeseterac3r2 = new JLabel("2");
			lblDeseterac3r2.setBounds(299, 281, 200, 15);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblDeseterac3r2);

			JLabel lblDeseterac3r3 = new JLabel("3");
			lblDeseterac3r3.setBounds(299, 300, 200, 15);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblDeseterac3r3);

			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r1) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r2)){
				lblDeseterac3r1.setText(red13);
				lblDeseterac3r2.setText(red23);
			}
			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r1) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r3)){
				lblDeseterac3r1.setText(red13);
				lblDeseterac3r3.setText(red33);
			}
			if(		BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r3) && 
					BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r2)){
				lblDeseterac3r3.setText(red33);
				lblDeseterac3r2.setText(red23);
			}

		}



		if(BingoGUI.tik3_5 == 1){

			JLabel lblPeterac3r1 = new JLabel("");
			lblPeterac3r1.setBounds(511, 254, 200, 15);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblPeterac3r1);

			JLabel lblPeterac3r2 = new JLabel("");
			lblPeterac3r2.setBounds(511, 281, 200, 15);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblPeterac3r2);

			JLabel lblPeterac3r3 = new JLabel("");
			lblPeterac3r3.setBounds(511, 300, 200, 15);
			if(BingoStartGUI.brIgraca3 != 1 )
				frame.getContentPane().add(lblPeterac3r3);

			if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r1) ){
				lblPeterac3r1.setText(red13);
			}
			else if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r2) ){
				lblPeterac3r2.setText(red23);
			}	
			if(BingoStartGUI.bingo.getBingoBrojevi().containsAll(BingoGUI.tik3r3) ){
				lblPeterac3r3.setText(red33);
			}	
		}



	}
}
