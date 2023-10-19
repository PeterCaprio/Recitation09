import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creating some sample items
        Item sword = new Item("Sword", 10.0);
        Item potion = new Item("Health Potion", 5.0);
        Item hat = new Item("Hat", 1);
        
        Store store = new Store();
        
        // Adding items to the store's inventory
        store.addItem(sword);
        store.addItem(potion);
        store.addItem(hat);
        
        JUnitPlayer player = new JUnitPlayer(100.0);
        
        System.out.println("Welcome to the JUnit game!");

        boolean continueGame = true;
        
        while(continueGame) {
            System.out.println("Your balance: " + player.getBalance());
            System.out.println("Choose an action: ");
            System.out.println("1. Enter Store");
            System.out.println("2. View Inventory");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    storeMenu(store, player, scanner);
                    break;
                case 2:
                    System.out.println("Your Inventory: ");
                    player.displayInventory();
                    break;
                case 3:
                    continueGame = false;
                    System.out.println("Thanks for playing!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }

    public static void storeMenu(Store store, JUnitPlayer player, Scanner scanner) {
        System.out.println("Welcome to the Store!");
        store.displayItems();

        System.out.println("Choose an item number to buy, or 0 to exit the store.");
        int itemChoice = scanner.nextInt();

        if (itemChoice == 0) {
            return;
        }

        if (itemChoice > 0 && itemChoice <= store.getInventorySize()) {
            Item chosenItem = store.getItem(itemChoice - 1);

            if (player.getBalance() >= chosenItem.getPrice()) {
                player.purchaseItem(chosenItem);
                store.removeItem(chosenItem);
                System.out.println("You bought: " + chosenItem.getName());
            } else {
                System.out.println("Not enough balance to purchase this item.");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
