package domain;

public class Pais {

	private Integer idPais;
	private String nomePais;
	
	public Integer getIdPais() {
		return idPais;
	}
	public String getNomePais() {
		return nomePais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	 
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	
	@Override
	public String toString() {
		return "PaisDAO [idPais=" + idPais + ", nomePais=" + nomePais + "]";
	}
	

}
