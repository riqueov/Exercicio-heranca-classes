package exercicio.Animais;

public class TestaAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro pug = new Cachorro();
		
		pug.setNome("Thor");
		pug.setIdade(6);
		
		pug.Apresenta(pug.getNome(),pug.getIdade());
		pug.Correr();
		pug.EmitirSom();
		
		System.out.println("\n");
		Cavalo PuroSangue = new Cavalo();
		
		PuroSangue.setNome("Galã");
		PuroSangue.setIdade(4);
		
		PuroSangue.Apresenta(PuroSangue.getNome(),PuroSangue.getIdade());
		PuroSangue.Correr();
		PuroSangue.EmitirSom();
		
		System.out.println("\n");
		Preguica PreguicaReal = new Preguica();
		
		PreguicaReal.setNome("Veloz");
		PreguicaReal.setIdade(4);
		
		PreguicaReal.Apresenta(PreguicaReal.getNome(),PreguicaReal.getIdade());
		PreguicaReal.Subindo();
		PreguicaReal.EmitirSom();
	}

}
