package jadecolou.dao;

import jadecolou.model.Reserva;

public class ReservaDAO extends DAO<Reserva> {


    @Override
    protected String getSqlString() {
        return "select r from Reserva r";
    }

    @Override
    protected Class<Reserva> getClassName() {
        return Reserva.class;
    }
}
