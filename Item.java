import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Item {
    private int id;
    private String name;

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void show() {
        System.out.println("Nazwa przedmiotu: " + name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Laptop"));
        items.add(new Item(2, "Monitor"));
        items.add(new Item(3, "Klawiatura"));
        items.add(new Item(4, "Mysz"));
        items.add(new Item(5, "Drukarka"));

        for (Item item : items) {
            item.show();
        }

        HashMap<Integer, String> itemsMap = new HashMap<>();

        for (Item item : items) {
            itemsMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemsMap.entrySet()) {
            System.out.println("Identyfikator: " + entry.getKey() + ", Nazwa: " + entry.getValue());
        }
    }
}