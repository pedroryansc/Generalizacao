package animal;

public class Cao extends Mamifero {

	private String raca;
	
	public Cao(float comprimento, float peso, String habitat, String alimentacao, String formaDeslocamento, String pelagem, String raca) {
		super(comprimento, peso, habitat, alimentacao, formaDeslocamento, pelagem);
		setRaca(raca);
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getRaca() {
		return raca;
	}
	
	public boolean latir() {
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [raca=");
		builder.append(raca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
