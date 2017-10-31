package com.andrei.beans;

public class CarOwner {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
        System.out.println(myCar.drive(60));
    }
}
