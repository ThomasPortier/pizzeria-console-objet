package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public SupprimerPizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() {
		System.out.println("Veuillez choisir la pizza à supprimer.");
		String codePizza = scanner.next();

		dao.deletePizza(codePizza);

		// int indexPizza = -1;
		// for (int i = 0; i < pizzas.length; i++) {
		// if (pizzas[i].getCode().equals(codePizza)) {
		// indexPizza = i;
		// break;
		// }
		// }
		//
		// if (indexPizza != -1) {
		// pizzas[indexPizza] = null;
		// }
		// else {
		// System.out.println("Code inexistant :"+codePizza);
		// }
	}

}
