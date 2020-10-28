package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit){
            System.out.println("Please choose one of the following options: \r");
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printArrayList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("\n Press: ");
        System.out.println("\t  0 - To print choice options.");
        System.out.println("\t  1 - To display items in the the grocery list.");
        System.out.println("\t  2 - To add item.");
        System.out.println("\t  3 - To modify an item in the list.");
        System.out.println("\t  4 - To remove an item in the list.");
        System.out.println("\t  5 - To search an item in the list.");
        System.out.println("\t  6 - To quit the program.");
    }

    public static void addItem(){
        System.out.println("Please enter your item in the list: \r");
        groceryList.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please item number: \r");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter replacement item: \r");
        String newItem = scanner.nextLine();
        groceryList.modifyGriceryList(position-1, newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter the item number: \r");
        int itemNo = scanner.nextInt();
        groceryList.removeItem(itemNo-1);
    }

    public static void searchForItem(){
        System.out.println("Please enter your seach item: \r");
        String searchItem = scanner.nextLine();
        if (groceryList.findItem(searchItem) != null){
            System.out.println("Found " + searchItem + " in your grocery list.");
        }else {
            System.out.println("Item " + searchItem + " not found in your list.");
        }
    }
}
