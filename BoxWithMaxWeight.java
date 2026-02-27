
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class BoxWithMaxWeight  extends Box{
    
    private int capacity;
    
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int totalWeight = 0;
        for(Item i : items){
            totalWeight += i.getWeight();
        }
        if(totalWeight + item.getWeight() <= this.capacity){
            items.add(item);
        } 
    }

    @Override
    public boolean isInBox(Item item) {
        
        if( items.contains(item)){
            return true;
        }
        return false;
    }
    
}
