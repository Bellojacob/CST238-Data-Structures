package Practice.ArrayList.src;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(100, "Steph Curry");
        Person p2 = new Person(120, "Shaq");
        Person p3 = new Person(120, "Shaq");
        Person p4 = new Person(140, "LeBron James");

        Team t1 = new Team("NBA");
        t1.add(p4);
        t1.add(p2);
        t1.add(p3);
        t1.add(p1);

        t1.sort();

        t1.printTeam();
        System.out.println(t1.duplicate());
        t1.removeDuplicates();
        t1.printTeam();

    }
}
