package jadecolou.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Modalidade implements BaseEntity{


	@Id()
	@GeneratedValue(generator = "id_modalidade_seq",strategy = GenerationType.AUTO)
	@Column(name = "id_modalidade")
	private Long id;
	
	private String nome;
	
	@OneToMany(mappedBy = "modalidade")
	private List<DestinoModalidade> destinoModalidades;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<DestinoModalidade> getDestinoModalidades() {
		return destinoModalidades;
	}

	public void setDestinoModalidades(List<DestinoModalidade> destinoModalidades) {
		this.destinoModalidades = destinoModalidades;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
