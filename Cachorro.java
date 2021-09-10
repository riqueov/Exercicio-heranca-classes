package exercicio.Animais;

public class Cachorro extends Animal {
	
	public void Correr() {
		System.out.println("E está correndo");
	}
	
	public void Apresenta(String nome, int idade) {
		System.out.println("O Cachorro " + nome + " tem " + idade + " anos");
	}
	
	@Override
	public void EmitirSom() {
		System.out.println("*aU Au Au AUuU*");
	}
}
