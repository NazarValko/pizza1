package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class OrderView {
    public void printDetails(ArrayList<String> pizzas, double sizePizza, int numOfPizza, ArrayList<String> additions, String name, String address, ArrayList<String> myPizzaIng){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Піца: ");
        String pizzaName = inputDevice.next();

        for (int i = 0;i < pizzas.toArray().length; i++) {

            if (pizzaName != pizzas.get(i)) {
                System.out.println("Піци не має в наявності ");
                System.out.println("Чи не хочете створити свою піцу? ");
                String answer = inputDevice.next();
                if (answer == "Так ") {
                    System.out.println("Введіть інгредієнти: ");
                    String myPizzaIngName = inputDevice.next();
                    myPizzaIng.add(myPizzaIngName);
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
        System.out.println("Додатки: ");
        String answer1 = inputDevice.next();
        additions.toArray();
        for (int a = 0; a < additions.toArray().length; a++) {
            if (answer1 == "Так ") {
                String addName = inputDevice.next();
                additions.add(addName);
                System.out.println(additions);
            }
            else {
                System.out.println("Без додатків ");
            }
        }
        System.out.println("Ваше ім'я: ");
        name = inputDevice.next();
        System.out.println("Адреса: ");
        address = inputDevice.next();
        System.out.println();
        System.out.println("Дякую за замовлення!");
    }
}
