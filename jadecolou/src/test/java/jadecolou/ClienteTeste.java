package jadecolou;

import org.junit.Assert;
import org.junit.Test;

import jadecolou.dao.ClienteDAO;
import jadecolou.model.Cliente;

public class ClienteTeste {

	@Test
	public void salvaCliente() {
		
		Cliente cliente =  new Cliente();
		ClienteDAO dao = new ClienteDAO();
		
		cliente.setDocumento("14dsd78s");
		cliente.setNome("jão da Silva");
		
		dao.save(cliente);

		Assert.assertNotNull(cliente.getId());		
	}		
}
