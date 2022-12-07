package ProjetoFuncionarios;

import java.sql.Connection;
import java.sql.Preparedstatement;
	public class ClasseSQL {
		public void salvarDados(ClasseFuncionarios parametroFuncionario) {
			String insert_sql = "INSERT INTO tabela_funcionarios(id, nome, salario) VALUES (default,?,?)";
			Connection acesso = null;
			PreparedStatement preparar = null;
			try {
				acesso = ClasseConexao.criarconexao();
				preparar = (Preparedstatement) acesso.preparestatement(insert_sql);
				preparar.setstring(1, parametroFuncionario.getAtributoNomeFuncionario());
				preparar.setDouble(2, parametroFuncionario.getAtributoSalarioFuncionario());
				preparar.execute();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
			try {
				if(preparar != null) {
					preparar.close();
				}
				if(acesso != null) {
					acesso.close();
				}
			}catch(Exception e) {
				System.out.println();
			}
		}
