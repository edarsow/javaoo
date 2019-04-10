/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortComparison;

import java.util.Random;

/**
 *
 * @author eliza
 */
public class SortClient {
    
    
    
    public static void main(String args[]){
        Sorter sort = new Sorter();
        
    }
    
    public static void 
    
    public static int[] getRand(int n){
        int[] list = new int[n];
        Random random = new Random();
        for(int i = 1; i < n-1; i ++){
            list[i] = random.nextInt();
        }
        return list;
    }
    
    public static boolean checkArr(int[] ar){
        boolean isSorted = true;
        for(int i = 1; i < ar.length && isSorted; i++){
            if (ar[i] > ar[i + 1]){
                isSorted = false;
            }
        }
        return isSorted;
        
    }
   
    public static void printArray(int[] ar){
        for(int i = 1; i < ar.length; i++){
            System.out.println(ar[i] + ", ");
        }
    }
    
    public static long subtract(long[] sub){
        long ans = sub[1]-sub[0];
        return ans;
    }
}
