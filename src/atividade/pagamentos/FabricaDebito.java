package atividade.pagamentos;

public class FabricaDebito implements IFabricaPagamento {
	public FormaPagamento getFormaPagamento() {
		return new Boleto();
	}
}
