import java.util.*;

public class Main {

    public static void sortByNameSizeAsc(List<Person> people) {
        TreeSet<Person> set = new TreeSet<>(
                Comparator.comparingInt(p -> p.getName().length())
        );
        set.addAll(people);

        for(Person p : set){
            System.out.println(p);
        }
    }

    public static void sortByAgeAsc(List<Person> people) {
        TreeSet<Person> set = new TreeSet<>(
                Comparator.comparingInt(p -> p.getAge())
        );
        set.addAll(people);
        for(Person p : set) System.out.println(p);

    }

    public static void sortByNameSizeDesc(List<Person> people){
        TreeSet<Person> set = new TreeSet<>(
                Comparator.comparingInt((Person p)-> p.getName().length()).reversed()
        );
        set.addAll(people);
        for(Person p : set) System.out.println(p);

    }

    public static void sortByAgeDesc(List<Person> people){
        TreeSet<Person> set = new TreeSet<>(
                Comparator.comparingInt((Person p)-> p.getAge()).reversed()
        );
        set.addAll(people);
        for(Person p : set) System.out.println(p);
    }
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Disha", 24));
        people.add(new Person("Sachin", 23));
        people.add(new Person("Riddesh", 25));
        people.add(new Person("Neha", 22));
        people.add(new Person("Deepikaa", 26));

        System.out.println("\n1. Sorted by name size (low to high):");
        sortByNameSizeAsc(people);

        System.out.println("\n2. Sorted by age (ascending):");
        sortByAgeAsc(people);

        System.out.println("\n3. Sorted by name size (high to low):");
        sortByNameSizeDesc(people);

        System.out.println("\n4. Sorted by age (descending):");
        sortByAgeDesc(people);
    }
}