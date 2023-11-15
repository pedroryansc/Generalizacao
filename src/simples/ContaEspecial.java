package simples;

public class ContaEspecial extends Conta {

	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroConta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroConta, saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}
	
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getLimite() {
		return limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
