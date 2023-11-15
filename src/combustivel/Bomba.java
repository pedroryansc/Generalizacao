package combustivel;

public class Bomba {

	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		setTotalLitros(totalLitros);
		setValorLitro(valorLitro);
	}
	
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public double getTotalLitros() {
		return totalLitros;
	}
	
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public float getValorLitro() {
		return valorLitro;
	}

	public boolean abastecerPorLitro(int litros) {
		totalLitros += litros;
		return true;
	}
	public boolean abastecerPorValor(double valor) {
		totalLitros += (valor / valorLitro);
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}
}
