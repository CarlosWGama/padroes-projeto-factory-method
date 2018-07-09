package exemplo.banco;

public class FabricaSQLServer implements IFabricaConexao {
	
	public IConexao getConexao() {
		return new SQLServer();
	}

}
