package exemplo.dao;

import exemplo.banco.MySQL;
import exemplo.banco.SQLServer;
import exemplo.banco.SQLite;

public class UsuarioDAO {

	private final String BANCO = "MySQL";
	
	public void cadastrar() {
		String stmt = "INSERT INTO usuarios...";
		
		if (BANCO.equals("MySQL")) {
			MySQL banco = new MySQL();
			banco.query(stmt);
		} else if (BANCO.equals("SQLServer")) {
			SQLServer banco = new SQLServer();
			banco.query(stmt);
		} else if (BANCO.equals("SQLite")) {
			SQLite banco = new SQLite();
			banco.query(stmt);
		}
	}
}
