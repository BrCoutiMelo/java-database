package loja;

public class Pneu {

	private int tamanho; 
	private int idPneu;
	private int aro;
	private int largura;
	private double preco; /*USAR NUMERIC NO SQL*/
	private String marca;
	private int perfil;
	private int qtd;
	
	
	
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getId() {
		return idPneu;
	}
	public void setId(int id) {
		this.idPneu = idPneu;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int ano) {
		this.aro = ano;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Pneu(int tamanho, int id, int ano, int largura, double preco, String marca, int perfil) {
		super();
		this.tamanho = tamanho;
		this.idPneu = idPneu;
		this.aro = ano;
		this.largura = largura;
		this.preco = preco;
		this.marca = marca;
		this.perfil = perfil;
	
	
	
	}
	
}
