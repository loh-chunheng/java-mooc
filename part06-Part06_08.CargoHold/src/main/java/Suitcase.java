/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mulle
 */

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
            this.totalWeight += item.getWeight();
        }
    }
        
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + totalWeight + " kg)";
        }
        
        if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        }
                
        return items.size() + " items (" + totalWeight + " kg)";
    }
    
    public void printItems() {       
        for (Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for (Item item: this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
}
