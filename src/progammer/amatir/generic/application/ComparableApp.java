package progammer.amatir.generic.application;

import progammer.amatir.generic.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Arip", "Subang"),
            new Person("Candra Liaw", "Djakartah"),
            new Person("Vani", "Malang")
        };


        Arrays.sort(people);

        System.out.println(Arrays.toString(people));

    }
}
