public class MyArrayListTester {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(1);
        myArrayList.PushBack(new Ball("green", 23.8));
        myArrayList.PushBack(new Ball("red", 45.6));
        myArrayList.PushBack(new Ball("yellow", 78.96));
        System.out.println(myArrayList.getSize());

        myArrayList.RemoveByIndex(1);
    }

}
