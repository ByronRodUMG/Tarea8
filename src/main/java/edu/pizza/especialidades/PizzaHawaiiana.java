package edu.pizza.especialidades;

import edu.pizza.base.Pizza;
import edu.pizza.base.Topping;

public class PizzaHawaiiana extends Pizza {
    private String tipoDePina;
    public PizzaHawaiiana(String name, String tipoDePina, Topping... toppings) {
        super(name, toppings);
        this.tipoDePina = tipoDePina;
    }

    public String getTipoDePina() {
        return tipoDePina;
    }

    public void setTipoDePina(String tipoDePina) {
        this.tipoDePina = tipoDePina;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\nLa Pizza Hawaiiana \"" + getName() + "\" está lista!");
        System.out.println("Tipo de piña elegida: " + getTipoDePina());
        System.out.println("Precio final: Q" + getPrice());
    }
}
