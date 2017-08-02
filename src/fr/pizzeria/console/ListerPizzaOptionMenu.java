package fr.pizzeria.console;

import java.util.ArrayList;

//import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class ListerPizzaOptionMenu extends OptionMenu {

	private IPizzaDao dao;

	public ListerPizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	public void execute() {
		//ArrayList<Pizza> pizzas = dao.findAllPizzas();
		ArrayList<Pizza> pizzas = dao.findAllPizzas();
		for (Pizza unePizza : pizzas) {
			System.out.println(unePizza);
			System.out.println("----------------------------");
		}

	}

}
