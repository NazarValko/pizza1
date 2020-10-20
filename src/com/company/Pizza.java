package com.company;

import java.util.ArrayList;

public class Pizza {
    private String[] pizzas = new String[]{"Тоскана", "Маргарита"};
    private String pizzaName;
    private double sizePizza;
    private int numOfPizza;
    private String[] myPizzaIng;



    public String getPizzaName(){
        return pizzaName;
    }
    public void setPizzaName(String pizzaName){
        this.pizzaName = pizzaName;
    }
    public String[] getMyPizzaIng(){
        return myPizzaIng;
    }
    public void setMyPizzaIng(String[] myPizzaIng){
        this.myPizzaIng = myPizzaIng;
    }
    public String[] getPizzas(){
        return pizzas;
    }
    public void setPizzas(String[] pizzas){
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
    public String[] getMyPizzaIngName() {
        return myPizzaIng;
    }
    public void setMyPizzaIngName(String[] myPizzaIng) {
        this.myPizzaIng = myPizzaIng;
    }
}
