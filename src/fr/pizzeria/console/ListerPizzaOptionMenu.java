package fr.pizzeria.console;

public class ListerPizzaOptionMenu extends OptionMenu {

	private Pizza[] pizzas;

	public ListerPizzaOptionMenu(Pizza[] pizzas) {
		this.pizzas = pizzas;

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
