package domain;

public class TipoPasseio {

	private Integer idTipoPasseio;
	private String nomePasseio;
	private String descricao;
	
	public Integer getIdTipoPasseio() {
		return idTipoPasseio;
	}
	public void setIdTipoPasseio(Integer idTipoPasseio) {
		this.idTipoPasseio = idTipoPasseio;
	}
	public String getNomePasseio() {
		return nomePasseio;
	}
	public void setNomePasseio(String nomePasseio) {
		this.nomePasseio = nomePasseio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "TipoPasseio [idTipoPasseio=" + idTipoPasseio + ", nomePasseio=" + nomePasseio + ", descricao="
				+ descricao + "]";
	}
	
	

}
