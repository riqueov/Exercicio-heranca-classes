package exercicio.Animais;

public abstract class Animal {
	
	private String Nome;
	private int Idade;	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}

	
	public void EmitirSom() {
		System.out.println("*Emitindo som*");
	}
}
