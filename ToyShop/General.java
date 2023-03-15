
package ToyShop;

import java.util.ArrayList;
import java.util.List;


public class General {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Dunky", 25);
        Toy toy2 = new Toy(1, "Car", 40);
        Toy toy3 = new Toy(2, "Cat", 3);
        Toy toy4 = new Toy(3, "Dog", 65);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyShop toyStore = new ToyShop(toys);
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();
        toyStore.saveToyForLottery();


    }
    
    
}
