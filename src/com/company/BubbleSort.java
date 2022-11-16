package com.company;

public class BubbleSort {
    public Integer[] array;

    public BubbleSort(Integer[] array){
        this.array = array;
        int passes = 0;
        int temp;

        int numPass = 0;
        int compariosns = 0;

        for (int i = 0; i < this.array.length; i++){
            passes++;
            numPass++;
            for(int j = 0; j < this.array.length - passes; j++){
                compariosns++;
                if (this.array[j] > this.array[j + 1]){
                    temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }// if statement

            }// for j < array.length - passres
        }// for i < array.length
        display();
        System.out.println("");
        System.out.println(Integer.toString(numPass) + " , " + Integer.toString(compariosns));
    }// public bubblesort

    public void display(){
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }// public void display

}//  class
