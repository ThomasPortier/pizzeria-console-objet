package fr.pizzeria.console;

import java.util.ArrayList;
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
		
//		for (Pizza pizzaModif: pizzas) {
//			if (pizzaModif.getCode().equals(codePizza)) {
//				
//			}	
//		}

		Integer indexPizza = -1;
		ArrayList<Pizza> pizzas = dao.findAllPizzas();
		for (Pizza pizzaModif: pizzas) {
			indexPizza++;
			if (pizzaModif.getCode().equals(codePizza)) {

				System.out.println("Veuillez saisir le code:");
				String code = scanner.next();

				System.out.println("Veuillez saisir le nom (sans espace):");
				String nom = scanner.next();

				System.out.println("Veuillez saisir le prix:");
				String prixStr = scanner.next();

				double prix = Double.parseDouble(prixStr);

				Pizza nouvellePizza = new Pizza(code, nom, prix);
				dao.updatePizza(code, nouvellePizza);
				//indexPizza = i;
				break;
			}
		}

	}

}
