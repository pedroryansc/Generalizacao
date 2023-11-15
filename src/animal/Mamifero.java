package animal;

public class Mamifero extends Animal {

	private String pelagem;
	
	public Mamifero(float comprimento, float peso, String habitat, String alimentacao, String formaDeslocamento, String pelagem) {
		super(comprimento, peso, habitat, alimentacao, formaDeslocamento);
		setPelagem(pelagem);
	}
	
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getPelagem() {
		return pelagem;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [pelagem=");
		builder.append(pelagem);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
