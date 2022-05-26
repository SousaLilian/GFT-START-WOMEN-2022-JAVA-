package gftWomen;

public class Ingredientes {

	private int quantidade;
	private int tempoPreparo;
	private String modoPreparo;

	public Ingredientes() {
	}

	public Ingredientes(int quantidade, int tempoPreparo, String modoPreparo) {
		this.quantidade = quantidade;
		this.tempoPreparo = tempoPreparo;
		this.modoPreparo = modoPreparo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(int tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}

	public void setModoPreparo(String modoPreparo) {
		this.modoPreparo = modoPreparo;
	}

	@Override
	public String toString() {
		return "Ingredientes{" + "quantidade=" + quantidade + ", tempoPreparo=" + tempoPreparo + ", modoPreparo='"
				+ modoPreparo + '\'' + '}';
	}

}
