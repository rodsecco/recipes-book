import java.util.List;

public class Recipe {
	private String nome;
	private List<Ingredient> ingrediente;
	private String modoPreparo;	
	
	public Recipe(String nome, List<Ingredient> ingrediente, String modoPreparo) {
		this.nome = nome;
		this.ingrediente = ingrediente;
		this.modoPreparo = modoPreparo;
	}

	public String getNome() {
		return nome;
	}

	public List<Ingredient> getIngrediente() {
		return ingrediente;
	}

	public String getModoPreparo() {
		return modoPreparo;
	}
	
	
}
