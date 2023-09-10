package edu.pizza;

import edu.pizza.base.Topping;
import edu.pizza.especialidades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un nombre para la pizza:");
        String name = scan.nextLine();
        System.out.println("Ingresa una chile para la pizza:");
        String extra = scan.nextLine();

        PizzaMexicana pizza = new PizzaMexicana(name, extra);
        pizza.addTopping(new Topping("Pepperoni", 20.0));
        pizza.addTopping(new Topping("Cebolla", 5.0));
        pizza.addTopping(new Topping("Champiñones", 25.0));
        System.out.println("""
                Selecciona un tamaño:
                -> Pequeña (Precio Normal)
                -> Mediana (Precio +20%)
                -> Grande (Precio +35%)""");
        pizza.setSize(scan.nextLine());
        pizza.prepare();
    }
}
