package ambiente;

public class Sala extends Ambiente {

	private boolean tv;
	
	public Sala(float area, boolean tv) {
		super(area);
		setTV(tv);
	}
	
	public void setTV(boolean tv) {
		this.tv = tv;
	}
	public boolean getTV() {
		return tv;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sala [tv=");
		builder.append(tv);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
