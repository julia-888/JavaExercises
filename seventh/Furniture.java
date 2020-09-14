package seventh;

public abstract class Furniture {
    public abstract String toString();
}

class Chair extends Furniture{
    public String toString(){
        return "This is new chair.";
    }
}

class Bed extends Furniture{
    public String toString(){
        return "This is new bed.";
    }
}

class Table extends Furniture{
    public String toString(){
        return "This is new table.";
    }
}
