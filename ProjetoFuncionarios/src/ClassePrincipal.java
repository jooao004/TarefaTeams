
public class ClassePrincipal {
	public static void main(String[] args) {
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		funcionario.setAtributoNomeFuncionario("João");
		funcionario.setAtributoSalarioFuncionario(18000);
		System.out.println("Fim");
		ClasseSQL sql = new ClasseSQL();
		sql . salvarDados (funcionario);
	}
}
