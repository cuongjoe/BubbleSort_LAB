/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class P0001 {

    //validate input 
    private static int getInt(String msg){
        Scanner sc = new Scanner(System.in);
        int a;
        do {            
            try {
                System.out.print(msg);
                a = Integer.parseInt(sc.nextLine());
                if(a<0 || a>Integer.MAX_VALUE){
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
            }
        } while (true);
        return a;
    }
    
    
    
    //create random array from input
    private static int[] Randomarray(int n){
        Random rd = new Random();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(n) + 1;
        }
        return a;
    }
    
    
    //print unsorted and sorted array
    private static void printArray(String msg, int a[]){
        String res = "";
        res += a[0];
        System.out.print(msg + "[");
        for (int i = 1; i < a.length; i++) {
            res += ", " + a[i];
        }
        System.out.print(res);
        System.out.print("]");
    }
    
    
    public static void main(String[] args) {
        int size = getInt("Enter number of array:");
        int a[] = Randomarray(size);
        printArray("Unsorted Array: ", a);
    }
    
}
