package bingo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bingo1IgracGUI {

	private JFrame frame;
	private JTextField txtImeIgraca1;
	private JButton btnStartIgre;

	/**
	 * Launch the application.
	 */
	public static void startBingo1IgracGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bingo1IgracGUI window = new Bingo1IgracGUI();
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
	public Bingo1IgracGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 305, 117);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImeIgraca1 = new JLabel("Ime igrača:");
		lblImeIgraca1.setBounds(12, 12, 87, 15);
		frame.getContentPane().add(lblImeIgraca1);
		
		txtImeIgraca1 = new JTextField();
		txtImeIgraca1.setBounds(117, 10, 150, 19);
		frame.getContentPane().add(txtImeIgraca1);
		txtImeIgraca1.setColumns(10);
		
		btnStartIgre = new JButton("Start igre");
		btnStartIgre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Pokretanje Bingo igre
				 */
				BingoStartGUI.brIgraca2 = 1;
				BingoStartGUI.brIgraca3 = 1;
				
				BingoStartGUI.igrac1.setImeIgrac(txtImeIgraca1.getText());
				BingoGUI.startGame();
				frame.dispose();
			}
		});
		btnStartIgre.setBounds(117, 41, 150, 25);
		frame.getContentPane().add(btnStartIgre);
	}
}
