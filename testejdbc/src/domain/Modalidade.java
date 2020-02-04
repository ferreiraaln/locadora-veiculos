package domain;

public class Modalidade {

	private Integer idModalidade;
	private String nomeModalidade;
	
	public Integer getIdModalidade() {
		return idModalidade;
	}
	public String getNomeModalidade() {
		return nomeModalidade;
	}
	public void setIdModalidade(Integer idMOdalidade) {
		this.idModalidade = idMOdalidade;
	}
	 
	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}
	@Override
	public String toString() {
		return "Modalidade [idModalidade=" + idModalidade + ", nomeModalidade=" + nomeModalidade + "]";
	}
	

}
