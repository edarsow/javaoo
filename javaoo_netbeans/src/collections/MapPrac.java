/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;

/**
 *
 * @author delores
 */
public class MapPrac {
    
    public static void main(String[] args) {
        HashMap<String, String> firstMap = new HashMap<>();
        firstMap.put("keya", "valuea");
        firstMap.put("keyb", "valueb");
        System.out.println(firstMap.get("keya"));
        System.out.println(firstMap.get("keyb"));
    }
    
}
