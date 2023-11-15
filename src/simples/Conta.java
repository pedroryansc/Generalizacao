package simples;

public class Conta {

	private String banco;
	private int agencia;
	private int numeroConta;
	private double saldo;
	
	public Conta(String banco, int agencia, int numeroConta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroConta(numeroConta);
		setSaldo(saldo);
	}
	
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getBanco() {
		return banco;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {
		return agencia;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}

	public boolean deposito(double valor) {
		saldo += valor;
		return true;
	}
	public boolean saque(double valor) {
		saldo -= valor;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroConta=");
		builder.append(numeroConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
}
