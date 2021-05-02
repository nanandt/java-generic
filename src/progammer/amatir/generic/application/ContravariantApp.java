package progammer.amatir.generic.application;

import progammer.amatir.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("X-ray");
        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }
    /*
    contravariant aman utk setData tdk dgn getData
     */

    public static void process(MyData<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("X-ray");
    }
}
