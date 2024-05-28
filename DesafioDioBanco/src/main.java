public class main {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("Augusto");
		
		FamiliarCliente fam = new FamiliarCliente();
		fam.setNome("Junior");
		
		Conta cc = new ContaCorrente(cli);
		Conta poupanca = new ContaPoupança(cli);
		Conta jovem = new ContaJovem(fam);

		cc.depositar(100);
		cc.transferir(42, poupanca);
		jovem.depositar(200);
		jovem.transferir(30, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		jovem.imprimirExtrato();
	}

}