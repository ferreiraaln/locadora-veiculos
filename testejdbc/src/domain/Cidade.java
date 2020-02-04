package domain;

public class Cidade {

	private Integer idCidade;
	private String nomeCidade;
	
	public Integer getIdCidade() {
		return idCidade;
	}
	public String getNomeCidade() {
		return nomeCidade;
	}
	public void setIdCidade(Integer idCidade ) {
		this.idCidade = idCidade ;
	}
	 
	public void setNomeCidade (String nomeCidade ) {
		this.nomeCidade = nomeCidade ;
	}
	@Override
	public String toString() {
		return "Cidade [idCidade=" + idCidade + ", nomeCidade =" + nomeCidade + "]";
	}
	

}
