package gftWomen;

import java.time.LocalDate;

public class PessoaTeste {

	public static void main(String[] args) {
		final LocalDate dataAtual = LocalDate.now();
		final LocalDate aniversarioMaria = LocalDate.of(1990, 10, 10);
		final LocalDate aniversarioCarlos = LocalDate.of(1990, 10, 10);

		Pessoa Marcia = new Pessoa("Marcia", "Feminino", "Castanho", "Castanho Preto", aniversarioMaria, "A", "+");
		Pessoa Carlos = new Pessoa("Carlos", "Masculino", "Castanho", "Castanho Preto", aniversarioCarlos, "A", "+");

		System.out.println("Idade atual de " + Marcia.getNome() + " : " + Marcia.idade(aniversarioMaria, dataAtual));
		System.out.println("Idade atual de " + Carlos.getNome() + " : " + Carlos.idade(aniversarioCarlos, dataAtual));

		String probabilidadeDaCorOlhosBebe = Marcia.probabilidadeCorDoOlhoBebe(Carlos, Marcia);
		System.out.println(probabilidadeDaCorOlhosBebe);
		
		
	}
}
