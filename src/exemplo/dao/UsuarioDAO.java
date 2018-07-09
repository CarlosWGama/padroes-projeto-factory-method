package exemplo.dao;

import exemplo.banco.FabricaConexao;
import exemplo.banco.FabricaMySQL;
import exemplo.banco.FabricaSQLServer;
import exemplo.banco.FabricaSQLite;
import exemplo.banco.IConexao;
import exemplo.banco.IFabricaConexao;
import exemplo.banco.MySQL;
import exemplo.banco.SQLServer;
import exemplo.banco.SQLite;

public class UsuarioDAO {
	private final String BANCO = "MySQL";
	public IFabricaConexao fabrica;

	public UsuarioDAO() {
		if (BANCO.equals("MySQl")) 
			fabrica = new FabricaMySQL();
		if (BANCO.equals("SQLServer")) 
			fabrica = new FabricaSQLite();
		if (BANCO.equals("SQLite")) 
			fabrica = new FabricaSQLServer();
	}
	
	public void cadastrar() {
		String stmt = "INSERT INTO usuarios...";
		IConexao banco = fabrica.getConexao();
		banco.query(stmt);
	}
}
