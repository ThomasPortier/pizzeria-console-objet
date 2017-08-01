package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public ModifierPizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() {

		System.out.println("Veuillez choisir la pizza à modifier.");
		String codePizza = scanner.next();

		int indexPizza = -1;
		Pizza[] pizzas = dao.findAllPizzas();
		for (int i = 0; i < pizzas.length; i++) {

			if (pizzas[i].getCode().equals(codePizza)) {

				indexPizza = i;
				break;
			}
		}

		if (indexPizza != -1) {
			System.out.println("Veuillez saisir le code:");
			String code = scanner.next();

			System.out.println("Veuillez saisir le nom (sans espace):");
			String nom = scanner.next();

			System.out.println("Veuillez saisir le prix:");
			String prixStr = scanner.next();

			double prix = Double.parseDouble(prixStr);
			
			Pizza nouvellePizza = new Pizza(code, nom, prix);
			dao.updatePizza(codePizza, nouvellePizza);
			
			

			pizzas[indexPizza] = new Pizza(code, nom, prix);
		} else {
			System.out.println("Code inexistant :" + codePizza);
		}
	}

}
