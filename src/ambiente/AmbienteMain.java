package ambiente;

public class AmbienteMain {
	public static void main(String[] args) {
		
		Ambiente amb = new Ambiente(14.5f);
		System.out.println(amb);
		
		Quarto quar = new Quarto(17.9f, 1);
		System.out.println(quar);
		
		Sala sala = new Sala(23.42f, true);
		System.out.println(sala);
		
		Banheiro ban = new Banheiro(10, false);
		System.out.println(ban);
		
		Cozinha coz = new Cozinha(19.42f, true);
		System.out.print(coz);
	}
}
