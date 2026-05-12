package linkedlist;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Client> file = new LinkedList<>();
        file.add(new Client(1, "walid"));
        file.add(new Client(2, "wissam"));
        System.out.println(file);
        Client servi = file.poll();
        System.out.println("Client servi : " + servi);
        file.addLast(new Client(3, "marwa"));
        System.out.println("Premier : " + file.peek());
    }
}
