package jadecolou.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente implements BaseEntity{
	
	@Id()
	@GeneratedValue(generator = "id_cliente_seq",strategy = GenerationType.AUTO)
	@Column(name = "id_cliente")
	private Long id;
	
	private String nome;
	
	private String documento;
	
	@OneToMany (mappedBy = "cliente")
	private List<Reserva> reservas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
