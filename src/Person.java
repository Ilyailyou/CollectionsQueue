public class Person {
    private String name;
    private int tickets;

    public Person(String name, int tickets) {
        this.name = name;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public int getTickets() {
        return tickets;
    }

    public boolean decreaseTickets() {
        this.tickets --;
        if (this.tickets != 0) {
            return true;
        } else {
            return false;
        }
    }
}
