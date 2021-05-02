package progammer.amatir.generic.application;

import progammer.amatir.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Rizky");
        // doIt(stringMyData); // ERROR
        // MyData<Object> objectMyData = stringMyData; // ERROR

        MyData<Object> objectMyData = new MyData<>(200);
        // MyData<Integer> integerMyData = objectMyData; // ERROR

        /*
        tdk bisa menerapkan polymorphism di generic
         */

    }

    public static void doIt(MyData<Object> objectMyData){
        // do anything
    }
}
