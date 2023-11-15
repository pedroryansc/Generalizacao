package xadrez;

public class Peao extends Peca {

	public Peao(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public boolean mover(int linha, int coluna) {
		if(linha <= 8 && linha == getLinha() + 1 && getColuna() == coluna) {
			setLinha(linha);
			setMovimentos(getMovimentos() + 1);
			return true;
		} else
			return false;
	}
}
