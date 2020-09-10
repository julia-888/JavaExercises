package second;

import java.util.ArrayList;
import java.util.List;

class Dog {
    private String name;
    private int age;

    Dog(){}

    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

    int toHumanAge(){
        return age*7;
    }

    String ToString(){
        return "This dog named " + name + " is age of " + age + " (it's like " + toHumanAge() + " years old for human).";
    }
}

public class NurseryDog{
    private ArrayList<Dog> dogs = new ArrayList<>();

    void addDog(Dog d){
        dogs.add(d);
    }
}
