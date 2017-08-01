package fr.pizzeria.console;

import java.util.Scanner;

public class NouvellePizzaOptionMenu extends OptionMenu {

	private Pizza[] pizzas;
	private Scanner scanner;

	public NouvellePizzaOptionMenu(Pizza[] pizzas, Scanner scanner) {
		this.pizzas = pizzas;
		this.scanner = scanner;
	}

	public void getLibelle() {

	}

	public void execute() {

		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code:");
		String code = scanner.next();

		System.out.println("Veuillez saisir le nom (sans espace):");
		String nom = scanner.next();

		System.out.println("Veuillez saisir le prix:");
		String prixStr = scanner.next();

		// Conversion du prix en double
		double prix = Double.parseDouble(prixStr);

		for (int i = 0; i < pizzas.length; i++) {
			if (pizzas[i] == null) {
				pizzas[i] = new Pizza(code, nom, prix);
				break;
			}

		}

	}

}
