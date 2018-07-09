package atividade.pagamentos;

public abstract class FormaPagamento {

	protected double preco;
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract void telaPagamento();
}
