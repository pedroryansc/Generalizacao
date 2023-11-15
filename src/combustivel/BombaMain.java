package combustivel;

public class BombaMain {
	public static void main(String[] args) {
		
		Bomba bomba = new Bomba(30, 5.52f);
		System.out.println(bomba);
		bomba.abastecerPorLitro(20);
		System.out.println(bomba.getTotalLitros());
		
		BombaGasolina bg = new BombaGasolina(0, 5.52f);
		System.out.println(bg);
		bg.abastecerPorValor(11.04);
		System.out.println(bg.getTotalLitros());
	}
}
