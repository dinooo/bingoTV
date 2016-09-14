package bingo.gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.Timer;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class BingoGUI {

	private JFrame frame;
	static int rBr = 0;
	/*
	 * kreiranje 3 arrayliste, svaka predstavlja jedan redak na tiketu
	 */
	public static ArrayList<Integer> tik1r1 = new ArrayList<>();
	public static ArrayList<Integer> tik1r2 = new ArrayList<>();
	public static ArrayList<Integer> tik1r3 = new ArrayList<>();

	public static ArrayList<Integer> tik2r1 = new ArrayList<>();
	public static ArrayList<Integer> tik2r2 = new ArrayList<>();
	public static ArrayList<Integer> tik2r3 = new ArrayList<>();

	public static ArrayList<Integer> tik3r1 = new ArrayList<>();
	public static ArrayList<Integer> tik3r2 = new ArrayList<>();
	public static ArrayList<Integer> tik3r3 = new ArrayList<>();

	/**
	 * kontrolne varijable za dobitak:
	 */
	//prvi tiket
	public static int tik1_5 = 0;
	public static int tik1_10 = 0;
	public static int tik1_15 = 0;
	//drugi tiket
	public static int tik2_5 = 0;
	public static int tik2_10 = 0;
	public static int tik2_15 = 0;
	//treci tiket
	public static int tik3_5 = 0;
	public static int tik3_10 = 0;
	public static int tik3_15 = 0;


	final JLabel lblPoz01 = new JLabel("01");
	final JLabel lblPoz02 = new JLabel("02");
	final JLabel lblPoz03 = new JLabel("03");
	final JLabel lblPoz04 = new JLabel("04");
	final JLabel lblPoz05 = new JLabel("05");
	final JLabel lblPoz06 = new JLabel("06");
	final JLabel lblPoz07 = new JLabel("07");
	final JLabel lblPoz08 = new JLabel("08");
	final JLabel lblPoz09 = new JLabel("09");
	final JLabel lblPoz10 = new JLabel("10");
	final JLabel lblPoz11 = new JLabel("11");
	final JLabel lblPoz12 = new JLabel("12");
	final JLabel lblPoz13 = new JLabel("13");
	final JLabel lblPoz14 = new JLabel("14");
	final JLabel lblPoz15 = new JLabel("15");
	final JLabel lblPoz16 = new JLabel("16");
	final JLabel lblPoz17 = new JLabel("17");
	final JLabel lblPoz18 = new JLabel("18");
	final JLabel lblPoz19 = new JLabel("19");
	final JLabel lblPoz20 = new JLabel("20");
	final JLabel lblPoz21 = new JLabel("21");
	final JLabel lblPoz22 = new JLabel("22");
	final JLabel lblPoz23 = new JLabel("23");
	final JLabel lblPoz24 = new JLabel("24");
	final JLabel lblPoz25 = new JLabel("25");
	final JLabel lblPoz26 = new JLabel("26");
	final JLabel lblPoz27 = new JLabel("27");
	final JLabel lblPoz28 = new JLabel("28");
	final JLabel lblPoz29 = new JLabel("29");
	final JLabel lblPoz30 = new JLabel("30");
	final JLabel lblPoz31 = new JLabel("31");
	final JLabel lblPoz32 = new JLabel("32");
	final JLabel lblPoz33 = new JLabel("33");
	final JLabel lblPoz34 = new JLabel("34");
	final JLabel lblPoz35 = new JLabel("35");
	final JLabel lblPoz36 = new JLabel("36");
	final JLabel lblPoz37 = new JLabel("37");
	final JLabel lblPoz38 = new JLabel("38");
	final JLabel lblPoz39 = new JLabel("39");
	final JLabel lblPoz40 = new JLabel("40");
	final JLabel lblPoz41 = new JLabel("41");
	final JLabel lblPoz42 = new JLabel("42");
	final JLabel lblPoz43 = new JLabel("43");
	final JLabel lblPoz44 = new JLabel("44");
	final JLabel lblPoz45 = new JLabel("45");
	final JLabel lblPoz46 = new JLabel("46");
	final JLabel lblPoz47 = new JLabel("47");
	final JLabel lblPoz48 = new JLabel("48");
	final JLabel lblPoz49 = new JLabel("49");
	final JLabel lblPoz50 = new JLabel("50");
	final JLabel lblPoz51 = new JLabel("51");
	final JLabel lblPoz52 = new JLabel("52");
	final JLabel lblPoz53 = new JLabel("53");
	final JLabel lblPoz54 = new JLabel("54");
	final JLabel lblPoz55 = new JLabel("55");
	final JLabel lblPoz56 = new JLabel("56");
	final JLabel lblPoz57 = new JLabel("57");
	final JLabel lblPoz58 = new JLabel("58");
	final JLabel lblPoz59 = new JLabel("59");
	final JLabel lblPoz60 = new JLabel("60");
	final JLabel lblPoz61 = new JLabel("61");
	final JLabel lblPoz62 = new JLabel("62");
	final JLabel lblPoz63 = new JLabel("63");
	final JLabel lblPoz64 = new JLabel("64");
	final JLabel lblPoz65 = new JLabel("65");
	final JLabel lblPoz66 = new JLabel("66");
	final JLabel lblPoz67 = new JLabel("67");
	final JLabel lblPoz68 = new JLabel("68");
	final JLabel lblPoz69 = new JLabel("69");
	final JLabel lblPoz70 = new JLabel("70");
	final JLabel lblPoz71 = new JLabel("71");
	final JLabel lblPoz72 = new JLabel("72");
	final JLabel lblPoz73 = new JLabel("73");
	final JLabel lblPoz74 = new JLabel("74");
	final JLabel lblPoz75 = new JLabel("75");
	final JLabel lblPoz76 = new JLabel("76");
	final JLabel lblPoz77 = new JLabel("77");
	final JLabel lblPoz78 = new JLabel("78");
	final JLabel lblPoz79 = new JLabel("79");
	final JLabel lblPoz80 = new JLabel("80");
	final JLabel lblPoz81 = new JLabel("81");
	final JLabel lblPoz82 = new JLabel("82");
	final JLabel lblPoz83 = new JLabel("83");
	final JLabel lblPoz84 = new JLabel("84");
	final JLabel lblPoz85 = new JLabel("85");
	final JLabel lblPoz86 = new JLabel("86");
	final JLabel lblPoz87 = new JLabel("87");
	final JLabel lblPoz88 = new JLabel("88");
	final JLabel lblPoz89 = new JLabel("89");
	final JLabel lblPoz90 = new JLabel("90");

	//prvi tiket
	final JLabel lblTik1_r1_01_09 = new JLabel("");
	final JLabel lblTik1_r1_10_19 = new JLabel("");
	final JLabel lblTik1_r1_20_29 = new JLabel("");
	final JLabel lblTik1_r1_30_39 = new JLabel("");
	final JLabel lblTik1_r1_40_49 = new JLabel("");
	final JLabel lblTik1_r1_50_59 = new JLabel("");
	final JLabel lblTik1_r1_60_69 = new JLabel("");
	final JLabel lblTik1_r1_70_79 = new JLabel("");
	final JLabel lblTik1_r1_80_90 = new JLabel("");

	final JLabel lblTik1_r2_01_09 = new JLabel("");
	final JLabel lblTik1_r2_10_19 = new JLabel("");
	final JLabel lblTik1_r2_20_29 = new JLabel("");
	final JLabel lblTik1_r2_30_39 = new JLabel("");
	final JLabel lblTik1_r2_40_49 = new JLabel("");
	final JLabel lblTik1_r2_50_59 = new JLabel("");
	final JLabel lblTik1_r2_60_69 = new JLabel("");
	final JLabel lblTik1_r2_70_79 = new JLabel("");
	final JLabel lblTik1_r2_80_90 = new JLabel("");

	final JLabel lblTik1_r3_01_09 = new JLabel("");
	final JLabel lblTik1_r3_10_19 = new JLabel("");
	final JLabel lblTik1_r3_20_29 = new JLabel("");
	final JLabel lblTik1_r3_30_39 = new JLabel("");
	final JLabel lblTik1_r3_40_49 = new JLabel("");
	final JLabel lblTik1_r3_50_59 = new JLabel("");
	final JLabel lblTik1_r3_60_69 = new JLabel("");
	final JLabel lblTik1_r3_70_79 = new JLabel("");
	final JLabel lblTik1_r3_80_90 = new JLabel("");

	//drugi tiket
	final JLabel lblTiket2_r1_01_09 = new JLabel("");
	final JLabel lblTiket2_r1_10_19 = new JLabel("");
	final JLabel lblTiket2_r1_20_29 = new JLabel("");
	final JLabel lblTiket2_r1_30_39 = new JLabel("");
	final JLabel lblTiket2_r1_40_49 = new JLabel("");
	final JLabel lblTiket2_r1_50_59 = new JLabel("");
	final JLabel lblTiket2_r1_60_69 = new JLabel("");
	final JLabel lblTiket2_r1_70_79 = new JLabel("");
	final JLabel lblTiket2_r1_80_90 = new JLabel("");

	final JLabel lblTiket2_r2_01_09 = new JLabel("");
	final JLabel lblTiket2_r2_10_19 = new JLabel("");
	final JLabel lblTiket2_r2_20_29 = new JLabel("");
	final JLabel lblTiket2_r2_30_39 = new JLabel("");
	final JLabel lblTiket2_r2_40_49 = new JLabel("");
	final JLabel lblTiket2_r2_50_59 = new JLabel("");
	final JLabel lblTiket2_r2_60_69 = new JLabel("");
	final JLabel lblTiket2_r2_70_79 = new JLabel("");
	final JLabel lblTiket2_r2_80_90 = new JLabel("");

	final JLabel lblTiket2_r3_01_09 = new JLabel("");
	final JLabel lblTiket2_r3_10_19 = new JLabel("");
	final JLabel lblTiket2_r3_20_29 = new JLabel("");
	final JLabel lblTiket2_r3_30_39 = new JLabel("");
	final JLabel lblTiket2_r3_40_49 = new JLabel("");
	final JLabel lblTiket2_r3_50_59 = new JLabel("");
	final JLabel lblTiket2_r3_60_69 = new JLabel("");
	final JLabel lblTiket2_r3_70_79 = new JLabel("");
	final JLabel lblTiket2_r3_80_90 = new JLabel("");

	//treci tiket
	final JLabel lblTikett3_r1_01_09 = new JLabel("");
	final JLabel lblTikett3_r1_10_19 = new JLabel("");
	final JLabel lblTikett3_r1_20_29 = new JLabel("");
	final JLabel lblTikett3_r1_30_39 = new JLabel("");
	final JLabel lblTikett3_r1_40_49 = new JLabel("");
	final JLabel lblTikett3_r1_50_59 = new JLabel("");
	final JLabel lblTikett3_r1_60_69 = new JLabel("");
	final JLabel lblTikett3_r1_70_79 = new JLabel("");
	final JLabel lblTikett3_r1_80_90 = new JLabel("");

	final JLabel lblTikett3_r2_01_09 = new JLabel("");
	final JLabel lblTikett3_r2_10_19 = new JLabel("");
	final JLabel lblTikett3_r2_20_29 = new JLabel("");
	final JLabel lblTikett3_r2_30_39 = new JLabel("");
	final JLabel lblTikett3_r2_40_49 = new JLabel("");
	final JLabel lblTikett3_r2_50_59 = new JLabel("");
	final JLabel lblTikett3_r2_60_69 = new JLabel("");
	final JLabel lblTikett3_r2_70_79 = new JLabel("");
	final JLabel lblTikett3_r2_80_90 = new JLabel("");

	final JLabel lblTikett3_r3_01_09 = new JLabel("");
	final JLabel lblTikett3_r3_10_19 = new JLabel("");
	final JLabel lblTikett3_r3_20_29 = new JLabel("");
	final JLabel lblTikett3_r3_30_39 = new JLabel("");
	final JLabel lblTikett3_r3_40_49 = new JLabel("");
	final JLabel lblTikett3_r3_50_59 = new JLabel("");
	final JLabel lblTikett3_r3_60_69 = new JLabel("");
	final JLabel lblTikett3_r3_70_79 = new JLabel("");
	final JLabel lblTikett3_r3_80_90 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void startGame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BingoGUI window = new BingoGUI();
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
	public BingoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 677);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);




		/*
		 * kreiranje okvira specificne boje
		 */
		Border ovkirPlavi = BorderFactory.createLineBorder(Color.blue, 1);

		/*
		 * INICIJALIZACIJA PLOCE ZA PRIKAZ IZVUCENIH BROJEVA
		 */
		/*
		 * pozicija 1. izvucenog broja
		 */
		lblPoz01.setBounds(12, 12, 30, 30);
		lblPoz01.setBorder(ovkirPlavi);

		lblPoz02.setBounds(12, 54, 30, 30);
		lblPoz02.setBorder(ovkirPlavi);

		lblPoz03.setBounds(12, 96, 30, 30);
		lblPoz03.setBorder(ovkirPlavi);

		lblPoz04.setBounds(12, 138, 30, 30);
		lblPoz04.setBorder(ovkirPlavi);

		lblPoz05.setBounds(12, 180, 30, 30);
		lblPoz05.setBorder(ovkirPlavi);

		lblPoz06.setBounds(12, 222, 30, 30);
		lblPoz06.setBorder(ovkirPlavi);

		lblPoz07.setBounds(12, 264, 30, 30);
		lblPoz07.setBorder(ovkirPlavi);

		lblPoz08.setBounds(12, 306, 30, 30);
		lblPoz08.setBorder(ovkirPlavi);

		lblPoz09.setBounds(12, 348, 30, 30);
		lblPoz09.setBorder(ovkirPlavi);

		lblPoz10.setBounds(12, 390, 30, 30);
		lblPoz10.setBorder(ovkirPlavi);

		lblPoz11.setBounds(54, 12, 30, 30);
		lblPoz11.setBorder(ovkirPlavi);

		lblPoz12.setBounds(54, 54, 30, 30);
		lblPoz12.setBorder(ovkirPlavi);

		lblPoz13.setBounds(54, 96, 30, 30);
		lblPoz13.setBorder(ovkirPlavi);

		lblPoz14.setBounds(54, 138, 30, 30);
		lblPoz14.setBorder(ovkirPlavi);

		lblPoz15.setBounds(54, 180, 30, 30);
		lblPoz15.setBorder(ovkirPlavi);

		lblPoz16.setBounds(54, 222, 30, 30);
		lblPoz16.setBorder(ovkirPlavi);

		lblPoz17.setBounds(54, 264, 30, 30);
		lblPoz17.setBorder(ovkirPlavi);

		lblPoz18.setBounds(54, 306, 30, 30);
		lblPoz18.setBorder(ovkirPlavi);

		lblPoz19.setBounds(54, 348, 30, 30);
		lblPoz19.setBorder(ovkirPlavi);

		lblPoz20.setBounds(54, 390, 30, 30);
		lblPoz20.setBorder(ovkirPlavi);

		lblPoz21.setBounds(96, 12, 30, 30);
		lblPoz21.setBorder(ovkirPlavi);

		lblPoz22.setBounds(96, 54, 30, 30);
		lblPoz22.setBorder(ovkirPlavi);

		lblPoz23.setBounds(96, 96, 30, 30);
		lblPoz23.setBorder(ovkirPlavi);

		lblPoz24.setBounds(96, 138, 30, 30);
		lblPoz24.setBorder(ovkirPlavi);

		lblPoz25.setBounds(96, 180, 30, 30);
		lblPoz25.setBorder(ovkirPlavi);

		lblPoz26.setBounds(96, 222, 30, 30);
		lblPoz26.setBorder(ovkirPlavi);

		lblPoz27.setBounds(96, 264, 30, 30);
		lblPoz27.setBorder(ovkirPlavi);

		lblPoz28.setBounds(96, 306, 30, 30);
		lblPoz28.setBorder(ovkirPlavi);

		lblPoz29.setBounds(96, 348, 30, 30);
		lblPoz29.setBorder(ovkirPlavi);

		lblPoz30.setBounds(96, 390, 30, 30);
		lblPoz30.setBorder(ovkirPlavi);

		lblPoz31.setBounds(138, 12, 30, 30);
		lblPoz31.setBorder(ovkirPlavi);

		lblPoz32.setBounds(138, 54, 30, 30);
		lblPoz32.setBorder(ovkirPlavi);

		lblPoz33.setBounds(138, 96, 30, 30);
		lblPoz33.setBorder(ovkirPlavi);

		lblPoz34.setBounds(138, 138, 30, 30);
		lblPoz34.setBorder(ovkirPlavi);

		lblPoz35.setBounds(138, 180, 30, 30);
		lblPoz35.setBorder(ovkirPlavi);

		lblPoz36.setBounds(138, 222, 30, 30);
		lblPoz36.setBorder(ovkirPlavi);

		lblPoz37.setBounds(138, 264, 30, 30);
		lblPoz37.setBorder(ovkirPlavi);

		lblPoz38.setBounds(138, 306, 30, 30);
		lblPoz38.setBorder(ovkirPlavi);

		lblPoz39.setBounds(138, 348, 30, 30);
		lblPoz39.setBorder(ovkirPlavi);

		lblPoz40.setBounds(138, 390, 30, 30);
		lblPoz40.setBorder(ovkirPlavi);

		lblPoz41.setBounds(180, 12, 30, 30);
		lblPoz41.setBorder(ovkirPlavi);

		lblPoz42.setBounds(180, 54, 30, 30);
		lblPoz42.setBorder(ovkirPlavi);

		lblPoz43.setBounds(180, 96, 30, 30);
		lblPoz43.setBorder(ovkirPlavi);

		lblPoz44.setBounds(180, 138, 30, 30);
		lblPoz44.setBorder(ovkirPlavi);

		lblPoz45.setBounds(180, 180, 30, 30);
		lblPoz45.setBorder(ovkirPlavi);

		lblPoz46.setBounds(180, 222, 30, 30);
		lblPoz46.setBorder(ovkirPlavi);

		lblPoz47.setBounds(180, 264, 30, 30);
		lblPoz47.setBorder(ovkirPlavi);

		lblPoz48.setBounds(180, 306, 30, 30);
		lblPoz48.setBorder(ovkirPlavi);

		lblPoz49.setBounds(180, 348, 30, 30);
		lblPoz49.setBorder(ovkirPlavi);

		lblPoz50.setBounds(180, 390, 30, 30);
		lblPoz50.setBorder(ovkirPlavi);

		lblPoz51.setBounds(222, 12, 30, 30);
		lblPoz51.setBorder(ovkirPlavi);

		lblPoz52.setBounds(222, 54, 30, 30);
		lblPoz52.setBorder(ovkirPlavi);

		lblPoz53.setBounds(222, 96, 30, 30);
		lblPoz53.setBorder(ovkirPlavi);

		lblPoz54.setBounds(222, 138, 30, 30);
		lblPoz54.setBorder(ovkirPlavi);

		lblPoz55.setBounds(222, 180, 30, 30);
		lblPoz55.setBorder(ovkirPlavi);

		lblPoz56.setBounds(222, 222, 30, 30);
		lblPoz56.setBorder(ovkirPlavi);

		lblPoz57.setBounds(222, 264, 30, 30);
		lblPoz57.setBorder(ovkirPlavi);

		lblPoz58.setBounds(222, 306, 30, 30);
		lblPoz58.setBorder(ovkirPlavi);

		lblPoz59.setBounds(222, 348, 30, 30);
		lblPoz59.setBorder(ovkirPlavi);

		lblPoz60.setBounds(222, 390, 30, 30);
		lblPoz60.setBorder(ovkirPlavi);

		lblPoz61.setBounds(264, 12, 30, 30);
		lblPoz61.setBorder(ovkirPlavi);

		lblPoz62.setBounds(264, 54, 30, 30);
		lblPoz62.setBorder(ovkirPlavi);

		lblPoz63.setBounds(264, 96, 30, 30);
		lblPoz63.setBorder(ovkirPlavi);

		lblPoz64.setBounds(264, 138, 30, 30);
		lblPoz64.setBorder(ovkirPlavi);

		lblPoz65.setBounds(264, 180, 30, 30);
		lblPoz65.setBorder(ovkirPlavi);

		lblPoz66.setBounds(264, 222, 30, 30);
		lblPoz66.setBorder(ovkirPlavi);

		lblPoz67.setBounds(264, 264, 30, 30);
		lblPoz67.setBorder(ovkirPlavi);

		lblPoz68.setBounds(264, 306, 30, 30);
		lblPoz68.setBorder(ovkirPlavi);

		lblPoz69.setBounds(264, 348, 30, 30);
		lblPoz69.setBorder(ovkirPlavi);

		lblPoz70.setBounds(264, 390, 30, 30);
		lblPoz70.setBorder(ovkirPlavi);

		lblPoz71.setBounds(306, 12, 30, 30);
		lblPoz71.setBorder(ovkirPlavi);

		lblPoz72.setBounds(306, 54, 30, 30);
		lblPoz72.setBorder(ovkirPlavi);

		lblPoz73.setBounds(306, 96, 30, 30);
		lblPoz73.setBorder(ovkirPlavi);

		lblPoz74.setBounds(306, 138, 30, 30);
		lblPoz74.setBorder(ovkirPlavi);

		lblPoz75.setBounds(306, 180, 30, 30);
		lblPoz75.setBorder(ovkirPlavi);

		lblPoz76.setBounds(306, 222, 30, 30);
		lblPoz76.setBorder(ovkirPlavi);

		lblPoz77.setBounds(306, 264, 30, 30);
		lblPoz77.setBorder(ovkirPlavi);

		lblPoz78.setBounds(306, 306, 30, 30);
		lblPoz78.setBorder(ovkirPlavi);

		lblPoz79.setBounds(306, 348, 30, 30);
		lblPoz79.setBorder(ovkirPlavi);

		lblPoz80.setBounds(306, 390, 30, 30);
		lblPoz80.setBorder(ovkirPlavi);

		lblPoz81.setBounds(348, 12, 30, 30);
		lblPoz81.setBorder(ovkirPlavi);

		lblPoz82.setBounds(348, 54, 30, 30);
		lblPoz82.setBorder(ovkirPlavi);

		lblPoz83.setBounds(348, 96, 30, 30);
		lblPoz83.setBorder(ovkirPlavi);

		lblPoz84.setBounds(348, 138, 30, 30);
		lblPoz84.setBorder(ovkirPlavi);

		lblPoz85.setBounds(348, 180, 30, 30);
		lblPoz85.setBorder(ovkirPlavi);

		lblPoz86.setBounds(348, 222, 30, 30);
		lblPoz86.setBorder(ovkirPlavi);

		lblPoz87.setBounds(348, 264, 30, 30);
		lblPoz87.setBorder(ovkirPlavi);

		lblPoz88.setBounds(348, 306, 30, 30);
		lblPoz88.setBorder(ovkirPlavi);

		lblPoz89.setBounds(348, 348, 30, 30);
		lblPoz89.setBorder(ovkirPlavi);

		lblPoz90.setBounds(348, 390, 30, 30);
		lblPoz90.setBorder(ovkirPlavi);


		

		JLabel lblIzvuceniBroj = new JLabel("Izvučeni broj:");
		lblIzvuceniBroj.setBounds(66, 449, 110, 15);
		frame.getContentPane().add(lblIzvuceniBroj);

		final JLabel lblIzvucenibroj = new JLabel("");
		lblIzvucenibroj.setFont(new Font("Dialog", Font.BOLD, 100));
		lblIzvucenibroj.setBounds(46, 479, 150, 150);
		lblIzvucenibroj.setBorder(ovkirPlavi);
		frame.getContentPane().add(lblIzvucenibroj);

		JLabel lblRBrIzvucenogBr = new JLabel("Redni broj:");
		lblRBrIzvucenogBr.setBounds(214, 449, 80, 15);
		frame.getContentPane().add(lblRBrIzvucenogBr);

		final JLabel lblRbr = new JLabel("");
		lblRbr.setFont(new Font("Dialog", Font.BOLD, 50));
		lblRbr.setBounds(214, 479, 80, 98);
		lblRbr.setBorder(ovkirPlavi);
		frame.getContentPane().add(lblRbr);



		/*
		 * timer koji svakih milisec poziva actionlistener
		 */
		int milisec = 300; 
		ActionListener taskPerformer = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*
				 * Nakon sto se izvuce svih 32 br onda se pozivaju rezultati
				 */
				if(rBr>32){
					//pozovi rezultate
					BingoRezultatiGUI.startBingoRezultatiGUI();
					frame.dispose();
				}


				/**
				 * ucitavanje random broja iz bubnja i ispisivanje tog broja
				 */
				int izvuceniBr = -1; //
				izvuceniBr = BingoStartGUI.bingo.getBingoBrojevi().get(rBr);//rbr pri prvoj iteraciji je 0, pa uzima prvi element iz niza
				
				lblIzvucenibroj.setText(String.valueOf(izvuceniBr));

				/*
				 * kada izvucemo neki br, zelimo ga prikazati na tabli, kao i redni broj izvucenog broja
				 */
				prikazIzvucBr(izvuceniBr);


				/*
				 * vrsimo provjeru dobitaka i krizanje pogodjenih kod igraca koji igrajuq
				 */
				krizajPogodjene(izvuceniBr);
				provjeriDobitak1();
				provjeriDobitak2();
				provjeriDobitak3();


				frame.repaint();
				
				rBr++; //izvukli smo prvi broj, povecamo brojac i ispisujemo redni broj izvucenog broja
				lblRbr.setText(String.valueOf(rBr));
				
			}

			/*
			 * kriza izvucene brojeve na tiketimma
			 */
			private void krizajPogodjene(int izvuceniBr) {
				Border ovkirZeleni = BorderFactory.createLineBorder(Color.green, 2);

				/*
				 * krizanje pogodjenih prvog igraca
				 */
				if(BingoStartGUI.igrac1.getBingoTiket().contains(izvuceniBr)){

					if(tik1r1.contains(izvuceniBr)){
						if(izvuceniBr<10){
							lblTik1_r1_01_09.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=10 && izvuceniBr<=19){
							lblTik1_r1_10_19.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=20 && izvuceniBr<=29){
							lblTik1_r1_20_29.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=30 && izvuceniBr<=39){
							lblTik1_r1_30_39.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=40 && izvuceniBr<=49){
							lblTik1_r1_40_49.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=50 && izvuceniBr<=59){
							lblTik1_r1_50_59.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=60 && izvuceniBr<=69){
							lblTik1_r1_60_69.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=70 && izvuceniBr<=79){
							lblTik1_r1_70_79.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=80 && izvuceniBr<=90){
							lblTik1_r1_80_90.setBorder(ovkirZeleni);
						}
					}
					if(tik1r2.contains(izvuceniBr)){
						if(izvuceniBr<10){
							lblTik1_r2_01_09.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=10 && izvuceniBr<=19){
							lblTik1_r2_10_19.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=20 && izvuceniBr<=29){
							lblTik1_r2_20_29.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=30 && izvuceniBr<=39){
							lblTik1_r2_30_39.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=40 && izvuceniBr<=49){
							lblTik1_r2_40_49.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=50 && izvuceniBr<=59){
							lblTik1_r2_50_59.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=60 && izvuceniBr<=69){
							lblTik1_r2_60_69.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=70 && izvuceniBr<=79){
							lblTik1_r2_70_79.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=80 && izvuceniBr<=90){
							lblTik1_r2_80_90.setBorder(ovkirZeleni);
						}
					}
					if(tik1r3.contains(izvuceniBr)){
						if(izvuceniBr<10){
							lblTik1_r3_01_09.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=10 && izvuceniBr<=19){
							lblTik1_r3_10_19.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=20 && izvuceniBr<=29){
							lblTik1_r3_20_29.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=30 && izvuceniBr<=39){
							lblTik1_r3_30_39.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=40 && izvuceniBr<=49){
							lblTik1_r3_40_49.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=50 && izvuceniBr<=59){
							lblTik1_r3_50_59.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=60 && izvuceniBr<=69){
							lblTik1_r3_60_69.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=70 && izvuceniBr<=79){
							lblTik1_r3_70_79.setBorder(ovkirZeleni);
						}
						else if(izvuceniBr>=80 && izvuceniBr<=90){
							lblTik1_r3_80_90.setBorder(ovkirZeleni);
						}
					}
				}

				/*
				 * krizanje pogodjenih brojeva drugog igraca
				 */

				if(tik2r1.contains(izvuceniBr)){
					if(izvuceniBr<10){
						lblTiket2_r1_01_09.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=10 && izvuceniBr<=19){
						lblTiket2_r1_10_19.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=20 && izvuceniBr<=29){
						lblTiket2_r1_20_29.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=30 && izvuceniBr<=39){
						lblTiket2_r1_30_39.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=40 && izvuceniBr<=49){
						lblTiket2_r1_40_49.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=50 && izvuceniBr<=59){
						lblTiket2_r1_50_59.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=60 && izvuceniBr<=69){
						lblTiket2_r1_60_69.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=70 && izvuceniBr<=79){
						lblTiket2_r1_70_79.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=80 && izvuceniBr<=90){
						lblTiket2_r1_80_90.setBorder(ovkirZeleni);
					}
				}
				if(tik2r2.contains(izvuceniBr)){
					if(izvuceniBr<10){
						lblTiket2_r2_01_09.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=10 && izvuceniBr<=19){
						lblTiket2_r2_10_19.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=20 && izvuceniBr<=29){
						lblTiket2_r2_20_29.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=30 && izvuceniBr<=39){
						lblTiket2_r2_30_39.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=40 && izvuceniBr<=49){
						lblTiket2_r2_40_49.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=50 && izvuceniBr<=59){
						lblTiket2_r2_50_59.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=60 && izvuceniBr<=69){
						lblTiket2_r2_60_69.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=70 && izvuceniBr<=79){
						lblTiket2_r2_70_79.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=80 && izvuceniBr<=90){
						lblTiket2_r2_80_90.setBorder(ovkirZeleni);
					}
				}
				if(tik2r3.contains(izvuceniBr)){
					if(izvuceniBr<10){
						lblTiket2_r3_01_09.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=10 && izvuceniBr<=19){
						lblTiket2_r3_10_19.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=20 && izvuceniBr<=29){
						lblTiket2_r3_20_29.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=30 && izvuceniBr<=39){
						lblTiket2_r3_30_39.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=40 && izvuceniBr<=49){
						lblTiket2_r3_40_49.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=50 && izvuceniBr<=59){
						lblTiket2_r3_50_59.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=60 && izvuceniBr<=69){
						lblTiket2_r3_60_69.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=70 && izvuceniBr<=79){
						lblTiket2_r3_70_79.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=80 && izvuceniBr<=90){
						lblTiket2_r3_80_90.setBorder(ovkirZeleni);
					}
				}

				/*
				 * krizanje pogodjenih brojeva treceg igraca
				 */

				if(tik3r1.contains(izvuceniBr)){
					if(izvuceniBr<10){
						lblTikett3_r1_01_09.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=10 && izvuceniBr<=19){
						lblTikett3_r1_10_19.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=20 && izvuceniBr<=29){
						lblTikett3_r1_20_29.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=30 && izvuceniBr<=39){
						lblTikett3_r1_30_39.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=40 && izvuceniBr<=49){
						lblTikett3_r1_40_49.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=50 && izvuceniBr<=59){
						lblTikett3_r1_50_59.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=60 && izvuceniBr<=69){
						lblTikett3_r1_60_69.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=70 && izvuceniBr<=79){
						lblTikett3_r1_70_79.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=80 && izvuceniBr<=90){
						lblTikett3_r1_80_90.setBorder(ovkirZeleni);
					}
				}
				if(tik3r2.contains(izvuceniBr)){
					if(izvuceniBr<10){
						lblTikett3_r2_01_09.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=10 && izvuceniBr<=19){
						lblTikett3_r2_10_19.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=20 && izvuceniBr<=29){
						lblTikett3_r2_20_29.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=30 && izvuceniBr<=39){
						lblTikett3_r2_30_39.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=40 && izvuceniBr<=49){
						lblTikett3_r2_40_49.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=50 && izvuceniBr<=59){
						lblTikett3_r2_50_59.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=60 && izvuceniBr<=69){
						lblTikett3_r2_60_69.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=70 && izvuceniBr<=79){
						lblTikett3_r2_70_79.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=80 && izvuceniBr<=90){
						lblTikett3_r2_80_90.setBorder(ovkirZeleni);
					}
				}
				if(tik3r3.contains(izvuceniBr)){
					if(izvuceniBr<10){
						lblTikett3_r3_01_09.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=10 && izvuceniBr<=19){
						lblTikett3_r3_10_19.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=20 && izvuceniBr<=29){
						lblTikett3_r3_20_29.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=30 && izvuceniBr<=39){
						lblTikett3_r3_30_39.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=40 && izvuceniBr<=49){
						lblTikett3_r3_40_49.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=50 && izvuceniBr<=59){
						lblTikett3_r3_50_59.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=60 && izvuceniBr<=69){
						lblTikett3_r3_60_69.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=70 && izvuceniBr<=79){
						lblTikett3_r3_70_79.setBorder(ovkirZeleni);
					}
					else if(izvuceniBr>=80 && izvuceniBr<=90){
						lblTikett3_r3_80_90.setBorder(ovkirZeleni);
					}
				}

			}


			/*
			 * Prikazuje izvucene brojeve
			 */
			private void prikazIzvucBr(int izvuceniBr) {
				switch (izvuceniBr) {
				case 1:
					frame.getContentPane().add(lblPoz01);
					break;
				case 2:
					frame.getContentPane().add(lblPoz02);
					break;
				case 3:
					frame.getContentPane().add(lblPoz03);
					break;
				case 4:
					frame.getContentPane().add(lblPoz04);
					break;
				case 5:
					frame.getContentPane().add(lblPoz05);
					break;
				case 6:
					frame.getContentPane().add(lblPoz06);
					break;
				case 7:
					frame.getContentPane().add(lblPoz07);
					break;
				case 8:
					frame.getContentPane().add(lblPoz08);
					break;
				case 9:
					frame.getContentPane().add(lblPoz09);
					break;	
				case 10:
					frame.getContentPane().add(lblPoz10);
					break;	
				case 11:
					frame.getContentPane().add(lblPoz11);
					break;
				case 12:
					frame.getContentPane().add(lblPoz12);
					break;
				case 13:
					frame.getContentPane().add(lblPoz13);
					break;
				case 14:
					frame.getContentPane().add(lblPoz14);
					break;
				case 15:
					frame.getContentPane().add(lblPoz15);
					break;
				case 16:
					frame.getContentPane().add(lblPoz16);
					break;
				case 17:
					frame.getContentPane().add(lblPoz17);
					break;
				case 18:
					frame.getContentPane().add(lblPoz18);
					break;
				case 19:
					frame.getContentPane().add(lblPoz19);
					break;	
				case 20:
					frame.getContentPane().add(lblPoz20);
					break;
				case 21:
					frame.getContentPane().add(lblPoz21);
					break;
				case 22:
					frame.getContentPane().add(lblPoz22);
					break;
				case 23:
					frame.getContentPane().add(lblPoz23);
					break;
				case 24:
					frame.getContentPane().add(lblPoz24);
					break;
				case 25:
					frame.getContentPane().add(lblPoz25);
					break;
				case 26:
					frame.getContentPane().add(lblPoz26);
					break;
				case 27:
					frame.getContentPane().add(lblPoz27);
					break;
				case 28:
					frame.getContentPane().add(lblPoz28);
					break;
				case 29:
					frame.getContentPane().add(lblPoz29);
					break;	
				case 30:
					frame.getContentPane().add(lblPoz30);
					break;	
				case 31:
					frame.getContentPane().add(lblPoz31);
					break;
				case 32:
					frame.getContentPane().add(lblPoz32);
					break;
				case 33:
					frame.getContentPane().add(lblPoz33);
					break;
				case 34:
					frame.getContentPane().add(lblPoz34);
					break;
				case 35:
					frame.getContentPane().add(lblPoz35);
					break;
				case 36:
					frame.getContentPane().add(lblPoz36);
					break;
				case 37:
					frame.getContentPane().add(lblPoz37);
					break;
				case 38:
					frame.getContentPane().add(lblPoz38);
					break;
				case 39:
					frame.getContentPane().add(lblPoz39);
					break;	
				case 40:
					frame.getContentPane().add(lblPoz40);
					break;
				case 41:
					frame.getContentPane().add(lblPoz41);
					break;
				case 42:
					frame.getContentPane().add(lblPoz42);
					break;
				case 43:
					frame.getContentPane().add(lblPoz43);
					break;
				case 44:
					frame.getContentPane().add(lblPoz44);
					break;
				case 45:
					frame.getContentPane().add(lblPoz45);
					break;
				case 46:
					frame.getContentPane().add(lblPoz46);
					break;
				case 47:
					frame.getContentPane().add(lblPoz47);
					break;
				case 48:
					frame.getContentPane().add(lblPoz48);
					break;
				case 49:
					frame.getContentPane().add(lblPoz49);
					break;	
				case 50:
					frame.getContentPane().add(lblPoz50);
					break;
				case 51:
					frame.getContentPane().add(lblPoz51);
					break;
				case 52:
					frame.getContentPane().add(lblPoz52);
					break;
				case 53:
					frame.getContentPane().add(lblPoz53);
					break;
				case 54:
					frame.getContentPane().add(lblPoz54);
					break;
				case 55:
					frame.getContentPane().add(lblPoz55);
					break;
				case 56:
					frame.getContentPane().add(lblPoz56);
					break;
				case 57:
					frame.getContentPane().add(lblPoz57);
					break;
				case 58:
					frame.getContentPane().add(lblPoz58);
					break;
				case 59:
					frame.getContentPane().add(lblPoz59);
					break;	
				case 60:
					frame.getContentPane().add(lblPoz60);
					break;
				case 61:
					frame.getContentPane().add(lblPoz61);
					break;
				case 62:
					frame.getContentPane().add(lblPoz62);
					break;
				case 63:
					frame.getContentPane().add(lblPoz63);
					break;
				case 64:
					frame.getContentPane().add(lblPoz64);
					break;
				case 65:
					frame.getContentPane().add(lblPoz65);
					break;
				case 66:
					frame.getContentPane().add(lblPoz66);
					break;
				case 67:
					frame.getContentPane().add(lblPoz67);
					break;
				case 68:
					frame.getContentPane().add(lblPoz68);
					break;
				case 69:
					frame.getContentPane().add(lblPoz69);
					break;	
				case 70:
					frame.getContentPane().add(lblPoz70);
					break;
				case 71:
					frame.getContentPane().add(lblPoz71);
					break;
				case 72:
					frame.getContentPane().add(lblPoz72);
					break;
				case 73:
					frame.getContentPane().add(lblPoz73);
					break;
				case 74:
					frame.getContentPane().add(lblPoz74);
					break;
				case 75:
					frame.getContentPane().add(lblPoz75);
					break;
				case 76:
					frame.getContentPane().add(lblPoz76);
					break;
				case 77:
					frame.getContentPane().add(lblPoz77);
					break;
				case 78:
					frame.getContentPane().add(lblPoz78);
					break;
				case 79:
					frame.getContentPane().add(lblPoz79);
					break;	
				case 80:
					frame.getContentPane().add(lblPoz80);
					break;
				case 81:
					frame.getContentPane().add(lblPoz81);
					break;
				case 82:
					frame.getContentPane().add(lblPoz82);
					break;
				case 83:
					frame.getContentPane().add(lblPoz83);
					break;
				case 84:
					frame.getContentPane().add(lblPoz84);
					break;
				case 85:
					frame.getContentPane().add(lblPoz85);
					break;
				case 86:
					frame.getContentPane().add(lblPoz86);
					break;
				case 87:
					frame.getContentPane().add(lblPoz87);
					break;
				case 88:
					frame.getContentPane().add(lblPoz88);
					break;
				case 89:
					frame.getContentPane().add(lblPoz89);
					break;	
				case 90:
					frame.getContentPane().add(lblPoz90);
					break;
				default:
					break;
				}
			}
		};
		
		new Timer(milisec, taskPerformer).start();



		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(396, 12, 10, 617);
		frame.getContentPane().add(separator);


		Border ovkirCrni = BorderFactory.createLineBorder(Color.black, 1);

		/*
		 * prikaz tiketa 1
		 */
		/*
		 * tiket igraca 1
		 */

		if(BingoStartGUI.brIgraca1 != 0 ){

		}

		JLabel lblIgrac1 = new JLabel(BingoStartGUI.igrac1.getImeIgrac());
		lblIgrac1.setBounds(424, 20, 150, 15);
		frame.getContentPane().add(lblIgrac1);



		/*
		 * prvi red
		 */
		int zr1_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_01_09.setBounds(424, 54, 30, 30);
		lblTik1_r1_01_09.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_01_09);

		int zr1_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_10_19.setBounds(466, 54, 30, 30);
		lblTik1_r1_10_19.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_10_19);

		int zr1_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_20_29.setBounds(508, 54, 30, 30);
		lblTik1_r1_20_29.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_20_29);

		int zr1_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_30_39.setBounds(550, 54, 30, 30);
		lblTik1_r1_30_39.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_30_39);

		int zr1_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_40_49.setBounds(594, 54, 30, 30);
		lblTik1_r1_40_49.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_40_49);

		int zr1_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_50_59.setBounds(636, 54, 30, 30);
		lblTik1_r1_50_59.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_50_59);

		int zr1_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_60_69.setBounds(678, 54, 30, 30);
		lblTik1_r1_60_69.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_60_69);

		int zr1_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_70_79.setBounds(720, 54, 30, 30);
		lblTik1_r1_70_79.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_70_79);

		int zr1_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r1_80_90.setBounds(762, 54, 30, 30);
		lblTik1_r1_80_90.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r1_80_90);

		/*
		 * drugi red
		 */
		int zr2_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_01_09.setBounds(424, 96, 30, 30);
		lblTik1_r2_01_09.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_01_09);

		int zr2_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_10_19.setBounds(466, 96, 30, 30);
		lblTik1_r2_10_19.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_10_19);

		int zr2_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_20_29.setBounds(508, 96, 30, 30);
		lblTik1_r2_20_29.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_20_29);

		int zr2_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_30_39.setBounds(550, 96, 30, 30);
		lblTik1_r2_30_39.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_30_39);

		int zr2_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_40_49.setBounds(594, 96, 30, 30);
		lblTik1_r2_40_49.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_40_49);

		int zr2_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_50_59.setBounds(636, 96, 30, 30);
		lblTik1_r2_50_59.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_50_59);

		int zr2_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_60_69.setBounds(678, 96, 30, 30);
		lblTik1_r2_60_69.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_60_69);

		int zr2_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_70_79.setBounds(720, 96, 30, 30);
		lblTik1_r2_70_79.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_70_79);

		int zr2_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r2_80_90.setBounds(762, 96, 30, 30);
		lblTik1_r2_80_90.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r2_80_90);

		/*
		 * treci red
		 */
		int zr3_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_01_09.setBounds(424, 138, 30, 30);
		lblTik1_r3_01_09.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_01_09);

		int zr3_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_10_19.setBounds(466, 138, 30, 30);
		lblTik1_r3_10_19.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_10_19);

		int zr3_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_20_29.setBounds(508, 138, 30, 30);
		lblTik1_r3_20_29.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_20_29);

		int zr3_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_30_39.setBounds(550, 138, 30, 30);
		lblTik1_r3_30_39.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_30_39);

		int zr3_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_40_49.setBounds(594, 138, 30, 30);
		lblTik1_r3_40_49.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_40_49);

		int zr3_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_50_59.setBounds(636, 138, 30, 30);
		lblTik1_r3_50_59.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_50_59);

		int zr3_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_60_69.setBounds(678, 138, 30, 30);
		lblTik1_r3_60_69.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_60_69);

		int zr3_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_70_79.setBounds(720, 138, 30, 30);
		lblTik1_r3_70_79.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_70_79);

		int zr3_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTik1_r3_80_90.setBounds(762, 138, 30, 30);
		lblTik1_r3_80_90.setBorder(ovkirCrni);
		frame.getContentPane().add(lblTik1_r3_80_90);


		/*
		 * upisivanje brojeva u tiket
		 */

		/*
		 * popunjavanje redova ovih arraylisti na sljedeci naci: 
		 * prolazimo kroz vektor tiketa, i kupimo 5 odgovarajucih velicina i bacamo u ove arrayliste.
		 */
		for (int i = 0; i < BingoStartGUI.igrac1.getBingoTiket().size(); i++) {
			int pom = BingoStartGUI.igrac1.getBingoTiket().get(i);

			if(pom>=0 && pom<=9){
				if(zr1_01_09 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, i nema vise od 5 elemenata, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_01_09.setText(String.valueOf(pom));
					zr1_01_09 = 1;
				}
				else if(zr2_01_09 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_01_09.setText(String.valueOf(pom));
					zr2_01_09 = 1;
				}
				else if(zr3_01_09 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_01_09.setText(String.valueOf(pom));
					zr3_01_09 = 1;
				}
			}
			else if(pom>=10 && pom<= 19){
				if(zr1_10_19 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_10_19.setText(String.valueOf(pom));
					zr1_10_19 = 1;
				}
				else if(zr2_10_19 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_10_19.setText(String.valueOf(pom));
					zr2_10_19 = 1;
				}
				else if(zr3_10_19 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_10_19.setText(String.valueOf(pom));
					zr3_10_19 = 1;
				}
			}

			else if(pom>=20 && pom<= 29){
				if(zr1_20_29 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_20_29.setText(String.valueOf(pom));
					zr1_20_29 = 1;
				}
				else if(zr2_20_29 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_20_29.setText(String.valueOf(pom));
					zr2_20_29 = 1;
				}
				else if(zr3_20_29 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_20_29.setText(String.valueOf(pom));
					zr3_20_29 = 1;
				}	
			}

			else if(pom>=30 && pom<= 39){
				if(zr1_30_39 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_30_39.setText(String.valueOf(pom));
					zr1_30_39 = 1;
				}
				else if(zr2_30_39 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_30_39.setText(String.valueOf(pom));
					zr2_30_39 = 1;
				}
				else if(zr3_30_39 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_30_39.setText(String.valueOf(pom));
					zr3_30_39 = 1;
				}
			}
			else if(pom>=40 && pom<= 49){
				if(zr1_40_49 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_40_49.setText(String.valueOf(pom));
					zr1_40_49 = 1;
				}
				else if(zr2_40_49 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_40_49.setText(String.valueOf(pom));
					zr2_40_49 = 1;
				}
				else if(zr3_40_49 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_40_49.setText(String.valueOf(pom));
					zr3_40_49 = 1;
				}
			}
			else if(pom>=50 && pom<= 59){
				if(zr1_50_59 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_50_59.setText(String.valueOf(pom));
					zr1_50_59 = 1;
				}
				else if(zr2_50_59 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_50_59.setText(String.valueOf(pom));
					zr2_50_59 = 1;
				}
				else if(zr3_50_59 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_50_59.setText(String.valueOf(pom));
					zr3_50_59 = 1;
				}
			}
			else if(pom>=60 && pom<= 69){
				if(zr1_60_69 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_60_69.setText(String.valueOf(pom));
					zr1_60_69 = 1;
				}
				else if(zr2_60_69 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_60_69.setText(String.valueOf(pom));
					zr2_60_69 = 1;
				}
				else if(zr3_60_69 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_60_69.setText(String.valueOf(pom));
					zr3_60_69 = 1;
				}
			}
			else if(pom>=70 && pom<= 79){
				if(zr1_70_79 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_70_79.setText(String.valueOf(pom));
					zr1_70_79 = 1;
				}
				else if(zr2_70_79 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_70_79.setText(String.valueOf(pom));
					zr2_70_79 = 1;
				}
				else if(zr3_70_79 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_70_79.setText(String.valueOf(pom));
					zr3_70_79 = 1;
				}
			}
			else if(pom>=80){
				if(zr1_80_90 == 0 && tik1r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik1r1.add(pom);
					lblTik1_r1_80_90.setText(String.valueOf(pom));
					zr1_80_90 = 1;
				}
				else if(zr2_80_90 == 0 && tik1r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik1r2.add(pom);
					lblTik1_r2_80_90.setText(String.valueOf(pom));
					zr2_80_90 = 1;
				}
				else if(zr3_80_90 == 0 && tik1r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik1r3.add(pom);
					lblTik1_r3_80_90.setText(String.valueOf(pom));
					zr3_80_90 = 1;
				}
			}

		}





		/*
		 * prikaz tiketa 2
		 */
		/*
		 * tiket igraca 2
		 */
	


		JLabel lblIgrac2 = new JLabel(BingoStartGUI.igrac2.getImeIgrac());
		lblIgrac2.setBounds(424, 180, 150, 15);

		/*
		 * prvi red
		 */
		int zr21_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_01_09.setBounds(424, 222, 30, 30);
		lblTiket2_r1_01_09.setBorder(ovkirCrni);

		int zr21_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_10_19.setBounds(466, 222, 30, 30);
		lblTiket2_r1_10_19.setBorder(ovkirCrni);

		int zr21_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_20_29.setBounds(508, 222, 30, 30);
		lblTiket2_r1_20_29.setBorder(ovkirCrni);

		int zr21_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_30_39.setBounds(550, 222, 30, 30);
		lblTiket2_r1_30_39.setBorder(ovkirCrni);

		int zr21_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_40_49.setBounds(594, 222, 30, 30);
		lblTiket2_r1_40_49.setBorder(ovkirCrni);

		int zr21_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_50_59.setBounds(636, 222, 30, 30);
		lblTiket2_r1_50_59.setBorder(ovkirCrni);

		int zr21_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_60_69.setBounds(678, 222, 30, 30);
		lblTiket2_r1_60_69.setBorder(ovkirCrni);

		int zr21_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_70_79.setBounds(720, 222, 30, 30);
		lblTiket2_r1_70_79.setBorder(ovkirCrni);

		int zr21_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r1_80_90.setBounds(762, 222, 30, 30);
		lblTiket2_r1_80_90.setBorder(ovkirCrni);

		/*
		 * drugi red
		 */
		int zr22_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_01_09.setBounds(424, 264, 30, 30);
		lblTiket2_r2_01_09.setBorder(ovkirCrni);

		int zr22_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_10_19.setBounds(466, 264, 30, 30);
		lblTiket2_r2_10_19.setBorder(ovkirCrni);

		int zr22_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_20_29.setBounds(508, 264, 30, 30);
		lblTiket2_r2_20_29.setBorder(ovkirCrni);

		int zr22_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_30_39.setBounds(550, 264, 30, 30);
		lblTiket2_r2_30_39.setBorder(ovkirCrni);

		int zr22_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_40_49.setBounds(594, 264, 30, 30);
		lblTiket2_r2_40_49.setBorder(ovkirCrni);

		int zr22_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_50_59.setBounds(636, 264, 30, 30);
		lblTiket2_r2_50_59.setBorder(ovkirCrni);

		int zr22_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r2_60_69.setBounds(678, 264, 30, 30);
		lblTiket2_r2_60_69.setBorder(ovkirCrni);


		int zr22_70_79 = 0; //za provjeravu zauzetost ove pozicije  
		lblTiket2_r2_70_79.setBounds(720, 264, 30, 30);
		lblTiket2_r2_70_79.setBorder(ovkirCrni);

		int zr22_80_90 = 0; //za provjeravu zauzetost ove pozicije 
		lblTiket2_r2_80_90.setBounds(762, 264, 30, 30);
		lblTiket2_r2_80_90.setBorder(ovkirCrni);

		/*
		 * treci red
		 */
		int zr23_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_01_09.setBounds(424, 306, 30, 30);
		lblTiket2_r3_01_09.setBorder(ovkirCrni);

		int zr23_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_10_19.setBounds(466, 306, 30, 30);
		lblTiket2_r3_10_19.setBorder(ovkirCrni);

		int zr23_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_20_29.setBounds(508, 306, 30, 30);
		lblTiket2_r3_20_29.setBorder(ovkirCrni);

		int zr23_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_30_39.setBounds(550, 306, 30, 30);
		lblTiket2_r3_30_39.setBorder(ovkirCrni);

		int zr23_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_40_49.setBounds(594, 306, 30, 30);
		lblTiket2_r3_40_49.setBorder(ovkirCrni);

		int zr23_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_50_59.setBounds(636, 306, 30, 30);
		lblTiket2_r3_50_59.setBorder(ovkirCrni);

		int zr23_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_60_69.setBounds(678, 306, 30, 30);
		lblTiket2_r3_60_69.setBorder(ovkirCrni);

		int zr23_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_70_79.setBounds(720, 306, 30, 30);
		lblTiket2_r3_70_79.setBorder(ovkirCrni);

		int zr23_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTiket2_r3_80_90.setBounds(762, 306, 30, 30);
		lblTiket2_r3_80_90.setBorder(ovkirCrni);


		if(BingoStartGUI.brIgraca2 != 1 ){
			frame.getContentPane().add(lblIgrac2);
			frame.getContentPane().add(lblTiket2_r1_01_09);
			frame.getContentPane().add(lblTiket2_r1_10_19);
			frame.getContentPane().add(lblTiket2_r1_20_29);
			frame.getContentPane().add(lblTiket2_r1_30_39);
			frame.getContentPane().add(lblTiket2_r1_40_49);
			frame.getContentPane().add(lblTiket2_r1_50_59);
			frame.getContentPane().add(lblTiket2_r1_60_69);
			frame.getContentPane().add(lblTiket2_r1_70_79);
			frame.getContentPane().add(lblTiket2_r1_80_90);
			frame.getContentPane().add(lblTiket2_r2_01_09);
			frame.getContentPane().add(lblTiket2_r2_10_19);
			frame.getContentPane().add(lblTiket2_r2_20_29);
			frame.getContentPane().add(lblTiket2_r2_30_39);
			frame.getContentPane().add(lblTiket2_r2_40_49);
			frame.getContentPane().add(lblTiket2_r2_50_59);
			frame.getContentPane().add(lblTiket2_r2_60_69);
			frame.getContentPane().add(lblTiket2_r2_70_79);
			frame.getContentPane().add(lblTiket2_r2_80_90);
			frame.getContentPane().add(lblTiket2_r3_01_09);
			frame.getContentPane().add(lblTiket2_r3_10_19);
			frame.getContentPane().add(lblTiket2_r3_20_29);
			frame.getContentPane().add(lblTiket2_r3_30_39);
			frame.getContentPane().add(lblTiket2_r3_40_49);
			frame.getContentPane().add(lblTiket2_r3_50_59);
			frame.getContentPane().add(lblTiket2_r3_60_69);
			frame.getContentPane().add(lblTiket2_r3_70_79);
			frame.getContentPane().add(lblTiket2_r3_80_90);
		}

		/*
		 * upisivanje brojeva u tiket
		 */


		/*
		 * popunjavanje redova ovih arraylisti na sljedeci naci: prolazimo kroz vektor tiketa, i kupimo 5 odgovarajucih velicina i bacamo u ove arrayliste.
		 */
		for (int i = 0; i < BingoStartGUI.igrac2.getBingoTiket().size(); i++) {
			int pom = BingoStartGUI.igrac2.getBingoTiket().get(i);



			if(pom>=0 && pom<=9){
				if(zr21_01_09 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, i nema vise od 5 elemenata, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_01_09.setText(String.valueOf(pom));
					zr21_01_09 = 1;
				}
				else if(zr22_01_09 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_01_09.setText(String.valueOf(pom));
					zr22_01_09 = 1;
				}
				else if(zr23_01_09 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_01_09.setText(String.valueOf(pom));
					zr23_01_09 = 1;
				}
			}
			else if(pom>=10 && pom<= 19){
				if(zr21_10_19 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_10_19.setText(String.valueOf(pom));
					zr21_10_19 = 1;
				}
				else if(zr22_10_19 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_10_19.setText(String.valueOf(pom));
					zr22_10_19 = 1;
				}
				else if(zr23_10_19 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_10_19.setText(String.valueOf(pom));
					zr23_10_19 = 1;
				}
			}

			else if(pom>=20 && pom<= 29){
				if(zr21_20_29 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_20_29.setText(String.valueOf(pom));
					zr21_20_29 = 1;
				}
				else if(zr22_20_29 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_20_29.setText(String.valueOf(pom));
					zr22_20_29 = 1;
				}
				else if(zr23_20_29 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_20_29.setText(String.valueOf(pom));
					zr23_20_29 = 1;
				}	
			}

			else if(pom>=30 && pom<= 39){
				if(zr21_30_39 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_30_39.setText(String.valueOf(pom));
					zr21_30_39 = 1;
				}
				else if(zr22_30_39 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_30_39.setText(String.valueOf(pom));
					zr22_30_39 = 1;
				}
				else if(zr23_30_39 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_30_39.setText(String.valueOf(pom));
					zr23_30_39 = 1;
				}
			}
			else if(pom>=40 && pom<= 49){
				if(zr21_40_49 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_40_49.setText(String.valueOf(pom));
					zr21_40_49 = 1;
				}
				else if(zr22_40_49 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_40_49.setText(String.valueOf(pom));
					zr22_40_49 = 1;
				}
				else if(zr23_40_49 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_40_49.setText(String.valueOf(pom));
					zr23_40_49 = 1;
				}
			}
			else if(pom>=50 && pom<= 59){
				if(zr21_50_59 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_50_59.setText(String.valueOf(pom));
					zr21_50_59 = 1;
				}
				else if(zr22_50_59 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_50_59.setText(String.valueOf(pom));
					zr22_50_59 = 1;
				}
				else if(zr23_50_59 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_50_59.setText(String.valueOf(pom));
					zr23_50_59 = 1;
				}
			}
			else if(pom>=60 && pom<= 69){
				if(zr21_60_69 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_60_69.setText(String.valueOf(pom));
					zr21_60_69 = 1;
				}
				else if(zr22_60_69 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_60_69.setText(String.valueOf(pom));
					zr22_60_69 = 1;
				}
				else if(zr23_60_69 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_60_69.setText(String.valueOf(pom));
					zr23_60_69 = 1;
				}
			}
			else if(pom>=70 && pom<= 79){
				if(zr21_70_79 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_70_79.setText(String.valueOf(pom));
					zr21_70_79 = 1;
				}
				else if(zr22_70_79 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_70_79.setText(String.valueOf(pom));
					zr22_70_79 = 1;
				}
				else if(zr23_70_79 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_70_79.setText(String.valueOf(pom));
					zr23_70_79 = 1;
				}
			}
			else if(pom>=80){
				if(zr21_80_90 == 0 && tik2r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik2r1.add(pom);
					lblTiket2_r1_80_90.setText(String.valueOf(pom));
					zr21_80_90 = 1;
				}
				else if(zr22_80_90 == 0 && tik2r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik2r2.add(pom);
					lblTiket2_r2_80_90.setText(String.valueOf(pom));
					zr22_80_90 = 1;
				}
				else if(zr23_80_90 == 0 && tik2r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik2r3.add(pom);
					lblTiket2_r3_80_90.setText(String.valueOf(pom));
					zr23_80_90 = 1;
				}
			}

		}



		/*
		 * prikaz tiketa 3
		 */
		/*
		 * tiket igraca 3
		 */
		JLabel lblIgrac3 = new JLabel(BingoStartGUI.igrac3.getImeIgrac());
		lblIgrac3.setBounds(424, 348, 150, 15);


		/*
		 * prvi red
		 */
		int zr31_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_01_09.setBounds(424, 390, 30, 30);
		lblTikett3_r1_01_09.setBorder(ovkirCrni);

		int zr31_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_10_19.setBounds(466, 390, 30, 30);
		lblTikett3_r1_10_19.setBorder(ovkirCrni);

		int zr31_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_20_29.setBounds(508, 390, 30, 30);
		lblTikett3_r1_20_29.setBorder(ovkirCrni);

		int zr31_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_30_39.setBounds(550, 390, 30, 30);
		lblTikett3_r1_30_39.setBorder(ovkirCrni);

		int zr31_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_40_49.setBounds(594, 390, 30, 30);
		lblTikett3_r1_40_49.setBorder(ovkirCrni);

		int zr31_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_50_59.setBounds(636, 390, 30, 30);
		lblTikett3_r1_50_59.setBorder(ovkirCrni);

		int zr31_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_60_69.setBounds(678, 390, 30, 30);
		lblTikett3_r1_60_69.setBorder(ovkirCrni);

		int zr31_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_70_79.setBounds(720, 390, 30, 30);
		lblTikett3_r1_70_79.setBorder(ovkirCrni);

		int zr31_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r1_80_90.setBounds(762, 390, 30, 30);
		lblTikett3_r1_80_90.setBorder(ovkirCrni);

		/*
		 * drugi red
		 */
		int zr32_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_01_09.setBounds(424, 432, 30, 30);
		lblTikett3_r2_01_09.setBorder(ovkirCrni);

		int zr32_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_10_19.setBounds(466, 432, 30, 30);
		lblTikett3_r2_10_19.setBorder(ovkirCrni);

		int zr32_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_20_29.setBounds(508, 432, 30, 30);
		lblTikett3_r2_20_29.setBorder(ovkirCrni);

		int zr32_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_30_39.setBounds(550, 432, 30, 30);
		lblTikett3_r2_30_39.setBorder(ovkirCrni);

		int zr32_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_40_49.setBounds(594, 432, 30, 30);
		lblTikett3_r2_40_49.setBorder(ovkirCrni);

		int zr32_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_50_59.setBounds(636, 432, 30, 30);
		lblTikett3_r2_50_59.setBorder(ovkirCrni);

		int zr32_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_60_69.setBounds(678, 432, 30, 30);
		lblTikett3_r2_60_69.setBorder(ovkirCrni);

		int zr32_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_70_79.setBounds(720, 432, 30, 30);
		lblTikett3_r2_70_79.setBorder(ovkirCrni);

		int zr32_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r2_80_90.setBounds(762, 432, 30, 30);
		lblTikett3_r2_80_90.setBorder(ovkirCrni);

		/*
		 * treci red
		 */
		int zr33_01_09 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_01_09.setBounds(424, 474, 30, 30);
		lblTikett3_r3_01_09.setBorder(ovkirCrni);

		int zr33_10_19 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_10_19.setBounds(466, 474, 30, 30);
		lblTikett3_r3_10_19.setBorder(ovkirCrni);

		int zr33_20_29 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_20_29.setBounds(508, 474, 30, 30);
		lblTikett3_r3_20_29.setBorder(ovkirCrni);

		int zr33_30_39 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_30_39.setBounds(550, 474, 30, 30);
		lblTikett3_r3_30_39.setBorder(ovkirCrni);

		int zr33_40_49 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_40_49.setBounds(594, 474, 30, 30);
		lblTikett3_r3_40_49.setBorder(ovkirCrni);

		int zr33_50_59 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_50_59.setBounds(636, 474, 30, 30);
		lblTikett3_r3_50_59.setBorder(ovkirCrni);

		int zr33_60_69 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_60_69.setBounds(678, 474, 30, 30);
		lblTikett3_r3_60_69.setBorder(ovkirCrni);

		int zr33_70_79 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_70_79.setBounds(720, 474, 30, 30);
		lblTikett3_r3_70_79.setBorder(ovkirCrni);

		int zr33_80_90 = 0; //za provjeravu zauzetost ove pozicije
		lblTikett3_r3_80_90.setBounds(762, 474, 30, 30);
		lblTikett3_r3_80_90.setBorder(ovkirCrni);

		
		if(BingoStartGUI.brIgraca3 != 1 ){
			frame.getContentPane().add(lblIgrac3);
			frame.getContentPane().add(lblTikett3_r1_01_09);
			frame.getContentPane().add(lblTikett3_r1_10_19);
			frame.getContentPane().add(lblTikett3_r1_20_29);
			frame.getContentPane().add(lblTikett3_r1_30_39);
			frame.getContentPane().add(lblTikett3_r1_40_49);
			frame.getContentPane().add(lblTikett3_r1_50_59);
			frame.getContentPane().add(lblTikett3_r1_60_69);
			frame.getContentPane().add(lblTikett3_r1_70_79);
			frame.getContentPane().add(lblTikett3_r1_80_90);
			frame.getContentPane().add(lblTikett3_r2_01_09);
			frame.getContentPane().add(lblTikett3_r2_10_19);
			frame.getContentPane().add(lblTikett3_r2_20_29);
			frame.getContentPane().add(lblTikett3_r2_30_39);
			frame.getContentPane().add(lblTikett3_r2_40_49);
			frame.getContentPane().add(lblTikett3_r2_50_59);
			frame.getContentPane().add(lblTikett3_r2_60_69);
			frame.getContentPane().add(lblTikett3_r2_70_79);
			frame.getContentPane().add(lblTikett3_r2_80_90);
			frame.getContentPane().add(lblTikett3_r3_01_09);
			frame.getContentPane().add(lblTikett3_r3_10_19);
			frame.getContentPane().add(lblTikett3_r3_20_29);
			frame.getContentPane().add(lblTikett3_r3_30_39);
			frame.getContentPane().add(lblTikett3_r3_40_49);
			frame.getContentPane().add(lblTikett3_r3_50_59);
			frame.getContentPane().add(lblTikett3_r3_60_69);
			frame.getContentPane().add(lblTikett3_r3_70_79);
			frame.getContentPane().add(lblTikett3_r3_80_90);
	
		}
	

		/*
		 * upisivanje brojeva u tiket
		 *
		 * popunjavanje redova ovih arraylisti na sljedeci naci: prolazimo kroz vektor tiketa, i kupimo 5 odgovarajucih velicina i bacamo u ove arrayliste.
		 */
		for (int i = 0; i < BingoStartGUI.igrac3.getBingoTiket().size(); i++) {
			int pom = BingoStartGUI.igrac3.getBingoTiket().get(i);


			if(pom>=0 && pom<=9){
				if(zr31_01_09 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, i nema vise od 5 elemenata, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_01_09.setText(String.valueOf(pom));
					zr31_01_09 = 1;
				}
				else if(zr32_01_09 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_01_09.setText(String.valueOf(pom));
					zr32_01_09 = 1;
				}
				else if(zr33_01_09 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_01_09.setText(String.valueOf(pom));
					zr33_01_09 = 1;
				}
			}
			else if(pom>=10 && pom<= 19){
				if(zr31_10_19 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_10_19.setText(String.valueOf(pom));
					zr31_10_19 = 1;
				}
				else if(zr32_10_19 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_10_19.setText(String.valueOf(pom));
					zr32_10_19 = 1;
				}
				else if(zr33_10_19 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_10_19.setText(String.valueOf(pom));
					zr33_10_19 = 1;
				}
			}

			else if(pom>=20 && pom<= 29){
				if(zr31_20_29 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_20_29.setText(String.valueOf(pom));
					zr31_20_29 = 1;
				}
				else if(zr32_20_29 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_20_29.setText(String.valueOf(pom));
					zr32_20_29 = 1;
				}
				else if(zr33_20_29 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_20_29.setText(String.valueOf(pom));
					zr33_20_29 = 1;
				}	
			}

			else if(pom>=30 && pom<= 39){
				if(zr31_30_39 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_30_39.setText(String.valueOf(pom));
					zr31_30_39 = 1;
				}
				else if(zr32_30_39 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_30_39.setText(String.valueOf(pom));
					zr32_30_39 = 1;
				}
				else if(zr33_30_39 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_30_39.setText(String.valueOf(pom));
					zr33_30_39 = 1;
				}
			}
			else if(pom>=40 && pom<= 49){
				if(zr31_40_49 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_40_49.setText(String.valueOf(pom));
					zr31_40_49 = 1;
				}
				else if(zr32_40_49 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_40_49.setText(String.valueOf(pom));
					zr32_40_49 = 1;
				}
				else if(zr33_40_49 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_40_49.setText(String.valueOf(pom));
					zr33_40_49 = 1;
				}
			}
			else if(pom>=50 && pom<= 59){
				if(zr31_50_59 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_50_59.setText(String.valueOf(pom));
					zr31_50_59 = 1;
				}
				else if(zr32_50_59 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_50_59.setText(String.valueOf(pom));
					zr32_50_59 = 1;
				}
				else if(zr33_50_59 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_50_59.setText(String.valueOf(pom));
					zr33_50_59 = 1;
				}
			}
			else if(pom>=60 && pom<= 69){
				if(zr31_60_69 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_60_69.setText(String.valueOf(pom));
					zr31_60_69 = 1;
				}
				else if(zr32_60_69 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_60_69.setText(String.valueOf(pom));
					zr32_60_69 = 1;
				}
				else if(zr33_60_69 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_60_69.setText(String.valueOf(pom));
					zr33_60_69 = 1;
				}
			}
			else if(pom>=70 && pom<= 79){
				if(zr31_70_79 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_70_79.setText(String.valueOf(pom));
					zr31_70_79 = 1;
				}
				else if(zr32_70_79 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_70_79.setText(String.valueOf(pom));
					zr32_70_79 = 1;
				}
				else if(zr33_70_79 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_70_79.setText(String.valueOf(pom));
					zr33_70_79 = 1;
				}
			}
			else if(pom>=80){
				if(zr31_80_90 == 0 && tik3r1.size()<5){//ako je slobodan 1. red, upisi u njeg i zauzmi to mjesto
					tik3r1.add(pom);
					lblTikett3_r1_80_90.setText(String.valueOf(pom));
					zr31_80_90 = 1;
				}
				else if(zr32_80_90 == 0 && tik3r2.size()<5){//ako je slobodan 2. red, upisi u njeg i zauzmi to mjesto
					tik3r2.add(pom);
					lblTikett3_r2_80_90.setText(String.valueOf(pom));
					zr32_80_90 = 1;
				}
				else if(zr33_80_90 == 0 && tik3r3.size()<5){//ako je slobodan 3. red, upisi u njeg i zauzmi to mjesto
					tik3r3.add(pom);
					lblTikett3_r3_80_90.setText(String.valueOf(pom));
					zr33_80_90 = 1;
				}
			}

		}


		provjeriDobitak1();
		provjeriDobitak2();
		provjeriDobitak3();

	}

	/*
	 * Provjera dobitka prvog tiketa
	 */
	private void provjeriDobitak1() {
		/*
		 * Provjera da li je postignut dobitak na nacin da provjeravamo da li se brojevi iz vektora tik1r1 tik1r2 i tik1r3 pojavljuju na tabli
		 */
		/*
		 * provjera BINGO JACK POT
		 */
		ArrayList<Integer> bingoBrojevi = BingoStartGUI.bingo.getBingoBrojevi();
		
		/*
		 * provjera da li sadrzi bingoBrojevi bilo koji od ona tri vektora
		 */
		if(bingoBrojevi.containsAll(tik1r1) && bingoBrojevi.containsAll(tik1r2) && bingoBrojevi.containsAll(tik1r3)){
			tik1_15 = 1;
			BingoRezultatiGUI.startBingoRezultatiGUI();
			frame.dispose();
		}
		else if(	(bingoBrojevi.containsAll(tik1r1) && bingoBrojevi.containsAll(tik1r2)) ||	 
				(bingoBrojevi.containsAll(tik1r1) && bingoBrojevi.containsAll(tik1r3)) ||
				(bingoBrojevi.containsAll(tik1r2) && bingoBrojevi.containsAll(tik1r3))){
			tik1_10 = 1;
		}
		else if(bingoBrojevi.containsAll(tik1r1) || bingoBrojevi.containsAll(tik1r2) || bingoBrojevi.containsAll(tik1r3)){
			tik1_5 = 1;
		}
	
	}

	/*
	 * Provjera dobitka drugog tiketa
	 */
	private void provjeriDobitak2() {
		/*
		 * Provjera da li je postignut dobitak na nacin da provjeravamo da li se brojevi iz vektora tik1r1 tik1r2 i tik1r3 pojavljuju na tabli
		 */
		/*
		 * provjera BINGO JACK POT
		 */
		ArrayList<Integer> bingoBrojevi = BingoStartGUI.bingo.getBingoBrojevi();
		/*
		 * provjera da li sadrzi bingoBrojevi bilo koji od ona tri vektora
		 */
		if(bingoBrojevi.containsAll(tik2r1) && bingoBrojevi.containsAll(tik2r2) && bingoBrojevi.containsAll(tik2r3)){
			tik2_15 = 1;
			BingoRezultatiGUI.startBingoRezultatiGUI();
			frame.dispose();
		}
		else if(	(bingoBrojevi.containsAll(tik2r1) && bingoBrojevi.containsAll(tik2r2)) ||	 
				(bingoBrojevi.containsAll(tik2r1) && bingoBrojevi.containsAll(tik2r3)) ||
				(bingoBrojevi.containsAll(tik2r2) && bingoBrojevi.containsAll(tik2r3))){
			tik2_10 = 1;
		}
		else if(bingoBrojevi.containsAll(tik2r1) || bingoBrojevi.containsAll(tik2r2) || bingoBrojevi.containsAll(tik2r3)){
			tik2_5 = 1;
		}
	
	}

	/*
	 * Provjera dobitka treceg tiketa
	 */
	private void provjeriDobitak3() {
		/*
		 * Provjera da li je postignut dobitak na nacin da provjeravamo da li se brojevi iz vektora tik1r1 tik1r2 i tik1r3 pojavljuju na tabli
		 */
		/*
		 * provjera BINGO JACK POT
		 */
		ArrayList<Integer> bingoBrojevi = BingoStartGUI.bingo.getBingoBrojevi();

		/*
		 * provjera da li sadrzi bingoBrojevi bilo koji od ona tri vektora
		 */
		if(bingoBrojevi.containsAll(tik3r1) && bingoBrojevi.containsAll(tik3r2) && bingoBrojevi.containsAll(tik3r3)){
			tik3_15 = 1;
			BingoRezultatiGUI.startBingoRezultatiGUI();
			frame.dispose();
		}
		else if(	(bingoBrojevi.containsAll(tik3r1) && bingoBrojevi.containsAll(tik3r2)) ||	 
				(bingoBrojevi.containsAll(tik3r1) && bingoBrojevi.containsAll(tik3r3)) ||
				(bingoBrojevi.containsAll(tik3r2) && bingoBrojevi.containsAll(tik3r3))){
			tik3_10 = 1;
		}
		else if(bingoBrojevi.containsAll(tik3r1) || bingoBrojevi.containsAll(tik3r2) || bingoBrojevi.containsAll(tik3r3)){
			tik3_5 = 1;
		}
	
	}
}
