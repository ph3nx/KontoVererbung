
public abstract class Bankkonto {
	
	public int kontonr;
	protected double kontostand;
	protected double zinssatz = 1;
	
	public void setKontonr(int _kontonr) {
		kontonr = _kontonr;
	}
	
	public void abbuchen(double _betrag) {
		kontostand = kontostand - _betrag;
	}
	
	public void einzahlen(double _betrag) {
		kontostand = kontostand + _betrag;
	}
	
	public double getKontostand() {
		return kontostand;
	}
	
	public void monatsabschluss() {
		gebühren();
		zinsen();
	}
	
	public void setZinssatz(double _zinssatz) {
		zinssatz = _zinssatz;
	}
	
	abstract void zinsen();
	
	abstract void gebühren();

}
