package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaMexicana extends Pizza {
    private String chile;
    public PizzaMexicana(String name, String chile, Topping... toppings) {
        super(name, toppings);
        this.chile = chile;
    }

    public String getChile() {
        return chile;
    }

    public void setChile(String chile) {
        this.chile = chile;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nLa Pizza Mexicana \"" + getName() + "\" está lista!");
        System.out.println("Tipo de chile elegido: " + getChile());
        System.out.println("Precio final: Q" + getPrice());
    }
}
