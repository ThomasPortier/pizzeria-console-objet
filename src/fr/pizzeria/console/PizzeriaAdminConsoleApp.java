package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;


public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			afficherMenu();
			
			Pizza [] pizzas = new Pizza[100];
			pizzas[0]=new Pizza();
			
			Scanner entryUser=new Scanner(System.in);
			String name=entryUser.next();
			int result = Integer.parseInt(name);

			checkIfIntegerValide(entryUser, result);
			
			
			while (result != 99){ 

				if (result == 1){
					System.out.println("Liste des pizzas");
				}
				else if (result == 2){
					System.out.println("Ajout d’une nouvelle pizza");
				}
				else if (result == 3){
					System.out.println("Mise à jour d’une pizza");
				}
				else if (result == 4){
					System.out.println("Suppression d’une pizza");
				}
				
				afficherMenu();

				name=entryUser.next();
				result = Integer.parseInt(name);
				checkIfIntegerValide(entryUser, result);
				
			}
			System.out.println("Aurevoir ");
			entryUser.close();
			
			
	}

	public static void checkIfIntegerValide(Scanner entryUser, int result) {
		String name;
		while((result != 1 ^ result != 2 ^ result != 3 ^ result != 4 ^ result != 99)){
		System.out.println("Utiliser les caractere 1 ou 2 ou 3 ou 4 ou 99.");
		name=entryUser.next();
		result = Integer.parseInt(name);

		}
		//return result;
	}

	public static void afficherMenu() {
		System.out.println("***** Pizzeria Administration ***** \n ");
		System.out.println("1. Lister les pizzas \n ");
		System.out.println("2. Ajouter une nouvelle pizza \n ");
		System.out.println("3. Mettre à jour une pizza \n ");
		System.out.println("4. Supprimer une pizza \n ");
		System.out.println("99. Sortir");
	}
}
