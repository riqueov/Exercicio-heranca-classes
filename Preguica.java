package exercicio.Animais;

public class Preguica extends Animal {
	public void Subindo() {
		System.out.println("E está subindo em uma arvore!");
	}
	
	public void Apresenta(String nome, int idade) {
		System.out.println("O Bicho preguiça, de nome " + nome + " tem " + idade + " anos");
	}
	
	@Override
	public void EmitirSom() {
		System.out.println("*aAaU Au Au AUuU*");
	}
}
