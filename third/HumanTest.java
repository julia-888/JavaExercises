package third;

class Head{
    private String colorOfEyes;
    private String hairColor;
    private String sizeOfNose;
    private String sizeOfEars;

    Head(String c, String h, String sn, String se){
        colorOfEyes = c;
        hairColor = h;
        sizeOfEars = se;
        sizeOfNose = sn;
    }

    String getColorOfEyes(){
        return colorOfEyes;
    }

    String getHairColor(){
        return hairColor;
    }
    String getSizeOfNose(){
        return sizeOfNose;
    }
    String getSizeOfEars(){
        return sizeOfEars;
    }

}

class Hand{
    private double length;
    private double weight;

    Hand(double l, double w){
        length = l;
        weight = w;
    }

    double getLength(){
        return length;
    }
    double getWeight(){
        return weight;
    }
}

class Leg{
    private double length;
    private double weight;

    Leg(double l, double w){
        length = l;
        weight = w;
    }

    double getLength(){
        return length;
    }
    double getWeight(){
        return weight;
    }

}

class Human {
    private Leg firstLeg;
    private Leg secondLeg;
    private Hand firstHand;
    private Hand secondHand;
    private Head head;

    Human(String c, String h, String sn, String se){
        head = new Head(c, h, sn, se);
        System.out.println("Human with " + c + " eyes, " + h + " hair, " + sn + " nose and " + se + " ears exists.");
    }

    void setLegs(double l, double w){
        firstLeg = new Leg(l, w);
        secondLeg = new Leg(l, w);
        System.out.println("Now his legs are weight of " + firstLeg.getWeight() + "kg and length of " + firstLeg.getLength() + "cm");
    }

    void setHands(double l, double w){
        firstHand = new Hand(l, w);
        secondHand = new Hand(l, w);
        System.out.println("Now his hands are weight of " + firstHand.getWeight() + "kg and length of " + firstHand.getLength() + "cm");
    }
}

public class HumanTest{
    public static void main(String[] args) {
        Human human = new Human("blue", "fair", "big", "small");
        human.setHands(30, 1);
        human.setLegs(120, 25);
    }
}