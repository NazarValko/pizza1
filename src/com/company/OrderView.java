package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class OrderView {
    public void printDetails(String[] pizzas,String pizzaName, double sizePizza, int numOfPizza, String name, String address, String[] myPizzaIng){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Піца: ");
        pizzaName = inputDevice.next();

        for (int i = 0;i < pizzas.length; i++) {

            if (pizzaName != pizzas[i]) {
                System.out.println("Піци не має в наявності ");
                System.out.println("Чи не хочете створити свою піцу? ");
                String answer = inputDevice.next();
                if (answer == "Так") {
                    System.out.println("Введіть інгредієнти: ");
                    String myPizzaIngName = inputDevice.next();
                    for (int b = 0; b < myPizzaIng.length;b++) {
                        myPizzaIngName = myPizzaIng[b];

                    }
                    System.out.println("Ваша піца: " + myPizzaIngName);
                }
                else {
                    System.out.println("Замовте щось інше");
                }
            }
        }



        System.out.println("Розмір: ");
        sizePizza = Double.parseDouble(inputDevice.next());
        System.out.println("Кількість: ");
        numOfPizza = Integer.parseInt(inputDevice.next());
        if (numOfPizza > 1) {
            System.out.println("Друга піца: ");
            String anotherPizza = inputDevice.next();
        }

        System.out.println("Ваше ім'я: ");
        name = inputDevice.next();
        System.out.println("Адреса: ");
        address = inputDevice.next();
        System.out.println();
        System.out.println("Дякуєм за замовлення!");
    }
}
