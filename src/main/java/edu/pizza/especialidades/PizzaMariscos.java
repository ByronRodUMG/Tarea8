package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaMariscos extends Pizza {
    private String marisco;
    public PizzaMariscos(String name, String marisco, Topping... toppings) {
        super(name, toppings);
        this.marisco = marisco;
    }

    public String getMarisco() {
        return marisco;
    }

    public void setMarisco(String marisco) {
        this.marisco = marisco;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nLa Pizza de Mariscos \"" + getName() + "\" está lista!");
        System.out.println("Tipo de mariscos seleccionado: " + getMarisco());
        System.out.println("Precio final: Q" + getPrice());
    }
}
