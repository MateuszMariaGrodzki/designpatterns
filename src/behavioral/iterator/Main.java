package behavioral.iterator;

public class Main {

    public static void main(String[] args) {
        Emails emails = new Emails();

        Iterator iterator = emails.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
