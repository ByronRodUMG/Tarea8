package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaItaliana extends Pizza {
    private String salsa;
    public PizzaItaliana(String name, String salsa, Topping... toppings) {
        super(name, toppings);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nLa Pizza Italiana \"" + getName() + "\" está lista!");
        System.out.println("Salsa de la pizza: " + getSalsa());
        System.out.println("Precio final: Q" + getPrice());
    }
}
