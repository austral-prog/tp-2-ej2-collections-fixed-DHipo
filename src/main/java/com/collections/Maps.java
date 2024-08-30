package com.collections;

import java.util.*;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        // todo: Implement the logic to create a map that tracks the count of each item in the list
        Set<String> keys = new HashSet<>(items);
        Map<String, Integer> inventory = new HashMap<>(keys.size());

        for (String key : keys) inventory.put(key, 0);
        for (String item : items) inventory.replace(item, inventory.get(item) + 1);

        return inventory;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to add or increment items in the inventory using elements from the items list
        for (String item : items) {
            if (!inventory.containsKey(item)) inventory.put(item, 1);
            else inventory.put(item, inventory.get(item) + 1);
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to decrement items in the inventory using elements from the items list
        for (String item : items)
            inventory.put(item, Math.max(inventory.get(item) - 1, 0));

        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        // todo: Implement the logic to remove an item from the inventory if it matches the item string
        inventory.remove(item);
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // todo: Implement the logic to create a list containing all (item_name, item_count) pairs in the inventory
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        inventory.entrySet().forEach(e ->{
            if (e.getValue() > 0) list.add(e);
        });
        return list;
    }
}