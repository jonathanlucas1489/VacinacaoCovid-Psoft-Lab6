public class Menu {
	public void exibir() {
		System.out.println("(C)adastrar Pessoa");
		System.out.println("(A)lterar Estado do cadastro");
		System.out.println("(V)erificar pessoa");
		System.out.println("(S)air");
	}
	
	public void exibirAlt() {
		System.out.println("Digite o CPF e o estado para o qual deseja alterar");
		System.out.println("(H1) Habilitado Para Primeira Dose");
		System.out.println("(T1) Tomou a Primeira Dose");
		System.out.println("(H2) Habilitado Para Segunda Dose");
		System.out.println("(F) Vacinação Finalizada");
		System.out.println("(S)air");
	}
}