package jadecolou.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Destino implements BaseEntity{

	@Id()
	@GeneratedValue(generator = "id_destino_seq",strategy = GenerationType.AUTO)
	@Column(name = "id_destino")
	private Long id;
	
	private String local;
	
	@OneToMany
	private List<DestinoModalidade> destinoModalidades;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
	public DestinoModalidade addModalidade(Modalidade modalidade) {
		DestinoModalidade dm = new DestinoModalidade();
		dm.setDestino(this);
		dm.setModalidade(modalidade);
		
		if(this.destinoModalidades == null) {
			this.destinoModalidades = new ArrayList<DestinoModalidade>();
		}
		
		this.destinoModalidades.add(dm);
		
		return dm;
	}

	public List<DestinoModalidade> getDestinoModalidades() {
		return destinoModalidades;
	}

	public void setDestinoModalidades(List<DestinoModalidade> destinoModalidades) {
		this.destinoModalidades = destinoModalidades;
	}
}
