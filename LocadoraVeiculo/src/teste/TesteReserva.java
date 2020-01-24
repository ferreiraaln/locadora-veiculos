package teste;

import org.junit.Assert;
import org.junit.Test;

import reserva.Caminhonete;
import reserva.CarroComum;
import reserva.Moto;
import reserva.Reserva;
import reserva.SUV;

public class TesteReserva {
	
	@Test
    public void testeCarroComumMenosDeCincoDias(){
		
		Integer dias = 3;
		CarroComum carro = new CarroComum();
		Reserva reserva = new Reserva();
		Double esperado = 126.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeCarroComumMaisDeCincoDiasMenosDeDezDias(){
		
		Integer dias = 8;
		CarroComum carro = new CarroComum();
		Reserva reserva = new Reserva();
		Double esperado = 352.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeCarroComumMaisDeDezDias(){
		
		Integer dias = 15;
		CarroComum carro = new CarroComum();
		Reserva reserva = new Reserva();
		Double esperado = 720.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeSUVMenosDeCincoDias(){
		Integer dias = 3;
		SUV carro = new SUV();
		Reserva reserva = new Reserva();
		Double esperado = 315.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void TesteSUVMaisDeCincoDiasMenosDeDezDias(){
		Integer dias = 8;
		SUV carro = new SUV();
		Reserva reserva = new Reserva();
		Double esperado = 880.00;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeSUVMaisDeDezDias(){
		Integer dias = 18;
		SUV carro = new SUV();
		Reserva reserva = new Reserva();
		Double esperado = 2160.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeCaminhoneteMenosDeCincoDias(){
		Integer dias = 3;
		Caminhonete carro = new Caminhonete();
		Reserva reserva = new Reserva();
		Double esperado = 252.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeCaminhoneteMaisDeCincoDiasMenosDeDezDias(){
		Integer dias = 7;
		Caminhonete carro = new Caminhonete();
		Reserva reserva = new Reserva();
		Double esperado = 616.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeCaminhoneteMaisDeDezDias(){
		Integer dias = 13;
		Caminhonete carro = new Caminhonete();
		Reserva reserva = new Reserva();
		Double esperado = 1248.0;
        Assert.assertEquals(esperado,reserva.reserva(carro, dias));
   }
	
	@Test
    public void testeMotoMenosDeCincoDias(){
		Integer dias = 2;
		Moto moto = new Moto();
		Reserva reserva = new Reserva();
		Double esperado = 63.0;
        Assert.assertEquals(esperado,reserva.reserva(moto, dias));
   }
	
	@Test
    public void testeMotoMaisDeCincoDiasMenosDeDezDias(){
		Integer dias = 6;
		Moto moto = new Moto();
		Reserva reserva = new Reserva();
		Double esperado = 198.0;
        Assert.assertEquals(esperado,reserva.reserva(moto, dias));
   }
	
	@Test
    public void testeMotoMaisDeDezDias(){
		Integer dias = 14;
		Moto moto = new Moto();
		Reserva reserva = new Reserva();
		Double esperado = 504.0;
        Assert.assertEquals(esperado,reserva.reserva(moto, dias));
   }
}
