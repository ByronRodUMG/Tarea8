package edu.pizza.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private List<Topping> toppings = new ArrayList<>();
    private String size; // Nueva propiedad para el tamaño

    public Pizza(String name, Topping... toppings) {
        this.name = name;
        for (Topping top : toppings) {
            this.toppings.add(top);
        }
        this.size = "Pequeña"; // "Pequeña" es el tamaño predeterminado
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    public double getPrice() {
        double precio = 0;
        for (Topping top : toppings) {
            precio += top.getPrecio();
        }

        if ("Pequeña".equalsIgnoreCase(size)) {
            precio *= 1.00; // Tamaño predeterminado: no se realiza nada
        } else if ("Mediana".equalsIgnoreCase(size)) {
            precio *= 1.20; // Aumento del 20% para pizzas medianas
        } else if ("Grande".equalsIgnoreCase(size)) {
            precio *= 1.35; // Aumento del 35% para pizzas grandes
        } else {
            System.out.println("Tamaño no válido, se utilizará el tamaño predeterminado (Pequeña).");
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nombre='" + name + '\'' + ", tamaño='" + size + '\'' + ", precio=" + getPrice() + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparando..... " + name);
        System.out.println("Tamaño: " + size); // Mostrar el tamaño
        System.out.println("Agregando toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre() + " (Q" + topping.getPrecio() + ")");
            // Put 1-second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
