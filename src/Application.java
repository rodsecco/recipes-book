import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Ingredient> ingredientes = getIngredients();
		List<Recipe> receitas = getRecipes();
		
		

	}
	
	public static List<Ingredient> getIngredients() {
		return List.of(
			new Ingredient("Ovos","3"),
			new Ingredient("Farinha","100g"),
			new Ingredient("Leite","200ml")
		);
	}
	
	public static List<Recipe> getRecipes() {
		return List.of(
			new Recipe("Bolo", getIngredients(), "Bate tudo e coloca no forno"),
			new Recipe("Doce", getIngredients(),"Mexe na panela até dar ponto")
		);
	}

}
