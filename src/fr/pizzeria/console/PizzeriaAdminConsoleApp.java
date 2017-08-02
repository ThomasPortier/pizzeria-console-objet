package fr.pizzeria.console;

import java.util.Scanner;

//import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		IPizzaDao dao = new PizzaDaoList();

		// Initialisation du scanner qui va permettre de poser des questions à
		// l'utilisateur
		Scanner scanner = new Scanner(System.in);
		int choix = 0;
		do {
			afficherMenu();
			choix = scanner.nextInt();

			switch (choix) {
			case 1:
				ListerPizzaOptionMenu liste = new ListerPizzaOptionMenu(dao);
				liste.execute();
				break;
			case 2:
				NouvellePizzaOptionMenu nouvellePizza = new NouvellePizzaOptionMenu(dao, scanner);
				nouvellePizza.execute();
				break;
			case 3:
				ModifierPizzaOptionMenu modifierPizza = new ModifierPizzaOptionMenu(dao, scanner);
				modifierPizza.execute();
				break;
			case 4:
				SupprimerPizzaOptionMenu supprimerPizza = new SupprimerPizzaOptionMenu(dao, scanner);
				supprimerPizza.execute();
				break;
			case 99:
				System.out.println("Au revoir !!!!.");
				break;
			default:
				System.out.println("Choix inexistant.");
				break;
			}

		} while (choix != 99);

		scanner.close();
	}

	private static void afficherMenu() {
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza ");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		System.out.println("Veuillez sélectionner une option de menu:");
	}
}
