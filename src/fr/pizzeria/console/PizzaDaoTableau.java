//package fr.pizzeria.console;
//
////import java.util.Arrays;
////import java.util.List;
//
////import java.util.ArrayList;
//
//import fr.pizzeria.model.Pizza;
//
//public class PizzaDaoTableau implements IPizzaDao {
//
//	Pizza[] pizzas;
//
//	public PizzaDaoTableau() {
//
//		pizzas = new Pizza[100];
//		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
//		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
//		pizzas[2] = new Pizza("REI", "La Reine", 11.50);
//		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
//		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
//		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
//		pizzas[6] = new Pizza("ORI", "L'orientale", 13.50);
//		pizzas[7] = new Pizza("IND", "L'indienne", 14.00);
//
//	}
//
//
//	public Pizza[] findAllPizzas() {	
//		return pizzas;
//	}
//
//	public boolean saveNewPizza(Pizza pizza) {
//
//		for (int i = 0; i < pizzas.length; i++) {
//			if (pizzas[i] == null) {
//				pizzas[i] = pizza; // new Pizza(code, nom, prix);
//				break;
//			}
//		}
//		return false;
//	}
//
//	public boolean updatePizza(String codePizza, Pizza pizza) {
//		int indexPizza = -1;
//		// Pizza[] pizzas = dao.findAllPizzas();
//		for (int i = 0; i < pizzas.length; i++) {
//
//			// if (pizzas[i].getCode().equals(codePizza.toUpperCase())) {
//			if (pizzas[i].getCode() == codePizza.toUpperCase()) {
//				indexPizza = i;
//				break;
//			}
//		}
//
//		pizzas[indexPizza] = pizza; // new Pizza(code, nom, prix);
//		return false;
//	}
//
//	public boolean deletePizza(String codePizza) {
//
//		int i = 0;
//		System.out.println(codePizza.getClass());
//		System.out.println(pizzas[i].getCode().getClass());
//
//		int indexPizza = -1;
//		for (i = 0; i < pizzas.length - 1; i++) {
//			// if (pizzas[i].getCode().equals(codePizza)) {
//			if (pizzas[i].getCode() == codePizza) {
//				indexPizza = i;
//				break;
//			}
//		}
//
//		if (indexPizza != -1) {
//			pizzas[indexPizza] = null;
//		} else {
//			System.out.println("Code inexistant :" + codePizza);
//		}
//		return false;
//	}
//
//}
