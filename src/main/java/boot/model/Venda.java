package boot.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable {
	@Id
	@GeneratedValue
	private long codVenda;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataVenda;

	
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
	
}
