/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author delores
 */
public class MapPrac {
    
    public static void main(String[] args) {
        Map<String, String> firstMap = new HashMap<>();
        firstMap.put("keya", "valuea");
        firstMap.put("keyb", "valueb");
//        System.out.println(firstMap.get("keya"));
//        System.out.println(firstMap.get("keyb"));
        
        Set myKeys = firstMap.keySet();
        Iterator it = myKeys.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
            
    }
    
}
