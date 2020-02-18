package jadecolou.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reserva implements BaseEntity{

	@Id()
	@GeneratedValue(generator = "id_reserva_seq",strategy = GenerationType.AUTO)
	@Column(name = "id_reserva")
	private Long id;
	
	private Date data;
	
	@OneToOne
	private Cliente cliente;
	
	@OneToOne
	private DestinoModalidade destinoModalidade;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public DestinoModalidade getDestinoModalidade() {
		return destinoModalidade;
	}

	public void setDestinoModalidade(DestinoModalidade destinoModalidade) {
		this.destinoModalidade = destinoModalidade;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
