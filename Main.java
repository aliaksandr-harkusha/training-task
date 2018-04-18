package com.epam.task1.playground;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    private static int fixedSum;
    public static void main(String[] args) throws Exception{
        System.out.println("Please, enter the offered sum for the playground (in BYN):");
        BufferedReader readerSum = new BufferedReader(new InputStreamReader(System.in));
        fixedSum = Integer.parseInt(readerSum.readLine());
        Toys toys = new Toys(fixedSum);
        for(int i=0; i<=fixedSum;){
            Toy toy = toys.generateToy();
            i = i + toy.getPrice();
            if (i<=fixedSum){
                toys.addToy(toy);
                toys.setFixedSum(i);
            }
            else {
                System.out.println("The playground successfully filled with toys");
            }
        }
        List<Toy> sortedPrices = toys.sortByPrice(toys.getToys());
        System.out.println("Descending price-list of all toys has been created.\nStarting the search...");
        System.out.println("Enter the bottom price border:");
        BufferedReader readerBotBorder = new BufferedReader(new InputStreamReader(System.in));
        int botBorder = Integer.parseInt(readerBotBorder.readLine());
        System.out.println("Enter the top price border:");
        BufferedReader readerTopBorder = new BufferedReader(new InputStreamReader(System.in));
        int topBorder = Integer.parseInt(readerTopBorder.readLine());
        System.out.println("Search output:");
        List<Toy> prints = toys.findPrice(sortedPrices, botBorder, topBorder);
        for (Toy toy: prints){
            System.out.println(toy.getSize()+" "+toy.getClass().getSimpleName()+" "+toy.getPrice()+" BYN");
        }
    }
}
