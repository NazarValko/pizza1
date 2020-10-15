package com.company;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pizza model1  = new Pizza();
        User model2 = new User();
        //Create a view : to write student details on console
        OrderView view = new OrderView();


        OrderController controller = new OrderController(model1,model2 ,view);

        controller.updateView();
    }

}
