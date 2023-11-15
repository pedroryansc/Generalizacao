package item;

public class ItemMain {
	public static void main(String[] args) {
		
		Item item = new Item(12345, "Descrição padrão");
		System.out.println(item);
		
		Livro livro = new Livro(42, "O Guia do Mochileiro das Galáxias", "Douglas Adams");
		System.out.println(livro);
		
		Midia mid = new Midia(54321, "Mídia padrão", "Universal", 42);
		System.out.println(mid);
		
		CD cd = new CD(2017, "Terceiro álbum da banda Low Roar", "Tonequake Records", 49, 12, "Low Roar", "Once in a Long, Long While...");
		System.out.println(cd);
		
		VHS vhs = new VHS(2014, "Trilha sonora do filme 'Guardiões da Galáxia'", "Hollywood Records", 44.34f, "Awesome Mix Vol.1");
		System.out.print(vhs);
	}
}
