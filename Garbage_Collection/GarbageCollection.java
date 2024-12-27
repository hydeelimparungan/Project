public class GarbageCollection {

    public static void main(String[] args) {
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();
        
        obj1 = null; // obj1 is now eligible for garbage collection
        
        System.gc(); // Suggests JVM to perform garbage collection
        
        System.out.println("Garbage Collection is invoked.");
    }

    @Override
    protected void finalize() {
        System.out.println("Object is being garbage collected.");
    }
}
