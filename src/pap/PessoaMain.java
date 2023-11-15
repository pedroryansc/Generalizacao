package pap;

public class PessoaMain {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa(1910, "Gianluca Matos Klaumann", "Panificadora Dona Maria");
		System.out.println(p);
		
		Aluno al = new Aluno(1503, "Leonardo Knopf", "Santo Antônio", 2023004505);
		System.out.println(al);
		
		Professor prof = new Professor(501, "Pedro Ryan Coelho Iplinski", "Jardim América", "Física");
		System.out.print(prof);
	}
}