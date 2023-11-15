package veiculo;

public class VeiculoMain {
	public static void main(String[] args) {
		
		Veiculo vei = new Veiculo(true);
		System.out.println(vei);
		
		Caminhao cam = new Caminhao(true, 4);
		System.out.println(cam);
		
		Carro car = new Carro(false, 2);
		System.out.println(car);
		
		Moto moto = new Moto(true, 150);
		System.out.println(moto);
	}
}
