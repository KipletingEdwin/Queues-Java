import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // FIFO    =     First In First Out

        Queue<String> queue = new LinkedList<String>();



        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.size());
        System.out.println(queue.contains("Karen"));


//        queue.poll();
//        queue.poll();
//        System.out.println(queue);
//        System.out.println(queue.isEmpty());
//        System.out.println(queue.peek());



    }
}