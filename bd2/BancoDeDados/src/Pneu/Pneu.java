/**
 * 
 */
package Pneu;
	
/**
 * 
 *
 */
public class Pneu {
	
	protected int idPneu;
	private int aro;
	private int qtd;
	private double preco;
	/**
	 * 
	 */
	
	public Pneu(int idPneu, int aro, int qtd, double preco) {
		super();
		this.idPneu = idPneu;
		this.aro = aro;
		this.qtd = qtd;
		this.preco = preco;
	}

	public Pneu() {
		// TODO Auto-generated constructor stub
	}

	public int getIdPneu() {
		return idPneu;
	}
	public void setIdPneu(int idPneu) {
		this.idPneu = idPneu;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
