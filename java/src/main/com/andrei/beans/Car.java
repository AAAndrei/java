package com.andrei.beans;

public class Car {
    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Приехали");
    }

    public int drive(int howlong){
      int distance = howlong*60;
      return distance;
    }
}
