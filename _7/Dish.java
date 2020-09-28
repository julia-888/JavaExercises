package _7;

public abstract class Dish {
    double capacity;
    String [] meals;

    double getCapacity(){
        return capacity;
    }
    void setCapacity(double c){
        capacity = c;
    }

    String getMeals(int i){
        return meals[i];
    }
    abstract  void cook();
}

class Plate extends Dish{
    void cook(){
        meals = new String[]{"fish", "salad", "pizza", "pasta", "cake"};
    }
}

class Cup extends Dish{
    void cook(){
        meals = new String[]{"tea", "coffee", "water", "juice", "hot chocolate"};
    }
}

class Bowl extends Dish{
    void cook(){
        meals = new String[]{"soup", "porridge", "milk"};
    }
}
