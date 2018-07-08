	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class BancoDeDados {

		//Parâmetros de acesso ao banco de dados - x
		private Connection connection = null;
		private Statement statement = null;
		private ResultSet resultset = null;

		//método para conexão com banco de dados
		
//		MariaDB [db_noticias]> set password for 'testuser'@'%' = 'teste123'
//			    -> ;
//			ERROR 1372 (HY000): Password hash should be a 41-digit hexadecimal number
//			MariaDB [db_noticias]> set password for 'testuser'@'%' = password('testuser123');
//			Query OK, 0 rows affected (0.03 sec)
//
//			MariaDB [db_noticias]> commit;
//			Query OK, 0 rows affected (0.00 sec)

		
		public void conectar() {
			String servidor = "jdbc:mysql://localhost:3306/db_noticias";
			String usuario = "testuser";
			String senha = "testuser123";
			String driver = "com.mysql.cj.jdbc.Driver";
			try {
					Class.forName(driver);
					this.connection = DriverManager.getConnection(servidor, usuario, senha);
					this.statement = this.connection.createStatement();
				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
				}
		}

		//Método para testar conexão com banco de dados
		public boolean estaConectado() {
			if(this.connection != null) {
				return true;
			} else {
				return false;
			}
		}

		public Connection getConnection() {
			return connection;
		}
		public void setConnection(Connection connection) {
			this.connection = connection;
		}
		public Statement getStatement() {
			return statement;
		}
		public void setStatement(Statement statement) {
			this.statement = statement;
		}
		public ResultSet getResultset() {
			return resultset;
		}
		public void setResultset(ResultSet resultset) {
			this.resultset = resultset;
		}
	}
