package naveEspacial;

public class NaveMain {
	public static void main(String[] args) {
		
		NaveEspacial nave = new NaveEspacial(1994);
		System.out.println(nave);
		
		Apolo11 ap = new Apolo11(38.6f, "Hidrogênio líquido");
		System.out.println(ap);
		
		MilleniumFalcon mf = new MilleniumFalcon(1977, "Metal líquido", 0.5f);
		System.out.println(mf);
	}
}
