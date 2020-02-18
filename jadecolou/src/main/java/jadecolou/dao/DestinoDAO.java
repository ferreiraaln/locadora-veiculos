package jadecolou.dao;

import jadecolou.model.Destino;

public class DestinoDAO extends DAO<Destino> {


    @Override
    protected String getSqlString() {
        return "select d from Destino d";
    }

    @Override
    protected Class<Destino> getClassName() {
        return Destino.class;
    }

}
