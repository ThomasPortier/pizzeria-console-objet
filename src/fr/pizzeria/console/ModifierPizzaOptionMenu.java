package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;
import fr.pizzeria.exception.*;///UpdatePizzaException;
import fr.pizzeria.model.BasePizza;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public ModifierPizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() throws UpdatePizzaException {

		System.out.println("Veuillez choisir la pizza à modifier.");
		String codePizza = scanner.next();

		Integer indexPizza = -1;
		ArrayList<Pizza> pizzas = dao.findAllPizzas();
		boolean codeInvalide = false;
		for (Pizza pizzaModif : pizzas) {
			indexPizza++;

			if (pizzaModif.getCode().equals(codePizza)) {
				codeInvalide = true;
				System.out.println("Veuillez saisir la Base de la Pizza ");
				System.out.println(" TOMATE ou CREME ou PATATE");
				String baseStr = scanner.next().toUpperCase();
				BasePizza basePizza = BasePizza.valueOf(baseStr);

				int tailleMaxCode = 3;

				String code = "o";
				System.out.println("Veuillez saisir le code:");
				code = scanner.next().toUpperCase().substring(0, tailleMaxCode);

				System.out.println("Veuillez saisir le nom (sans espace):");
				String nom = scanner.next();

				System.out.println("Veuillez saisir le prix:");
				String prixStr = scanner.next();

				double prix = Double.parseDouble(prixStr);

				Pizza nouvellePizza = new Pizza(basePizza, code, nom, prix);
				dao.updatePizza(codePizza, nouvellePizza);

				// break;

			}

		}
		if (codeInvalide == false) {
			throw new UpdatePizzaException(" Exception : Le code n'existe pas");

		}

	}

}
