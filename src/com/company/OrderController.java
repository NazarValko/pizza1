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

    public void setPizzas(ArrayList<String> pizzas){
        pizzaModel.setPizzas(pizzas);
    }
    public ArrayList<String> getPizzas(){
        return pizzaModel.getPizzas();
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
    public void setAdditions(ArrayList<String> additions){
        pizzaModel.setAdditions(additions);
    }
    public ArrayList<String> getAdditions(){
        return pizzaModel.getAdditions();
    }
    public void setMyPizzaIngName(ArrayList<String> myPizzaIngName){
        pizzaModel.setMyPizzaIngName(myPizzaIngName);
    }
    public ArrayList<String> getMyPizzaIngName(){
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
        view.printDetails( pizzaModel.getPizzas(),pizzaModel.getSizePizza(),pizzaModel.getNumOfPizza(),pizzaModel.getAdditions(), userModel.getName(), userModel.getAddress(),pizzaModel.getMyPizzaIng());
    }
}
