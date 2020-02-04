package domain;

public class Estado {

	private Integer idEstado;
	private String nomeEstado;
	
	public Integer getIdEstado() {
		return idEstado;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	 
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", nomeEstado=" + nomeEstado + "]";
	}
	

}
