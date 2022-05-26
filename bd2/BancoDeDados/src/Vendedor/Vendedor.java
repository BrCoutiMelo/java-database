/**
 * 
 */
package Vendedor;

import Pneu.Pneu;

/**
 * 
 *
 */
public class Vendedor extends Pneu{

	protected int idVendedor;
	private String nome;
	
	/**
	 * 
	 */
	
	public Vendedor(int idVendedor, String nome) {
		this.idVendedor = idVendedor;
		this.nome = nome;
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
	
	

}
