/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package differencearray;

import java.util.Hashtable;

/**
 *
 * @author wilsoncastiblanco
 */
public class DifferenceArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getPairsOfIntegersByDifference();
    }

    /*
Given an array of distinct integer values, count the number of pairs of integers that have difference k. for example, given the array {1, 7, 5, 9, 2, 12, 3} and the difference is k = 2

e.g: (7, 9) (1, 3), (5, 3)
     */
    public static void getPairsOfIntegersByDifference() {
        int difference = 2;
        int[] integersArray = new int[]{1, 7, 5, 9, 2, 12, 3};

        String pairs = "";
        
        Hashtable<Integer, Integer> hashIntegers = new Hashtable<>(integersArray.length);
        
       for (int i = 0; i < integersArray.length; i++) {
           
       }

        for (int i = 0; i < integersArray.length; i++) {
            for (int j = 0; j < integersArray.length; j++) {
                if (integersArray[i] - integersArray[j] == difference || integersArray[j] - integersArray[i] == difference ) {
                    pairs += " (" + integersArray[i] + "," + integersArray[j] + ") ";
                }
            }
        }

        System.out.println(pairs);
    }

}
