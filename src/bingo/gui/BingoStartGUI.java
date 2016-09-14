package bingo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import bingo.klase.BingoBoard;
import bingo.klase.Igrac;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BingoStartGUI {

	/*
	 * Kreiranje igraca i Bingo table
	 */
	public static BingoBoard bingo = new BingoBoard();
	public static Igrac igrac1 = new Igrac();
	public static Igrac igrac2 = new Igrac();
	public static Igrac igrac3 = new Igrac();
	
	public static int brIgraca1 = 0;
	public static int brIgraca2 = 0;
	public static int brIgraca3 = 0;
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BingoStartGUI window = new BingoStartGUI();
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
	public BingoStartGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		/*
		 * Kreiranje Bingo Brojeva i tiketa za igrace
		 */
		bingo.generateBingo();
		igrac1.generateTiket();
		igrac2.generateTiket();
		igrac3.generateTiket();
		
		/*
		 * GUI dio
		 */
		frame = new JFrame();
		frame.setBounds(100, 100, 193, 229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBingo = new JLabel("BINGO 15/90");
		lblBingo.setBounds(41, 12, 85, 15);
		frame.getContentPane().add(lblBingo);
		
		JLabel lblOdaberiBrojIgraca = new JLabel("Odaberi broj igrača:");
		lblOdaberiBrojIgraca.setBounds(12, 38, 150, 15);
		frame.getContentPane().add(lblOdaberiBrojIgraca);
		
		JButton btnIgra = new JButton("1 igrač");
		btnIgra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Pokretanje prozora za unos imena prvog igraca
				 */
				Bingo1IgracGUI.startBingo1IgracGUI();
				frame.dispose();
			}
		});
		btnIgra.setBounds(12, 65, 150, 25);
		frame.getContentPane().add(btnIgra);
		
		JButton btnIgraa = new JButton("2 igrača");
		btnIgraa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Pokretanje prozora za unos imena prvog i drugog igraca
				 */
				Bingo2IgracaGUI.startBingo2IgracaGUI();
				frame.dispose();
			}
		});
		btnIgraa.setBounds(12, 102, 150, 25);
		frame.getContentPane().add(btnIgraa);
		
		JButton btnIgraca_1 = new JButton("3 igrača");
		btnIgraca_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Pokretanje prozora za unos imena prvog, drugog i treceg igrca
				 */
				Bingo3IgracaGUI.startBingo3IgracaGUI();
				frame.dispose();
			}
		});
		btnIgraca_1.setBounds(12, 139, 150, 25);
		frame.getContentPane().add(btnIgraca_1);
		
		
	}

}
