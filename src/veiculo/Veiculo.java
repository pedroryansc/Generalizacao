package veiculo;

public class Veiculo {

	private boolean motor;
	
	public Veiculo(boolean motor) {
		setMotor(motor);
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [motor=");
		builder.append(motor);
		builder.append("]");
		return builder.toString();
	}
}
