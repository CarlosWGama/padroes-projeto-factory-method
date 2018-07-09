package exemplo.banco;

public class FabricaMySQL implements IFabricaConexao {
	
	public IConexao getConexao() {
		return new MySQL();
	}
}
