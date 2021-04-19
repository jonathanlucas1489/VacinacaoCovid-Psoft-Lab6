public class Pessoa {
	
	private String nome;

	private String cpf;
	private String endereco;
	private String cartao_sus;
	private String email;
	private String telefone;
	private String profissao;
	private String comorbidade;
	private State state;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, String endereco, String cartao_sus, String email, String telefone, String profissao,
			String comorbidade) {
		super();
        this.state = new EstadoNaoHabilitado(this);
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cartao_sus = cartao_sus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartao_sus() {
		return cartao_sus;
	}

	public void setCartao_sus(String cartao_sus) {
		this.cartao_sus = cartao_sus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return  "A vacinação de " + nome + " está na seguinte situação: " + state.toString();
	}
	
}
