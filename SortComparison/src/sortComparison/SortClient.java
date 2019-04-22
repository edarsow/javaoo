/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortComparison;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class SortClient {
    
    public static void main(String args[]){
        runSystem();
    }
    
    public static void runSystem(){
        Sorter sort = new Sorter();
        System.out.println("How long of a list do you want to sort?");
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] arr1 = getRand(arrSize);
        int[] arr2 = arr1;
        
        int[] sort1 = sort.sortMeth(arr1);
        int[] sort2 = sort.sort2Meth(arr2);
        System.out.println("...sorting... (change by ecd)");
        
        System.out.println("Bubble Sort: ");
        //printArray(sort1);
        System.out.println("Array is Sorted: " + checkArr(sort1));
        System.out.println("Sort time: " + subtract(sort.runTimes1) + " milliseconds");
        
        System.out.println("\nQuicksort: ");
        //printArray(sort2);
        System.out.println("Array is sorted: " + checkArr(sort2));
        System.out.println("Sort time: " + subtract(sort.runTimes2) + " milliseconds");
        
        runAgain();
    }
    
    public static void runAgain(){
        int again = 0;
        while (again != 1 && again !=2){
            System.out.println("Would you like to test the sort algorithms again? \n1-yes \n2-no");
            Scanner scan = new Scanner(System.in);
            again = scan.nextInt();
            switch(again){
                case 1: 
                    runSystem();
                    break;
                case 2: 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
    
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
        for(int i = 0; i < ar.length - 1 && isSorted; i++){
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
        //System.out.println("Time 1: " + sub[0] + "Time 2: " + sub[1]);
        long ans = sub[1]-sub[0];
        return ans;
    }
}
