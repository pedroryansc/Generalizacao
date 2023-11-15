package xadrez;

public class Torre extends Peca {
	
	public Torre(int linha, int coluna, boolean cor, int movimentos) {
		super(linha, coluna, cor, movimentos);
	}
	
	public boolean mover(int linha, int coluna) {
		if(linha >= 1 && linha <= 8 && coluna >= 1 && coluna <= 8 && (linha == getLinha() || coluna == getColuna())) {
			setLinha(linha);
			setColuna(coluna);
			setMovimentos(getMovimentos() + 1);
			return true;
		} else
			return false;
	}
	
}
