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
      boolean swap = false;

        for (int i = 0; i < sorted.length; i++){
            minimum = sorted[i];

            for (int j = 0 + i; j < sorted.length; j++){

                if (sorted[j] < minimum){

                  minimum = sorted[j];
                  location = j;
                  swap = true;

                }// if statement

            }// for j < sorted length

          if (swap == true){
            temp = sorted[i];
            sorted[i] = minimum;
            sorted[location] = temp;

          }
        }// for i < sorted length

    }// subprogramme sort

    public void display(){
        for (int i = 0; i < sorted.length; i ++){
            System.out.println(sorted[i]);
        }
    }

}// class
