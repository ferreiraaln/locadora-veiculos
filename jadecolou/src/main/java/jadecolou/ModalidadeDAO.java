package jadecolou;

import jadecolou.dao.DAO;
import jadecolou.model.Modalidade;

public class ModalidadeDAO  extends DAO<Modalidade> {

    @Override
    protected String getSqlString() {
        return "select m from Modalidade m";
    }

    @Override
    protected Class<Modalidade> getClassName() {
        return Modalidade.class;
    }
}