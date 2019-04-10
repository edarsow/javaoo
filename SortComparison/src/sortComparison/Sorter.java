package sortComparison;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eliza
 */
public class Sorter {
    long[] runTimes1 = new long[2];
    long[] runTimes2 = new long[2];
    
    /**
     * implements the bubble sort algorithm as defined
     * by Daniel Liang in Edition 9 of intro to Java, generates time stamps
     * @param ar primitives to be sorted
     * @return sorted array
     */
    public int[] sortMeth(int[] ar){
        //save start time
        runTimes1[0] = java.time.Instant.now().toEpochMilli();
        boolean needNextPass = true;
        for (int k = 1; k < ar.length && needNextPass; k++){
            //array may be sorted and next pass not needed
            needNextPass = false;
            for(int i=0; i<ar.length-k;i++){
                if(ar[i]>ar[i+1]){
                    //swap ar[i] with ar[i+1]
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                    
                    needNextPass = true;
                }
            }
        }
        //save time end of sort
        runTimes1[1] = java.time.Instant.now().toEpochMilli();
        return ar;
    }
    
    /**
     * helper method: implements the quick sort algorithm as defined 
     * by Daniel Liang in Edition 9 of intro to Java, generates time stamps
     * @param ar primitives to be sorted
     * @return sorted array
     */
    public int[] sort2Meth(int[] ar){
        //Quick sort
        runTimes2[0] = java.time.Instant.now().toEpochMilli();
        quickSort(ar,0,ar.length-1);
        runTimes2[1] = java.time.Instant.now().toEpochMilli();
        return ar;
    }
    
    /**
     * implements the quick sort algoirthm as defined by Daniel Liang
     * in Edition 9 of intro to Java
     * @param list to be sorted
     * @param first index of first int in selection to be sorted
     * @param last  index of last int in selection to be sorted
     */
    public void quickSort(int[] list, int first, int last){
        if(last>first){
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex-1);
            quickSort(list, pivotIndex + 1,last);
        }
    }
    
    /**
     * generates the partition for the quickSort (implementation of Daniel Liang
     * in Ed. 9 intro to Java)
     * @param list to be sorted 
     * @param first index at the beginning of the array or array section being sorted
     * @param last index at the end of the array or array section sorted
     * @return 
     */
    public int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first + 1;
        int high = last;
        
        while(high > low){
            while(low <= high && list[low] <= pivot){
                low ++;
            }
            while(low <= high && list[high] > pivot){
                high--;
            }
        }
        
        while(high > first && list[high] >= pivot){
            high--;
        }
        
        if(pivot > list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }else return first;
    }
    
    /**
     * 
     * @return start and end time of use of sortMeth
     */
    public long[] getRunTimes1(){
        return runTimes1;
    }
    
    /**
     * 
     * @return start and end time of last use of sort2Meth
     */
    public long[] getRunTimes2(){
        return runTimes2;
    }
}
