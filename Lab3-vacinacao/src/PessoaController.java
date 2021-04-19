import java.util.ArrayList;

public class PessoaController {
	private ArrayList<Pessoa> pessoas;

	public PessoaController() {
		this.pessoas = new ArrayList<Pessoa>();;
	}
	
	public void cadastrarPessoa(String nome, String cpf, String endereco, String cartao_sus, String email, String telefone, String profissao,
			String comorbidade) {
			Pessoa p = new Pessoa( nome,  cpf,  endereco,  cartao_sus,  email,  telefone,  profissao,
				 comorbidade);
			pessoas.add(p);
	}
	
	public String procurarPessoa(String cartao_sus) {
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getCartao_sus().equals(cartao_sus)) {
				return pessoas.get(i).toString();
			}
		} 
		return "Pessoa Não encontrada.";
	}
	
	
	public Pessoa getPessoa(String cartao_sus) {
		for(int i = 0; i < pessoas.size(); i++) {
			if(pessoas.get(i).getCartao_sus().equals(cartao_sus)) {
				return pessoas.get(i);
			}
		} 
		return new Pessoa();
	}
	
		
	
}
