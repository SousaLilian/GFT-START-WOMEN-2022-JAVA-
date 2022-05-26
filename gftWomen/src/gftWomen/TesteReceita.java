package gftWomen;

import java.util.ArrayList;
import java.util.List;

public class TesteReceita {

	public static void main(String[] args) {

		List<Ingredientes> ingredientesReceita = new ArrayList<>();
		ingredientesReceita.add(new Ingredientes(3, 60, "primeiro"));
		ingredientesReceita.add(new Ingredientes(1, 50, "segundo"));
		ingredientesReceita.add(new Ingredientes(2, 40, "alguma coisa"));

		Receita receita1 = new Receita("Torta", ingredientesReceita);
		Receita receita2 = new Receita("Bolo", ingredientesReceita);

		List<Ingredientes> ingredientesPesquisa = new ArrayList<Ingredientes>();
		ingredientesPesquisa.add(new Ingredientes(3, 60, "Sei la"));

		for (Ingredientes ingrediente : ingredientesReceita) {
			System.out.println(ingrediente);
		}
		if (receita1.getIgredientes().contains(ingredientesPesquisa)) {
			System.out.println("entrou");
		}

	}

}
