package fr.pizzeria.console;

import java.util.Scanner;

//import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public SupprimerPizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() {
		System.out.println("Veuillez choisir la pizza à supprimer.");
		String codePizza = scanner.next(); //.toString();

		dao.deletePizza(codePizza);
	}

}
