package simples;

public class ContaMain {
	public static void main(String[] args) {
		
		Conta conta = new Conta("Caixa Econômica Federal", 1234, 501, 1000.41);
		System.out.println(conta);
		conta.deposito(399.59);
		System.out.println(conta.getSaldo());
		conta.saque(900);
		System.out.println(conta.getSaldo());
		
		ContaSimples cs = new ContaSimples("Nubank", 0001, 140, 1239.40, 2300);
		System.out.println(cs);
		cs.depositoPoupanca(600);
		System.out.println(cs.getSaldoPoupanca());
		cs.saquePoupanca(500);
		System.out.println(cs.getSaldoPoupanca());
		cs.deposito(619.70);
		System.out.println(cs.getSaldo());
		
		ContaEspecial ce = new ContaEspecial("Itaú", 341, 181, 320, 60, 12);
		System.out.println(ce);
	}
}
