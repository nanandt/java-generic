package progammer.amatir.generic.application;

import progammer.amatir.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>("nanang"));
        print(new MyData<>(100));
        print(new MyData<>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> data){
        System.out.println(data.getData());
    }
}
