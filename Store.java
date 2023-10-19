import java.util.ArrayList;
import java.util.List;

// Store.java
public class Store {
    private List<Item> inventory;
    private List<JUnitPlayer> players_in_store;

    // Constructor initializes empty lists for inventory and players_in_store
    public Store() {
        inventory = new ArrayList<>();
        players_in_store = new ArrayList<>();
    }

    //... [All other methods of the Store class go here]
}
