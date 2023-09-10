package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaVegetariana extends Pizza {
    private String vegetal;
    public PizzaVegetariana(String name, String vegetal, Topping... toppings) {
        super(name, toppings);
        this.vegetal = vegetal;
    }

    public String getVegetal() {
        return vegetal;
    }

    public void setVegetal(String vegetal) {
        this.vegetal = vegetal;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nLa Pizza Vegetariana \"" + getName() + "\" está lista!");
        System.out.println("Verdura principal elegida: " + getVegetal());
        System.out.println("Precio final: Q" + getPrice());
    }
}
