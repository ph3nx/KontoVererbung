
public class KontoVererbung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bankkonto b[];
		b = new Bankkonto[10];
		Girokonto g;
		Sparkonto s;
		
		g = new Girokonto();
		b[0] = g;
		b[0].setKontonr(4711); b[0].einzahlen(1000.00);
		
		s = new Sparkonto();
		s.einzahlen(500.00);
		s.setKontonr(4712);
		b[1]=s;
		
		s = new Sparkonto();
		s.einzahlen(800);
		b[2] = s;
		
		b[3] = new Girokonto();
		b[3].einzahlen(44000.00);
		
		b[4] = new Girokonto();
		b[4].einzahlen(10500.00);
		
		b[5] = new Girokonto();
		b[5].einzahlen(10000600.00);
		
		int counter = 0;
		int counterGiro = 0;
		int counterSpar = 0;
		
		for (int i=0; i<b.length; i++) {
			if (b[i] != null) {
				counter++;
			}
			if (b[i] instanceof Sparkonto) counterSpar++;
			if (b[i] instanceof Girokonto) counterGiro++;
		}
		System.out.println(counter);
		System.out.println(counterSpar);
		System.out.println(counterGiro);
		
		// Summe aller Kontostände
		
		double summe = 0;
		
		for (int i = 0; i<b.length; i++) {
			if (b[i] != null) {
				summe = summe + b[i].getKontostand();
			}
		}
		
		System.out.println("Summe ist: " + summe);
		
		
		// Monatsabschluss aller Konten
		
		
	}

}
