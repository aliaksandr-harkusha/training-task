package com.epam.task1.playground;

import java.util.ArrayList;
import java.util.List;

public class Toys {
    private List<Toy> toys = new ArrayList<>();
    private int fixedSum;

    public Toys(int fixedSum) {
        this.fixedSum = fixedSum;
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public List<Toy> sortByPrice(List<Toy> toys){
        List<Toy> sortedPrices = new ArrayList<>();
        List<Toy> twins = toys;
        int max = twins.get(0).getPrice();
        int maxIndex = 0;
        for (int j=0; j<twins.size(); j++){
            if (twins.get(j).getPrice()>=max){
                max = twins.get(j).getPrice();
                maxIndex = j;
            }
        }
        for(;0<twins.size();){
            sortedPrices.add(twins.get(maxIndex));
            twins.remove(maxIndex);
            maxIndex = 0;
            max = 0;
            for (int j=0; j<=(twins.size()-1); j++){
                if (twins.get(j).getPrice()>=max){
                    max = twins.get(j).getPrice();
                    maxIndex = j;
                }
            }
        }
        return sortedPrices;
    }

    public List<Toy> findSize(List<Toy> toys, String size){
        List<Toy> rightSizes = new ArrayList<>();
        for (Toy toy: toys){
            if (toy.getSize().equals(size)){
                rightSizes.add(toy);
            }
        }
        return rightSizes;
    }

    public List<Toy> findType(List<Toy> toys, String type){
        List<Toy> rightTypes = new ArrayList<>();
        for (Toy toy: toys){
            if (toy.getClass().getSimpleName().equals(type)){
                rightTypes.add(toy);
            }
        }
        return rightTypes;
    }

    public List<Toy> findPrice(List<Toy> toys, int bottom, int top){
        List<Toy> rightPrices = new ArrayList<>();
        for (Toy toy: toys){
            if (toy.getPrice()>=bottom && toy.getPrice()<=top){
                rightPrices.add(toy);
            }
        }
        return rightPrices;
    }

    public Toy generateToy(){
        int typeIndex = (1 + (int) (Math.random() * 4));
        int sizeIndex = (1 + (int) (Math.random() * 3));
        int priceRange = (3 + (int) (Math.random() * 3));

        if (1 == typeIndex) {
            Car toy = new Car();
            if (1 == sizeIndex) {
                toy.setSize("Small");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else if (2 == sizeIndex) {
                toy.setSize("Medium");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else {
                toy.setSize("Big");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
        }
        else if (2 == typeIndex){
            Doll toy = new Doll();
            if (1 == sizeIndex) {
                toy.setSize("Small");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else if (2 == sizeIndex) {
                toy.setSize("Medium");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else {
                toy.setSize("Big");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
        }
        else if (3 == typeIndex){
            Ball toy = new Ball();
            if (1 == sizeIndex) {
                toy.setSize("Small");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else if (2 == sizeIndex) {
                toy.setSize("Medium");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else {
                toy.setSize("Big");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
        }
        else {
            Cube toy = new Cube();
            if (1 == sizeIndex) {
                toy.setSize("Small");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else if (2 == sizeIndex) {
                toy.setSize("Medium");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
            else {
                toy.setSize("Big");
                toy.setPrice(priceRange*sizeIndex);
                return toy;
            }
        }
    }

    public int getFixedSum() {
        return fixedSum;
    }

    public void setFixedSum(int fixedSum) {
        this.fixedSum = fixedSum;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }
}
