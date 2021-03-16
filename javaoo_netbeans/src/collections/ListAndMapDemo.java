/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 * Demo of basic data Structures in Java: LinkedLists and HashMaps
 * @author Eric Darsow <edarsow@ccac.edu>
 */
public class ListAndMapDemo {
    
    public static void main(String[] args) {
        
        // Create an instance of the LinkedList class
        // SEE docs https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html
        
        // We must declare what type of object can be stored in our
        // List, which we name inside the  < > 
        // On the right side of = we create an instance of our list
        // and use the <>() to call the apropriate constructor on our object
        // Read more about generic programming in LIANG, that's the <>
        LinkedList<String> speedScenarios = new LinkedList<>();
        
        // In speed 1, first there's the Elevator hijack
        speedScenarios.add("Rigged elevator with bomb");
        // In speed 1, then the city bus is rigged with a speed trigger bomb
        speedScenarios.add("City bus speed trigger bomb");
        
        speedScenarios.add("Subway train hijack");
        
        // add item in the second position (indexes start at Zero)
        // reorder all other items
        speedScenarios.add(1, "Destroys random city bus and driver to taunt Jack");
        // once we have items in our list, let's get them out
        System.out.println("Linked List Display");
        // First step is to ask the LinkedList for a special
        // object called an Iterator (to iterate means to visit items
        // in a sequence, one at a time)
        ListIterator<String> iter = speedScenarios.listIterator();
        // iterators have methods on them for telling us when all the 
        // items have been visited, that's called hasNext()
        // it's desgined for use with the while() loop structure
        while(iter.hasNext()){
            String item = iter.next();
            System.out.println("List item: " + item);
            
        } // close while
        
        
        
        
        
    } // close main
    
} // close class
