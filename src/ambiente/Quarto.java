package ambiente;

public class Quarto extends Ambiente {
	
	private int capacidade;
	
	public Quarto(float area, int capacidade) {
		super(area);
		setCapacidade(capacidade);
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getCapacidade() {
		return capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
