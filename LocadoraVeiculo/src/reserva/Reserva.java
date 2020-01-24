package reserva;

import java.text.DecimalFormat;

public class Reserva {

	DecimalFormat format = new DecimalFormat("#.##");
	
	public Double reserva(Veiculo tipo, Integer dias) {
		Double taxa = 5.0;
		if(dias <= 5 && dias > 0) {
			return Double.valueOf(format.format(tipo.calculadiaria(dias,taxa)));
		} else if(dias > 5 && dias<=10) {
			taxa = 10.0;
			return Double.valueOf(format.format(tipo.calculadiaria(dias,taxa)));
		} else if(dias>10) {
			taxa= 20.0;
			return Double.valueOf(format.format(tipo.calculadiaria(dias,taxa)));		
		}
		
		return null;
		
	}
}
