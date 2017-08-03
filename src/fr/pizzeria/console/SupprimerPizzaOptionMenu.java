package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.exception.*;

//import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public SupprimerPizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() throws DeletePizzaException {
		System.out.println("Veuillez saisir le code de la pizza à supprimer.");
		String codePizza = scanner.next().toUpperCase();

			if (codePizza.length() != 3) {
				throw new DeletePizzaException(" Exception : Le code de la pizza doit contenir 3 caractères."); //Exception
			}
			else if (dao.pizzaExist(codePizza) == false) {
				throw new DeletePizzaException(" Exception : Le code n'existe pas");
			}

		dao.deletePizza(codePizza);
	}

}
