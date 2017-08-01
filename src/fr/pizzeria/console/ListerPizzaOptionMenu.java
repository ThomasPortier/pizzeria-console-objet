package fr.pizzeria.console;

//import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public ListerPizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;

	}

	public void execute() {
		// for (int i = 0; i < pizzas.length; i++) {
		// if (pizzas[i] != null) {
		// System.out
		// .println(pizzas[i].getCode() + " > " + pizzas[i].getNom() + " - Prix:
		// " + pizzas[i].getPrix());
		// }
		// }
		// System.out.println("--------------------------------------------------");
		Pizza [] pizzas =dao.findAllPizzas();
		for (int i = 0; i < pizzas.length - 1; i++) {
			if (pizzas[i] == null) {
				break;
			} else {
				System.out.println(pizzas[i].getCode() + " > " + pizzas[i].getNom() + " - " + pizzas[i].getPrix());
			}
		}
		System.out.println("--------------------------------------------------");

	}

}
