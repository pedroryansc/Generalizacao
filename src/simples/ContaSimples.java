package simples;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numeroConta, double saldo, double saldoPoupanca) {
		super(banco, agencia, numeroConta, saldo);
		setSaldoPoupanca(saldoPoupanca);
	}
	
	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		saldoPoupanca += valor;
		return true;
	}
	public boolean saquePoupanca(double valor) {
		saldoPoupanca -= valor;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
