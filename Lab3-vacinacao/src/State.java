public abstract class State {
	Pessoa pessoa;
	
	State(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public abstract String naoHabilitada();
	public abstract String habilitadaPrimeira();
	public abstract String tomouPrimeira();
	public abstract String habilitadaSegunda();
	public abstract String finalizada();
}
