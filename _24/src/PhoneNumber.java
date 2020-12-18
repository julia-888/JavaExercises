public class PhoneNumber {
    private String number;

    PhoneNumber(String number){
        String last4 = number.substring(number.length() - 4);
        String t2 = number.substring(number.length() - 7, number.length() - 4);
        this.number = number.substring(0, number.length() - 7) + "-" + t2 + "-" + last4;
    }

    String getNumber(){
        return number;
    }
}

class MainN{
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber("+79167883421");
        System.out.println(phoneNumber.getNumber());
    }
}
