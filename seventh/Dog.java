package seventh;

public abstract class Dog {
    String fur;
    String size;

    String getFur(){
        return fur;
    }
    String getSize(){
        return size;
    }
    void setFur(String fur){
        this.fur = fur;
    }
    void setSize(String s){
        size = s;
    }

    public abstract String toString();
}

class AkitaInu extends Dog{
    AkitaInu(){
         size = "big";
         fur = "fluffy";
    }

    @Override
    public String toString() {
        return "I'm Akita Inu!";
    }
}

class EnglishBulldog extends Dog{
    EnglishBulldog(){
        size = "small";
        fur = "short";
    }
    @Override
    public String toString() {
        return "I'm English Bulldog!";
    }
}

class Shelty extends Dog{
    Shelty(){
        size = "average";
        fur = "long";
    }
    @Override
    public String toString() {
        return "I'm Shelty!";
    }
}
