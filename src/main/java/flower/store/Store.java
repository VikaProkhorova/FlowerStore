package flower.store;

import java.util.ArrayList;
import java.util.List;
import flower.store.filters.SearchFilter;

public class Store {
    List<Item> items;
    public Store(){
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public Item getItem(Item item){
        if (items.contains(item)){
            return item;
        }
        return null;
    }
    public List<Item> search(SearchFilter filter){
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items){
            if (filter.match(item)){
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
