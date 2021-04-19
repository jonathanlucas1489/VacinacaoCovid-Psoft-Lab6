
public class EstadoFinalizado extends State{

	EstadoFinalizado(Pessoa pessoa) {
		super(pessoa);
	}

	@Override
	public String naoHabilitada() {
		pessoa.setState(new EstadoFinalizado(pessoa));
		return "Não Habilitado Para Vacina";
	}

	@Override
	public String habilitadaPrimeira() {
		pessoa.setState(new EstadoHabilitadoPrimeira(pessoa));

		return "Habilitada para tomar primeira dose";
	}

	@Override
	public String tomouPrimeira() {
		pessoa.setState(new EstadoTomouPrimeira(pessoa));

		return "Tomou a primeira dose ";
	}

	@Override
	public String habilitadaSegunda() {
		pessoa.setState(new EstadoHabilitadoSegunda(pessoa));

		return "Habilitada para tomar segunda dose";
	}

	@Override
	public String finalizada() {
		pessoa.setState(new EstadoFinalizado(pessoa));

		return "Finalizada vacinação";
	}

	@Override
	public String toString() {
		return "Estado Finalizado";
	}
}
