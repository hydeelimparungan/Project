
class Person {
    private String name;

    
    public Person(String name) {
        this.name = name;
    }

   
    public String getName() {
        return name;
    }
}


class Limparungan {
    private String groupName;
    private Person leader;

    
    public Limparungan(String groupName, Person leader) {
        this.groupName = groupName;
        this.leader = leader;
    }

   
    public void showGroupInfo() {
        System.out.println(groupName + " has the leader: " + leader.getName());
    }
}


public class aggregation {
    public static void main(String[] args) {
        
        Person herondio = new Person("Herondiooooo");
        Person limparungan = new Person("Limparungan");
        Person bonalos = new Person("Bonalos");

        
        Limparungan group1 = new Limparungan("Group A", herondio);
        Limparungan group2 = new Limparungan("Group B", limparungan);
        Limparungan group3 = new Limparungan("Group C", bonalos);

        
        group1.showGroupInfo(); 
        group2.showGroupInfo(); 
    }
}
