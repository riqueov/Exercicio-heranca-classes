package exercicio.Animais;

public class Cachorro extends Animal {
	
	public void Correr() {
		System.out.println("E est� correndo");
	}
	
	public void Apresenta(String nome, int idade) {
		System.out.println("O Cachorro " + nome + " tem " + idade + " anos");
	}
}
