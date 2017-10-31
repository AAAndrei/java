package com.andrei;

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Спокойной ночи! До завтра");
    }

    public void eat(){
        System.out.println("Я очень голоден, давайте перекусим чипсами");
    }

    public String say(String aWorld){
        String petResponce = "Ну ладно!!" + aWorld;
        return petResponce;
    }
}
