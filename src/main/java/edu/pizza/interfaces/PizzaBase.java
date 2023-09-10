package edu.pizza.interfaces;

public class PizzaBase implements IPreparable {
    private String nombre;
    private double precio;

    public PizzaBase(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando la pizza...");
        System.out.println("La pizza está lista!");
    }
}
