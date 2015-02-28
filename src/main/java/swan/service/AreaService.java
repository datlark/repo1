package swan.service;

import java.util.ArrayList;
import java.util.List;

import swan.domain.Store;

public class AreaService {

    public List<Store> getStores() {
        
    	List<Store> stores = new ArrayList<Store>();
    	
    	Store store = new Store();
        store.setName("Walmart");
        
        stores.add(store);
        
        store = new Store();
        store.setName("Target");
        
        stores.add(store);
        
        return stores;
    }
}
