package com.company;

import java.util.ArrayList;

public class Pizza {
    private ArrayList<String> pizzas;
    private double sizePizza;
    private int numOfPizza;
    private ArrayList<String> additions;
    private ArrayList<String> myPizzaIng;


    public ArrayList<String> getMyPizzaIng(){
        return myPizzaIng;
    }
    public void setMyPizzaIng(ArrayList<String> myPizzaIng){
        this.myPizzaIng = myPizzaIng;
    }
    public ArrayList<String> getPizzas(){
        return pizzas;
    }
    public void setPizzas(ArrayList<String> pizzas){
        this.pizzas = pizzas;
    }
    public double getSizePizza(){
        return sizePizza;
    }
    public void setSizePizza(double sizePizza){
        this.sizePizza = sizePizza;
    }
    public int getNumOfPizza(){
        return numOfPizza;
    }
    public void setNumOfPizza(int numOfPizza){
        this.numOfPizza = numOfPizza;
    }
    public ArrayList<String> getAdditions(){
        return additions;
    }
    public void setAdditions(ArrayList<String> additions){
        this.additions = additions;
    }

    public ArrayList<String> getMyPizzaIngName() {
        return myPizzaIng;
    }

    public void setMyPizzaIngName(ArrayList<String> myPizzaIng) {
        this.myPizzaIng = myPizzaIng;
    }
}
