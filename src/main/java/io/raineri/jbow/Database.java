package io.raineri.jbow;

import java.util.Map;
import java.util.HashMap;

public class Database {
    static private Map<String, Integer> data = new HashMap<String, Integer>();
    
    private Database() {}
    
    static public boolean add(String key, Integer value) {
    	if(key.equals(""))
    		return false;
    	
    	Database.data.put(key, value);
    	return true;
    }
    
    static public boolean put(String key, Integer value) {
    	return Database.add(key, value);
    }
    
    static public Integer get(String key) {
    	return Database.data.get(key);
    } 
    
    static public Map<String, Integer> instance() {
    	return Database.data;
    }
}
