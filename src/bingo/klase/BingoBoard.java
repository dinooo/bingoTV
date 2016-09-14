package bingo.klase;

import java.util.ArrayList;
import java.util.Collections;

public class BingoBoard {
	
	/*
	 * Kreiranje brojeva u bubnju i mijesanje redosljeda
	 */
	private ArrayList<Integer> bingoBrojevi = new ArrayList<>();

	
	/*
	 * dohvatanje BingoBrojeva i tiketa
	 */
	public ArrayList<Integer> getBingoBrojevi() {
		return bingoBrojevi;
	}
	
	/*
	 * Kreiranje Bingo Brojeva
	 */
	public void generateBingo(){
		/*
		 * popunjavanje tabele brojevima 1-90
		 */
		ArrayList<Integer> pom = new ArrayList<>();
		for (int i = 1; i <= 90; i++) {
			pom.add(i);
		}
		
		/*
		 * miješanje sadrzaja cijele bingo table - svih 90 brojeva
		 */
		Collections.shuffle(pom);
		
		/*
		 * u listi ostaju samo 33 broja jer igra zavrsava nakon 33. izvucenog broja. Odbacujemo ostalih 57 brojeva iz niza
		 */
		for (int i =  0; i<33; i++) {
			bingoBrojevi.add(pom.get(i));
		}
	
	}

}
