package jadecolou;

import org.junit.Assert;
import org.junit.Test;

import jadecolou.dao.DestinoDAO;
import jadecolou.model.Destino;

public class DestinoTeste {
	
	@Test
	public void testeDestino() {
		
		Destino destino =  new Destino();
		DestinoDAO dao = new DestinoDAO();
		
		destino.setLocal("Espanha");
				
		dao.save(destino);

		Assert.assertNotNull(destino.getId());
	}

}
