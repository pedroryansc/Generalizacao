package pessoa;

public class PessoaMain {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Gianluca Matos Klaumann");
		System.out.println(pessoa);
		
		PessoaFisica pf = new PessoaFisica("Pedro Henrique Damann", "123.456.789-10", ":)");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Igor Kammer Grahl", "140-2", "Muhahaha");
		System.out.println(pj);
	}
}