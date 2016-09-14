package bingo.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bingo3IgracaGUI {

	private JFrame frame;
	private JTextField txtImeIgraca1;
	private JLabel lblImeIgraca2;
	private JTextField txtImeIgraca2;
	private JLabel lblImeIgraca3;
	private JTextField txtImeIgraca3;

	/**
	 * Launch the application.
	 */
	public static void startBingo3IgracaGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bingo3IgracaGUI window = new Bingo3IgracaGUI();
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
	public Bingo3IgracaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 305, 181);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblImeIgraca1 = new JLabel("Ime igrača 1:");
		lblImeIgraca1.setBounds(12, 12, 110, 15);
		frame.getContentPane().add(lblImeIgraca1);
		
		txtImeIgraca1 = new JTextField();
		txtImeIgraca1.setBounds(128, 10, 150, 19);
		frame.getContentPane().add(txtImeIgraca1);
		txtImeIgraca1.setColumns(10);
		
		lblImeIgraca2 = new JLabel("Ime igrača 2:");
		lblImeIgraca2.setBounds(12, 43, 110, 15);
		frame.getContentPane().add(lblImeIgraca2);
		
		txtImeIgraca2 = new JTextField();
		txtImeIgraca2.setBounds(128, 41, 150, 19);
		frame.getContentPane().add(txtImeIgraca2);
		txtImeIgraca2.setColumns(10);
		
		lblImeIgraca3 = new JLabel("Ime igrača 3:");
		lblImeIgraca3.setBounds(12, 74, 110, 15);
		frame.getContentPane().add(lblImeIgraca3);
		
		txtImeIgraca3 = new JTextField();
		txtImeIgraca3.setBounds(128, 72, 150, 19);
		frame.getContentPane().add(txtImeIgraca3);
		txtImeIgraca3.setColumns(10);
		
		JButton btnStartIgre = new JButton("Start igre");
		btnStartIgre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Pokretanje Bingo igre
				 */

				
				BingoStartGUI.igrac1.setImeIgrac(txtImeIgraca1.getText());
				BingoStartGUI.igrac2.setImeIgrac(txtImeIgraca2.getText());
				BingoStartGUI.igrac3.setImeIgrac(txtImeIgraca3.getText());
				
				BingoGUI.startGame();
				frame.dispose();
			}
		});
		btnStartIgre.setBounds(128, 103, 150, 25);
		frame.getContentPane().add(btnStartIgre);
	}
}
