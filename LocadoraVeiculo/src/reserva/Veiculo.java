package reserva;

public abstract class Veiculo {

	public abstract Double diaria();
	
	public Double calculadiaria(Integer dias, Double taxa ) {
		return (dias * this.diaria()) * ((taxa/100)+1);
	}

}
