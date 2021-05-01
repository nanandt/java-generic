package progammer.amatir.generic.application;

import progammer.amatir.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Danu");
        MyData<Integer> integerMyData = new MyData<Integer>(2);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }


}
