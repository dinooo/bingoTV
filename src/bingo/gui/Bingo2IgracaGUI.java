package bingo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bingo2IgracaGUI {

	private JFrame frame;
	private JTextField txtImeIgraca1;
	private JTextField txtImeIgraca2;

	/**
	 * Launch the application.
	 */
	public static void startBingo2IgracaGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bingo2IgracaGUI window = new Bingo2IgracaGUI();
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
	public Bingo2IgracaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 320, 161);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblImeIgraca1 = new JLabel("Ime igrača 1:");
		lblImeIgraca1.setBounds(12, 12, 110, 15);
		frame.getContentPane().add(lblImeIgraca1);
		
		txtImeIgraca1 = new JTextField();
		txtImeIgraca1.setBounds(140, 10, 150, 19);
		frame.getContentPane().add(txtImeIgraca1);
		txtImeIgraca1.setColumns(10);
		
		JLabel lblImeIgraca2 = new JLabel("Ime igrača 2:");
		lblImeIgraca2.setBounds(12, 50, 110, 15);
		frame.getContentPane().add(lblImeIgraca2);
		
		txtImeIgraca2 = new JTextField();
		txtImeIgraca2.setBounds(140, 48, 150, 19);
		frame.getContentPane().add(txtImeIgraca2);
		txtImeIgraca2.setColumns(10);
		
		JButton btnStartIgre = new JButton("Start igre");
		btnStartIgre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Pokretanje Bingo igre
				 */

				BingoStartGUI.brIgraca3 = 1;
				
				BingoStartGUI.igrac1.setImeIgrac(txtImeIgraca1.getText());
				BingoStartGUI.igrac2.setImeIgrac(txtImeIgraca2.getText());
				BingoGUI.startGame();
				frame.dispose();
			}
		});
		btnStartIgre.setBounds(140, 79, 150, 25);
		frame.getContentPane().add(btnStartIgre);
	}

}
