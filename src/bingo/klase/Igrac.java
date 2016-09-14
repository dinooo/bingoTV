package bingo.klase;

import java.util.ArrayList;
import java.util.Collections;

public class Igrac {
	
	private String imeIgrac;
	private ArrayList<Integer> bingoTiket = new ArrayList<>();
	
	public String getImeIgrac() {
		return imeIgrac;
	}
	
	public ArrayList<Integer> getBingoTiket() {
		return bingoTiket;
	}
	
	public void setImeIgrac(String imeIgrac) {
		this.imeIgrac = imeIgrac;
	}
	
	/*
	 * Kreiranje Bingo Tiketa
	 */
	public void generateTiket(){
		ArrayList<Integer> pom = new ArrayList<>();
		/*
		 * popunjavanje tabele brojevima 1-90
		 */
		for (int i = 1; i <= 90; i++) {
			pom.add(i);
		}
		
		Collections.shuffle(pom);
		
		/*
		 * u bingo tiketu, ne moze biti vise od tri broja iz jedne dekade u tiketu, tako da moramo o tome voditi racuna
		 */
		int p0=0, p1=0, p2=0, p3=0, p4=0, p5=0, p6=0, p7=0, p8=0; //pomocne varijable koje ce brojati koliko brojeva iz odredjene dekade vec imamo u tiketu
		/*
		 * prolzimo kroz pomocni vektor koji sadrzi sve brojeve od 1-90 izmjesane. Iz tog vektora cemo vaditi jedan po jedan broj, i ubacivati u 
		 * tiket, ali pazeci da iz jedne dekade ne bude vise od 3 broja ubaceno
		 */
		for (int i = 0; i < pom.size(); i++) {
			
			if(pom.get(i)<=9 && p0<3){
				bingoTiket.add(pom.get(i));
				p0++;
			}
			else if(pom.get(i)>=10 && pom.get(i)<=19 && p1<3){
				bingoTiket.add(pom.get(i));
				p1++;
			}
			else if(pom.get(i)>=20 && pom.get(i)<=29 && p2<3){
				bingoTiket.add(pom.get(i));
				p2++;
			}
			else if(pom.get(i)>=30 && pom.get(i)<=39 && p3<3){
				bingoTiket.add(pom.get(i));
				p3++;
			}
			else if(pom.get(i)>=40 && pom.get(i)<=49 && p4<3){
				bingoTiket.add(pom.get(i));
				p4++;
			}
			else if(pom.get(i)>=50 && pom.get(i)<=59 && p5<3){
				bingoTiket.add(pom.get(i));
				p5++;
			}
			else if(pom.get(i)>=60 && pom.get(i)<=69 && p6<3){
				bingoTiket.add(pom.get(i));
				p6++;
			}
			else if(pom.get(i)>=70 && pom.get(i)<=79 && p7<3){
				bingoTiket.add(pom.get(i));
				p7++;
			}
			else if(pom.get(i)>=80 && pom.get(i)<=90 && p8<3){
				bingoTiket.add(pom.get(i));
				p8++;
			}
			
			
		}
		

		for (int i =  bingoTiket.size(); i >15; i--) {
			bingoTiket.remove(i-1);
		}
	
	}	
	
}
