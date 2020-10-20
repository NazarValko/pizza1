package com.company;

import java.util.ArrayList;

public class OrderController {
    private Pizza pizzaModel;
    private User userModel;
    private OrderView view;

    public OrderController(Pizza pizzaModel, User userModel, OrderView view) {
        this.pizzaModel = pizzaModel;
        this.userModel = userModel;
        this.view = view;
    }

    public void setPizzas(String[] pizzas){
        pizzaModel.setPizzas(pizzas);
    }
    public String[] getPizzas(){
        return pizzaModel.getPizzas();
    }
    public void setPizzaName(String pizzaName){
        pizzaModel.setPizzaName(pizzaName);
    }
    public String getPizzaName(){
        return pizzaModel.getPizzaName();
    }
    public void setSizePizza(double sizePizza){
        pizzaModel.setSizePizza(sizePizza);
    }
    public double getSizePizza(){
        return pizzaModel.getSizePizza();
    }
    public void setNumOfPizza(int numOfPizza){
        pizzaModel.setSizePizza(numOfPizza);
    }
    public int getNumOfPizza(){
        return pizzaModel.getNumOfPizza();
    }
    public void setMyPizzaIngName(String[] myPizzaIngName){
        pizzaModel.setMyPizzaIngName(myPizzaIngName);
    }
    public String[] getMyPizzaIngName(){
        return pizzaModel.getMyPizzaIngName();
    }
    public void setName(String name){
        userModel.setName(name);
    }
    public String getName(){
        return userModel.getName();
    }
    public void setAddress(String address){
        userModel.setAddress(address);
    }
    public String getAddress(){
        return userModel.getAddress();
    }
    public void updateView() {
        view.printDetails( pizzaModel.getPizzas(),pizzaModel.getPizzaName(),pizzaModel.getSizePizza(),pizzaModel.getNumOfPizza(), userModel.getName(), userModel.getAddress(),pizzaModel.getMyPizzaIng());
    }
}
