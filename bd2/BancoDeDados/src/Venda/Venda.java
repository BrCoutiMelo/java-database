/**
 * 
 */
package Venda;

import Vendedor.Vendedor;

/**
 * 
 *
 */
public class Venda extends Vendedor {
	
	private int idP = idPneu;
	private int idV = idVendedor;
	private double valor;
	
	public Venda(int idVendedor, String nome, int idP, int idV, double valor) {
		super(idVendedor, nome);
		this.idP = idP;
		this.idV = idV;
		this.valor = valor;
	}
	
	public int getIdP() {
		return idP;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getIdV() {
		return idV;
	}
}
