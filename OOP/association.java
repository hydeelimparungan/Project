class Motorcycle {
    private String model;

    public Motorcycle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

class Limparungan {
    private Motorcycle favoriteMotorcycle;

   
    public Limparungan(Motorcycle favoriteMotorcycle) {
        this.favoriteMotorcycle = favoriteMotorcycle;
    }

    
    public void showFavoriteMotorcycle() {
        System.out.println("Limparungan's favorite motorcycle is: " + favoriteMotorcycle.getModel());
    }
}

// Main class to test association
public class association {
    public static void main(String[] args) {
       
        Motorcycle yamaha = new Motorcycle("Yamaha R1");
        Motorcycle ducati = new Motorcycle("Ducati Panigale V4");
        Motorcycle kawasaki = new Motorcycle("Kawasaki Ninja H2");

        
        Limparungan limparunganWithYamaha = new Limparungan(yamaha);
        Limparungan limparunganWithDucati = new Limparungan(ducati);
        Limparungan limparunganWithKawasaki = new Limparungan(kawasaki);

      
        limparunganWithYamaha.showFavoriteMotorcycle();  
        limparunganWithDucati.showFavoriteMotorcycle(); 
        limparunganWithKawasaki.showFavoriteMotorcycle(); 
    }
}
