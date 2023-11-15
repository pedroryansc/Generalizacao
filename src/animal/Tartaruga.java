package animal;

public class Tartaruga extends Reptil {

	private String especie;
	private String composicaoCarapaca;
	
	public Tartaruga(float comprimento, float peso, String habitat, String alimentacao, String formaDeslocamento, String tipoEscama, String especie, String composicaoCarapaca) {
		super(comprimento, peso, habitat, alimentacao, formaDeslocamento, tipoEscama);
		setEspecie(especie);
		setComposicaoCarapaca(composicaoCarapaca);
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getEspecie() {
		return especie;
	}
	
	public void setComposicaoCarapaca(String composicaoCarapaca) {
		this.composicaoCarapaca = composicaoCarapaca;
	}
	public String getComposicaoCarapaca() {
		return composicaoCarapaca;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [especie=");
		builder.append(especie);
		builder.append(", composicaoCarapaca=");
		builder.append(composicaoCarapaca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
