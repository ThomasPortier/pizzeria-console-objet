package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		

		// Initialisation d'un tableau de 100 pizzas
		Pizza[] pizzas = new Pizza[100];
		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza("REI", "La Reine", 11.50);
		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza("ORI", "L'orientale", 13.50);
		pizzas[7] = new Pizza("IND", "L'indienne", 14.00);

		// Initialisation du scanner qui va permettre de poser des questions à
		// l'utilisateur
		Scanner scanner = new Scanner(System.in);
		int choix = 0;
		do {
			afficherMenu();
			choix = scanner.nextInt();

			switch (choix) {
			case 1:		
				ListerPizzaOptionMenu liste = new ListerPizzaOptionMenu(pizzas);
				liste.execute();	
				break;
			case 2:
				NouvellePizzaOptionMenu nouvellePizza = new NouvellePizzaOptionMenu(pizzas,scanner);
				nouvellePizza.execute();
				break;
			case 3:
				ModifierPizzaOptionMenu modifierPizza = new ModifierPizzaOptionMenu(pizzas,scanner);
				modifierPizza.execute();
				break;
			case 4:	
				SupprimerPizzaOptionMenu supprimerPizza = new SupprimerPizzaOptionMenu(pizzas,scanner);
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
