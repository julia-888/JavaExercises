import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String flat;
    String [] address;

    Address(){}
    Address(String address) {
        StringTokenizer st = new StringTokenizer(address, ",.;-");
        while(st.hasMoreTokens()) {
            country = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            street = st.nextToken();
            house = st.nextToken();
            building = st.nextToken();
            flat = st.nextToken();
        }
    }

    void setAddress(String address){
        this.address = address.split("[\\,\\.\\;\\-]");
        country = this.address[0];
        region = this.address[1];
        city = this.address[2];
        street = this.address[3];
        house = this.address[4];
        building = this.address[5];
        flat = this.address[6];
    }
}

class MainA{
    public static void main(String[] args) {
        Address a1 = new Address("Россия-Московская область-Королёв-Октябрьская-8-1-12");
        Address a2 = new Address("Россия.Орловская область.Орёл.Новосильская.7.1.3");
        Address a3 = new Address("Россия,Брянская область,Брянск,Фокина,66,1,9");
        Address a4 = new Address("Россия;Рязанская область;Рязань;Гагарина;78;1;8");
        System.out.println(a1.region);
        System.out.println(a2.street);
        System.out.println(a3.country);
        System.out.println(a4.city);
    }
}
