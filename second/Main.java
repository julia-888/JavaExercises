package second;

public class Main {
    public static void main(String[] args) {
        //1
        Shape x = new Shape();
        x.setP(5);
        x.setS(7584.23);
        Tester t = new Tester(x);
        t.test();
        //2
        Ball ball = new Ball("red", 23.34);

        //3
        Book book = new Book("Poems", 500);

        //4
        NurseryDog nurseryDog = new NurseryDog();
        for (int i=0; i < 10; i++) {
            nurseryDog.addDog(new Dog());
        }
    }
}
