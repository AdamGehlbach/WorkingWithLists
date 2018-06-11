package com.company.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main mainClass = new Main();
        mainClass.testingList();
    }

    private void testingList() {

        nameList = new ArrayList<String>();

        nameList.add("Adam");
        nameList.add("Chris");
        nameList.add("Bin");
        nameList.add("Luke");
        System.out.println("See All Items in the Array List: ");
        //For Each loop to see all items in arrayList.
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("See a single item in the array list: ");
        System.out.println(nameList.get(2));

        System.out.println("Remove a single item and list what is left in the ArrayList: ");
        nameList.remove(0);

        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println("viewing ArrayList using Iteration loop with numbers");
        for (int i = 0; i < nameList.size(); i++) {

            System.out.println((i + 1) + " " + nameList.get(i));
    }

    System.out.println("Which number would you like to remove?");
        int numberToRemove = input.nextInt() - 1;

        if (numberToRemove >=  nameList.size() || numberToRemove < 0) {

        } else {
            nameList.remove(numberToRemove);
        }
        System.out.println("List after take out selected number");
        for (int i = 0; i < nameList.size(); i++) {

            System.out.println((i + 1) + " " + nameList.get(i));
        }


}}
