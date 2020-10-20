package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Pizza pizzaModel = retrivePizzaFromDatabase();
        User userModel = retriveUserFromDatabase();
        OrderView view = new OrderView();
        OrderController controller = new OrderController(pizzaModel, userModel, view);
        controller.updateView();


    }

    private static Pizza retrivePizzaFromDatabase() {
        Pizza pizza = new Pizza();
        pizza.setPizzaName("Маргарита");

        pizza.setSizePizza(20);
        pizza.setNumOfPizza(2);
        return pizza;
    }

    private static User retriveUserFromDatabase() {
        User user = new User();
        user.setName("Alex");
        user.setAddress("");
        return user;
    }
}


