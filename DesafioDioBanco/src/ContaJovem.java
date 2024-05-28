
public class ContaJovem extends Conta{

	public ContaJovem(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("==========Extrato conta do seu familiar (idade inferior a 18 anos)==========");
		super.imprimirInformacoesComuns();
	}
	
}
