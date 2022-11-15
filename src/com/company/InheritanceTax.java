package com.company;

public class InheritanceTax {
    private Integer[] sorted;

    public InheritanceTax(Integer[] sorted){
        this.sorted = sorted;
        sort();
        display();
    }

    public void sort(){
        Integer[] unsorted = new Integer[sorted.length];
        int minimum = sorted[0];
        int temp;
        int location = 0;

        for (int i = 0; i < sorted.length; i++){
            minimum = 0;

            for (int j = 0; j < sorted.length - i; j++){

                if (sorted[j] < minimum){

                    minimum = sorted[j];
                    location = j;

                }// if statement

            }// for j < sorted length

            temp = sorted[i];
            sorted[i] = minimum;
            sorted[location] = temp;
            display();
            System.out.println(" ");

        }// for i < sorted length

    }// subprogramme sort

    public void display(){
        for (int i = 0; i < sorted.length; i ++){
            System.out.println(sorted[i]);
        }
    }

}// class
