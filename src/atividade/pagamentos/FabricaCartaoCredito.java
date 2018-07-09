package atividade.pagamentos;

public class FabricaCartaoCredito implements IFabricaPagamento {
	public FormaPagamento getFormaPagamento() {
		return new Boleto();
	}
}
