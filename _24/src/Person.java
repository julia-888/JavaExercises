public class Person {
    private String surname;
    private String name1;
    private String name2;

    Person(String surname) {
        this.surname = surname;
    }

    Person(String surname, String name1) {
        this.surname = surname;
        this.name1 = name1;
    }

    Person(String surname, String name1, String name2) {
        this.surname = surname;
        this.name1 = name1;
        this.name2 = name2;
    }

    void setName1(String name1) {
        this.name1 = name1;
    }

    void setName2(String name2) {
        this.name2 = name2;
    }

    public String getFio() {
        return surname + ((name1 == null) ? "" : " " + name1) + ((name2 == null) ? "" : " " + name2);
    }

}

class MainP{
    public static void main(String[] args) {
        Person person1 = new Person("Афанасьева", "Елизавета", "Александровна");
        Person person2 = new Person("Цветков");
        person2.setName1("Дмитрий");
        Person person3 = new Person("Иванов");
        System.out.println(person2.getFio());
        System.out.println(person1.getFio());
        System.out.println(person3.getFio());
    }
}
