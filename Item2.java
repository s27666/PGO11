package Item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && name.equals(item.name);
    }
    @Override
    public int hashCode() {
        return id;
    }
    public static void main(String[] args) {
        ArrayList<Item> itemsList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            itemsList.add(new Item(i, "Item" + i));
        }

        List<Item> firstFiveItems = itemsList.subList(0, 5);

        HashSet<Item> itemsSet = new HashSet<>(firstFiveItems);

        for (Item item : itemsSet) {
            item.show();
        }
    }
}
