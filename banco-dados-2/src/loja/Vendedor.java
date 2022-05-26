package loja;

public class Vendedor {

	private int idVendedor;
	private String nome;
	private int salario;
	
	
	public Vendedor(int idVendedor, String nome, int salario) {
		super();
		this.idVendedor = idVendedor;
		this.nome = nome;
		this.salario = salario;
	
	
	}
	public int getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
