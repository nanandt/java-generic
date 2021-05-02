package progammer.amatir.generic.application;

import progammer.amatir.generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Wahyu");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        // covariant hanya boleh getData tp tdk boleh setData
    }
}
