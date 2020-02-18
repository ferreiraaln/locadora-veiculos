package jadecolou.dao;

import jadecolou.model.Cliente;

public class ClienteDAO extends DAO<Cliente> {


    @Override
    protected String getSqlString() {
        return "select c from Cliente c";
    }

    @Override
    protected Class<Cliente> getClassName() {
        return Cliente.class;
    }
}
