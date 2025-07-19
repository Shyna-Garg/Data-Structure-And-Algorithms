package OOPS;

//interface -> blueprint of class...interface keyword is used...implements word is used for inheritance im case of interface
//main work of interface -> to implement multiple inheritance , to achieve total abstraction
/*
    • by default All methods are public, abstract & without implementation.
    • variables in the interface are final, public & static
 */

//example - let say u have to make a car MS800.
/*
    • Car (Inteface)-car features                          Car (wheels,spped,engine)
    • Maruti 800(Class)-making blueprint of                              |
                car using all features                       -----------------------------
                                                            |            |                |
    • Object                                              car1          car2             car3
                                                         (M800)        (M800)           (M800)
 */

public class Interface {
    public static void main(String[] args) {
        Queen shyu = new Queen();
        shyu.moves();
        King siddo = new King();
        siddo.moves();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, lft, right, diagonal - (in all 4 directions)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal - (by 1 step)");
    }
}

//multiple inheritance in interfaces
 /*
                                                      A   B 
                                                      \   /  
                                                        C
                                                    
  */
  interface Herbivore{
    void eatGrass();
  }
  interface Carnivore{
    void eatMeat();
  }
  class Bear implements Herbivore, Carnivore{
    public void eatGrass(){
        System.out.println("eats green grass");  
    }
    public void eatMeat(){
        System.out.println("eats meat as well as grass");
    }
  }

  /*
    Output ->
               up, down, lft, right, diagonal - (in all 4 directions)
               up, down, left, right, diagonal - (by 1 step)
               eats green grass
               eats meat as well as grass
   */