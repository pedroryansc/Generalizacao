package animal;

public class Lagarto extends Reptil {

	private String especie;
	
	public Lagarto(float comprimento, float peso, String habitat, String alimentacao, String formaDeslocamento, String tipoEscama, String especie) {
		super(comprimento, peso, habitat, alimentacao, formaDeslocamento, tipoEscama);
		setEspecie(especie);
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getEspecie() {
		return especie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [especie=");
		builder.append(especie);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
