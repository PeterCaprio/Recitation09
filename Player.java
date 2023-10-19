import java.util.ArrayList;
import java.util.Iterator;

// Player.java
public class JUnitPlayer {
    double health = 100;
    double thirst = 0;
    double balance = 100; 

    ArrayList<Item> PlayerInventory = new ArrayList<>();
    Item itemInHand;
    Item currentClothing;

    // Constructor for Player class
    public JUnitPlayer(double initialBalance) {
        this.balance = initialBalance;
    }

    //... [All other methods of the JUnitPlayer class go here]
}
