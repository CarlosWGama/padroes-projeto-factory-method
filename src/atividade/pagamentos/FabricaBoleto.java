package atividade.pagamentos;

public class FabricaBoleto implements IFabricaPagamento {

	public FormaPagamento getFormaPagamento() {
		return new Boleto();
	}	
}
