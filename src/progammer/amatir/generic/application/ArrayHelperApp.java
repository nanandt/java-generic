package progammer.amatir.generic.application;

import progammer.amatir.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] names = {"Bahrul", "Ulum", "pemalang"};
        Integer[] numbers = {2,69,7,78,10};

        System.out.println(ArrayHelper.count(numbers));
        System.out.println(ArrayHelper.count(names));

    }
}
