package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades_enum.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	
	private List<Contrato> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Contrato> getContratos() {
		return contratos;
	}
	
	
	public void adicionarContrato(Contrato contrato) {
		//adicionando contratos da lista
		contratos.add(contrato);
	}
	
	public void removerContrato(Contrato contrato) {		
		//removendo contratos da lista
		contratos.remove(contrato);
	}
	
	public Double somar(int ano, int mes) {
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (Contrato c : contratos) {
			cal.setTime(c.getData());
			if ((cal.get(Calendar.YEAR) == ano ) && (cal.get(Calendar.MONTH) == mes)) {
				sum += c.total();
			}
		}
		return sum;
	}
	
}
