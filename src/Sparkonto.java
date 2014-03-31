
public class Sparkonto extends Bankkonto {
	
	@Override
	void zinsen() {
		if(kontostand>5000.00)kontostand=kontostand+(kontostand*zinssatz/100*12);
	}
	
	@Override
	void gebühren() {
		kontostand=kontostand-5.00;
	}

}
