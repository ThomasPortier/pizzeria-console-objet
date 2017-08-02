package fr.pizzeria.console;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public class PizzaDaoList implements IPizzaDao {

	ArrayList<Pizza> pizzas = new ArrayList<>();

	public PizzaDaoList() {

		// ArrayList<Pizza> pizzas = new ArrayList<>();
		pizzas.add(new Pizza("PEP", "Pépéroni", 12.50));
		pizzas.add(new Pizza("MAR", "Margherita", 14.00));
		pizzas.add(new Pizza("REI", "La Reine", 11.50));
		pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00));
		pizzas.add(new Pizza("CAN", "La cannibale", 12.50));
		pizzas.add(new Pizza("SAV", "La savoyarde", 13.00));
		pizzas.add(new Pizza("ORI", "L'orientale", 13.50));
		pizzas.add(new Pizza("IND", "L'indienne", 14.00));

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
				pizzas.remove(index);// pizzas indexPizza = i;
				break;
			}
		}

		return false;
	}

}
