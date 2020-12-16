package entidades;

import java.util.Date;

public class Contrato {
	private Date data;
	private Double valor;
	private Integer horas;
	
	public Contrato() {
		
	}

	public Contrato(Date data, Double valor, Integer horas) {
	
		this.data = data;
		this.valor = valor;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double total() {
		return valor * horas;
	}
}
