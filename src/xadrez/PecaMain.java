package xadrez;

public class PecaMain {
	public static void main(String[] args) {
		
		Peca peca = new Peca(2, 1, false, 0);
		System.out.println(peca);
		
		Rei rei = new Rei(1, 4, true, 0);
		System.out.println(rei);
		
		Peao peao = new Peao(2, 1, false, 0);
		System.out.println(peao);
		peao.mover(3, 1);
		System.out.println(peao.getLinha() + " " + peao.getColuna());
		if(peao.mover(4, 1))
			System.out.println(peao.getMovimentos());
		else
			System.out.println("Movimento inválido");
		
		Torre tor = new Torre(1, 8, false, 0);
		System.out.println(tor);
		tor.mover(1, 1);
		System.out.println(tor.getLinha() + " " + tor.getColuna());
		if(tor.mover(2, 2))
			System.out.println(tor.getMovimentos());
		else
			System.out.println("Movimento inválido");
	}
}
