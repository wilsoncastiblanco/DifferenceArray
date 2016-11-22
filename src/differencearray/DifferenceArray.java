/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differencearray;

import java.util.HashMap;

/**
 *
 * @author wilsoncastiblanco
 */
public class DifferenceArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int difference = 3;
        int[] integersArray = new int[]{3, 8, 15, 1, 9, 6, 4, 12, 20};
        getPairsOfIntegersByDifference(integersArray, difference);
    }

    /*
Given an array of distinct integer values, count the number of pairs of integers that have difference k. for example, given the array {1, 7, 5, 9, 2, 12, 3} and the difference is k = 2

e.g: (7, 9) (1, 3), (5, 3)
     */
    public static void getPairsOfIntegersByDifference(int a[], int subValue) {
        HashMap store = new HashMap();
        for (int i = 0; i < a.length; i++) {
            store.put(a[i], 1);
        }
        for (int i = 0; i < a.length; i++) {
            if (store.containsKey(a[i] - subValue)) {
                System.out.println("(" + a[i] + "," + (a[i] - subValue) + ")");
            }
            if (store.containsKey(a[i] + subValue)) {
                System.out.println("(" + a[i] + "," + (a[i] + subValue) + ")");
            }
            store.remove(a[i]);
        }
    }

}
