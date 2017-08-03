package fr.pizzeria.console;

import fr.pizzeria.exception.*;//DeletePizzaException;
//import fr.pizzeria.exception.SavePizzaException;

public abstract class OptionMenu {
	
	public abstract void execute() throws DeletePizzaException, SavePizzaException, UpdatePizzaException;
	
}
