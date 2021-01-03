package com.datastructure;

import java.util.Scanner;

public class Ternary {
	 
   
    static int ternarySearch(int l, int r, int key, int ar[])
 
    {
        while (r >= l) {
 
            
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
 
            
            if (ar[mid1] == key) {
                return mid1;
            }
            if (ar[mid2] == key) {
                return mid2;
            }
 
            
 
            if (key < ar[mid1]) {
 
               
                r = mid1 - 1;
            }
            else if (key > ar[mid2]) {
 
               
                l = mid2 + 1;
            }
            else {
 
               
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
 
        
        return -1;
    }
 
    
public static void main(String args[])
    {
        int l, r, p, key;
 
        
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 
       
        l = 0;
 
        
        r = 9;
 
       
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key:");
        key = scanner.nextInt();
 
        
        p = ternarySearch(l, r, key, ar);
 
        
        System.out.println("Index of " + key + " is " + p);
 
       
    }
}