package naveEspacial;

public class MilleniumFalcon extends Apolo11 {

	private float classeHiperpropulsor;
	
	public MilleniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		setClasseHiperpropulsor(classeHiperpropulsor);
	}
	
	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}
	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MilleniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
