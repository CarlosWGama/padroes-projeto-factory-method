package exemplo.banco;

public class FabricaSQLite implements IFabricaConexao {
	
	public IConexao getConexao() {
		return new SQLite();
	}

}
