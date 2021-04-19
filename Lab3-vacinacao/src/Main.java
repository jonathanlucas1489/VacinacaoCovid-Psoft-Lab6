import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		PessoaController sys = new PessoaController();
		Scanner sc = new Scanner(System.in);
		String option = "";	
		Menu m = new Menu();
		
		do {
			
			m.exibir();
			System.out.print("Opção> ");		
			option = sc.nextLine();
			
			switch (option) {
			
			case "C":
				opcaoC(sys);
			break;
			
			case "A":
				opcaoA(sys);
			break;
			
			case "V":
				opcaoV(sys);
			break;				
				}		
	}
	while(!option.equals("S"));

	}
	
	
	public static void opcaoC(PessoaController sys) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome> ");
		String nome = sc.nextLine();
		
		System.out.print("CPF> ");
		String cpf = sc.nextLine();

		System.out.print("Endereco> ");
		String endereco = sc.nextLine();
		
		System.out.print("Cartao SUS> ");
		String cartao_sus = sc.nextLine();
		
		System.out.print("Email> ");
		String email = sc.nextLine();
		
		System.out.print("Telefone> ");
		String telefone = sc.nextLine();
		
		System.out.print("Profissao> ");
		String profissao = sc.nextLine();
		
		System.out.print("Comorbidade> ");
		String comorbidade = sc.nextLine();
		
		sys.cadastrarPessoa(nome, cpf, endereco, cartao_sus, email, telefone, profissao, comorbidade);
		
		System.out.print("CADASTRO REALIZADO! \n");
		
	}
	public static void opcaoV(PessoaController sys) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Cartao SUS> ");
		String cartao_sus = sc.nextLine();
		
		System.out.println(sys.procurarPessoa(cartao_sus));
	}

	public static void opcaoA(PessoaController sys) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("Cartao SUS> ");
		String cartao_sus = sc.nextLine();
		Pessoa p = sys.getPessoa(cartao_sus);
		opcoesA(p);
}
	private static void opcoesA(Pessoa p) {
		
		Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		m.exibirAlt();
		String optionn = "";	

		do {
			
			m.exibir();
			System.out.print("DIGITE H1, T1, H2 OU F PARA SELECIONAR ESTADO OU S PARA SAIR DA SELEÇÃO DE ESTADOS> ");		
			optionn = sc.nextLine();
			
			switch (optionn) {
			case "H1":
				opcaohum(p);
			break;
			
			case "T1":
				opcaotum(p);
			break;
			
			case "H2":
				opcaohdois(p);
			break;			
			case "F":
				opcaoF(p);
			break;	
			
			}		
	}
	while(!optionn.equals("S"));
	}

	private static void opcaoF(Pessoa sys) {
		sys.getState().finalizada();
		System.out.println("Estado Alterado para: Finalizado");
	}

	private static void opcaohdois(Pessoa sys) {
		sys.getState().habilitadaSegunda();
		System.out.println("Estado Alterado para: Habilitado para Segunda dose");
	}

	private static void opcaotum(Pessoa sys) {
		sys.getState().tomouPrimeira();
		System.out.println("Estado Alterado para: Tomou a Primeira Dose");
	}

	private static void opcaohum(Pessoa sys) {
		sys.getState().habilitadaPrimeira();
		System.out.println("Estado Alterado para: Habilitado para Primeira Dose");
	}
	

}

