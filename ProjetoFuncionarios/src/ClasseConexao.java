package ProjetoFuncionarios;

import java.sql.Connection;

	public class ClasseConexao {
		
			private static final String USERNAME = "root";
			private static final String PASSWORD = "12345678";
			private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/banco funcionarios";

		public static Connection criarConexao() throws Exception {
			Class.forName("com.mysql .cj.jdbc.Driver");
			Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			return conexao;
		}
 		public static void main(String[] args) throws Exception {
			Connection conexao = criarconexao();
			if (conexao != null) {
			System. out .println("Conexão okay!");
			conexao.close();
		}
}
}
