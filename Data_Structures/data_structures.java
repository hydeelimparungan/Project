import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class data_structures {

    public static void main(String[] args) {
        
        // Array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("Linked List: " + linkedList);
        
        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack (Last In First Out): " + stack);
        stack.pop();
        System.out.println("Stack after pop: " + stack);
        
        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Jane");
        queue.add("Tom");
        System.out.println("Queue (First In First Out): " + queue);
        queue.poll();
        System.out.println("Queue after poll: " + queue);
    }
}
