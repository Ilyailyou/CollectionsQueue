import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Deque<Person> p = (Deque<Person>) generateClients();
        while (!p.isEmpty()) {
            Person person = p.poll();
            System.out.println(person.getName() + " прокатился на аттракционе");
            if (person.decreaseTickets()) {
                p.offer(person);
            }

        }

    }

    public static List<Person> generateClients() {
        List<Person> p = new LinkedList<>();
        p.add(new Person("Dasha Pupkovna", 10));
        p.add(new Person("Masha Netology", 7));
        p.add(new Person("Natasha Kakasha", 10));
        p.add(new Person("Stepan Skorobogatka", 3));
        p.add(new Person("Denis Kolobkov", 1));
        return p;
    }
}
