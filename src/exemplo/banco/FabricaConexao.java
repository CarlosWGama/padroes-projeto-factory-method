package exemplo.banco;

public class FabricaConexao {

	public IConexao getConexao(String conexao) {
		if (conexao.equals("MySQL")) 
			return new MySQL();
		if (conexao.equals("SQLServer")) 
			return new SQLServer();
		if (conexao.equals("SQLite")) 
			return new SQLite();
		return null;
	}
}
