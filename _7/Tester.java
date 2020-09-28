package _7;

public class Tester {
    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.cook();
        System.out.println(plate.getMeals(2));
        Cup cup = new Cup();
        cup.cook();
        System.out.println(cup.getMeals(1));


        System.out.println("");


        EnglishBulldog bulldog = new EnglishBulldog();
        System.out.println(bulldog.toString() + " I have " + bulldog.getFur() +" fur and I'm " + bulldog.getSize());


        System.out.println("");


        FurnitureShop furnitureShop = new FurnitureShop();
        for (int i=0; i<5; i++){
            Furniture x = new Chair();
            furnitureShop.Add(x);
        }
        for (int i=0; i<2; i++){
            Furniture x = new Bed();
            furnitureShop.Add(x);
        }
        for (int i=0; i<8; i++){
            Furniture x = new Table();
            furnitureShop.Add(x);
        }
        System.out.println(furnitureShop.getFurniture(6));
        System.out.println(furnitureShop.getFurniture(7));
        System.out.println(furnitureShop.getFurniture(1));
        System.out.println(furnitureShop.getFurniture(12));
    }
}
