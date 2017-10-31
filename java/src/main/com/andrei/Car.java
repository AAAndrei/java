package com.andrei;

public class Car {
    int distance;
    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Приехали");
    }

    public int drive(int howlong){
      distance = howlong*60;
      return distance;
    }
}
