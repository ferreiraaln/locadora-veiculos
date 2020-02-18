package jadecolou;

import org.junit.Assert;
import org.junit.Test;

import jadecolou.dao.ModalidadeDAO;
import jadecolou.model.Modalidade;

public class modalidadeTeste {

	@Test
	public void testeModalidade() {
		
		Modalidade modalidade =  new Modalidade();
		ModalidadeDAO dao = new ModalidadeDAO();
		
		modalidade.setNome("Combo");
				
		dao.save(modalidade);

		Assert.assertNotNull(modalidade.getId());
	}

}
