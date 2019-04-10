package computerSorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliza
 */
public class Computer implements Comparable<Computer> {
    private int year;
    private int khtz;
    private int RAM;
    private String manufacturer;
    
    public void Computer(int yr, int kh, int ram, String man){
        year = yr;
        khtz = kh;
        RAM = ram;
        manufacturer = man;
    }
    
    public int compareTo(Computer toCompare){
        if(toCompare.year >this.year){
            return 1;
        }else if(toCompare.year<this.year){
            return -1;
        }else{
            return 0;
        }
    }
    
    
}
