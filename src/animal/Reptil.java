package animal;

public class Reptil extends Animal {

	private String tipoEscama;
	
	public Reptil(float comprimento, float peso, String habitat, String alimentacao, String formaDeslocamento, String tipoEscama) {
		super(comprimento, peso, habitat, alimentacao, formaDeslocamento);
		setTipoEscama(tipoEscama);
	}
	
	public void setTipoEscama(String tipoEscama) {
		this.tipoEscama = tipoEscama;
	}
	public String getTipoEscama() {
		return tipoEscama;
	}
	
	public boolean trocarPele() {
		return true;
	}
	
	public boolean fazerSom() {
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [tipoEscama=");
		builder.append(tipoEscama);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
