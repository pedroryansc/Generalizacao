package animal;

public class Animal {
	
	private float comprimento;
	private float peso;
	private String habitat;
	private String alimentacao;
	private String formaDeslocamento;
	
	public Animal(float comprimento, float peso, String habitat, String alimentacao, String formaDeslocamento) {
		setComprimento(comprimento);
		setPeso(peso);
		setHabitat(habitat);
		setAlimentacao(alimentacao);
		setFormaDeslocamento(formaDeslocamento);
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getFormaDeslocamento() {
		return formaDeslocamento;
	}

	public void setFormaDeslocamento(String formaDeslocamento) {
		this.formaDeslocamento = formaDeslocamento;
	}

	public void comer(float comida) {
		peso += comida;
	}
	public void deslocar() {
		peso -= 0.01;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Animal [comprimento=");
		builder.append(comprimento);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", habitat=");
		builder.append(habitat);
		builder.append(", alimentacao=");
		builder.append(alimentacao);
		builder.append(", formaDeslocamento=");
		builder.append(formaDeslocamento);
		builder.append("]");
		return builder.toString();
	}
}
