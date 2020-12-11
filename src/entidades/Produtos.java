package entidades;

public class Produtos {
	private String nome;
	private double preco;
	private double qtd;
	
	//contrutor 1
	public Produtos(){
		
	}
	
	//contrutor 2
	public Produtos(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		
	}
	
	//contrutor 3
	public Produtos(String nome, double preco, double qtd){
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQtd() {
		return qtd;
	}

	public void setQtd(double qtd) {
		this.qtd = qtd;
	}
	
	public double totalEmEstoque() {
		return preco*qtd;
	}
	
	public void adProduto(int qtd) {
		this.qtd += qtd;
	}
	
	public void rmProduto(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString(){
		return nome+" , $ "+preco+ ", Qtd: "+qtd+" Total: "+totalEmEstoque();
	}
}
