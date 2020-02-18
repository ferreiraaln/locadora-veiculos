package jadecolou.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DestinoModalidade implements BaseEntity{
	
	@Id()
	@GeneratedValue(generator = "id_destino_modalidade_seq",strategy = GenerationType.AUTO)
	@Column(name = "id_destino_modalidade")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_destino")
	private Destino destino;
	
	@ManyToOne
	@JoinColumn(name = "id_modalidade")
	private Modalidade modalidade;

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
