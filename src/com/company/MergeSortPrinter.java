package com.company;

import java.util.Scanner;

import static com.company.MergeSort.mergesort;

public class MergeSortPrinter {

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[]array=new int[n];
        for (int i=0; i<n;i++){
            array[i]=in.nextInt();
        }
    }
}
