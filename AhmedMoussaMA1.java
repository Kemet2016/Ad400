/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ahmedmoussama1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Ahmed Moussa
 * AD 300 / Monday
 * Assignment # 1
 * The purpose of this program is to create an array list from the user input
 * and remove any duplicate numbers
 * @author ahmedmoussa
 */


public class AhmedMoussaMA1 {
     public static void removeDuplicate(ArrayList<Integer>list){
        //create a temporary list
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        
        //compare the original array list with the new array list
        for(int num : list)
            if(!tempList.contains(num))
                tempList.add(num);
   
        
        //remove the original array list elements and replace them with the new list
        list.clear();
        list.addAll(tempList);
        
    }
    
    public static void main(String[] args) {
        
        // create an Array List
        ArrayList<Integer>list = new ArrayList<>();
        
        // set a scanner to prompt the user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        
        int value; 
 
        for (int i=0; i < 10; i++){
            value = input.nextInt(); // read the value from input
            
                list.add(value);
            
        }
            //print the original array list to test
              System.out.print("The Original integers are: ");
              for(int i=0; i<list.size(); i++)
                 System.out.print(list.get(i) + " ");

        // call the removeDuplicate method
        removeDuplicate(list);
        
        System.out.println(" ");
        System.out.print("The distinct integers are: ");
        for(int i=0; i<list.size(); i++)
            System.out.print(list.get(i) + " ");
        
        System.out.println(" ");
        // using the sort method
        java.util.Collections.sort(list);
        System.out.println("Sorted in ascending " + list);
        
        // using the max & min methods
        System.out.println("Minimal element in a list " + Collections.min(list));
        System.out.println("Maximum element in a list " + Collections.max(list));
       
        
        // using the shuffle method 
        Collections.shuffle(list);
        System.out.println("Random shuffle for the elements in the list " + list);
        
    }
}
