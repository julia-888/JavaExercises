package seventh;

import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> catalog;
    FurnitureShop(){
        catalog  = new ArrayList<>();
    }

    void Add(Furniture x){
        catalog.add(x);
    }

    String getFurniture(int i){
        return catalog.get(i).toString();
    }

}
