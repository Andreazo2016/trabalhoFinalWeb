package boot.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codVenda;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataVenda;
	
	
	@OneToOne
	private CarroCompra carro;
	
	public long getCodVenda() {
		return codVenda;
	}
	public Calendar getDataVenda() {
		return dataVenda;
	}
	public void setCodVenda(long codVenda) {
		this.codVenda = codVenda;
	}
	public void setDataVenda(Calendar dataVenda) {
		this.dataVenda = dataVenda;
	}
	public void setCarro(CarroCompra carro) {
		this.carro = carro;
	}
	public CarroCompra getCarro() {
		return carro;
	}
	
}
