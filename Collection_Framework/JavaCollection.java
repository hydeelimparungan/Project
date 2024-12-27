import java.util.*;

public class JavaCollection {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Supra");
        list.add("Civic");
        list.add("Ferrari");
        list.add("Mango");
        list.add("Civic");
        
        System.out.println("List after insertion: " + list);
        
        boolean containsSupra = list.contains("Supra");
        System.out.println("List contains 'Supra': " + containsSupra);
        
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        
        list.set(2, "Pineapple");
        System.out.println("List after modification: " + list);
        
        list.remove("Civic");
        System.out.println("List after deletion: " + list);
        
        Set<String> set = new HashSet<>();
        set.add("Supra");
        set.add("Civic");
        set.add("Ferrari");
        set.add("Mango");
        set.add("Civic");
        
        System.out.println("Set after insertion: " + set);
       
        Map<String, Integer> map = new HashMap<>();
        map.put("Supra", 3);
        map.put("Civic", 5);
        map.put("Ferrari", 2);
        map.put("Mango", 4);

        Integer supraCount = map.get("Supra");
        System.out.println("Count of Supra: " + supraCount);
        
        System.out.println("Map contents:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        map.remove("Civic");
        System.out.println("Map after deletion: " + map);

        Queue<String> queue = new LinkedList<>();
        queue.add("Supra");
        queue.add("Civic");
        queue.add("Ferrari");

        System.out.println("Queue after insertion: " + queue);

        String removedItem = queue.poll();
        System.out.println("Removed from queue: " + removedItem);
        System.out.println("Queue after dequeue: " + queue);
    }
}
