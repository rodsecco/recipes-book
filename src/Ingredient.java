public class Ingredient {
	
	private String nome;
	private String quantidade;	
	
	public Ingredient(String nome, String quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public String getQuantidade() {
		return quantidade;
	}
}
