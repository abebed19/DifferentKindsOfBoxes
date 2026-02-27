
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class OneItemBox extends Box {
    
    private List<Item> items;
    
    public OneItemBox(){
        this.items = new ArrayList<>();
        
    }
    

    @Override
    public void add(Item item) {
      if(this.items.isEmpty()){
          items.add(item);
      }
    }

    @Override
    public boolean isInBox(Item item) {
      return this.items.contains(item);
    }
    
}
