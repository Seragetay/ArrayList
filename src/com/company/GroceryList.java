package com.company;

import java.util.ArrayList;

public class GroceryList {
    private final ArrayList<String> groceryList = new ArrayList<>();

    //Add item to the arrayList
    public void addItem(String item){
        groceryList.add(item);
    }
    //modify arraylist
    public void modifyGriceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has modified.");
    }
    //print arraylist
    public void printArrayList(){
        System.out.println("You have " + groceryList.size() + " item in your list: ");
        for (int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    //remove item from arraylist
    public void removeItem(int position){
        //String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String seachItem){
        boolean itemExist = groceryList.contains(seachItem);
        int position = groceryList.indexOf(seachItem);
        if (position >=0){
            System.out.println("Item found at position " + position);
            return groceryList.get(position);
        }
        System.out.println("Item not found!!");
        return null;
    }

}
