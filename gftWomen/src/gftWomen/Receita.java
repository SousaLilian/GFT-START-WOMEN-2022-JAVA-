package gftWomen;

import java.util.List;

public class Receita {
	
	 private String nome;
	    private List<Ingredientes> ingredientes;


	    public Receita(String nome, List<Ingredientes> ingredientes) {
	        this.nome = nome;
	        this.ingredientes = ingredientes;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public List<Ingredientes> getIgredientes() {
	        return ingredientes;
	    }

	    public void setIgredientes(List<Ingredientes> ingredientes) {
	        this.ingredientes = ingredientes;
	    }

}
