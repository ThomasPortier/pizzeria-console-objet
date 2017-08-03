package fr.pizzeria.console;

import fr.pizzeria.model.BasePizza;
import fr.pizzeria.model.Pizza;

import java.util.ArrayList;
//import java.util.Locale.Category;

public class PizzaDaoList implements IPizzaDao {

	ArrayList<Pizza> pizzas = new ArrayList<>();

	public PizzaDaoList() {

		// ArrayList<Pizza> pizzas = new ArrayList<>();
		pizzas.add(new Pizza(BasePizza.CREME, "PEP", "Pépéroni", 12.50));
		pizzas.add(new Pizza(BasePizza.TOMATE, "MAR", "Margherita", 14.00));
		pizzas.add(new Pizza(BasePizza.TOMATE, "REI", "La Reine", 11.50));
		pizzas.add(new Pizza(BasePizza.CREME, "FRO", "La 4 fromages", 12.00));
		pizzas.add(new Pizza(BasePizza.TOMATE, "CAN", "La cannibale", 12.50));
		pizzas.add(new Pizza(BasePizza.CREME, "SAV", "La savoyarde", 13.00));
		pizzas.add(new Pizza(BasePizza.PATATE, "ORI", "L'orientale", 13.50));
		pizzas.add(new Pizza(BasePizza.TOMATE, "IND", "L'indienne", 14.00));

	}

	public ArrayList<Pizza> findAllPizzas() {
		return pizzas;
	}

	public boolean saveNewPizza(Pizza pizza) {
		pizzas.add(pizza); // new Pizza(code, nom, prix);
		return false;
	}

	public boolean updatePizza(String codePizza, Pizza pizza) {
		Integer indexPizza = -1;
		for (Pizza pizzaModif : pizzas) {
			indexPizza++;

			if (pizzaModif.getCode().equals(codePizza)) {
				break;
			}
		}

		pizzas.set(indexPizza, pizza);
		return false;
	}

	public boolean deletePizza(String codePizza) {
		int index = -1;
		for (Pizza pizzatodelete : pizzas) {
			index++;
			if (pizzatodelete.getCode().equals(codePizza)) {
				pizzas.remove(index);
			}
		}

		return false;
	}

	public boolean pizzaExist(String codePizza) {
		for (Pizza unepizza : pizzas) {
			if (unepizza.getCode().equals(codePizza)) {
				return true;
			}
		}
		return false;

	}

}
