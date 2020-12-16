package entidades;

import java.util.Date;

import entidades_enum.StatusVenda;

public class Pedido {
	private Integer id;
	private Date data;
	private StatusVenda status;
	
	public Pedido() {
		
	}

	public Pedido(Integer id, Date data, StatusVenda status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusVenda getStatus() {
		return status;
	}

	public void setStatus(StatusVenda status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	
	
	
}
