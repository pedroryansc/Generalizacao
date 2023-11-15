package animal;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal animal = new Animal(0.7f, 20, "Ambiente doméstico", "Onívoro", "Quadrúpede");
		System.out.println(animal);
		animal.comer(2);
		System.out.println(animal.getPeso());
		animal.deslocar();
		System.out.println(animal.getPeso());
		
		Mamifero mami = new Mamifero(0.7f, 20, "Ambiente doméstico", "Onívoro", "Quadrúpede", "Curta");
		System.out.println(mami);
		mami.deslocar();
		System.out.println(mami.getPeso());
		
		Gato gato = new Gato(0.42f, 10.5f, "Ambiente doméstico", "Carnívoro", "Quadrúpede", "Longa", "Sprigatito");
		System.out.println(gato);
		gato.comer(0.78f);
		System.out.println(gato.getPeso());
		System.out.println(gato.miar());
		
		Cao cao = new Cao(0.7f, 20, "Ambiente doméstico", "Onívoro", "Quadrúpede", "Curta", "Vira-lata");
		System.out.println(cao);
		cao.comer(5);
		System.out.println(cao.getPeso());
		cao.deslocar();
		cao.deslocar();
		System.out.println(cao.getPeso());
		System.out.println(cao.latir());
		
		Reptil rep = new Reptil(0.3f, 0.42f, "Floresta, Savana", "Onívoro", "Quadrúpede", "Média");
		System.out.println(rep);
		System.out.println(rep.trocarPele());
		System.out.println(rep.fazerSom());
		
		Tartaruga tart = new Tartaruga(1, 40, "Oceano", "Onívoro", "Quadrúpede", "Grande", "Tartaruga-verde", "Queratina");
		System.out.println(tart);
		System.out.println(tart.fazerSom());
		
		Lagarto lag = new Lagarto(0.3f, 0.3f, "Floresta de Eucalipto, Floresta de Acácia, Savana, Deserto", "Onívoro", "Quadrúpede", "Pequena", "Pogona");
		System.out.println(lag);
		lag.deslocar();
		System.out.println(lag.getPeso());
	}
}
