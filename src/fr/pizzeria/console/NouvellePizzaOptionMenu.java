package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.BasePizza;
import fr.pizzeria.model.Pizza;

public class NouvellePizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	private Scanner scanner;

	public NouvellePizzaOptionMenu(IPizzaDao dao, Scanner scanner) {
		this.dao = dao;
		this.scanner = scanner;
	}

	public void execute() throws SavePizzaException {
		

		System.out.println("Ajout d'une nouvelle pizza");
		
		System.out.println("Veuillez saisir la Base de la Pizza");
		System.out.println(" TOMATE ou CREME ou PATATE");
		String baseStr = scanner.next().toUpperCase();
		BasePizza basePizza = BasePizza.valueOf(baseStr);
	
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next().toUpperCase();
			if (code.length() != 3 ){
				throw new SavePizzaException("Exception Le code doit contenir 3 caractères");  //Exception
			}


		System.out.println("Veuillez saisir le nom (sans espace):");
		String nom = scanner.next();

		System.out.println("Veuillez saisir le prix:");
		String prixStr = scanner.next();

		// Conversion du prix en double
		double prix = Double.parseDouble(prixStr);
		Pizza nouvellePizza = new Pizza(basePizza,code, nom, prix);

		dao.saveNewPizza(nouvellePizza);

	}

}
